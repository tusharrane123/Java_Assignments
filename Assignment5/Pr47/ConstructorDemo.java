class Person{
	int price;

	Person(){
	System.out.println("person parameterless constructor called");
	}
	Person(int i){
		this.price=i;
		System.out.println("person parametrised constructor called");
	}
	
}
class Employee extends Person{
	Employee(){
		System.out.println("employee parameterless Constructor called");
	}

	Employee(int i,int j){
		super(i);
		System.out.println("employee parameterised Constructor called");
	}
}

class Manager extends Employee{
	Manager(){
		System.out.println("Manager parameterless constructor");
	}
	Manager(int i,int j,int k){
		super(i,j);
		System.out.println("Manager parameterised constructor");
	}
}
class ConstructorDemo{
	public static void main(String args[]){

        Manager m=new Manager(1,2,3);
	}
}

