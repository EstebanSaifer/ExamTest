package Sixteen;

public class Human {
    public boolean like (Season season) {
        if(season == Season.AUTHUM || season == Season.SPRING) return false;
        else return true;
    }
}
