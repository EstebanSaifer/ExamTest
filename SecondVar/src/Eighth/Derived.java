package Eighth;

public class Derived extends Base{
    Base a = null;
    Base b = new Derived();
    //Derived c = new Base();
    //Data d = new Data(); //нельзя создавать обьект интерфейса
    Data e = b;
}
