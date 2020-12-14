package main.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.java.Car;

public class ParkingLotStartTest {
    Car car1 = new Car("FiftyKW", 20.0, 0, true);
    Car car2 = new Car("Standard", 0.0, 2, true);
    Car car3 = new Car("TwentyKW", 100.0, 0, true);

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
    }
}
