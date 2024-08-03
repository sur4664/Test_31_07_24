package exam_1st_31_07_24;
// return area of aq using static mtd
class Square{
    static int are(int x,int y){
        int res =0;
        if( x==y) {
            res = (x * y);

        }

        return res;
    }
}
public class Area_sq {
    public static void main(String[] args) {
         int res =Square.are(5,5);
        System.out.println(res);
    }
}
