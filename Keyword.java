class A{
    A(){
        System.out.println(" default");
    }
    A(int a){
        this();
        System.out.println("parameterized");
    }
}
class B extends A{
    B(){
        super(2);
        System.out.println("in child default method");
    }

    B(int a){
        this();
        System.out.println("in child parametrized method");
    }
}

public class Keyword {
    public static void main(String[] args) {
        A obj=new B(5);
    }
}
