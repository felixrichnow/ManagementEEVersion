package managementproject;

/**
 * Created by Felix on 2017-06-30.
 * Complete. Maybe
 */
public class Support extends Employee {
    public float percentageHourMultiplier;
    public int nightHours;
    public final float percentageExp = 200.0f;

    public Support(String firstName, String lastName,
                     int experience, int workingHours, int age, int nigtHours){
        super();
        this.firstName=firstName;
        this.lastName= lastName;
        this.experience=experience;
        this.workingHours=workingHours;
        this.age=age;
        this.nightHours= nigtHours;
        percentageHourMultiplier=experience/percentageExp;
    }

    private final int hourFee = 250;
    private final int extraHourFree = 300;
    private final int normalWorkingHours = 40;

    @Override
    int calculateAndGetSalary() {
        int expExtra = (int) ((workingHours * hourFee)*percentageHourMultiplier);
        salary = (workingHours-nightHours) * hourFee + expExtra +((int) (nightHours*hourFee*1.5));
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
