import java.io.*;
class ktm_shwrm
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int k,n;
System.out.println("******Welcome TO******");
System.out.println("________________ ________________  ___------");
System.out.println("_____________  //_/___  __/___   |/  /----");
System.out.println("____________  ,<   __  /   __  /|_/ /---");
System.out.println("___________  /| |  _  /    _  /  / /--");
System.out.println("__________/_/ |_|  /_/     /_/  /_/ -");
System.out.println("");
System.out.println("");
System.out.println("The Catalog");
System.out.println("-------------------");
System.out.println("");
System.out.println(" 1 - KTM 1190 RC8 R");
System.out.println(" 2 - KTM RC 390");
System.out.println(" 3 - KTM RC 200");
System.out.println(" 4 - KTM RC 125");
System.out.println(" 5 - KTM Duke 125");
System.out.println(" 6 - Customization");
System.out.println(" 7 - Give you feedback");
System.out.print("");
k=Integer.parseInt(br.readLine());
switch (k)
{
case 1: //case 1 1190 RC8 R
int O,o=1,c;
System.out.println("Thank you for choosing KTM 1190 RC8 R");
System.out.println("");
System.out.println("Its Specifications");
System.out.println("__________________");
System.out.println("");
System.out.println("Technical Specifications of KTM 1190 RC8 R >");
System.out.println("");
System.out.println("Type                - Motorcycle");
System.out.println("Engine Displacement - 1195.00 cc");
System.out.println("Engine Type 	    - 2-cylinder, 4-stroke, spark-ignition engine, 75 V arrangement, liquid-cooled");
System.out.println("Engine Starting     - Electric Start");
System.out.println("Maximum Power       - 173 hp");
System.out.println("Transmission        - 6-speed, claw shifted");
System.out.println("");
System.out.println("Electricals - Battery");
System.out.println("");
System.out.println("Brakes >");
System.out.println("");
System.out.println("Front Brake - Twin-disc brake with radially mounted four-piston brake calipers; floating brake discs");
System.out.println("");
System.out.println("Rear Brake - Single-disc brake with two-piston brake caliper; fixed brake disc");
System.out.println("");
System.out.println("Chassis and Suspension >");
System.out.println("");
System.out.println("Frame               -  ????");
System.out.println("Front Suspension    - WP Suspension Up Side Down");
System.out.println("Rear Suspension     - WP Suspension Monoshock");
System.out.println("");
System.out.println("Tyres >");
System.out.println("Wheel Type          - ????");
System.out.println("");
System.out.println("Dimensions");
System.out.println("Length x Width x Height  -  -- x -- x 805 mm");
System.out.println("Wheelbase                - 1425 mm");
System.out.println("Weight                   - 184 kg");
System.out.println("Ground Clearance	     -  110 mm");
System.out.println("Petrol Tank Capacity     - 16.5 litres");
System.out.println("");
{
System.out.println("Its is available in 2 colors :");
System.out.println(" 1 (letter o) - Orange");
System.out.println(" 2 (letter w) - White");
c=Integer.parseInt(br.readLine());
switch (c)
{
case 1:
System.out.println("Thank you for choose KTM 1190 RC8 R in Orange");
System.out.println("Prices of KTM 1190 RC8 R is only Rs 20,00,000");
break;
case 2:
System.out.println("Thank you for choose KTM 1190 RC8 R in White");
System.out.println("Prices of KTM 1190 RC8 R is only Rs 20,00,000");
break;
default :
System.out.println("This color code is incorrect, plz retry."); 
System.out.println("");
}
}
System.out.println("Now plz enter the quantity for KTM 1190 RC8 R");
n=Integer.parseInt(br.readLine());
{
if(n<=2)
O=(2000000*n)*(13/100);
else
o=(2000000*n)*(20/100);
O=o+2000000;
System.out.println("Your amount for this choice is Rs "+O);
}
break;
case 2: //case 2 RC 390
double p,P;
System.out.println("Thank you for choosing  KTM RC 390");
System.out.println("");
System.out.println("Its Specifications");
System.out.println("__________________");
System.out.println("");
System.out.println("Technical Specifications of KTM RC 390 >");
System.out.println("");
System.out.println("Type	                - Motorcycle");
System.out.println("Engine Displacement	    - 373.20 cc");
System.out.println("Engine Type	            - Single cylinder 4 stroke water cooled engine");
System.out.println("Engine Starting	        - Electric starter");
System.out.println("Bore x Stroke	        - 89mm x 60mm");
System.out.println("Engine Lubrication	    - Forced oil lubrication with 2 Eaton pumps");
System.out.println("Clutch	                - Wet multi-disc clutch / mechanically operated");
System.out.println("Ignition	            - Contactless, controlled, fully electronic ignition system with digital ignition timing adjustment");
System.out.println("Cooling System	        - Liquid cooling system, continuous circulation of cooling liquid with water pump");
System.out.println("Maximum Power	        - 44 hp");
System.out.println("Transmission	        - 6 speed, claw shifted");
System.out.println("");
System.out.println("Electricals >");
System.out.println("");
System.out.println("Battery	                - 12V/6Ah");
System.out.println("");
System.out.println("Brakes >");
System.out.println("");
System.out.println("Front Brake	300 mm Disc brake with four pot brake caliper");
System.out.println("Rear Brake	230 mm	Disc brake with one-pot brake caliper, floating brake discs");
System.out.println("");
System.out.println("Chassis and Suspension >");
System.out.println("");
System.out.println("Frame	                - Tubular space frame made from steel, powder -coated");
System.out.println("Front Suspension	    - 125 mm");
System.out.println("Rear Suspension	        - 150 mm");
System.out.println("");
System.out.println("Tyres >");
System.out.println("");
System.out.println("Wheel Type	            - 17 inch cast light alloy wheels");
System.out.println("");
System.out.println("Dimensions >");
System.out.println("");
System.out.println("Length x Width x Height	- -- x -- x 820 mm");
System.out.println("Wheelbase	            - 1340 mm");
System.out.println("Weight	                - 147 kg");
System.out.println("Ground Clearance	    - 178.5 mm");
System.out.println("Petrol Tank Capacity	- 9.5 litres");
System.out.println("Reserve Tank Capacity	- 1.5 litres");
System.out.println("");
System.out.println("KTM RC 390 just worth Rs 2,05,000 ");
System.out.println("On buying 2 bikes you'll get 13.5% discount,");
System.out.println("And on buying more you'll get 20% discount.");
System.out.println("Now plz enter the quantity for KTM RC 390");
n=Integer.parseInt(br.readLine());
{
if(n<=2)
p=(205000*n)*(13.5/100);
else
p=(205000*n)*(20/100);
}
P=p+205000;
System.out.println("Your amount for this choice is Rs "+P);
break;
case 3: //case 3 RC 200
int R,r;
System.out.println("Thank you for choosing KTM RC 200");
System.out.println("");
System.out.println("Its Specifications");
System.out.println("__________________");
System.out.println("");
System.out.println("Technical Specifications of KTM RC 390 >");
System.out.println("");
System.out.println("Type	                - Motorcycle");
System.out.println("Engine Displacement	    - 199.50 cc");
System.out.println("Engine Type	            - Single cylinder 4 stroke spark - ignition engine");
System.out.println("Engine Starting	        - Electric starter");
System.out.println("Bore x Stroke	        - 72mm x 49mm");
System.out.println("Engine Lubrication	    - Forced oil lubrication with 1 rotor pump");
System.out.println("Clutch	                - Clutch in oil bath / mechanically operated");
System.out.println("Ignition	            - Contactless, controlled, fully electronic ignition system with digital ignition timing adjustment");
System.out.println("Cooling System	        - Liquid cooling system, continuous circulation of cooling liquid with water pump");
System.out.println("Maximum Power	        - 19 kW (25 hp)");
System.out.println("Transmission	        - 6 speed, claw shifted");
System.out.println("");
System.out.println("Electricals >");
System.out.println("");
System.out.println("Battery	                - 12V/6Ah");
System.out.println("");
System.out.println("Brakes >");
System.out.println("");
System.out.println("Front Brake	         - 300 mm Disc brake with four pot brake caliper");
System.out.println("Rear Brake	         - 230 mm Disc brake with one-pot brake caliper, floating brake discs");
System.out.println("");
System.out.println("Chassis and Suspension >");
System.out.println("");
System.out.println("Frame	                - Tubular space frame made from steel, powder -coated");
System.out.println("Front Suspension	    - WP Suspension 4357");
System.out.println("Rear Suspension	        - WP Suspension 4618 EM");
System.out.println("");
System.out.println("Tyres >");
System.out.println("");
System.out.println("Wheel Type	            - ??????");
System.out.println("");
System.out.println("Dimensions >");
System.out.println("");
System.out.println("Length x Width x Height	- -- x -- x 820 mm");
System.out.println("Wheelbase	            - 1340 mm");
System.out.println("Ground Clearance	    - 178.5 mm");
System.out.println("Petrol Tank Capacity	- 10 litres");
System.out.println("");
System.out.println("KTM RC 200 just worth Rs 1,60,000 ");
System.out.println("On buying 2 bikes you'll get 13% discount,");
System.out.println("And on buying more you'll get 20% discount.");
System.out.println("Now plz enter the quantity for KTM RC 200");
n=Integer.parseInt(br.readLine());
{
if(n<=2)
r=(160000*n)*(13/100);
else
r=(160000*n)*(20/100);
}
R=r+160000;
System.out.println("Your amount for this choice is Rs "+R);
break;
case 4: // case 4 RC 125
int S,s;
System.out.println("Thank you for choosing KTM RC 125");
System.out.println("");
System.out.println("Its Specifications");
System.out.println("__________________");
System.out.println("");
System.out.println("Technical Specifications of KTM RC 390 >");
System.out.println("");
System.out.println("Type	                - Motorcycle");
System.out.println("Engine Displacement	    - 125.00 cc");
System.out.println("Engine Type	            - Single cylinder 4 stroke engine, water cooled");
System.out.println("Engine Starting	        - Electric starter");
System.out.println("Bore x Stroke	        - 58mm x 47.2mm");
System.out.println("Engine Lubrication	    - Forced oil lubrication with 2 Eaton pumps");
System.out.println("Clutch	                - Wet multi-disc clutch / mechanically operated");
System.out.println("Ignition	            - Contactless, controlled, fully electronic ignition system with digital ignition timing adjustment");
System.out.println("Cooling System	        - Liquid cooling system, continuous circulation of cooling liquid with water pump");
System.out.println("Maximum Power	        - 11 kW (15 hp)");
System.out.println("Transmission	        - 6 speed, claw shifted");
System.out.println("");
System.out.println("Electricals >");
System.out.println("");
System.out.println("Battery	                - ????");
System.out.println("");
System.out.println("Brakes >");
System.out.println("");
System.out.println("Front Brake	         - Disc brake with four pot brake caliper");
System.out.println("Rear Brake	         - Disc brake with one-pot brake caliper, floating brake discs");
System.out.println("");
System.out.println("Chassis and Suspension >");
System.out.println("");
System.out.println("Frame	                - Tubular space frame made from steel, powder -coated");
System.out.println("Front Suspension	    - WP Suspension 4357");
System.out.println("Rear Suspension	        - WP Suspension 4618 EM");
System.out.println("");
System.out.println("Tyres >");
System.out.println("");
System.out.println("Wheel Type	            - ??????");
System.out.println("");
System.out.println("Dimensions >");
System.out.println("");
System.out.println("Length x Width x Height	- -- x -- x -- mm");
System.out.println("");
System.out.println("KTM RC 125 just worth Rs 1,30,000 ");
System.out.println("On buying 2 bikes you'll get 13% discount,");
System.out.println("And on buying more you'll get 20% discount.");
System.out.println("Now plz enter the quantity for KTM RC 125");
n=Integer.parseInt(br.readLine());
{
if(n<=2)
s=(130000*n)*(13/100);
else
s=(130000*n)*(20/100);
}
S=s+130000;
System.out.println("Your amount for this choice is Rs "+S);
break;
case 5: //case 5 duke 125
int T,t,ch;
System.out.println("Thank you for choosing KTM duke 125");
System.out.println("");
System.out.println("Its Specifications");
System.out.println("__________________");
System.out.println("");
System.out.println("Technical Specifications of KTM duke 125 >");
System.out.println("");
System.out.println("Type	                - Motorcycle");
System.out.println("Engine Displacement	    - 125.00 cc");
System.out.println("Engine Type	            - Single cylinder 4 stroke engine, water cooled");
System.out.println("Engine Starting	        - Electric starter");
System.out.println("Maximum Power	        - 12 Bhp @ 10500 rpm");
System.out.println("Maximum Torque	        - 12 Nm @ 8000 rpm");
System.out.println("Transmission	        - 6 speed, claw shifted");
System.out.println("Top speed	            - 120 kmph");
System.out.println("");
System.out.println("Electricals >");
System.out.println("");
System.out.println("Battery	                - ????");
System.out.println("");
System.out.println("Brakes >");
System.out.println("");
System.out.println("Front Brake	         - Disc brake with four pot brake caliper");
System.out.println("Rear Brake	         - Disc brake with one-pot brake caliper, floating brake discs");
System.out.println("");
System.out.println("Chassis and Suspension >");
System.out.println("");
System.out.println("Frame	                - ????");
System.out.println("Front Suspension	    - Telescopic");
System.out.println("Rear Suspension	        - Mono-Shock");
System.out.println("");
System.out.println("Tyres >");
System.out.println("");
System.out.println("Wheel Type	            - ??????");
System.out.println("");
System.out.println("Dimensions >");
System.out.println("");
System.out.println("Length x Width x Height	- -- x -- x -- mm");
System.out.println("Wheelbase	              - 1367 mm");
System.out.println("Weight	                  - 127 kg");
System.out.println("Ground Clearance	      - 170 mm");
System.out.println("Petrol Tank Capacity	  - 11 litres");
System.out.println("");
System.out.println("Its is available in 2 colors :");
System.out.println(" 1 - Orange");
System.out.println(" 2 - White");
ch=Integer.parseInt(br.readLine());
{
switch (ch)
{
case 1:
System.out.println("Thank you for choose KTM duke 125 in Orange");
System.out.println("Prices of KTM duke 125 is only Rs 90,000");
break;
case 2:
System.out.println("Thank you for choose KTM 1190 RC8 R in White");
System.out.println("Prices of KTM 1190 RC8 R is only Rs 90,000");
break;
default:
System.out.println("This color code is incorrect, plz retry.");
}
}
System.out.println("KTM duke 125 just worth Rs 90,000");
System.out.println("On buying 2 bikes you'll get 10% discount,");
System.out.println("And on buying more you'll get 13% discount.");
System.out.println("Now plz enter the quantity for KTM duke 125");
n=Integer.parseInt(br.readLine());
{
if(n<=2)
t=(90000*n)*(10/100);
else
t=(90000*n)*(13/100);
}
T=t+90000;
System.out.println("Your amount for this choice is Rs "+T); 
break;
case 6: // case 6 customizer
int Tl,Tp=1,bk;
System.out.println("Welcome to bike customizer ");
System.out.println("");
System.out.println("");
System.out.println("              //");
System.out.println("            /' ([],----~~~~~---__                             _________");
System.out.println("          /' _-~~\0       KTM    ~~--_               ___---~~~        /'");
System.out.println("         /_-~                       _-~-_______---~~/               /'");
System.out.println("         (___________/           _-~     |_____--~~/             _-~");
System.out.println("      _ ----- _~-_\\\\        _-~                 (_ ______---~~~--_");
System.out.println("   _-~         ~-_~\\\\      (                      ~-_  |          ~-_");
System.out.println(" |/~~~~|          | |~~       ~-_        ____          ~~--__-----_    ||");
System.out.println(";    / | ______-----|           ~-__--~~    ~-_             ~~--_ |    .");
System.out.println("|   | |((*)~~~~~~~~~~|      __--~~             ~-_               ) |   |");
System.out.println("|    |  |~|~---------)__--~~                      |_____________/ /    ,");
System.out.println("  |    ~-----~    /  /~                             )  |    ~-----~    /");
System.out.println("  |    ~-----~    /  /~                             )  |    ~-----~    /");
System.out.println("  ~-_         _-~ /_______________________________/    `-_         _-~");
System.out.println("      ~ ----- ~                                            ~ ----- ~");
System.out.println("Enter your wish,what all bikes do you want to owe??");
System.out.println("");
System.out.println("For all 5 bikes enter '5'. ");
System.out.println("For choice enter '6'.");
System.out.println("");
bk=Integer.parseInt(br.readLine());
if(bk==5)
System.out.println("You chose to buy all of them, you'll be discounted 50% of total price.");
System.out.println("****Congratulations****");
Tl=(2000000+205000+160000+130000+90000)/2;
System.out.println("Total price is "+Tl);
if(bk==6);
System.out.println("To choose the combinatons of bikes. Enter bike codes. Discounts will be 13% on each");
System.out.println("KTM 1190 RC8 R (bike code)~ 1190 ");
System.out.println("KTM RC 390 (bike code)~ 390 ");
System.out.println("KTM RC 200 (bike code)~ 200 ");
System.out.println("KTM RC 125 (bike code)~ 125 ");
System.out.println("KTM duke 125 (bike code)~ 1252 ");
int cd1=Integer.parseInt(br.readLine());
int cd2=Integer.parseInt(br.readLine());
{
if(cd1==1190&&cd2==390) 
{
Tp=(2000000+205000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==390&&cd2==200)
{
Tp=(205000+160000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==200&&cd2==125)
{
Tp=(160000+130000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==125&&cd2==1252)
{
Tp=(130000+90000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==1190&&cd2==200)
{
Tp=(2000000+160000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==1190&&cd2==125)
{
Tp=(2000000+130000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==1190&&cd2==1252)
{ 
Tp=(2000000+90000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==390&&cd2==125)
{ 
Tp=(205000+130000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==390&&cd2==1252)
{ 
Tp=(205000+90000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==390&&cd2==200)
{ 
Tp=(2000000+160000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==200&&cd2==125) 
{
Tp=(160000+130000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==200&&cd2==1252)
{ 
Tp=(160000+90000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1==125&&cd2==1252) 
{
Tp=(130000+90000)/5;
System.out.println("Total price is RS "+Tp);
}
if(cd1<=cd2);
{
System.out.println("Plz enter cose with higher value and than the code with smaller value. If same choice than enter different choises as per your wish.");
}
}
break;
case 7:
System.out.println("Plz tell us you liked our service or hated it.");
System.out.println("If you liked or loved it plz enter 1");
System.out.println("If you hated it plz enter 0");
int fd=Integer.parseInt(br.readLine());
if(fd==1)
System.out.println("Thankyou for loving our service, plz give a feedback why you loved our service.");
System.out.println("");
if(fd==0)
System.out.println("We are very sorry to trouble you, this will never be repeated, plz give a feedback to tell us why you are not satisfied with us.");
System.out.println("");
String str;
System.out.println("We like have your feedback, plz express your experience with us....");
System.out.println("------------");
str=br.readLine();
System.out.println("------------");
System.out.println(""); 
System.out.println("Thank you for your feedback");
System.out.println("Have a good day with your new KTM......come back again....");
break;
default :
System.out.println("This choice dose not match with any options.Plz try again...");
break;
}
}
}







