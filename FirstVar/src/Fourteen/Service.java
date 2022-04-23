package Fourteen;

public class Service {
    public static int countNear (IPoint[] points,
                                 IPoint start,
                                 double maxDistance) {
        int count = 0;
        for(int i = 0; i < points.length; i++){
            if (Math.sqrt(points[i].getX() * points[i].getX() +
                    points[i].getY() * points[i].getY()) <= maxDistance) {
                count++;
            }
        }
        return count;
    }
}
