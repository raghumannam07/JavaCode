

class Student{
    int rollno;
    String name;
    int marks;
    static String clg_name="kits";
    static {
        System.out.println("static block executed");
    }
    
   void show(){
    System.out.println(rollno+" "+marks+" "+name+" "+clg_name);
   }
   
   static void show1(Student obj){

    System.out.println(obj.rollno+" "+obj.marks+" "+obj.name+" "+clg_name);
}
   }

public class Static {
    public static void main(String[] args) {
        Student s2=new Student();
        s2.name="Kiran";
        s2.marks=63;
        s2.rollno=1;
        Student s1=new Student();
        s1.name="Raghu";
        s1.marks=49;
        s1.rollno=2;

        Student s3=new Student();
        s3.name="Manam";
        s3.marks=93;
        s3.rollno=3;
        Student.show1(s1);
        s1.show();

    }
}
