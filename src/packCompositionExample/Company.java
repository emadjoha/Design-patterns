package packCompositionExample;

public class Company  {


    public static void main(String args[]){
        Developer developer1 = new Developer(1,"emad","none");
        Developer developer2 = new Developer(2,"ahmad","none");
        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(developer1);
        companyDirectory.addEmployee(developer2);


        Manager manager1 = new Manager(3,"saad","none");
        Manager manager2 = new Manager(4,"khaled","none");
        CompanyDirectory companyDirectoryManager = new CompanyDirectory();
        companyDirectoryManager.addEmployee(manager1);
        companyDirectoryManager.addEmployee(manager2);


        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(companyDirectory);
        directory.addEmployee(companyDirectoryManager);
        directory.showEmployeeDetails();

    }


}
