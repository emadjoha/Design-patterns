package packCompositionExample;


/**
 * @leaf one Developer
 */

public class Developer implements Employee {

    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Employee ID :" + this.empId +
                " ,Employee Name:" + this.name +
                " ,Employee Position:" + this.position);
    }

}
