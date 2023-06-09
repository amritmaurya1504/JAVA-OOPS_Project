package Bank;

public class Department {
    String name;
    private static int numberOfDepartment;
    int numOfEmpPerDepartment;
    int budgetPerDepartment;

    public Department(String name, int numOfEmpPerDepartment, int budget){
        this.name = name;
        this.numOfEmpPerDepartment = numOfEmpPerDepartment;
        this.budgetPerDepartment = budget;
        numberOfDepartment++;
    }
    public int getNumberOfDepartment(){
        return this.numOfEmpPerDepartment;
    }
}
