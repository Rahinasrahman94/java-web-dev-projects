public class Technology {
    public static void main(String[] args)
    {
        Computer c = new Computer("Samsung",120.00,256);
        c.display();
        c.message();
        Laptop l = new Laptop("Dell",120,128,25);
        l.batStatus();
        l.message();
        SmartPhone s = new SmartPhone("iPhone",1000,128,"Ios");
        s.phoType();
        s.message();
    }
}
