class human{
    private String name;
    private int age;
    public human()
    {
        name="Raghu";
        age=22;
        System.out.println("Default constructor called");
    }
    public human(int a,String b)
    {
        this.age=a;
        this.name=b;
        System.out.println("Parameter constructor called"+" "+this.age);
    }
    public int getA(int a)
    {
        return age;
    }
    public String getN(String a)
    {
        return name;
    }
    

    public void set(int age,String name){
        this.age=age;
        this.name=name;
        
    }
}


public class Constr {
    public static void main(String[] args) {
        human H=new human(24,"manam");
        System.out.println(H.getA(23)+":"+H.getN("Kiran"));
        
        
    }
    
}
  