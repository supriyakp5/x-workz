class Running{

public static void main (String[] args)
{

int step=4;
int steps=5;
int length=15;
Ladder.stepUp(step);
Ladder.stepDown(steps);
Ladder.extend(length);

boolean tof=true;
boolean tofs=false;

Ladder.fold(tof);
Ladder.chekStability(tofs);

String name="wooden";
int quality=10;
char surface='g';

Ladder.place(name,quality,surface);

int qun=8;
float amount=200.50f;
double width=5.5;
Ladder.price(qun,amount,width);



String n ="IndianFood";
int price=100;
Fooditem.northIndian(n,price);

int item=50;
float time =6.30f;
Fooditem.chats(item,time);

double prices=499.50;
double quantity=8.5;
Fooditem.milkshake(price,quantity);

boolean m=true;
boolean c=false;
Fooditem.icecream(m,c);

char online='y';
Fooditem.order(online);

char bake='y';
char fry='n';
char steam='y';
Fooditem.prepare(bake,fry,steam);

String nam="pepper";
double qunt=9.0;
int rate=9;
Fooditem.masala(nam,qunt,rate);


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
int quantity1=1;
char size='s';
Beer.serve(brand,quantity1,size);


int qun=5;
float amount=300.50f;
double width = 200.5;
Beer.price(qun,(int)amount,(int) width);
	



}
}