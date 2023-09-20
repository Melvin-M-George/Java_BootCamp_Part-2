
class Base {
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void printMe(){
        System.out.println("Hello World");
    }
}

class Derived extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

public class CWH_45_Inheritance {
    public static void main(String[] args) {
        Base b = new Derived();
        b.setX(4);
        System.out.println(b.getX());

        //Creating an object of Derived class and accessing methods of Base class
        Derived d = new Derived();
        b.setX(4);
        System.out.println(b.getX());


    }
}