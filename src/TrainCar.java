import java.util.Scanner;

public class TrainCar {
    int carNumber;
    TrainCar nextCar;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car number:");
        int carNumber = scanner.nextInt();
        TrainCar trainCar = new TrainCar(carNumber);
        scanner.close();
    }

    TrainCar(int carNumber) {
        this.carNumber = carNumber;
        this.nextCar = null; // Initialize nextCar to null
    }
}