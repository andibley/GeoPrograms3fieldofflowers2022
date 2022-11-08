

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

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
        plane.setColor(155,100,170);
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
        plane.setColor(250,30,100);
        plane.move(100);


    }


}
