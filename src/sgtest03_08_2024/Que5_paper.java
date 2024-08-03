package sgtest03_08_2024;
// A class has one instance method and one static method wap
//to execute them in a constructor?
class Minister{
    void prime(){
        System.out.println(" this is an instance method of class prime");
    }
    static void ps(){
        System.out.println(" it is astatic method of class Minister");
    }
    Minister(){
        this.prime();
        Minister.ps();
    }
}
public class Que5_paper {
    public static void main(String[] args) {
        Minister mns = new Minister();
    }
}
