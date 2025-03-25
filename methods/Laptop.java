class Laptop {
    // Static methods
    static void powerOn() {
        System.out.println("Laptop is powering on...");
        checkBattery();
        initializeHardware();
        loadOS();
        displayHomeScreen();
    }

    static void checkBattery() {
        System.out.println("Checking battery status...");
    }

    static void initializeHardware() {
        System.out.println("Initializing hardware components...");
    }

    static void loadOS() {
        System.out.println("Loading operating system...");
    }

    static void displayHomeScreen() {
        System.out.println("Displaying home screen...");
    }

    // Methods to be called from another class
    static void openBrowser() {
        System.out.println("Opening web browser...");
    }

    static void playVideo() {
        System.out.println("Playing video...");
    }

    static void runCodeEditor() {
        System.out.println("Running code editor...");
    }

    static void connectWiFi() {
        System.out.println("Connecting to WiFi...");
    }

    static void shutDown() {
        System.out.println("Shutting down the laptop...");
    }
}