public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime = 0;
        plane.isTrail=true;
        plane.trailWidth = 3;
        for(int row=0;row<20;row=row+1) {

        for(int colums=0;colums<20;colums=colums+1){

            int a = (int) (Math.random() *256);
            System.out.println(a);
            plane.teleport(50*colums, row*50+10);
            plane.setColor(10*row, 10*colums,200);
            plane.house(10);
    }
    }

        }





        }


