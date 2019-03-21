#include<dos.h>
#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<process.h>
#include<time.h>

void main()

{
  /* request auto detection */
   int gdriver = DETECT, gmode, errorcode;
   char key = '\M', ck[30];
    time_t start_time=clock();
    time_t end_time;
 int x = 0 ,y = 0 ,f1 = 0, f2 = 0,floop = 1,f2loop = 0,h = 0,h2 = 0;
 int b = 100,o = 260; // increacin x , y printing values
 float loop = 0 , m = 0 , m2 = 0;
 float speed = 0;
 int pip,j;
   /* initialize graphics and local
   variables */
   initgraph(&gdriver, &gmode, "C:/TURBOC3/BGI");
   /* read result of initialization */
   errorcode = graphresult();
   /* an error occurred */
   if (errorcode != grOk)
   {
      printf("Graphics error: %s\n", grapherrormsg(errorcode));
      printf("Press any key to halt:");
      getch();

      exit(1);    /* terminate with an error code */
   }

textcolor(0);

//////////////////////////////////////////// initial animation display start
setfillstyle(11,2);
bar(20,345,610,380);
delay(555);



/////////////////////////////////////////KEYS
setfillstyle(9,RED);
bar3d(260,180+o,290,200+o,3,3);
settextstyle(2,0,4);
outtextxy(265,185+o,"Left");
delay(444);
bar3d(330,180+o,360,200+o,3,3);
settextstyle(2,0,4);
outtextxy(332,185+o,"RIGHT ");
delay(444);
bar3d(400,175+o,450,198+o,3,3);
settextstyle(2,0,4);
outtextxy(400,185+o,"  ENTER ");
delay(444);
settextstyle(2,0,4);
outtextxy(400,175+o," to exit ");
delay(444);
 line(220,10,220,140);
 line(420,10,420,140);
 line(320,+200+10,320,200+140);
 line(520,+200+10,520,200+140);
delay(555);
 settextstyle(1,0,6);
outtextxy(70,0,"CROSS THE PATH");
settextstyle(3,0,3);
outtextxy(60,80,"READY...");
delay(1000);
settextstyle(3,0,3);
outtextxy(60,150,"SET.....");
delay(1000);
settextstyle(3,0,3);
outtextxy(60,220,"GO......");
delay(1000);

////////////////////////////////////initial animation display end
 //speed
do
{
cleardevice();
setbkcolor(0); //8
/* while(key is not pressed) */
 while(!kbhit())
{

clrscr();
speed += 0.0003;
/////////////////////////////////////////////LINE CHALLANGE
    ///moving of obstacles (not sure)////
 if(loop == 0 && m <= 202 )
      {
       m+=(1+speed);
       m2-=(1+speed);
       if( m >= 202 )
       {
 loop = 1;
       // getch();
       }
      }
   if(loop == 1 && m >= 0 )
      {

       m-=(1+speed);
       m2+=(1+speed);
       if( m <= 0)
       {
 loop = 0;
       }
      }

      ///4 obstacle lines///
 line(220,10+m,220,140+m);
 line(420,10+m,420,140+m);
 line(320,+200+10+m2,320,200+140+m2);
 line(520,+200+10+m2,520,200+140+m2);

//out condition//
 if( x >=99 &&x<=137&&y ==0&&m>=96 || x >=99 &&x<=137&&y < -200 && m<=130
  || x >=299 &&x<=337&&y ==0&&m>=96|| x >=299 &&x<=337&&y < -200 && m<=130
  || x >=199 &&x<=237&&y ==0&&m2>=-103|| x >=199 &&x<=237&&y < -200 && m2<=-70
  || x >=399 &&x<=437&&y ==0&&m2>=-103|| x >=399 &&x<=437&&y < -200 && m2<=-70
)



 {

setfillstyle(11,2);
bar(20,345,610,380);


/////////////////////////////////////////KEYS
setfillstyle(9,RED);
bar3d(260,180+o,290,200+o,3,3);
settextstyle(2,0,4);
outtextxy(265,185+o,"Left");
bar3d(330,180+o,360,200+o,3,3);
settextstyle(2,0,4);
outtextxy(332,185+o,"RIGHT ");
settextstyle(8,0,2);
bar3d(400,175+o,450,198+o,3,3);
settextstyle(2,0,4);
outtextxy(400,185+o,"  ENTER ");
settextstyle(2,0,4);
outtextxy(400,175+o," to exit ");
////////////////////////////////////

   settextstyle(7,0,5);
   outtextxy(0,150,"GAME OVER");
   settextstyle(3,0,3);
   outtextxy(0,260,"You are dead");
   settextstyle(3,0,3);
   outtextxy(0,290,"Press any key to continue");
   end_time= clock()-start_time;
   sprintf(ck,"Time: %d seconds",end_time/10);   //time code
   outtextxy(20,20,ck);
   ////////////character
//setfillstyle(1,BLUE);
//bar(20,5,610,8);
setfillstyle(1,6);
circle(100+x,250+b,15);                 //face
floodfill(100+x,250+b,WHITE)   ;
setfillstyle(1,1);
fillellipse(98+x,247+b,2,3);
setfillstyle(1,6);
fillellipse(106+x,233+b,2,3);       //nose
line(99+x,235+b,105+x,230+b);               //nose
line(114+x,244+b,125+x,240+b);                          //nack
line(114+x,254+b,125+x,258+b);                        //nack
setfillstyle(2,1);
fillellipse(148+x,249+b,28,17);
bar(115+x,244+b,125+x,255+b);
ellipse(150+x,249+b,270,90,6,17);                  //pant

line(130+x,248+b,145+x,260+b);    //arm
setfillstyle(1,RED);
circle(147+x,261+b,3);      //hand
floodfill(147+x,261+b,WHITE)   ;
setfillstyle(1,RED);
fillellipse(151+x,264+b,3,1);                   //finger
fillellipse(151+x,262+b,3,1);                  //finger
fillellipse(151+x,260+b,3,1);                  //finger
setfillstyle(1,RED);

line(170+x,248+b,200+x,265+b);
fillellipse(203+x,258+b,2,8)   ;              //legs1
line(175+x,243+b,200+x,238+b);                     //legs2
fillellipse(203+x,230+b,2,8)   ;
loop = 0;m=0;x=0,m2 = 0;
sleep(2);  //ENTER TIME
getch();

}
/////end of out condition///
//////////////////////////////////////////////cHALANGE COMPLEATE


///keys are displayed during running game////
setfillstyle(11,2);
bar(20,345,610,380);
/////////////////////////////////////////KEYS
setfillstyle(9,RED);
bar3d(260,180+o,290,200+o,3,3);
settextstyle(2,0,4);
outtextxy(265,185+o,"Left");
bar3d(330,180+o,360,200+o,3,3);
settextstyle(2,0,4);
outtextxy(332,185+o,"RIGHT ");
settextstyle(8,0,2);
bar3d(400,175+o,450,198+o,3,3);
settextstyle(2,0,4);
outtextxy(400,185+o,"  ENTER ");
settextstyle(2,0,4);
outtextxy(400,175+o," to exit ");
////////////////////////////////////



///abcd////
if( y <-220 )
{
y=-219;
h = 0; h2 = 0;}
else if(y > 0 && x >460 )
{y = 0; key = '\K';
h = 0; h2 = 0;}
else if (y > 0 && x <= -39)
{ y = 0; key = '\M';
h = 0; h2 = 0;;}
else if (x <= -39 && y <= -219 && key == '\K')
{key = '\P';
x = -39;}
else if (x >= 469 && y <= -219 && key == '\M')
{key = '\P';}
///abcd////

////////////////////////////////////////// stop at right
if (x >= 470)
{
 h = 0; h2 = 0;
 x=469;
setfillstyle(1,6);
circle(100+x,250,15);                 //face
floodfill(100+x,250,WHITE)   ;
setfillstyle(1,1);
fillellipse(103+x,247,3,2);               //eye
ellipse(103+x,247,90,89,3,2);
setfillstyle(1,6);
fillellipse(118+x,253,2,3);       //nose
ellipse(118+x,253,180,20,2,2);
line(115+x,246,120+x,253);               //nose
line(95+x,264,91+x,274);                          //nack
line(104+x,266,110+x,275);                        //nack
setfillstyle(2,1);
fillellipse(100+x,296,17,25);
ellipse(100+x,296,120,50,17,25);                  //body
setfillstyle(2,BLUE);
bar(95+x,266,104+x,276);                            //nack
ellipse(100+x,303,180,360,16,3);                  //pant
line(100+x,277,100+x,293);    //arm
setfillstyle(1,RED);
circle(100+x,295,3);      //hand
floodfill(100+x,295,WHITE)   ;
setfillstyle(1,RED);
ellipse(98+x,299,120,50,1,3);                  //finger
ellipse(101+x,299,120,50,1,3);                  //finger
ellipse(103+x,297,120,50,1,3);                  //finger
line(100+x,322,100+x,360);
setfillstyle(1,RED);
fillellipse(108+x,360,8,2)   ;         //legs1
line(100+x,322,100+x,360);                     //legs2
fillellipse(108+x,360,8,2)   ;
}
//////////////////////////////////////////////////////stop at left
 if (x <= -40)
{
 x=- 39;
 h = 0; h2 = 0;
 setfillstyle(1,6);
circle(100+x,250,15);                 //face
floodfill(100+x,250,WHITE)   ;
setfillstyle(1,1);
fillellipse(97+x,247,3,2);               //eye
setfillstyle(1,6);
fillellipse(83+x,253,2,3);       //nose
line(85+x,246,80+x,253);               //nose
line(95+x,264,91+x,274);                          //nack
line(104+x,266,110+x,275);                        //nack
setfillstyle(2,1);
fillellipse(100+x,296,17,25);
//ellipse(100+x,296,120,50,17,25);                  //body
setfillstyle(2,BLUE);
bar(95+x,266,104+x,276);                            //nack
ellipse(100+x,303,180,360,16,3);                  //pant
line(100+x,277,100+x,293);    //arm
setfillstyle(1,RED);
circle(100+x,295,3);      //hand
floodfill(100+x,295,WHITE)   ;
setfillstyle(1,RED);
ellipse(98+x,299,120,50,1,3);                  //finger
ellipse(101+x,299,120,50,1,3);                  //finger
ellipse(103+x,297,120,50,1,3);                  //finger
line(100+x,322,100+x,360);
setfillstyle(1,RED);
fillellipse(91+x,360,8,2)   ;         //legs1
line(100+x,322,100+x,360);                     //legs2
fillellipse(91+x,360,8,2)   ;
}
///////////////////////////////////////////////////// move to right
else if (key == '\M'&& y >= -2)
{x++;
h = 0;
if(f1 <=30 && floop == 1 )
{
f1+= 2;
h++;
}
if(f1 == 20)
{ floop = 0;}
if(floop == 0 )
{f1-=2;
h--;}
if(f1 <= -20 )
{floop = 1;}
if(f2 <=30 && f2loop == 1)
f2+= 2;
if(f2 == 20)
{ f2loop = 0;}
if(f2loop == 0 )
{f2-=2;}
if(f2 <= -20 )
{f2loop = 1;}
setfillstyle(1,6);
circle(100+x,250,15);                 //face
floodfill(100+x,250,WHITE)   ;
setfillstyle(1,1);
fillellipse(103+x,247,3,2);               //eye
setfillstyle(1,6);
fillellipse(118+x,253,2,3);       //nose
line(115+x,246,120+x,253);               //nose
line(95+x,264,91+x,274);                          //nack
line(104+x,266,110+x,275);                        //nack
setfillstyle(2,1);
fillellipse(100+x,296,17,25);
ellipse(100+x,296,120,50,17,25);                  //body
setfillstyle(2,BLUE);
bar(95+x,266,104+x,276);                            //nack
ellipse(100+x,303,180,360,16,3);                  //pant
if(x >= 470 || x <= -40)
{
line(100+x,277,100+x+h,293);    //arm
setfillstyle(1,RED);
circle(100+x+h,295,3);      //hand
floodfill(100+x+h,295,WHITE)   ;
setfillstyle(1,RED);
ellipse(98+x+h,299,120,50,1,3);                  //finger
ellipse(101+x+h,299,120,50,1,3);                  //finger
ellipse(103+x+h,297,120,50,1,3);                  //finger
line(100+x,322,100+x,360);
if(x<=-40)
{
setfillstyle(1,RED);
fillellipse(108+x+f1,360,8,2)   ;         //legs1
line(100+x,322,100+x+f2,360);                     //legs2
fillellipse(108+x+f2,360,8,2)   ;
}
else
{
setfillstyle(1,RED);
fillellipse(108+x,360,8,2)   ;         //legs1
line(100+x,322,100+x,360);                     //legs2
fillellipse(108+x,360,8,2)   ;
}
}
else
{
line(100+x,277,100+x+h,293);    //arm
setfillstyle(1,RED);
circle(100+x+h,295,3);      //hand
floodfill(100+x+h,295,WHITE)   ;
setfillstyle(1,RED);
ellipse(98+x+h,299,120,50,1,3);                  //finger
ellipse(101+x+h,299,120,50,1,3);                  //finger
ellipse(103+x+h,297,120,50,1,3);                  //finger
line(100+x,322,100+x+f1,360);
setfillstyle(1,RED);
fillellipse(108+x+f1,360,8,2)   ;         //legs1
line(100+x,322,100+x+f2,360);                     //legs2
fillellipse(108+x+f2,360,8,2)   ;
}
}
/////////////////////////////////////////// move toords left
else if (key == '\K'&& y >= -2)
{x--;
h = 0;h2 = 0;
if(f1 <=30 && floop == 1 )
{
f1+= 2;
 h++;
}
if(f1 == 20)
{
 floop = 0;}
 if(floop == 0 )
 {f1-=2;
 h--;}
 if(f1 <= -20 )
 {floop = 1;}
// leg second
 if(f2 <=30 && f2loop == 1)
 f2+= 2;
 if(f2 == 20)
 { f2loop = 0;}
 if(f2loop == 0 )
 {f2-=2;}
 if(f2 <= -20 )
 {f2loop = 1;}
setfillstyle(1,6);
circle(100+x,250,15);                 //face
floodfill(100+x,250,WHITE)   ;
setfillstyle(1,1);
fillellipse(97+x,247,3,2);               //eye
setfillstyle(1,6);
fillellipse(83+x,253,2,3);       //nose
line(85+x,246,80+x,253);               //nose
line(95+x,264,91+x,274);                          //nack
line(104+x,266,110+x,275);                        //nack
setfillstyle(2,1);
fillellipse(100+x,296,17,25);
//ellipse(100+x,296,120,50,17,25);                  //body
setfillstyle(2,BLUE);
bar(95+x,266,104+x,276);                            //nack
ellipse(100+x,303,180,360,16,3);                  //pant
if(x >= 470 || x<= -40)
{line(100+x,277,100+x,293);    //arm
setfillstyle(1,RED);
circle(100+x,295,3);      //hand
floodfill(100+x,295,WHITE)   ;
setfillstyle(1,RED);
ellipse(98+x,299,120,50,1,3);                  //finger
ellipse(101+x,299,120,50,1,3);                  //finger
ellipse(103+x,297,120,50,1,3);                  //finger
line(100+x,322,100+x,360);
if(x<=-40)
{
setfillstyle(1,RED);
fillellipse(91+x,360,8,2)   ;         //legs1
line(100+x,322,100+x,360);                     //legs2
fillellipse(91+x,360,8,2)   ;
}
else
{
setfillstyle(1,RED);
fillellipse(108+x,360,8,2)   ;         //legs1
line(100+x,322,100+x,360);                     //legs2
fillellipse(108+x,360,8,2)   ;
}
}
else
{
line(100+x,277,100+x+h,293);    //arm
setfillstyle(1,RED);
circle(100+x+h,295,3);      //hand
floodfill(100+x+h,295,WHITE)   ;
setfillstyle(1,RED);
ellipse(98+x+h,299,120,50,1,3);                  //finger
ellipse(102+x+h,299,120,50,1,3);                  //finger
ellipse(96+x+h,297,120,50,1,3);                  //finger
line(100+x,322,100+x+f1+4,360);
if(x<=-40)
{
setfillstyle(1,RED);
fillellipse(91+x,360,8,2)   ;         //legs1
line(100+x,322,100+x,360);                     //legs2
fillellipse(91+x,360,8,2)   ;
}
else
{
setfillstyle(1,RED);
 fillellipse(91+x+f1+4,360,8,2)   ;         //legs1
 line(100+x,322,100+x+f2+4,360);                     //legs2
 fillellipse(91+x+f2+4,360,8,2)   ;
}
}
}






/////////////////////////////////// stop at left
     else if ( key == '\M'||'\K'&& y < -2 && x < -38)
{

setfillstyle(1,6);
circle(100+x,250+y,15);                 //face
floodfill(100+x,250+y,WHITE)   ;
setfillstyle(1,1);
fillellipse(97+x,247+y,3,2);               //eye
setfillstyle(1,6);
fillellipse(83+x,253+y,2,3);       //nose
line(85+x,246+y,80+x,253+y);               //nose
line(95+x,264+y,91+x,274+y);                          //neck
line(104+x,266+y,110+x,275+y);                        //neck
setfillstyle(2,1);
fillellipse(100+x,296+y,17,25);
setfillstyle(2,BLUE);
bar(95+x,266+y,104+x,276+y);                            //neck
ellipse(100+x,303+y,180,360,16,3);                  //pant
line(100+x,277+y,75+x,272+y+h);    //arm
line(75+x,272+y+h,75+x,255+y+h);    //arm up
setfillstyle(1,RED);
circle(75+x,253+y+h,3);      //hand
floodfill(75+x,253+y+h,WHITE)   ;
ellipse(72+x,250+y+h,0,180,1,3);                  //finger
ellipse(74+x,250+y+h,0,180,1,3);                  //finger
ellipse(76+x,250+y+h,0,180,1,3);
line(100+x,277+y,75+x,272+y+h2);    //arm 2
line(75+x,272+y+h2,75+x,255+y+h2);    //arm up2
setfillstyle(1,RED);
circle(75+x,253+y+h2,3);      //hand2
floodfill(75+x,253+y+h2,WHITE)   ;
ellipse(72+x,250+y+h2,0,180,1,3);                  //finger 2
ellipse(74+x,250+y+h2,0,180,1,3);                  //finger 2
ellipse(76+x,250+y+h2,0,180,1,3);                  //finger 2
line(100+x,322+y,80+x,322+y+h);            // leg 1
line(80+x,322+y+h,75+x,339+y+h);
fillellipse(68+x,339+y+h,8,2)   ;         // foot 1
line(100+x,322+y,80+x,322+y+h2);            // leg 1
line(80+x,322+y+h2,75+x,339+y+h2);
fillellipse(68+x,339+y+h2,8,2)   ;         // foot 1
}

////////////////////////////////         kill       //////////////

else if(key == '\P' && x<= 468 && x >= -38 && y <= -219)
{

for (;y<= 0;y++)
{
clrscr();

setfillstyle(11,2);
bar(20,345,610,380);
}
///////////////////                DEAD MAN

clrscr();
setfillstyle(11,2);
bar(20,345,610,380);
   nosound();
   settextstyle(7,0,5);
   outtextxy(0,150,"GAME OVER");
   settextstyle(3,0,3);
   outtextxy(0,260,"You are dead");
   settextstyle(3,0,3);
   outtextxy(0,290,"Press any key to continue");
   end_time=clock()-start_time;
   sprintf(ck,"Time: %d seconds",end_time/10);

    x=- 39;
    h = 0; h2 = 0;     // start from begning
getch();
break;
}
/////////////////////////////////////////////// kill end
//no idea what this else does
else
{ key = '\K';}
/////////////// end of do while loop (while key is ton hit)

delay(5);
}
key = getche();
}while(key != '\r');     //this ends the game

end_time=clock()-start_time;settextstyle(6,0,3);
sprintf(ck,"Time: %d seconds",end_time/10);     //time code
outtextxy(20,20,ck);

getch();
}
