class Runbeer {
public static void main(String[] args) 
{
int pours=1;
int drinks=3;
int chills=5;
Beer.pour(pours);
Beer.drink(drinks);
Beer.chill(chills);   

boolean ToF=true;
boolean ToFs=false;
Beer.openbottele(ToF);
Beer.checkcontent(ToFs);



String brand="KF";
int quantity=1;
char size='s';
Beer.serve(brand,quantity,size);


int qun=5;
float amount=300.50f;
double width = 200.5;
Beer.price(qun,(int)amount,(int) width);
		
}
}