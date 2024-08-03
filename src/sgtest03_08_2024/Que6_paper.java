package sgtest03_08_2024;
// que: no 6
// there are two ckasses ,one class has an instance method and another classs  has a constructor
//wap to execute the instance method in constructor?
class   Army{
    void brigadier(){
        System.out.println(" this an instance method");
        String name = " Brigadier name is Umesh";
        System.out.println(name);
    }
}
class Airforce{
    Airforce(){
        Army arm = new Army();
        arm.brigadier();
        System.out.println("it is a construcctor in class airforce");
        String nameofofficer=" anand";
        System.out.println(nameofofficer);

    }
}
public class Que6_paper {
    public static void main(String[] args) {
        Airforce afs= new Airforce();
    }
}
