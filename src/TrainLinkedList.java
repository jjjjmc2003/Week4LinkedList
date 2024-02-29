public class TrainLinkedList {
    TrainCar head; // The engine
    public TrainLinkedList() {
        this.head = null;
    }

    // Method to add new TrainCar
    public void addTrainCar(int carNumber) {
        TrainCar newCar = new TrainCar(carNumber);
        if (head == null) {
            head = newCar;
        } else {
            TrainCar current = head;

        }
    }

    // Method to traverse the TrainLinkedList
    public void traverseTrain() {
        TrainCar current = head;
        while (current != null) {
            System.out.println("Train car number: " + current.carNumber);
            current = current.nextCar;
        }
    }
}