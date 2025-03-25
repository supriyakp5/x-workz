class Transport {
    public static int getPrice(String source) {
        System.out.println("Source: " + source);
        
        if (source.equals("New York")) 
		return 150;
        if (source.equals("Los Angeles")) 
		return 200;
        if (source.equals("Chicago")) 
		return 180;
        if (source.equals("Houston"))
		return 220;
        if (source.equals("Phoenix"))
		return 140;
        if (source.equals("Philadelphia")) 
		return 170;
        if (source.equals("San Antonio")) 
		return 160;
        if (source.equals("San Diego")) 
		return 190;
        if (source.equals("Dallas")) 
		return 210;
        if (source.equals("San Jose")) 
		return 230;
        if (source.equals("Austin")) 
		return 250;
        if (source.equals("Jacksonville"))
		return 130;
        if (source.equals("Fort Worth"))
		return 175;
        if (source.equals("Columbus")) 
		return 155;
        if (source.equals("Charlotte"))
		return 145;
        if (source.equals("Indianapolis"))
		return 165;
        if (source.equals("San Francisco"))
		return 195;
        if (source.equals("Seattle"))
		return 185;
        if (source.equals("Denver"))
		return 225;
        if (source.equals("Washington DC")) 
	    return 205;

        return 0;
    }
}