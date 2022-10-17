import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a coordinate pair: ");
        String pair1 = scan.nextLine();
        int index1 = pair1.indexOf("(");
        int index2 = pair1.indexOf(",");
        int index3 = pair1.indexOf(")");
        String x1 = pair1.substring(index1+1, index2);
        String y1 = pair1.substring(index2+2, index3);
        Integer.parseInt(x1);
        Integer.parseInt(y1);
        System.out.println(x1);
        System.out.println(y1);

        System.out.print("Enter another coordinate pair: ");
        String pair2 = scan.nextLine();
        int index4 = pair2.indexOf("(");
        int index5 = pair2.indexOf(",");
        int index6 = pair2.indexOf(")");
        String x2 = pair2.substring(index4+1, index5);
        String y2 = pair2.substring(index5+2, index6);
        Integer.parseInt(x2);
        Integer.parseInt(y2);
        System.out.println(x2);
        System.out.println(y2);

        LinearEquation coordinates1 = new LinearEquation (x1, y1, x2, y2);
    }
}
