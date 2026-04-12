class NumberArray {
    int[] arr;
    int size;

    // Constructor
    NumberArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    // Insert numbers
    void insert(int index, int value) {
        if (index >= 0 && index < size) {
            arr[index] = value;
        } else {
            System.out.println("Invalid index");
        }
    }

    // Display numbers
    void display() {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Count even and odd numbers
    void countEvenOdd() {
        int even = 0, odd = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}

// Main class
public class Numbers{
    public static void main(String[] args) {

        NumberArray na = new NumberArray(5);

        // Insert values
        na.insert(0, 10);
        na.insert(1, 15);
        na.insert(2, 20);
        na.insert(3, 25);
        na.insert(4, 30);

        // Display
        na.display();

        // Count even and odd
        na.countEvenOdd();
    }
}