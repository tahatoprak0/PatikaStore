public class Phone extends Products{
    private String color;
    private int batteryPower;
    public Phone(int productId, String brandName, String productName, double discountRate, double productPrice, String productInch, int productStorage, int productRam, int batteryPower,String color ,int productStock) {
        super(productId, brandName, productName, discountRate, productPrice, productInch, productStorage, productRam, productStock);
        this.color=color;
        this.batteryPower=batteryPower;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
}
