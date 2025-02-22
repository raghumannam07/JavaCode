public class W extends X {

    public static void main(String[] args) {
        W w=new W();
        X x=new W();
        Z z=new X();

        System.out.println(z.add(20,20));

        System.out.println(x.add(20,20));
        System.out.println(x.mod(20,20));

        System.out.println(w.add(2,4));
        System.out.println(X.sub(6,4));
        System.out.println(w.ab(5,5));
        System.out.println(w.div(5,5));
        System.out.println(w.mod(5,5));

    }
}
