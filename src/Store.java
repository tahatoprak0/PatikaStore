import java.util.*;


public class Store {
    public static List<Notebook> noteBooks = new ArrayList<>();
    public static List<Phone> phones = new ArrayList<>();
    public static List<Brands> brands = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        addBrand();
        addPhone();
        addNotebook();
        menu();


    }


    public static void showMenu() {
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış");
    }

    public static void addNotebook() {
        noteBooks.add(new Notebook(1, "ASUS", "ASUS Tuf Gaming", 0.20, 8199.5, "15.6", 2048, 32, 50));
        noteBooks.add(new Notebook(2, "HUAWEİ", "HUAWEİ Matebook D14", 0.20, 7000.0, "14.0", 512, 16, 20));
        noteBooks.add(new Notebook(3, "LENOVO", "LENOVA Matebook V14 IGL", 0.20, 3699.0, "14.0", 1024, 8, 12));
    }

    public static Notebook removeNotebook(int idNo) {
        Notebook notebook = null;
        Iterator<Notebook> itr = noteBooks.iterator();
        while (itr.hasNext()) {
            Notebook currentNoteBook = itr.next();
            if (currentNoteBook.getProductId() == idNo) {
                notebook = currentNoteBook;
                itr.remove();
                break;
            }
        }
        System.out.println(idNo + " ID nuamaralı Notebook Silindi");
        return notebook;

    }

    public static  boolean isThereNoteBook( List<Notebook> product,int idNo){
        for (int i = 0; i<product.size(); i++){
            if (product.get(i).getProductId()==idNo){
                return true;
            }
        }
        return false;
    }

    public static void addPhone() {
        phones.add(new Phone(1, "SAMSUNG", "SAMSUNG Galaxy A51", 20, 3199.0, "6.5", 128, 8, 4000, "Kırmızı", 15));
        phones.add(new Phone(2, "İPHONE", "İPHONE 11 64GB", 20, 7379.0, "6.1", 64, 6, 2375, "Siyah", 15));
        phones.add(new Phone(3, "XİAOMİ", "XİAOMİ Redmi Note 10 Pro", 20, 4012.0, "6.5", 128, 8, 5300, "GOLD", 15));
    }

    public static void addSpecialPhone() {
        System.out.println("--------------------------");
        System.out.print("Telefon İd: ");
        int id = input.nextInt();
        // System.out.println("---------------------------");
        input.nextLine();
        System.out.print("Marka Adı: ");
        String brandName = input.nextLine();
        //System.out.println("---------------------------");
        System.out.print("Ürün Adı: ");
        String productName = input.nextLine();
        //System.out.println("---------------------------");
        System.out.print("İndirim Oranı: ");
        double discountRate = input.nextDouble();
        //System.out.println("---------------------------");
        input.nextLine();
        System.out.print("Fiyat: ");
        double price = input.nextDouble();
        //System.out.println("---------------------------");
        input.nextLine();
        System.out.print("Ekran: ");
        String inch = input.nextLine();
        //System.out.println("---------------------------");
        System.out.print("Depolama: ");
        int storage = input.nextInt();
        //System.out.println("---------------------------");
        input.nextLine();
        System.out.print("RAM: ");
        int ram = input.nextInt();
        //System.out.println("---------------------------");
        input.nextLine();
        System.out.print("Batarya Gücü: ");
        int batteryPower = input.nextInt();
        //System.out.println("---------------------------");
        input.nextLine();
        System.out.print("Renk: ");
        String color = input.nextLine();
        //System.out.println("---------------------------");
        System.out.print("Stok:");
        int stock = input.nextInt();
        phones.add(new Phone(id, brandName, productName, discountRate, price, inch, storage, ram, batteryPower, color, stock));
        System.out.println(productName + " Adlı Ürün Eklendi");
        System.out.println("---------------------------");
    }

    public static void addSpecialNotebook() {
        System.out.println("--------------------------");
        System.out.print("Notebook İd: ");
        int id = input.nextInt();
        // System.out.println("---------------------------");
        input.nextLine();
        System.out.print("Marka Adı: ");
        String brandName = input.nextLine();
        //System.out.println("---------------------------");
        System.out.print("Ürün Adı: ");
        String productName = input.nextLine();
        //System.out.println("---------------------------");
        System.out.print("İndirim Oranı: ");
        double discountRate = input.nextDouble();
        //System.out.println("---------------------------");
        input.nextLine();
        System.out.print("Fiyat: ");
        double price = input.nextDouble();
        //System.out.println("---------------------------");
        input.nextLine();
        System.out.print("Ekran: ");
        String inch = input.nextLine();
        //System.out.println("---------------------------");
        System.out.print("Depolama: ");
        int storage = input.nextInt();
        //System.out.println("---------------------------");
        input.nextLine();
        System.out.print("RAM: ");
        int ram = input.nextInt();
        //System.out.println("---------------------------");
        System.out.print("Stok:");
        int stock = input.nextInt();
        noteBooks.add(new Notebook(id, brandName, productName, discountRate, price, inch, storage, ram, stock));
        System.out.println(productName + " Adlı Ürün Eklendi");
        System.out.println("---------------------------");
    }

    public static Phone removePhone(int idNo) {
        Phone phone = null;
        Iterator<Phone> itr = phones.iterator();
        while (itr.hasNext()) {
            Phone currentPhone = itr.next();
            if (currentPhone.getProductId() == idNo) {
                phone = currentPhone;
                itr.remove();
                break;
            }
        }
        System.out.println(idNo + " ID nuamaralı Telefon Silindi");
        return phone;
    }
    public static  boolean isTherePhone( List<Phone> product,int idNo){
        for (int i = 0; i<product.size(); i++){
            if (product.get(i).getProductId()==idNo){
                return true;
            }
        }
        return false;
    }

    public static void printPhone(List<Phone> phoneList) {
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%s%1c%s%20c%s%6c%s%6c%s%6c%s%6c%s", "| ID |", ' ', "Ürün Adı", ' ', "| Fiyat", ' ', "| Depolama", ' ', "| Ekran", ' ', "| RAM", ' ', "| RENK"));
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < phoneList.size(); i++) {

            System.out.println(String.format("%3s %c %-25s %10s %c %10s %c %12s %c %8s %c %12s", phoneList.get(i).getProductId(), ' ', phoneList.get(i).getProductName(),
                    phoneList.get(i).getProductPrice(), ' ', phoneList.get(i).getProductStorage(), ' ', phoneList.get(i).getProductInch(), ' ', phoneList.get(i).getProductRam(), ' ', phoneList.get(i).getColor()));
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("0 - Geri Dön");
        System.out.println("1 - Telefon Sil");
        System.out.println("2 - Telefon Ekle");

    }

    public static void printNotebook(List<Notebook> notebooks) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(String.format("%s%1c%s%20c%s%6c%s%6c%s%6c%s", "| ID |", ' ', "Ürün Adı", ' ', "| Fiyat", ' ', "| Depolama", ' ', "| Ekran", ' ', "| RAM"));
        System.out.println("----------------------------------------------------------------------------------------");
        for (int i = 0; i < notebooks.size(); i++) {

            System.out.println(String.format("%3s %c %-25s %10s %c %10s %c %12s %c %8s", notebooks.get(i).getProductId(), ' ', notebooks.get(i).getProductName(),
                    notebooks.get(i).getProductPrice(), ' ', notebooks.get(i).getProductStorage(), ' ', notebooks.get(i).getProductInch(), ' ', notebooks.get(i).getProductRam()));
        }

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("0 - Geri Dön");
        System.out.println("1 - Bilgisayar Sil");
        System.out.println("2 - Bilgisayar Ekle");


    }

    public static void menu() {
        System.out.println("####### PATİKA STORE YÖNETİM MERKEZİNE HOŞGELDİNİZ. #######");
        //showMenu();

        boolean isSelect = false;
        while (isSelect == false) {
            showMenu();
            System.out.print("Mağazadan Yapmak İstediğiniz İşlemi Seçin: ");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    printNotebook(noteBooks);
                    select = input.nextInt();
                    while (select != 0 && select > 2) {
                        System.out.println("Geçersiz Numara. Geri Dönmek İçin 0'ı Tercih Edin");
                        select = input.nextInt();
                    }
                    if (select == 0) {
                        break;
                    }
                    if (select == 1) {
                        System.out.print("Silmek İstediğiniz Notebook'un ID numarasını Girin: ");
                        System.out.println("\n0 - Ana Menüye Dön");
                        select = input.nextInt();
                        if (select == 0) {
                            break;
                        }
                        while (isThereNoteBook(noteBooks,select)==false) {
                            System.out.println("GEÇERSİZ İD NO GİRİDİNİZ");
                            select = input.nextInt();
                        }
                        removeNotebook(select);
                        break;
                    }
                    if (select == 2) {
                        addSpecialNotebook();
                        break;
                    }

                case 2:
                    printPhone(phones);
                    select = input.nextInt();
                    while (select != 0 && select > 2) {
                        System.out.println("Geçersiz Numara. Geri Dönmek İçin 0'ı Tercih Edin");
                        select = input.nextInt();
                    }
                    if (select == 0) {
                        break;
                    }
                    if (select == 1) {
                        System.out.print("Silmek İstediğiniz Telefonun ID numarasını Girin: ");
                        System.out.println("\n0 - Ana Menüye Dön");
                        select = input.nextInt();
                        if (select == 0){
                            break;
                        }
                            while (isTherePhone(phones,select)==false) {
                                System.out.println("GEÇERSİZ İD NO GİRDİNİZ");
                                select = input.nextInt();
                            }
                        removePhone(select);
                        break;
                    }
                    if (select == 2) {
                        addSpecialPhone();
                        break;
                    }

                case 3:
                    printBrands(brands);
                    select = input.nextInt();
                    while (select != 0) {
                        System.out.println("Geçersiz Numara. Geri Dönmek İçin 0'ı Tercih Edin");
                        select = input.nextInt();
                    }
                    if (select == 0) {
                        break;
                    }

                case 0:
                    isSelect = true;
                    break;
                default:
                    System.out.println("Yanlış Numara Girdiniz Tekrar Deneyin");
                    break;

            }
        }

    }

    public static void addBrand() {
        brands.add(new Brands(23214, "Samsung"));
        brands.add(new Brands(52342, "Lenova"));
        brands.add(new Brands(34234, "Apple"));
        brands.add(new Brands(62346, "Huawei"));
        brands.add(new Brands(85864, "Casper"));
        brands.add(new Brands(67434, "Asus"));
        brands.add(new Brands(12345, "HP"));
        brands.add(new Brands(86454, "Xiaomi"));
        brands.add(new Brands(95853, "Monster"));
        Collections.sort(brands, new Comparator<Brands>() {
            @Override
            public int compare(Brands o1, Brands o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public static void printBrands(List<Brands> brands) {

        System.out.println("----------MARKALARIMIZ---------");
        for (int i = 0; i < brands.size(); i++) {
            System.out.println("-" + brands.get(i).getName());
        }
        System.out.println("0 - Geri Dön");
    }


}
