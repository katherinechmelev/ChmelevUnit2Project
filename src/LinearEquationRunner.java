import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");

        //collecting coordinates
        System.out.println("Enter your first coordinate pair: ");
        String pair1 = scan.nextLine();
        System.out.println("Enter your second coordinate pair: ");
        String pair2 = scan.nextLine();

        //taking out x and y values from the coordinate pairs, storing as Strings
        String coordX1 = pair1.substring(1, pair1.indexOf(","));
        String coordY1 = pair1.substring((pair1.indexOf(" ") + 1), pair1.indexOf(")"));
        String coordX2 = pair2.substring(1, pair2.indexOf(","));
        String coordY2 = pair2.substring((pair2.indexOf(" ") + 1), pair2.indexOf(")"));

        //converting Strings to ints
        int coordX1Int = Integer.parseInt(coordX1);
        int coordY1Int = Integer.parseInt(coordY1);
        int coordX2Int = Integer.parseInt(coordX2);
        int coordY2Int = Integer.parseInt(coordY2);

        //checks to see if vertical line first, creates equation, ends program
        if (coordX1Int == coordX2Int) {
            System.out.println("Your points create a vertical line. The equation is: x = " + coordX1Int);
        } else {
            //build object
            LinearEquation line = new LinearEquation(coordX1Int, coordY1Int, coordX2Int, coordY2Int);
            System.out.println(line.lineInfo());
            //printing out y-value based on entered x-value
            System.out.println("Enter an x-value: ");
            double xVal = scan.nextDouble();
            System.out.println("The point on the line is: " + line.coordinateForX(xVal));
        }
    }
}
Footer

