package week3Tutorial;



public class DataType
{
   public static void main(String[]args){
       System.out.println("Minimum Integer Value: "+Integer.MIN_VALUE);
       System.out.println("Maximum Integer value: "+ Integer.MAX_VALUE);
       System.out.println("Integer Byte: "+Integer.BYTES);
       System.out.println("Integer Size: "+Integer.SIZE);
       System.out.println("Minimum Float Value: "+Float.MIN_VALUE);
       System.out.println("Maximum Float Value "+Float.MAX_VALUE);
       System.out.println("Float Byte: "+Float.BYTES);
       System.out.println("Float Size: "+Float.SIZE);
       
       long i=2000000l;
        float f=6.77f;
        
        byte b=60;
        byte c=7;
        
       byte sum=(byte)(b+c);
       System.out.println("The sum of two bytes " +b+ " and " +c+ " is " +sum);
       
       float g=12.34f;
       long v=80l;
       double j=200.33d;
       
       int x=(int)(g+v+j);
       
       System.out.println("The sum of float " +g+ " ,long "+v+" and double "+j+" is "+x);
       
       int ln=100;
       int bh=200;
       int perimeter_rec=2*(ln+bh);
       int area_rec=(ln*bh);
       
       System.out.println("The perimeter of the rectangle is "+perimeter_rec+" units and the area is "+area_rec+" sq. units");
       
       int p=100;
       int t=5;
       float r=2.5f;
       int n=2; // number of times compound is done per year
       
       float inte=(p*t*r)/(100);
       System.out.println("The interest rate is "+inte+"%");
    
       float cpi=p*((float)(Math.pow(1+r/n,n*t)));
       System.out.println(cpi);
       
   }
}