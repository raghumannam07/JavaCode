class human{
    private String name;
    private int age;

    public int get()
    {
        return age;
    }

    public void set(int age){
        this.age=age;
    }
}

public class Capsule {
    
    public static void main(String[] args) {
        human obj=new human();
        obj.set(22);
        System.out.println(obj.get());
    }
}
