package seminars.second.hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car createTestCar(){
        return new Car("Lada", "Kalina", 2014);
    }
    private Motorcycle createTestMotorcycle(){
        return new Motorcycle("Yava", "LikeNew", 1986);

    }
    @DisplayName("Car is Vehicle")
    @Test
    void carIsVehicle(){
        Car car = createTestCar();
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    void carHas4Wheels(){
        Car car = createTestCar();
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void motoHas2Wheels(){
        Motorcycle moto = createTestMotorcycle();
        assertEquals(2, moto.getNumWheels());
    }

    @Test
    void carSpeedCheck(){
        Car car = createTestCar();
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void motoSpeedCheck(){
        Motorcycle moto = createTestMotorcycle();
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    @Test
    void carParkingSpeedCheck(){
        Car car = createTestCar();
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void motoParkingSpeedCheck(){
        Motorcycle moto = createTestMotorcycle();
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed());
    }
}