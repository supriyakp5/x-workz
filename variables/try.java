class Books {
    public static void main(String[] val) {
        int bottlePrice = 300;
        System.out.println("Bottle Price: " + bottlePrice);

        bottlePrice = 250;
        System.out.println("Updated Bottle Price: " + bottlePrice);

        // Creating an instance of Read class
        Read obj = new Read();
        obj.displaySize(); // Calling method to print size
    }
}

// Define Read class separately
class Read {
    byte size = 5;

    void displaySize() {
        System.out.println("Size: " + size);
        size = 2;
        System.out.println("Updated size: " + size);

        Cat obj = new Cat();
        obj.displayAddress(); // Corrected method name
    }
}

class Cat {
    char address = "Shivmogga"; // Changed from char to String

    void displayAddress() { // Fixed method name to match call in Read class
        System.out.println("Address: " + address);

        address = "Bengaluru";
        System.out.println("Updated Address: " + address);
    }
}
