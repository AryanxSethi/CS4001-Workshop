package week3Tutorial;



public class DefaultValues
{
    byte a;
       short b;
       int c;
       long d;
       float e;
       double f;
       char g;
       boolean h;
       
       public static void main(String[]args){
           DefaultValues x= new DefaultValues();
           System.out.println("This is Byte: "+x.a);
       System.out.println("This is Short: "+x.b);
       System.out.println("This is Integer: "+x.c);
       System.out.println("This is Long: "+x.d);
       System.out.println("This is Float: "+x.e);
       System.out.println("This is Double: "+x.f);
       System.out.println("This is Character: "+x.g);
       System.out.println("This is Boolean: "+x.h);
        /*
         * This doesn't work with local variables as they require a value to be 
         * assigned to them and can not be unassigned. Local variables don't have
         * default value but Instance variables do.
         */ 
       }
}