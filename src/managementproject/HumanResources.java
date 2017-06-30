package managementproject;

/**
 * Created by user on 2017-06-30.
 */
public class HumanResources extends Employee {
    public final float percentageExp = 50.0f;
    public float percentageHourMultiplier;
    private String workingField;
    public int hourFeeFieldMultiplication;

    private int hourFee = 500;
    private final int extraHourFree = 300;
    private final int normalWorkingHours = 38;

    HumanResources(String firstName, String lastName,
                   int experience, int workingHours, int age, String workingField){
            super();
        this.firstName=firstName;
        this.lastName= lastName;
        this.experience=experience;
        this.workingHours=workingHours;
        this.age=age;
        percentageHourMultiplier=experience/percentageExp;
        this.workingField = workingField;
    }

    @Override
    int calculateAndGetSalary() {

        switch (workingField) {
            case "Consultant":
                hourFeeFieldMultiplication = 2;
                break;
            case "Executive":
                hourFeeFieldMultiplication = 4;
                break;
            case "Education":
                hourFeeFieldMultiplication = 6;
                break;
            default:
                hourFeeFieldMultiplication = 0;
                break;
        }
            hourFee = hourFee * hourFeeFieldMultiplication;
            int expExtra = (int) ((workingHours * hourFee) * percentageHourMultiplier);
            salary = (workingHours) * hourFee + expExtra;
            return salary;


    }

    @Override
    int calculateAndGetBonus() {
        return 0;
    }
}
