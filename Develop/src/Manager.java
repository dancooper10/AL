public class Manager extends Employee {
    private boolean hasStocks;
    private boolean hasCar;

    public Manager(String name, int age, double salary) {
        super(name, age, salary);


    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public void WriteProcedures() {
            System.out.println("I am writing my awesome algorithm! ");
        }


}



