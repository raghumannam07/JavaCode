class Calculator{
    
    int add(int a,int b){
        return a+b;
    }
    float add(int a,float b, int c){
        return a+b+c;
    }
}

public class Example {
    public static void main(String[] args) {
        Calculator Calc=new Calculator();
        int result=(int)Calc.add(4,5.6f,6);
        System.out.println(result);
    }
    
}
