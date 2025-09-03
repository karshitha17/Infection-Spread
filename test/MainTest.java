public class MainTest{
  
   public static void main(String[] args) {
        // Built-in test cases (TDD style manual tests)
        System.out.println("Running internal tests...");

        // Test Case 1
        int[] test1 = Main.getMinMaxInfected(new int[]{3, 6});
        System.out.println("Expected: 1 1, Got: " + test1[0] + " " + test1[1]);
     
        // Test Case 2
        int[] test2 = Main.getMinMaxInfected(new int[]{1, 3, 5});
        System.out.println("Expected: 3 3, Got: " + test2[0] + " " + test2[1]);
     
        // Test Case 3
        int[] test3 = Main.getMinMaxInfected(new int[]{1, 2, 5, 6, 7});
        System.out.println("Expected: 2 3, Got: " + test3[0] + " " + test3[1]);
     
        // Test Case 4
        int[] test4 = Main.getMinMaxInfected(new int[]{2, 4, 5, 7, 9});
        System.out.println("Expected: 1 3, Got: " + test3[0] + " " + test3[1]);
   }
}

