class Person{
	void getDetail(){
		System.out.println("person details");
	}
	void getJob(){
		System.out.println("person job");
	}
}
class Employee extends Person{
	void getJob(){
		System.out.println("employee job");
	}
	void getDept(){
		System.out.println("employee dept");
	}
}
class InstancOfOperator{
	public static void main(String args[]){

        Employee e1=new Employee();
        Employee e2=new Employee();
        Person p1=new Person();
		Person ar[] = {e1,e2,p1}; 
		for(Person a : ar){
            // a.getJob();
			if(a instanceof Employee){
			  Employee e = (Employee)a;
			  e.getJob();
			}
		}
	}
}

