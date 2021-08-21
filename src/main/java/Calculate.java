public class Calculate {
    public static void main(String[] args) {
        int increment = 4;
        int s = 0;

        long startTime = System.currentTimeMillis();
        for (int a = 0; a <= 300; a=a+2) {
            for (int b = 0; b < 100; b=b+increment) {
                for (int c = 0; c < 100; c=c+increment) {
                    for (int d = 0; d < 100; d=d+ increment) {
                        for (int e = 0; e < 150; e=e+increment) {
                            for (int f = 0; f < 150; f=f+increment) {
                                //System.out.println("Testing A: " + a + " B: " + b + " C: " + c + " D: " + d + " E: " + e + " F: " + f);
                                if (a+b+c+d+e+f == 550) {
                                    //System.out.println("Condition 1 Match.");
                                    if (b+d+f >= 300) {
                                        //System.out.println("Condition 2 Match.");
                                        if (c+e<=200) {
                                            //System.out.println("Condition 3 Match.");
                                            if (c+b == 100) {
                                                System.out.println("Solution Found! A: " + a + " B: " + b + " C: " + c + " D: " + d + " E: " + e + " F: " + f);
                                                s++;
                                                //return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Progress: " + a/3 + "/100%" + "\nTotal solutions found: " + s);
        }
        long time = System.currentTimeMillis() - startTime;
        System.out.println("-----------------------------");
        System.out.println("Program Completed!");
        System.out.println("Statistics: ");
        System.out.println("Increment used: " + increment);
        System.out.println("Total answers found: " + s);
        System.out.println("Time taken to complete: " + time + " ms");
        System.out.println("-----------------------------");

    }
}
