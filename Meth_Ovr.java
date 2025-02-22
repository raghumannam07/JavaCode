class Calc{
    
    int add(int a,int b){
        return a+b;
    }
    double div(int a,int b){
        return a/b;
    }
}
class Adv_Calc extends Calc{
    int add(int a,int b){
     System.out.println("in child class");
     return a+b;
    }

}
public class Meth_Ovr {
    public static void main(String[] args) {
        Adv_Calc obj=new Adv_Calc();
       int r=obj.add(2,3);
        System.err.println(r);
    }
}
