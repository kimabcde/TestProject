package ncs.test2;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];

		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		
		System.out.println();
		
		System.out.println("name\tdepartment\tsale");
		System.out.println("------------------------------------------------");
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("인센티브 100 지급");
		
		for(Employee e : employees) {
			if(e instanceof Secretary) {
				Secretary s = (Secretary) e;
				s.incentive(100);
			}else if(e instanceof Sales) {
				Sales s = (Sales) e;
				s.incentive(100);
			}
		}
		
		for(Employee e : employees) {
			System.out.println(e+"\t"+e.tax());
		}
		
	}

}
