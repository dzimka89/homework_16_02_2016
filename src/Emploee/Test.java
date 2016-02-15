package Emploee;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Employer boss = new Employer("Vasya", "Briz");
        Employer anotherBoss = new Employer("Marina", "Briz");
        Employer emp4 = new Employer("Emp4", "Briz", boss);
        Employer emp3 = new Employer("Emp3", "Briz", boss, emp4);
        Employer emp2 = new Employer("Emp2", "Briz", emp3, anotherBoss);
        Employer emp1 = new Employer("Emp1", "Briz", emp2, anotherBoss);

        Employer employers[] = new Employer[5];
        getAllEmployer(employers, 0, emp1);
        System.out.println(Arrays.toString(employers));
    }

    public static void getAllEmployer(Employer employer[], int currentPosition, Employer currentEmpl) {
        employer[currentPosition] = currentEmpl;

        if(currentEmpl.getBoss()!=null&&currentEmpl.getAnotherBoss()!=null) {
            getAllEmployer(employer, ++currentPosition, currentEmpl.getBoss());
        }
    }

}
