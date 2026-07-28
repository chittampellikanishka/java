class student{
	String name;
	int rollno;
	String branch;
	public student(){
		name="Unknown";
		rollno=0;
		branch="Not assigned";
		
	}
	public student(String n,int r,String b){
		name=n;
		rollno=r;
		branch=b;
	}
	public static void main(String args[])
	{
		student s1=new student();
		student s2=new student("Haripriya",4,"CSM");
		s1.display();
		s2.display();
	}
    public void display(){
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(branch);
	}
}