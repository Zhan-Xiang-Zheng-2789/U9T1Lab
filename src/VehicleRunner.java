public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycle myBike = new Bicycle("Lil Bike", 2, 21);
    System.out.println(myBike.getName()); // inherited method
    System.out.println(myBike.getWheels()); // inherited method
    System.out.println(myBike.getGearCount()); // method ONLY available on Bicycle objects
    myBike.ringBell();
    myBike.move(30); // inherited method
    myBike.turn(-90); // inherited method
    myBike.brake(0.50); // inherited method

    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a AttackHelicopter object
    AttackHelicopter myAttackHelicopter = new AttackHelicopter("Apache", 0, 341);
    System.out.println(myAttackHelicopter.getName()); // inherited method
    System.out.println(myAttackHelicopter.getWheels()); // inherited method
    System.out.println(myAttackHelicopter.getBullet()); // method ONLY available on AttackHelicopter objects
    myAttackHelicopter.fire(100);
    myAttackHelicopter.fire(1000);
    myAttackHelicopter.move(30); // inherited method
    myAttackHelicopter.turn(-90); // inherited method
    myAttackHelicopter.brake(0.50); // inherited method

  }
}