public class SmartPhone extends Computer{
    private String phonetype;

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public SmartPhone(String brand, double price, double memory, String phonetype )
    {
        super(brand,price,memory);
        this.phonetype = phonetype;
    }
    public void message()
    {
        System.out.println("This from SmartPhone class");
    }
    public void phoType()
    {
        super.display();
        System.out.println("PhoneType:"+ phonetype);
    }
}
