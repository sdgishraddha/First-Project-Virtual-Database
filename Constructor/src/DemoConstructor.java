class EmpDetail{
	int Empid;
	String Empname;

void Info() {
	System.out.println(Empid+" "+Empname);
	}
}


public class DemoConstructor {
	public static void main(String[] args) {

		EmpDetail e1=new EmpDetail();
		EmpDetail e2=new EmpDetail();

		e1.Info();
		e2.Info();
		}
}
	
