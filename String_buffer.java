public class String_buffer {
    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer("Raghu");

        sb.insert(5," manam ");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
       
        sb.setLength(30);
       
        String S=sb.toString();
        System.out.println(S);

    }
}
