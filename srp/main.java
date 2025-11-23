package srp;

public class main {
    public static void main(String[] args) {
        Journal j = new Journal();
        j.addEntry("I woke up at 7 o'clock today.");
        j.addEntry("I ride a JR Central Line to get to work.");
        System.out.println(j);

        Persistence p = new Persistence();
        p.saveToFile(j, "point.txt", true);
        
    }
}
