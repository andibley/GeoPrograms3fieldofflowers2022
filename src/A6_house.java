public class A6_house extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.pausetime = 0;

        //  equitriangle(275);
        //  square(30,60);

        for(int H = 0; H<5; H++){

            int Q = (int) (Math.random() * 3 + 1);
            if (Q == 1) {
                house();
            }
      plane.teleport((int)(Math.random()*600), (int)(Math.random()*600));
            if (Q == 2) {
                big();
            }
            if (Q == 3) {
                mytriangle();
            }

        }
    }

        
     // house();


    public void big() {
        plane.move(111);
        plane.turn(90);
        plane.move(111);
       plane.turn(90);
       plane.move(111);
     plane.turn(90);      plane.move(111);      plane.turn(90);


    }

   public void small(int a, int b) {
//        plane.move(a);
//        plane.turn(90);
//        plane.move(b);
//        plane.turn(90);
//        plane.move(a);
//        plane.turn(90);
//        plane.move(b);
//        plane.turn(90);


    }
    public void mysquare() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(20, 130, 250);
        plane.move(100);
        plane.turn(90);
        plane.setColor(155, 100, 170);
        plane.move(100);
    }
    public void mytriangle () {


        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(130, 0, 130);
        plane.move(100);
        plane.turn(120);
        plane.isTrail = true;
        plane.setColor(50, 30, 200);
        plane.move(100);
        plane.turn(-240);
        plane.setColor(250, 30, 100);
        plane.move(100);
    }
    public void house()  {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);

        plane.startingAngle(90);
        mysquare();
        mytriangle();
//        plane.isTrail = true;
//        plane.startingAngle(0);
//        square(50);
//        plane.isTrail = false;
//        plane.startingAngle(270);
//        plane.move(200);
//        plane.isTrail = true;
//        plane.pausetime = 0;
//??      sun(20);
    }

    public void square(int a,int b) {
        plane.teleport(100,200);
        plane.move(a);
        plane.turn(90);
       plane.move(b);
        plane.turn(90);
       plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);
    }

    public void equitriangle(int b) {
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(130, 0, 130);
        plane.move(b);
        plane.turn(120);
        plane.isTrail = true;
        plane.setColor(50, 30, 200);
        plane.move(b);
        plane.turn(-240);
        plane.setColor(250,30,100);
        plane.move(b);
        plane.teleport(500,300);

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(20, 130, 250);
        plane.move(100);
        plane.turn(90);
        plane.setColor(155, 100, 170);
        plane.move(100);
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(130, 0, 130);
        plane.move(100);
        plane.turn(120);
        plane.isTrail = true;
        plane.setColor(50, 30, 200);
        plane.move(100);
        plane.turn(-240);
        plane.setColor(250, 30, 100);
        plane.move(100);

    }



    public void rectangle(int a, int b) {


    }

    public void fillRec(int a, int b) {


    }

    public void tree(int a) {

    }
public void myhouse(){
    plane.teleport(650,350);

    plane.trailWidth = 3;
    plane.startingAngle(90);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(200, 0, 0);
    plane.move(50);
    plane.turn(90);
    plane.setColor(0, 200, 0);
    plane.move(50);
    plane.turn(90);
    plane.setColor(20, 130, 250);
    plane.move(50);
    plane.turn(90);
    plane.setColor(155, 100, 170);
    plane.move(50);
    plane.startingAngle(0);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(130, 0, 130);
    plane.move(50);
    plane.turn(120);
    plane.isTrail = true;
    plane.setColor(50, 30, 200);
    plane.move(50);
    plane.turn(-240);
    plane.setColor(250, 30, 100);
    plane.move(50);

    plane.teleport(750,330);
    plane.startingAngle(90);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(200, 0, 0);
    plane.move(70);
    plane.turn(90);
    plane.setColor(0, 200, 0);
    plane.move(70);
    plane.turn(90);
    plane.setColor(20, 130, 250);
    plane.move(70);
    plane.turn(90);
    plane.setColor(155, 100, 170);
    plane.move(70);
    plane.startingAngle(0);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(130, 0, 130);
    plane.move(70);
    plane.turn(120);
    plane.isTrail = true;
    plane.setColor(50, 30, 200);
    plane.move(70);
    plane.turn(-240);
    plane.setColor(250, 30, 100);
    plane.move(70);

    plane.teleport(900,360);


    plane.startingAngle(90);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(200, 0, 0);
    plane.move(40);
    plane.turn(90);
    plane.setColor(0, 200, 0);
    plane.move(40);
    plane.turn(90);
    plane.setColor(20, 130, 250);
    plane.move(40);
    plane.turn(90);
    plane.setColor(155, 100, 170);
    plane.move(40);
    plane.startingAngle(0);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(130, 0, 130);
    plane.move(40);
    plane.turn(120);
    plane.isTrail = true;
    plane.setColor(50, 30, 200);
    plane.move(40);
    plane.turn(-240);
    plane.setColor(250, 30, 100);
    plane.move(40);

    //second row
    plane.teleport(500,550);

    plane.trailWidth = 3;
    plane.startingAngle(90);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(200, 0, 0);
    plane.move(50);
    plane.turn(90);
    plane.setColor(0, 200, 0);
    plane.move(50);
    plane.turn(90);
    plane.setColor(20, 130, 250);
    plane.move(50);
    plane.turn(90);
    plane.setColor(155, 100, 170);
    plane.move(50);
    plane.startingAngle(0);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(130, 0, 130);
    plane.move(50);
    plane.turn(120);
    plane.isTrail = true;
    plane.setColor(50, 30, 200);
    plane.move(50);
    plane.turn(-240);
    plane.setColor(250, 30, 100);
    plane.move(50);

    plane.teleport(580,530);
    plane.startingAngle(90);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(200, 0, 0);
    plane.move(70);
    plane.turn(90);
    plane.setColor(0, 200, 0);
    plane.move(70);
    plane.turn(90);
    plane.setColor(20, 130, 250);
    plane.move(70);
    plane.turn(90);
    plane.setColor(155, 100, 170);
    plane.move(70);
    plane.startingAngle(0);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(130, 0, 130);
    plane.move(70);
    plane.turn(120);
    plane.isTrail = true;
    plane.setColor(50, 30, 200);
    plane.move(70);
    plane.turn(-240);
    plane.setColor(250, 30, 100);
    plane.move(70);

    plane.teleport(680,560);


    plane.startingAngle(90);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(200, 0, 0);
    plane.move(40);
    plane.turn(90);
    plane.setColor(0, 200, 0);
    plane.move(40);
    plane.turn(90);
    plane.setColor(20, 130, 250);
    plane.move(40);
    plane.turn(90);
    plane.setColor(155, 100, 170);
    plane.move(40);
    plane.startingAngle(0);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(130, 0, 130);
    plane.move(40);
    plane.turn(120);
    plane.isTrail = true;
    plane.setColor(50, 30, 200);
    plane.move(40);
    plane.turn(-240);
    plane.setColor(250, 30, 100);
    plane.move(40);

    plane.teleport(750,520);
    plane.startingAngle(90);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(200, 0, 0);
    plane.move(80);
    plane.turn(90);
    plane.setColor(0, 200, 0);
    plane.move(80);
    plane.turn(90);
    plane.setColor(20, 130, 250);
    plane.move(80);
    plane.turn(90);
    plane.setColor(155, 100, 170);
    plane.move(80);
    plane.startingAngle(0);
    plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(130, 0, 130);
    plane.move(80);
    plane.turn(120);
    plane.isTrail = true;
    plane.setColor(50, 30, 200);
    plane.move(80);
    plane.turn(-240);
    plane.setColor(250, 30, 100);
    plane.move(80);

}

     //   plane.startingAngle(90);
//        plane.isTrail = true;
//        plane.trailWidth = 10;
//        plane.setColor(200, 0, 0);
//        plane.move(100);
//        plane.turn(90);
//        plane.setColor(0, 200, 0);
//        plane.move(100);
//        plane.turn(90);
//        plane.setColor(20, 130, 250);
//        plane.move(100);
//        plane.turn(90);
//        plane.setColor(155, 100, 170);
//        plane.move(100);
//        plane.startingAngle(0);
//        plane.isTrail = true;
//        plane.trailWidth = 10;
//        plane.setColor(130, 0, 130);
//        plane.move(100);
//        plane.turn(120);
//        plane.isTrail = true;
//        plane.setColor(50, 30, 200);
//        plane.move(100);
//        plane.turn(-240);
//        plane.setColor(250, 30, 100);
//        plane.move(100);



   // public void sun(int a) {
     //   plane.setColor(255, 255, 0);
       // plane.fillCircle(a);





    }



/*

Methods:
- fillCircle(int x)
   fillCircle() draws a filled circle with a radius size specified in the parameter.
   plane.fillCircle(10); draws a circle of radius 10 pixels.

- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int pausetime
   pausetime is used to speed up or slow down the plane. The default value is 5.
   plane.pausetime = 10; slows the plane down.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/

