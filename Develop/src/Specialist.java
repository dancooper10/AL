public class Specialist extends Employee {
    private int levels;

    public Specialist(String name, int age, double salary) {
        super(name, age, salary);

    }
        public int getLevels () {
            return levels;
        }

        public void setLevels ( int levels){
            this.levels = levels;
        }

        public void workWithClients () {
            System.out.print("I am writing my awesome algorithm! ");

        }

}