package managementproject;

/**
 * Created by user on 2017-06-30.
 */
public class Main{

    public static void main(String args[] ) {
        int i=0;
        while(i<10){
            RandomEmployeeCreator randEmpCreator = new RandomEmployeeCreator();
            Employee randEmp = randEmpCreator.createRandomEmployee();
            System.out.println("Emp: First name " +randEmp.firstName +" Lastname " +randEmp.lastName
                    +" Age: " +randEmp.age +" Type " +randEmp.getClass() +" Experience " +randEmp.experience);
            System.out.println("SALARY FOR EMPLOYYEE BEFORE :" +randEmp.calculateAndGetSalary());
            i++;

        }
    }
}
