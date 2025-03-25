class MainExplicit {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Car car = new Car("Sedan", 2022);
            House house = new House(4, "Bengaluru");
            Book book = new Book("Invisible Cities", "Italo Calvino");
            Computer computer = new Computer("Dell", "Intel i7");
            Phone phone = new Phone("Apple", 128);
        }
}
}