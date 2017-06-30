package managementproject;

/**
 * Created by user on 2017-06-30.
 */
public abstract class Employee {
    String firstName = null;
    String lastName = null;
    int age;
    int salary=0;
    int bonus=0;
    int experience=0;
    int workingHours=0;
    int gender=0;


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }


    //Abstract classes
    abstract int calculateAndGetSalary();
    abstract int calculateAndGetBonus();


    public String getLastName() {
        return lastName;
    }

    public int getWorkingHours() {
        return workingHours;
    }


    public int getSalary(){
        return salary;
    }


    public int getExperience() {
        return experience;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBasicSalary(int salary) {
        this.salary=salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getFirstName() {
        return firstName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
