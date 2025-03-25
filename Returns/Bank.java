class Bank {
    public static int getBalance(int accountNumber) {
        System.out.println("Checking balance for Account Number: " + accountNumber);
        
        if (accountNumber == 876456785) 
		return 5000;
        if (accountNumber == 876456786) 
		return 12000;
        if (accountNumber == 876456787) 
		return 8000;
        if (accountNumber == 876456788)
		return 3000;
        if (accountNumber == 876456789)
		return 15000;
        if (accountNumber == 876456790) 
		return 22000;
        if (accountNumber == 876456791) 
		return 7000;
        if (accountNumber == 876456792) 
		return 9500;
        if (accountNumber == 876456793) 
		return 11000;
        if (accountNumber == 876456794)
		return 4000;
        if (accountNumber == 876456795)
		return 8700;
        if (accountNumber == 876456796) 
		return 9200;
        if (accountNumber == 876456797)
		return 13300;
        if (accountNumber == 876456798)
		return 5100;
        if (accountNumber == 876456799) 
		return 17500;
        if (accountNumber == 876456800)
		return 6000;
        if (accountNumber == 876456801)
		return 19500;
        
        // If account number not found, return 0
        return 0;
    }
}