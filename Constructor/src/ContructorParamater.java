
	class Student{
		int stdid;
		String stdname;

		Student(int i,String n)
		{
		stdid=i;
		stdname=n;
		}

		void display() {
		System.out.println(stdid+" "+stdname);
		}
	}
	public class ContructorParamater {

	public static void main(String[] args) {

		Student s1=new Student(2,"Alex");
		Student s2=new Student(10,"Annie");
		s1.display();
		s2.display();
			}
	}



