import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.awt.*;  
import java.applet.*;


public class javabusiness
{
public static void main(String args[])
{

int a=10000,b=10000,i,j,t,k=0,x=0,y=0;
int f[]= new int[36];
int g[]= new int[36];
System.out.println("THIS IS A 2 PLAYER GAME ");
System.out.println("BOTH THE PLAYERS START WITH A STARTING MONEY OF Rs10000");
Scanner s =new Scanner(System.in);
Random r = new Random();
for(i=0;i<36;i++)
f[i]=0;
for(i=0;i<36;i++)
g[i]=0;
do
{
System.out.println("Player 1 press 1 to roll your dice");
System.out.println("Player 2 press 2 to roll your dice");
k=s.nextInt();
if(k==1)
{ i=r.nextInt(5)+1;
System.out.println("The dice rolled to "+i);
x=(x+i)%36;
if(x==0)
{
System.out.println("You have reached at start point.You get Rs1500 BONUS");
a=a+1500;
}
else if(x==1)
{
	System.out.println("You are at bombay");
if(f[1]==0)
{
	System.out.println("Do You want to purchase BOMBAY? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[1]=1;
f[1]=1;
a=a-8500;
}
}
else if(f[1]==1)
{
System.out.println("BOMBAY IS SOLD!");
if(g[1]==2)
{System.out.println("YOU PAY RENT OF Rs900");
a=a-900;
b=b+900;
}
}
}
else if(x==2)
{System.out.println("You are at WaterWorks ");
if(f[2]==0)
{System.out.println("Do You want to purchase WaterWorks ? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[2]=1;
f[2]=1;
a=a-3200;
}
}
else if(f[2]==1)
{
System.out.println(" WaterWorks IS SOLD!");
if(g[2]==2)
{System.out.println("YOU PAY RENT OF Rs500");
a=a-500;
b=b+500;
}
}
}
else if(x==3)
{System.out.println("You are at RAILWAYS");
if(f[3]==0)
{System.out.println("Do You want to purchase RAILWAYS? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[3]=1;
f[3]=1;
a=a-9500;
}
}
else if(f[3]==1)
{
System.out.println(" RAILWAYS IS SOLD!");
if(g[3]==2)
{System.out.println("YOU PAY RENT OF Rs1000");
a=a-1000;
b=b+1000;
}
}
}
else if(x==4)
{System.out.println("You are at AHMEDABAD");
if(f[4]==0)
{System.out.println("Do You want to purchase AHMEDABAD? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[4]=1;
f[4]=1;
a=a-4000;
}
}
else if(f[4]==1)
{
System.out.println(" AHMEDABAD IS SOLD!");
if(g[4]==2)
{System.out.println("YOU PAY RENT OF Rs300");
a=a-300;
b=b+300;
}
}
}
else if(x==5)
{
System.out.println("YOU ARE AT INCOME TAX PAY Rs200");
a=a-200;
}
else if(x==6)
{System.out.println("You are at INDORE");
if(f[6]==0)
{System.out.println("Do You want to purchase INDORE? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[6]=1;
f[6]=1;
a=a-1500;
}
}
else if(f[6]==1)
{
System.out.println(" INDORE IS SOLD!");
if(g[6]==2)
{System.out.println("YOU PAY RENT OF Rs100");
a=a-100;
b=b+100;
}
}
}
else if(x==8)
{System.out.println("You are at JAIPUR");
if(f[8]==0)
{System.out.println("Do You want to purchase JAIPUR? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[8]=1;
f[8]=1;
a=a-3000;
}
}
else if(f[8]==1)
{
System.out.println(" JAIPUR IS SOLD!");
if(g[8]==2)
{System.out.println("YOU PAY RENT OF Rs200");
a=a-200;
b=b+200;
}
}
}
else if(x==9)
{ System.out.println("YOU ARE AT JAIL PAY Rs200");
a=a-200;
}
else if(x==10)
{System.out.println("You are at DELHI");
if(f[10]==0)
{System.out.println("Do You want to purchase DELHI? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[10]=1;
f[10]=1;
a=a-6000;
}
}
else if(f[10]==1)
{
System.out.println(" DELHI IS SOLD!");
if(g[10]==2)
{System.out.println("YOU PAY RENT OF Rs700");
a=a-700;
b=b+700;
}
}
}
else if(x==11)
{System.out.println("You are at CHANDIGARH");
if(f[11]==0)
{System.out.println("Do You want to purchase CHANDIGARH? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[11]=1;
f[11]=1;
a=a-2500;
}
}
else if(f[11]==1)
{
System.out.println(" CHANDIGARH IS SOLD!");
if(g[11]==2)
{System.out.println("YOU PAY RENT OF Rs200");
a=a-200;
b=b+200;
}
}
}
else if(x==12)
{System.out.println("You are at ELECTRIC COMPANY");
if(f[12]==0)
{System.out.println("Do You want to purchase ELECTRIC COMPANY? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[12]=1;
f[12]=1;
a=a-2500;
}
}
else if(f[12]==1)
{
System.out.println(" ELECTRIC COMPANY IS SOLD!");
if(g[12]==2)
{System.out.println("YOU PAY RENT OF Rs400");
a=a-400;
b=b+400;
}
}
}
else if(x==13)
{System.out.println("You are at B.E.S.T");
if(f[13]==0)
{System.out.println("Do You want to purchase BEST? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[13]=1;
f[13]=1;
a=a-3500;
}
}
else if(f[13]==1)
{
System.out.println(" B.E.S.T IS SOLD!");
if(g[13]==2)
{System.out.println("YOU PAY RENT OF Rs600");
a=a-600;
b=b+600;
}
}
}
else if(x==14)
{System.out.println("You are at SHIMLA");
if(f[14]==0)
{System.out.println("Do You want to purchase SHIMLA? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[14]=1;
f[14]=1;
a=a-2200;
}
}
else if(f[14]==1)
{
System.out.println(" SHIMLA IS SOLD!");
if(g[14]==2)
{System.out.println("YOU PAY RENT OF Rs200");
a=a-200;
b=b+200;
}
}
}
else if(x==15)
{System.out.println("You are at AMRITSAR");
if(f[15]==0)
{System.out.println("Do You want to purchase AMRITSAR? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[15]=1;
f[15]=1;
a=a-3300;
}
}
else if(f[15]==1)
{
System.out.println(" AMRITSAR IS SOLD!");
if(g[15]==2)
{System.out.println("YOU PAY RENT OF Rs300");
a=a-300;
b=b+300;
}
}
}
else if(x==17)
{System.out.println("You are at SRINAGAR");
if(f[17]==0)
{System.out.println("Do You want to purchase SRINAGAR? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[17]=1;
f[17]=1;
a=a-5000;
}
}
else if(f[17]==1)
{
System.out.println(" SRINAGAR IS SOLD!");
if(g[17]==2)
{System.out.println("YOU PAY RENT OF Rs500");
a=a-500;
b=b+500;
}
}
}
else if(x==18)
{ System.out.println("YOU HAVE VISITED CLUB YOU GET Rs200");
a=a+200;
}
else if(x==19)
{System.out.println("You are at AGRA");
if(f[19]==0)
{System.out.println("Do You want to purchase AGRA ? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[19]=1;
f[19]=1;
a=a-2500;
}
}
else if(f[19]==1)
{
System.out.println(" AGRA IS SOLD!");
if(g[19]==2)
{System.out.println("YOU PAY RENT OF Rs200");
a=a-200;
b=b+200;
}
}
}
else if(x==21)
{System.out.println("You are at KANPUR");
if(f[21]==0)
{System.out.println("Do You want to purchase KANPUR? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[21]=1;
f[21]=1;
a=a-4000;
}
}
else if(f[21]==1)
{
System.out.println(" KANPUR IS SOLD!");
if(g[21]==2)
{System.out.println("YOU PAY RENT OF Rs400");
a=a-400;
b=b+400;
}
}
}
else if(x==22)
{System.out.println("You are at PATNA");
if(f[22]==0)
{System.out.println("Do You want to purchase PATNA? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[22]=1;
f[22]=1;
a=a-2000;
}
}
else if(f[22]==1)
{
System.out.println(" PATNA IS SOLD!");
if(g[22]==2)
{System.out.println("YOU PAY RENT OF Rs200");
a=a-200;
b=b+200;
}
}
}
else if(x==23)
{System.out.println("You are at DARJEELING");
if(f[23]==0)
{System.out.println("Do You want to purchase DARJEELING? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[23]=1;
f[23]=1;
a=a-2500;
}
}
else if(f[23]==1)
{
System.out.println(" DARJEELING IS SOLD!");
if(g[23]==2)
{System.out.println("YOU PAY RENT OF Rs200");
a=a-200;
b=b+200;
}
}
}
else if(x==24)
{System.out.println("You are at AIR INDIA");
if(f[24]==0)
{System.out.println("Do You want to purchase AIR INDIA ? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[24]=1;
f[24]=1;
a=a-10500;
}
}
else if(f[24]==1)
{
System.out.println(" AIR INDIA IS SOLD!");
if(g[24]==2)
{System.out.println("YOU PAY RENT OF Rs1200");
a=a-1200;
b=b+1200;
}
}
}
else if(x==25)
{System.out.println("You are at CALCUTTA");
if(f[25]==0)
{System.out.println("Do You want to purchase CALCUTTA? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[25]=1;
f[25]=1;
a=a-6500;
}
}
else if(f[25]==1)
{
System.out.println(" CALCUTTA IS SOLD!");
if(g[25]==2)
{System.out.println("YOU PAY RENT OF Rs700");
a=a-700;
b=b+700;
}
}
}
else if(x==26)
{System.out.println("You are at HYDERABAD");
if(f[26]==0)
{System.out.println("Do You want to purchase HYDERABAD? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[26]=1;
f[26]=1;
a=a-3500;
}
}
else if(f[26]==1)
{
System.out.println(" HYDERABAD IS SOLD!");
if(g[26]==2)
{System.out.println("YOU PAY RENT OF Rs400");
a=a-400;
b=b+400;
}
}
}
else if(x==27)
{ System.out.println("YOU HAVE VISITED REST HOUSE YOU PAY Rs200");
a=a-200;
}
else if(x==28)
{System.out.println("You are at MADRAS");
if(f[28]==0)
{System.out.println("Do You want to purchase MADRAS\nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[28]=1;
f[28]=1;
a=a-7000;
}
}
else if(f[28]==1)
{
System.out.println(" MADRAS IS SOLD!");
if(g[28]==2)
{System.out.println("YOU PAY RENT OF Rs900");
a=a-900;
b=b+900;
}
}
}
else if(x==30)
{System.out.println("You are at BANGALORE");
if(f[30]==0)
{System.out.println("Do You want to purchase BANGALORE? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[30]=1;
f[30]=1;
a=a-4000;
}
}
else if(f[30]==1)
{
System.out.println(" BANGALORE IS SOLD!");
if(g[30]==2)
{System.out.println("YOU PAY RENT OF Rs400");
a=a-400;
b=b+400;
}
}
}
else if(x==32)
{System.out.println("You are at OOTACMAND");
if(f[32]==0)
{System.out.println("Do You want to purchase OOTACMAND? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[32]=1;
f[32]=1;
a=a-2500;
}
}
else if(f[32]==1)
{
System.out.println(" OOTACMAND IS SOLD!");
if(g[32]==2)
{System.out.println("YOU PAY RENT OF Rs200");
a=a-200;
b=b+200;
}
}
}
else if(x==33)
{System.out.println("You are at COCHIN");
if(f[33]==0)
{System.out.println("Do You want to purchase COCHIN? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[33]=1;
f[33]=1;
a=a-3000;
}
}
else if(f[33]==1)
{
System.out.println(" COCHIN IS SOLD!");
if(g[33]==2)
{System.out.println("YOU PAY RENT OF Rs300");
a=a-300;
b=b+300;
}
}
}
else if(x==34)
{System.out.println("You are at MOTOR-BOAT");
if(f[34]==0)
{System.out.println("Do You want to purchase MOTOR-BOAT ? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[34]=1;
f[34]=1;
a=a-5500;
}
}
else if(f[34]==1)
{
System.out.println(" MOTORBOAT IS SOLD!");
if(g[34]==2)
{System.out.println("YOU PAY RENT OF Rs400");
a=a-400;
b=b+400;
}
}
}
else if(x==7)
{
if((x%2)==0)
{
if(i==2)
{System.out.println("SCHOOL FESS PAY Rs1000\n");
a=a-1000;
}
if(i==4)
{
System.out.println("MARRIAGE CELEBERATIONS PAY Rs2000");
a=a-2000;
}
if(i==6)
{
System.out.println("PAY INSURANCE PREMIUM Rs1500");
a=a-1500;
}
}
else
{
if(i==1)
{
System.out.println("WONA LOTTERY Rs2000");
a=a+2000;
}
if(i==3)
{
System.out.println("INCOME TAX REFUND Rs2500");
a=a+2500;
}
if(i==5)
{System.out.println("WON A BEAUTY CONTEST OF Rs2500");
a=a+2500;
}
}
}
else if(x==20)
{
if((x%2)==0)
{
if(i==2)
{System.out.println("SCHOOL FESS PAY Rs1000\n");
a=a-1000;
}
if(i==4)
{
System.out.println("MARRIAGE CELEBERATIONS PAY Rs2000");
a=a-2000;
}
if(i==6)
{
System.out.println("PAY INSURANCE PREMIUM Rs1500");
a=a-1500;
}
}
else
{
if(i==1)
{
System.out.println("WONA LOTTERY Rs2000");
a=a+2000;
}
if(i==3)
{
System.out.println("INCOME TAX REFUND Rs2500");
a=a+2500;
}
if(i==5)
{System.out.println("WON A BEAUTY CONTEST OF Rs2500");
a=a+2500;
}
}
}
else if(x==31)
{
System.out.println("PAY WEALTH TAX Rs200");
a=a-200;
}
else if(x==16)
{
if((x%2)==0)
{
if(i==2)
{System.out.println("WON A LOTTERY OF Rs2000\n");
a=a+2000;
}
if(i==4)
{
System.out.println("WON A BEAUTY CONTEST OF Rs2500");
a=a+2500;
}
if(i==6)
{
System.out.println("INCOME TAX REFUND Rs2500");
a=a+2500;
}
}
else
{
if(i==1)
{
System.out.println("SCHOOL FEES Rs1000");
a=a-1000;
}
if(i==3)
{
System.out.println("MARRIAGE CELEBERATION Rs2000");
a=a-2000;
}
if(i==5)
{System.out.println("PAY INSURANCE PREMIUM Rs1500");
a=a-1500;
}
}
}
else if(x==29)
{
if((x%2)==0)
{
if(i==2)
{System.out.println("WON A LOTTERY OF Rs2000\n");
a=a+2000;
}
if(i==4)
{
System.out.println("WON A BEAUTY CONTEST OF Rs2500");
a=a+2500;
}
if(i==6)
{
System.out.println("INCOME TAX REFUND Rs2500");
a=a+2500;
}
}
else
{
if(i==1)
{
System.out.println("SCHOOL FEES Rs1000");
a=a-1000;
}
if(i==3)
{
System.out.println("MARRIAGE CELEBERATION Rs2000");
a=a-2000;
}
if(i==5)
{System.out.println("PAY INSURANCE PREMIUM Rs1500");
a=a-1500;
}
}
}
else if(x==35)
{System.out.println("You are at MARGOA ");
if(f[35]==0)
{System.out.println("Do You want to purchase MARGOA? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[35]=1;
f[35]=1;
a=a-4000;
}
}
else if(f[35]==1)
{
System.out.println(" MARGOA IS SOLD!");
if(g[35]==2)
{System.out.println("YOU PAY RENT OF Rs400");
a=a-400;
b=b+400;
}
}
}
}
else if(k==2)
{ i=r.nextInt(5)+1;
System.out.println("The dice rolled to "+i);
x=(x+i)%36;
if(x==0)
{
System.out.println("You have reached at start point.You get Rs1500 BONUS");
b=b+1500;
}
else if(x==1)
{System.out.println("You are at bombay");
if(f[1]==0)
{System.out.println("Do You want to purchase BOMBAY? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[1]=2;
f[1]=1;
b=b-8500;
}
}
else if(f[1]==1)
{
System.out.println("BOMBAY IS SOLD!");
if(g[1]==1)
{System.out.println("YOU PAY RENT OF Rs900");
b=b-900;
a=a+900;
}
}
}
else if(x==2)
{System.out.println("You are at WaterWorks ");
if(f[2]==0)
{System.out.println("Do You want to purchase WaterWorks ? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[2]=2;
f[2]=1;
b=b-3200;
}
}
else if(f[2]==1)
{
System.out.println(" WaterWorks IS SOLD!");
if(g[2]==1)
{System.out.println("YOU PAY RENT OF Rs500");
b=b-500;
a=a+500;
}
}
}
else if(x==3)
{System.out.println("You are at RAILWAYS");
if(f[3]==0)
{System.out.println("Do You want to purchase RAILWAYS? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[3]=2;
f[3]=1;
b=b-9500;
}
}
else if(f[3]==1)
{
System.out.println(" RAILWAYS IS SOLD!");
if(g[3]==1)
{System.out.println("YOU PAY RENT OF Rs1000");
b=b-1000;
a=a+1000;
}
}
}
else if(x==4)
{System.out.println("You are at AHMEDABAD");
if(f[4]==0)
{System.out.println("Do You want to purchase AHMEDABAD? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[4]=2;
f[4]=1;
b=b-4000;
}
}
else if(f[4]==1)
{
System.out.println(" AHMEDABAD IS SOLD!");
if(g[4]==1)
{System.out.println("YOU PAY RENT OF Rs300");
b=b-300;
a=a+300;
}
}
}
else if(x==7)
{
if((x%2)==0)
{
if(i==2)
{System.out.println("SCHOOL FESS PAY Rs1000\n");
b=b-1000;
}
if(i==4)
{
System.out.println("MARRIAGE CELEBERATIONS PbY Rs2000");
b=b-2000;
}
if(i==6)
{
System.out.println("PAY INSURANCE PREMIUM Rs1500");
b=b-1500;
}
}
else
{
if(i==1)
{
System.out.println("WON LOTTERY Rs2000");
b=b+2000;
}
if(i==3)
{
System.out.println("INCOME TAX REFUND Rs2500");
b=b+2500;
}
if(i==5)
{System.out.println("WON BEAUTY CONTEST OF Rs2500");
b=b+2500;
}
}
}
else if(x==20)
{
if((x%2)==0)
{
if(i==2)
{System.out.println("SCHOOL FESS PAY Rs1000\n");
b=b-1000;
}
if(i==4)
{
System.out.println("MARRIAGE CELEBERATIONS PAY Rs2000");
b=b-2000;
}
if(i==6)
{
System.out.println("PAY INSURANCE PREMIUM Rs1500");
b=b-1500;
}
}
else
{
if(i==1)
{
System.out.println("WON LOTTERY Rs2000");
b=b+2000;
}
if(i==3)
{
System.out.println("INCOME TAX REFUND Rs2500");
b=b+2500;
}
if(i==5)
{System.out.println("WON BEAUTY CONTEST OF Rs2500");
b=b+2500;
}
}
}
else if(x==31)
{
System.out.println("PAY WEbLTH TAX Rs200");
b=b-200;
}
else if(x==16)
{
if((x%2)==0)
{
if(i==2)
{System.out.println("WON A LOTTERY OF Rs2000\n");
b=b+2000;
}
if(i==4)
{
System.out.println("WON BEAUTY CONTEST OF Rs2500");
b=b+2500;
}
if(i==6)
{
System.out.println("INCOME TAX REFUND Rs2500");
b=b+2500;
}
}
else
{
if(i==1)
{
System.out.println("SCHOOL FEES Rs1000");
b=b-1000;
}
if(i==3)
{
System.out.println("MARRIAGE CELEBERATION Rs2000");
b=b-2000;
}
if(i==5)
{System.out.println("PAY INSURANCE PREMIUM Rs1500");
b=b-1500;
}
}
}
else if(x==29)
{
if((x%2)==0)
{
if(i==2)
{System.out.println("WON LOTTERY OF Rs2000\n");
b=b+2000;
}
if(i==4)
{
System.out.println("WON BEAUTY CONTEST OF Rs2500");
b=b+2500;
}
if(i==6)
{
System.out.println("INCOME TAX REFUND Rs2500");
b=b+2500;
}
}
else
{
if(i==1)
{
System.out.println("SCHOOL FEES Rs1000");
b=b-1000;
}
if(i==3)
{
System.out.println("MARRIAGE CELEBERATION Rs2000");
b=b-2000;
}
if(i==5)
{System.out.println("PAY INSURANCE PREMIUM Rs1500");
b=b-1500;
}
}
}
else if(x==5)
{
System.out.println("YOU ARE AT INCOME TAX PAY Rs200");
b=b-200;
}
else if(x==6)
{System.out.println("You are at INDORE");
if(f[6]==0)
{System.out.println("Do You want to purchase INDORE? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[6]=2;
f[6]=1;
b=b-1500;
}
}
else if(f[6]==1)
{
System.out.println(" INDORE IS SOLD!");
if(g[6]==1)
{System.out.println("YOU PAY RENT OF Rs100");
b=b-100;
a=a+100;
}
}
}
else if(x==8)
{System.out.println("You are at JAIPUR");
if(f[8]==0)
{System.out.println("Do You want to purchase JAIPUR? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[8]=2;
f[8]=1;
b=b-3000;
}
}
else if(f[8]==1)
{
System.out.println(" JAIPUR IS SOLD!");
if(g[8]==1)
{System.out.println("YOU PAY RENT OF Rs200");
b=b-200;
a=a+200;
}
}
}
else if(x==9)
{ System.out.println("YOU ARE AT JAIL PAY Rs200");
b=b-200;
}
else if(x==10)
{System.out.println("You are at DELHI");
if(f[10]==0)
{System.out.println("Do You want to purchase DELHI? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[10]=2;
f[10]=1;
b=b-6000;
}
}
else if(f[10]==1)
{
System.out.println(" DELHI IS SOLD!");
if(g[10]==1)
{System.out.println("YOU PAY RENT OF Rs700");
b=b-700;
a=a+700;
}
}
}
else if(x==11)
{System.out.println("You are at CHANDIGARH");
if(f[11]==0)
{System.out.println("Do You want to purchase CHANDIGARH? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[11]=2;
f[11]=1;
b=b-2500;
}
}
else if(f[11]==1)
{
System.out.println(" CHANDIGARH IS SOLD!");
if(g[11]==1)
{System.out.println("YOU PAY RENT OF Rs200");
b=b-200;
a=a+200;
}
}
}
else if(x==12)
{System.out.println("You are at ELECTRIC COMPANY");
if(f[12]==0)
{System.out.println("Do You want to purchase ELECTRIC COMPANY? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[12]=2;
f[12]=1;
b=b-2500;
}
}
else if(f[12]==1)
{
System.out.println(" ELECTRIC COMPANY IS SOLD!");
if(g[12]==1)
{System.out.println("YOU PAY RENT OF Rs400");
b=b-400;
a=a+400;
}
}
}
else if(x==13)
{System.out.println("You are at B.E.S.T");
if(f[13]==0)
{System.out.println("Do You want to purchase BEST? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[13]=2;
f[13]=1;
b=b-3500;
}
}
else if(f[13]==1)
{
System.out.println(" B.E.S.T IS SOLD!");
if(g[13]==1)
{System.out.println("YOU PAY RENT OF Rs600");
b=b-600;
a=a+600;
}
}
}
else if(x==14)
{System.out.println("You are at SHIMLA");
if(f[14]==0)
{System.out.println("Do You want to purchase SHIMLA? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[14]=2;
f[14]=1;
b=b-2200;
}
}
else if(f[14]==1)
{
System.out.println(" SHIMLA IS SOLD!");
if(g[14]==1)
{System.out.println("YOU PAY RENT OF Rs200");
b=b-200;
a=a+200;
}
}
}
else if(x==15)
{System.out.println("You are at AMRITSAR");
if(f[15]==0)
{System.out.println("Do You want to purchase AMRITSAR? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[15]=2;
f[15]=1;
b=b-3300;
}
}
else if(f[15]==1)
{
System.out.println(" AMRITSAR IS SOLD!");
if(g[15]==1)
{System.out.println("YOU PAY RENT OF Rs300");
b=b-300;
a=a+300;
}
}
}
else if(x==17)
{System.out.println("You are at SRINAGAR");
if(f[17]==0)
{System.out.println("Do You want to purchase SRINAGAR? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[17]=2;
f[17]=1;
b=b-5000;
}
}
else if(f[17]==1)
{
System.out.println(" SRINAGAR IS SOLD!");
if(g[17]==1)
{System.out.println("YOU PAY RENT OF Rs500");
b=b-500;
a=a+500;
}
}
}
else if(x==18)
{ System.out.println("YOU HAVE VISITED CLUB YOU GET Rs200");
b=b+200;
}
else if(x==19)
{System.out.println("You are at AGRA");
if(f[19]==0)
{System.out.println("Do You want to purchase AGRA ? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[19]=2;
f[19]=1;
b=b-2500;
}
}
else if(f[19]==1)
{
System.out.println(" AGRA IS SOLD!");
if(g[19]==1)
{System.out.println("YOU PAY RENT OF Rs200");
b=b-200;
a=a+200;
}
}
}
else if(x==20)
{System.out.println("You are at ANDHRA PRADESH");
if(f[20]==0)
{System.out.println("Do You want to purchase ANDHRA PRADESH? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[20]=2;
f[20]=1;
b=b-2000;
}
}
else if(f[21]==1)
{
System.out.println(" KANPUR IS SOLD!");
if(g[21]==1)
{System.out.println("YOU PAY RENT OF Rs400");
b=b-400;
a=a+400;
}
}
}
else if(x==22)
{System.out.println("You are at PATNA");
if(f[22]==0)
{System.out.println("Do You want to purchase PATNA? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[22]=2;
f[22]=1;
b=b-2000;
}
}
else if(f[22]==1)
{
System.out.println(" PATNA IS SOLD!");
if(g[22]==1)
{System.out.println("YOU PAY RENT OF Rs200");
b=b-200;
a=a+200;
}
}
}
else if(x==23)
{System.out.println("You are at DARJEELING");
if(f[23]==0)
{System.out.println("Do You want to purchase DARJEELING? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[23]=2;
f[23]=1;
b=b-2500;
}
}
else if(f[23]==1)
{
System.out.println(" DARJEELING IS SOLD!");
if(g[23]==1)
{System.out.println("YOU PAY RENT OF Rs200");
b=b-200;
a=a+200;
}
}
}
else if(x==24)
{System.out.println("You are at AIR INDIA");
if(f[24]==0)
{System.out.println("Do You want to purchase AIR INDIA ? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[24]=2;
f[24]=1;
b=b-10500;
}
}
else if(f[24]==1)
{
System.out.println(" AIR INDIA IS SOLD!");
if(g[24]==1)
{System.out.println("YOU PAY RENT OF Rs1200");
b=b-1200;
a=a+1200;
}
}
}
else if(x==25)
{System.out.println("You are at CALCUTTA");
if(f[25]==0)
{System.out.println("Do You want to purchase CALCUTTA? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[25]=2;
f[25]=1;
b=b-6500;
}
}
else if(f[25]==1)
{
System.out.println(" CALCUTTA IS SOLD!");
if(g[25]==1)
{System.out.println("YOU PAY RENT OF Rs700");
b=b-700;
a=a+700;
}
}
}
else if(x==26)
{System.out.println("You are at HYDERABAD");
if(f[26]==0)
{System.out.println("Do You want to purchase HYDERABAD? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[26]=2;
f[26]=1;
b=b-3500;
}
}
else if(f[26]==1)
{
System.out.println(" HYDERABAD IS SOLD!");
if(g[26]==1)
{System.out.println("YOU PAY RENT OF Rs400");
b=b-400;
a=a+400;
}
}
}
else if(x==27)
{ System.out.println("YOU HAVE VISITED REST HOUSE YOU PAY Rs200");
b=b-200;
}
else if(x==28)
{System.out.println("You are at MADRAS");
if(f[28]==0)
{System.out.println("Do You want to purchase MADRAS\nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[28]=2;
f[28]=1;
b=b-7000;
}
}
else if(f[28]==1)
{
System.out.println(" MADRAS IS SOLD!");
if(g[28]==1)
{System.out.println("YOU PAY RENT OF Rs900");
b=b-900;
a=a+900;
}
}
}
else if(x==30)
{System.out.println("You are at BANGALORE");
if(f[30]==0)
{System.out.println("Do You want to purchase BANGALORE? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[30]=2;
f[30]=1;
b=b-4000;
}
}
else if(f[30]==1)
{
System.out.println(" BANGALORE IS SOLD!");
if(g[30]==1)
{System.out.println("YOU PAY RENT OF Rs400");
b=b-400;
a=a+400;
}
}
}
else if(x==32)
{System.out.println("You are at OOTACMAND");
if(f[32]==0)
{System.out.println("Do You want to purchase OOTACMAND? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[32]=2;
f[32]=1;
b=b-2500;
}
}
else if(f[32]==1)
{
System.out.println(" OOTACMAND IS SOLD!");
if(g[32]==1)
{System.out.println("YOU PAY RENT OF Rs200");
b=b-200;
a=a+200;
}
}
}
else if(x==33)
{System.out.println("You are at COCHIN");
if(f[33]==0)
{System.out.println("Do You want to purchase COCHIN? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[33]=2;
f[33]=1;
b=b-3000;
}
}
else if(f[33]==1)
{
System.out.println(" COCHIN IS SOLD!");
if(g[33]==1)
{System.out.println("YOU PAY RENT OF Rs300");
b=b-300;
a=a+300;
}
}
}
else if(x==34)
{System.out.println("You are at MOTOR-BOAT");
if(f[34]==0)
{System.out.println("Do You want to purchase MOTOR-BOAT ? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[34]=2;
f[34]=1;
b=b-5500;
}
}
else if(f[34]==1)
{
System.out.println(" MOTORBOAT IS SOLD!");
if(g[34]==1)
{System.out.println("YOU PAY RENT OF Rs400");
b=b-400;
a=a+400;
}
}
}
else if(x==35)
{System.out.println("You are at MARGOA ");
if(f[35]==0)
{System.out.println("Do You want to purchase MARGOA? \nIF YES PRESS 1\nIF NO PRESS 0");
j=s.nextInt();
if(j==1)
{System.out.println("CONGRATULATIONS");
g[35]=2;
f[35]=1;
b=b-4000;
}
}
else if(f[35]==1)
{
System.out.println(" MARGOA IS SOLD!");
if(g[35]==1)
{System.out.println("YOU PAY RENT OF Rs400");
b=b-400;
a=a+400;
}
}
}
}

System.out.println("PLAYER 1 HAS MONEY Rs"+a);
System.out.println("PLAYER 2 HAS MONEY Rs"+b);
System.out.println("PRESS 1 if you want to continue");
System.out.println("PRESS 2 if you want to stop");
t=s.nextInt();
}
while(t!=2);
}
}




















































































































































































