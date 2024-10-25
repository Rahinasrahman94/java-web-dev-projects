public class LaptopTest {
    public void testLap()
    {
        Laptop l = new Laptop("Dell",120,128,25);
        assertEquals("Dell",l.getBrand());
        assertEquals(120,l.getPrice());
        assertEquals (128,l.getMemory());
        assertEquals (128,l.getBatteryStatus());

    }
}
