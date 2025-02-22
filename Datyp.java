class Datyp{
        public static void main(String args[])
        {
            char a = 'G';
            int i = 89;
            byte b = 4;
            short s = 56;
            double d = 4.355453532;
            float f = 4.7333434f;
            long l = 12121;

            byte by=6;
            int k=by;
            float fl=(float)d;
            byte byt=(byte)l;


            float flo=7.534f;
            float floa=3.747f;
            double dou=flo*floa; 
    
            System.out.println("char: " + a);
            System.out.println("integer: " + i);
            System.out.println("byte: " + b);
            System.out.println("short: " + s);
            System.out.println("float: " + f);
            System.out.println("double: " + d);
            System.out.println("long: " + l);
            System.out.println("byte to int:" + k);
            System.out.println("decimal to float: " + fl);
            System.out.println("int to byte:" + byt);
            System.out.println("Type promotion: " + dou);
            }
            }
