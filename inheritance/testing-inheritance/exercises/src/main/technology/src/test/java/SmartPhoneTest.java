public class SmartPhoneTest {
    public void testLap()
    {
        SmartPhone s = new SmartPhone("iPhone",1000,128,"Ios");
        assertEquals("iPhone",s.getBrand());
        assertEquals(1000,s.getPrice());
        assertEquals (128,s.getMemory());
        assertEquals ("Ios",s.getPhonetype());

    }
}