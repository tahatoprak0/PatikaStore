public abstract class Products {
    private int productId;
    private String brandName;
    private String productName;
    private double discountRate;
    private double productPrice;
    private String productInch;
    private int productStorage;
    private int productRam;
    private int productStock;

    public Products(int productId, String brandName, String productName, double discountRate, double productPrice, String productInch, int productStorage, int productRam, int productStock) {
        this.productId = productId;
        this.brandName = brandName;
        this.productName = productName;
        this.discountRate = discountRate;
        this.productPrice = productPrice;
        this.productInch = productInch;
        this.productStorage = productStorage;
        this.productRam = productRam;
        this.productStock = productStock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductInch() {
        return productInch;
    }

    public void setProductInch(String productInch) {
        this.productInch = productInch;
    }

    public int getProductStorage() {
        return productStorage;
    }

    public void setProductStorage(int productStorage) {
        this.productStorage = productStorage;
    }

    public int getProductRam() {
        return productRam;
    }

    public void setProductRam(int productRam) {
        this.productRam = productRam;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
}
