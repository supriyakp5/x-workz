public class Laptoptest {
    public static void main(String[] args) {
        // Calling static methods from another class
        Laptop.openBrowser();
        Laptop.playVideo();
        Laptop.runCodeEditor();
        Laptop.connectWiFi();
        Laptop.shutDown();
        
        // Calling static method that invokes other methods
        Laptop.powerOn();
    }
}