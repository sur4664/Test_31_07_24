package exam_1st_31_07_24;
// Que wa m which returns the result of the logica; operator &&(and)?
class Andresult{
    static boolean logicaland(boolean a,boolean b){

        return a && b;
    }
}
public class Logicaloperareturn {
    public static void main(String[] args) {
        boolean res1 =Andresult.logicaland(true,true);
        boolean res2 = Andresult.logicaland(true,false);
        boolean res3 = Andresult.logicaland(false,true);
        boolean res4 =Andresult. logicaland(false,false);

        System.out.println(res1);
        /*
        System.out.println(Andresult.logicaland(true,true));
        System.out.println(Andresult.logicaland(true,false));
        System.out.println(Andresult.logicaland(false,true));
        System.out.println(Andresult.logicaland(false,false));

         */
    }
}
