package managementproject;

/**
 * Created by Felix on 2017-06-30.
 * Complete. Maybe
 */
public class Developer extends Employee {
    public float percentageHourMultiplier;
    public final float percentageExp = 100.0f;

    public Developer(String firstName, String lastName,
                     int experience, int workingHours, int age){
      super();
      this.firstName=firstName;
      this.lastName= lastName;
      this.experience=experience;
      this.workingHours=workingHours;
      this.age=age;
      percentageHourMultiplier=experience/percentageExp;
    }

    private final int hourFee = 1250;
    private final int extraHourFree = 1500;
    private final int normalWorkingHours = 35;

    @Override
    int calculateAndGetSalary() {
        int expExtra = (int) ((workingHours * hourFee)*percentageHourMultiplier);
        salary = workingHours * hourFee + expExtra;
        return salary;
    }

    @Override
    int calculateAndGetBonus() {
        if(workingHours>normalWorkingHours){
            bonus = (normalWorkingHours-workingHours )*extraHourFree;
            return (normalWorkingHours-workingHours )*extraHourFree;
        }
        else{
            return 0;
        }
    }
}
