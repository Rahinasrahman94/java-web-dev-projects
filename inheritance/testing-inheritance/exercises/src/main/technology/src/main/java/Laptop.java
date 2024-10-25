public class Laptop extends Computer{
    private double batteryStatus;

    public double getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(double batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public Laptop(String brand, double price, double memory, double batteryStatus)
    {
        super(brand,price,memory);
        this.batteryStatus = batteryStatus;
    }
    public void message()
    {
        System.out.println("This from laptop class");
    }
    public void batStatus()
    {
        super.display();
        System.out.println("Battery Status"+this.batteryStatus);

    }
}
