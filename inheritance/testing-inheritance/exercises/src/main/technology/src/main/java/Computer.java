public class Computer {
    private String brand;
    private double price;
    private double memory;
    public Computer(String brand, double price, double memory)
    {
        this.brand = brand;
        this.price=price;
        this.memory=memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
    public void display()
    {
        System.out.println("Brand :"+this.brand);
        System.out.println("Price:"+this.price);
        System.out.println("Memory:"+this.memory);
    }
    public void message(){
        System.out.println("This from COMPUTER CLASS");
    }

}
