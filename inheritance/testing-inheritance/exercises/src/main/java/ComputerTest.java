//package org.example;
//import static org.junit.jupiter.api.Assertions.*;
public class ComputerTest {
@Test
public void ComputerTes()
{
    Computer c = new Computer("Samsung",120.00,256);
    assertEquals("Samsung",c.getBrand());
    assertEquals(120,c.getPrice());
    assertEquals (256,c.getMemory());

}




}
