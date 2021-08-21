import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Calculate {
    public static void main(String[] args) {
        Map<Integer, String> solutions = new TreeMap<>(); //Stores correct answers.
        int precision = 2; //Sets the precision to work with.
        int s = 0;
        long startTime = System.currentTimeMillis();
        int a; //Farm land used for Recreation
        int b; //Farm land used for Development
        int c; //Army land used for Recreation
        int d; //Army lane used for Development
        int e; //Mine land used for Recreation
        int f; //Mine land used for Development
        int costA = 50;
        int costB = 500;
        int costC = 200;
        int costD = 2000;
        int costE = 100;
        int costF = 1000;

        for (a = 0; a <= 300; a=a+2) {
            for (b = 0; b < 100; b=b+precision) {
                for (c = 0; c < 100; c=c+precision) {
                    for (d = 0; d < 100; d=d+ precision) {
                        for (e = 0; e < 150; e=e+precision) {
                            for (f = 0; f < 150; f=f+precision) {
                                if (a+b+c+d+e+f == 550) {
                                    if (b+d+f >= 300) {
                                        if (c+e<=200) {
                                            if (c+b == 100) {
                                                String solution = "A=" + a + " B=" + b + " C=" + c + " D=" + d + " E=" + e + " F=" + f;
                                                int cost = (a*costA)+(b*costB)+(c*costC)+(d*costD)+(e*costE)+(f*costF);
                                                System.out.println("Solution Found! " + solution + " Cost: " + cost);
                                                solutions.put(cost, solution);
                                                s++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Progress: " + Math.round((a/(float)3)*Math.pow(10,1))/Math.pow(10,1) + "/100%" + "\nTotal solutions found: " + s);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("-----------------------------");
        System.out.println("Program Completed!");
        System.out.println("Statistics: ");
        System.out.println("Increment used: " + precision);
        System.out.println("Total answers found: " + s);
        System.out.println("Time taken to complete: " + (endTime-startTime) + " ms");
        System.out.println("-----------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to print all solutions? Y or N");
        if (scanner.nextLine().equalsIgnoreCase("Y")) { solutions.forEach((integer, s1) -> System.out.println("Solution: " + s1 + " Cost: " + integer));
            System.out.println("Printed: " + solutions.size());
        }
    }
}
