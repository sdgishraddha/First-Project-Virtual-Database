
public class typeCasting {
	
	public static void main(String []args)
	{
	byte b=10;
	System.out.println("implicitly type casting:");
	short s=b;
	System.out.println(+s);
	int c=b;
	System.out.println(+c);
	long k=c;
	System.out.println(+k);
	float f=k;
	System.out.println(+f);
	double t=f;
	System.out.println(+t);
	System.out.println("Explicitly type casting  ");
    short l=10;
    byte p=(byte) l;
    System.out.println(+p);
    int i=15;*    short y=(short) i;
    
    System.out.println(+p);
    float o= 2.5f;
    int u=(int) o;
    System.out.println(+u);
    double a=8.5d;
    float x=(float) a;
    System.out.println(+x);
    }

}
