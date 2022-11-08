public class landscapewithflowers extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.showBackGround();
        plane.teleport(115, 330);
        for(int row=0; row<300; row++)    //*** this is using new getBackground
        {
            for(int col=0; col<900; col++)    //*** this is using new getBackground
            {
                plane.teleport(col,row);

                red   = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue  = plane.howMuchBlue();

                //  if(red>237 && green >253 && blue>24 &&green<240 && blue< 100)
                //   {
                //       plane.setPixelColor(39,115,229);
                //   }
                if((red>220 && green>225 && blue>220) /*&& (red<210 && green<200 && blue<200)*/)
                {
                    plane.setPixelColor(10,30,100);
                }
            }
        }
        for (int row = 0; row < 4; row = row + 1) {

            for (int colums = 0; colums < 42; colums = colums + 1) {

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                int a = (int) (Math.random() * 256);
                System.out.println(a);
                plane.teleport(colums * 20 + 20, row * 63 + 350);
                plane.trailWidth = 10;
                plane.isTrail = true;
                plane.setColor(122, 235, 74);
             plane.startingAngle(270);
                plane.move(10);
                plane.turn(180);
//                plane.move(10);
//                plane.turn(180);
                petals();
            }

        }
        if ((red > 255 && green > 255 && blue > 255) && (red < 252 && green < 252 && blue < 240)) ;
        plane.setPixelColor(26, 36, 219);
    }

    public void petals() {
        int numofpetals = ((int) (Math.random() * 3)) + 3;
        plane.trailWidth = 5;
        if (numofpetals == 3) {
            plane.setColor(222,237,55);
            //plane.teleport(, );
            plane.isTrail = true;
           plane.startingAngle(230);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
            plane.turn(60);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
            plane.turn(60);
            plane.move(10);
            plane.turn(180);
            plane.move(10);




        }
        if(numofpetals == 4) {
            plane.isTrail = true;
            plane.setColor(242,136,228);
            plane.startingAngle(230);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
            plane.turn(90);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
            plane.turn(90);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
            plane.turn(90);
            plane.move(10);
            plane.turn(180);
            plane.move(10);

        }
        if(numofpetals == 5){
            plane.isTrail = true;
            plane.setColor(200,145,237);
            plane.startingAngle(230);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
            plane.turn(108);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
            plane.turn(108);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
            plane.turn(108);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
            plane.turn(108);
            plane.move(10);
            plane.turn(180);
            plane.move(10);
        }
    }
}


