public class landscapewithflowers extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.showBackGround();
        plane.teleport(115, 330);
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
                plane.move(10);
                plane.turn(180);
                plane.move(10);
                plane.turn(180);

            }
        }
        if ((red > 255 && green > 255 && blue > 255) && (red < 252 && green < 252 && blue < 240)) ;
        plane.setPixelColor(26, 36, 219);
    }

    public void petals() {
        int numofpetals = ((int)(Math.random()*600));
      if((numofpetals > 3) && (numofpetals < 5))
         plane.teleport(24,336);
          plane.isTrail = true;
          plane.move(15);
          plane.turn(360);
          //how do i tell it to do this multiple times compared to the random number chosen?






        }
    };


