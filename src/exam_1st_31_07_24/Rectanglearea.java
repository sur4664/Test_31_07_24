package exam_1st_31_07_24;
// area of rectangle
class Rec {
    static int area(int x, int y) {
        int res = x * y;

        return res;
    }
}
public class Rectanglearea {
    public static void main(String[] args) {
       int a =Rec.area(5,10);
        System.out.println(a);
    }
}
