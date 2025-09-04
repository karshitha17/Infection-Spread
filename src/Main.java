import java.util.*;

public class Main {

    // Function to calculate minimum and maximum number of people affected
    public static int[] getMinMaxInfected(int[] points) {
         Arrays.sort(points);
         int n = points.length;
         int minInfected = n;    // start with max possible
         int maxInfected = 0;

         int start = 0;

         for (int end = 0; end < n; end++) {
            // Extend the window until distance > 2
            while (points[end] - points[start] > 2) {
                start++;
            }
            int groupSize = end - start + 1;
            minInfected = Math.min(minInfected, groupSize);
            maxInfected = Math.max(maxInfected, groupSize);
         }

         return new int[]{minInfected, maxInfected};
    }
    public static void main(String[] args) {
        // 🔹 Built-in test cases (TDD style manual tests)
        System.out.println("Running internal tests...");
        int[] test1 = getMinMaxInfected(new int[]{3, 6});
        System.out.println("Expected: 1 1, Got: " + test1[0] + " " + test1[1]);

        int[] test2 = getMinMaxInfected(new int[]{1, 3, 5});
        System.out.println("Expected: 3 3, Got: " + test2[0] + " " + test2[1]);

        int[] test3 = getMinMaxInfected(new int[]{1, 2, 5, 6, 7});
        System.out.println("Expected: 2 3, Got: " + test3[0] + " " + test3[1]);

        System.out.println("\nNow enter input for custom test cases:");

        // User input mode
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] points = new int[N];
            for (int i = 0; i < N; i++) {
                points[i] = sc.nextInt();
            }
            int[] result = getMinMaxInfected(points);
            System.out.println(result[0] + " " + result[1]);
        }
    }
}

