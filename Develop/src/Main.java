import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Developer dSJ = new Developer("Steve jobs", 44,  120000.0); dSJ.setGrades(" Middle");
        Developer dBS = new Developer("Ben Stones", 55, 150000.0); dBS.setGrades(" Middle");
        Developer dDT = new Developer("Dan Terry", 29, 1350000.0);
        Developer dMB = new Developer("Mike Burns", 33, 125000.0);


        Specialist sRB = new Specialist("Rob Barney", 29, 90000.0);
        Specialist sGD = new Specialist("Garry Dott", 25, 90000.0); sGD.setLevels(5);
        Specialist sVR = new Specialist("Vinny Robb", 29, 90000.0);


        CEO ceo = new CEO("ssss", 45, 255.00);

    System.out.println(dSJ + ""  + " " + dSJ.getGrades()); dSJ.writeCode();
    System.out.println(sGD);


        }
    }
