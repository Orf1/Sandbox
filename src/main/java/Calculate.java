import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Calculate {
    public static void main(String[] args) {
        boolean a = true;
        if (true) {
            main2(null);
            return;
        }
        Map<Integer, String> solutions = new TreeMap<>(); //Stores correct answers.
        int precision = 1; //Sets the precision to work with.
        int s = 0;
        int start = -10;
        long startTime = System.currentTimeMillis();
        int Gr; //Farm land used for Recreation
        int Gd; //Farm land used for Development
        int Ar; //Army land used for Recreation
        int Ad; //Army lane used for Development
        int Mr; //Mine land used for Recreation
        int Md; //Mine land used for Development
        int costGr = 50;
        int costGd = 500;
        int costAr = 200;
        int costAd = 2000;
        int costMr = 100;
        int costMd = 1000;

        for (Gr = start; Gr <= 300; Gr=Gr+2) {
            for (Gd = start; Gd < 100; Gd=Gd+precision) {
                if (Gr+Gd==300) {
                    for (Ar = start; Ar < 100; Ar=Ar+precision) {
                        for (Ad = start; Ad < 100; Ad=Ad+ precision) {
                            if (Ar+Ad==100) {
                                for (Mr = start; Mr < 150; Mr=Mr+precision) {
                                    for (Md = start; Md < 150; Md=Md+precision) {
                                        if (Mr+Md==150) {
                                            if (Gd+Ad+Md >= 300) {
                                                if (Ar+Mr<=200) {
                                                    if (Ar+Gd == 100) {
                                                        String solution = "A=" + Gr + " B=" + Gd + " C=" + Ar + " D=" + Ad + " E=" + Mr + " F=" + Md;
                                                        int cost = (Gr*costGr)+(Gd*costGd)+(Ar*costAr)+(Ad*costAd)+(Mr*costMr)+(Md*costMd);
                                                        //System.out.println("Solution Found! " + solution + " Cost: " + cost);
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
                }

            }
            System.out.println("Progress: " + Math.round((Gr/(float)3)*Math.pow(10,1))/Math.pow(10,1) + "/100%" + "\nTotal solutions found: " + s);
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
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            solutions.forEach((integer, s1) -> System.out.println("Solution: " + s1 + " Cost: " + integer));
            System.out.println("Printed: " + solutions.size());
        }
    }

    public static void main2(String[] args) {
        int cf;
        int cc;
        int weightCf = 40;
        int weightCc = 50;
        int sizeCf = 2;
        int sizeCc = 3;
        double costCf = 2.20;
        double costCc = 3.00;


        for(cf = 0; cf <=925; cf++) {
            for(cc = 0; cc <=666; cc++) {
                if ((cf*weightCf) + (cc*weightCc) == 37000) {
                    if ((cf*sizeCf) + (cc*sizeCc) == 2000) {
                        System.out.println("Found an answer: CC: " + cc + " CF: " + cf);
                    }
                }
            }
        }
    }
}
