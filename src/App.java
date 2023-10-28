import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Enter total plastic production in pounds (decimal number)");
            double plasticProdInIb = myObj.nextDouble();
            System.out.println("Enter number of categories where plastic is consumed (integer)");
            int categories = myObj.nextInt();
            double[] plasticConsInIb = new double[categories];
            for (int i = 0; i < categories; i++) {
                System.out.println("Enter plastic consumption for a new category in pounds (decimal number)");
                plasticConsInIb[i] = myObj.nextDouble();
            }
            ExcessProduction excessProduce = new ExcessProduction(plasticProdInIb, plasticConsInIb);
            double excess = excessProduce.getExcessProduction();
            System.out.println("Excess production is " + excess + " in pounds");
            System.out.println("Do you want to go again (0 for no, any other integer is yes)");
            int contin = myObj.nextInt();
            if (contin == 0) {
                running = false;
            }
        }

        myObj.close();
    }
}
