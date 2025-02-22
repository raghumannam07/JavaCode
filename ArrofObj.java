class Student{
    int rollno;
    String name;
    int marks;
}




public class ArrofObj {
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

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].rollno+":"+students[i].name+":"+students[i].marks);

        }
        for(Student stud : students){
            System.out.println(stud.name);
        }
      

    }
    
}
