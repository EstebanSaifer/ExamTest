package Fourteen;

public class Service {
    public static boolean checkRadius (ICircle[] circles,
                                       double minRadius,
                                       double maxRadius) {
        for(int i = 0; i < circles.length; i++) {
            if(circles[i].getRadius() >= minRadius &&
               circles[i].getRadius() <= maxRadius)
                return true;
        }
        return false;
    }
}
