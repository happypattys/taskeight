public class eight {

    public static void main(String[] args) {
        
        System.out.println("Processing numbers: 4, 5, 10");
        int totalSum1 = calculateSums(4, 5, 10);
        System.out.println("Total sum of all parameters: " + totalSum1);
        System.out.println("");

        System.out.println("Processing numbers: 1, 2, 3, 4");
        int totalSum2 = calculateSums(1, 2, 3, 4);
        System.out.println("Total sum of all parameters: " + totalSum2);
        System.out.println("");

        System.out.println("Processing numbers: 7");
        int totalSum3 = calculateSums(7);
        System.out.println("Total sum of all parameters: " + totalSum3);
        System.out.println("");

        System.out.println("Processing no numbers:");
        int totalSum4 = calculateSums(); 
        System.out.println("Total sum of all parameters: " + totalSum4);
        System.out.println("");
    }

    
    public static int calculateSums(int... numbers) {
        int totalSum = 0;
        int cumulativeSumUpToCurrentParameter = 0;

        if (numbers.length == 0) {
            System.out.println("No parameters provided.");
            return 0;
        }

        System.out.println("Cumulative sums for each parameter:");
        for (int i = 0; i < numbers.length; i++) {
            int currentParameter = numbers[i];

            

            int sumOfNaturalNumbers = 0;
            for (int j = 1; j <= currentParameter; j++) {
                sumOfNaturalNumbers += j;
            }

            System.out.println("  For parameter " + currentParameter + ": Cumulative sum = " + sumOfNaturalNumbers);

            
            totalSum += currentParameter;
        }
        return totalSum;
    }
}

