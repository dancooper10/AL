public class Developer extends Employee {
    private String grades;

    public Developer(String name, int age, double salary, String grades) {
        super(name, age, salary);
        this.grades = grades;
    }

    public Developer(String name , int age, double salary) {
        super(name, age, salary);

    }




    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {

        this.grades = grades;
    }




    public void writeCode() {


        System.out.println("I am writing my awesome algorithm! ");
    }

}
