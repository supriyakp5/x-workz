
class Books {
    public static void main(String[] val) {
        int bottelPrice = 300;
        System.out.println("Bottle Price: " + bottelPrice);

        bottelPrice = 250;
        System.out.println("Updated Bottle Price: " + bottelPrice);

        // Creating an instance of Read class
        Read obj = new Read();
        obj.displaySize(); // Calling method to print size
    }
}

// Define Read class separately
class Read {
    byte size = 5 

    void displaySize() {
        System.out.println("Size: " + size);
        size = 2
        System.out.println("Updated size: " + size);
		
		Cat obj=new Cat();
		obj.displayAddress();
		
    }
}

class Cat {
	String address = "Shivmogga577450";
	
	void displayAddress(){
		System.out.println("Adress:" +address);
		
		address = "Bengaluru123";
		System.out.println("UpdateAdress:" +address);
		
		
	}
}

