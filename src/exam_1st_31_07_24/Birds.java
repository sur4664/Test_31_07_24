package exam_1st_31_07_24;

//QUe11
class Bird{
    static String []subj(String a[]) {
        String b[]= new String [a.length];
        for(int i=0;i<=a.length-1;i++){
            b[i]=a[i];
        }
        return b;
    }


}

public class Birds {
    public static void main(String[] args) {
        String a[]={"peiogon","duck","eagle"};
        String y[]= Fsubjects.subj(a);
        for(String x:y){
            System.out.println(x);

        }



    }

}
