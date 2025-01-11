import java.util.*;
class Box {
    int length;
    int breadth;
    int height;

   int  boxVolume() {

      return length * breadth * height;
  }
  int volume(int l, int b, int h){
       return l*b*h;
  }

}

public class Constructor {
    public static void main(String args[]) {

        Box a = new Box();
        a.length = 10;
        a.breadth = 5;
        a.height = 5;
        int vol = a.boxVolume();
        int vol2 = a.volume(2,5,5);
        System.out.println(a.length);
        System.out.println(vol);

    }
}


