# COVID-19 INFECTION SPREAD

## PROBLEM STATEMENT
There are N number of people standing in row(like a points in a straight line)
- Initially one person will be infected
- The virus spreads to any person whose distance from an infected person is atmost 2 units
  
**Task:**
- Find the minimum number of people that can be infected 
- Find the maximum number of people that can be infected

## INPUT FORMAT
- First line(T) : Number of test cases
- For each test case :
  - Line 1(n) : Total number of people
  - Line 2(points) : Positions of n people

## OUTPUT FORMAT 
- For each test case we get the output in the format of
    minInfected maxInfected

## SAMPLE INPUT
 3           <!-- Test cases (T) -->
 2           <!-- First TestCase (n) -->
 3 6         <!-- Positions (points) -->
 3           <!-- Second TestCase (n) -->
 1 3 5       <!-- Positions (points) -->
 5           <!-- Third TestCase (n) -->
 1 2 5 6 7   <!-- Positions (points)-->

## SAMPLE OUTPUT
 1 1         <!-- minInfected,maxInfected of TestCase1 -->
 3 3         <!-- minInfected,maxInfected of TestCase2 -->
 2 3         <!-- minInfected,maxInfected of TestCase3 -->

## PROJECT STRUCTURE
 Infection-Spread/
├── src/Main.java           <!-- main code -->
├── test/MainTest.java      <!-- optional test cases -->
├── samples/input1.txt
├── samples/output1.txt
├── README.md               <!-- this file -->
              
## SOLUTION
- Sort the positions.
- Count consecutive people within distance ≤2 (sliding window or left/right spread).
- Track minimum and maximum infected people across all possible scenarios.

## TEST CASES
- Test Case 1: `[3, 6]` → Expected: `1 1`  
- Test Case 2: `[1, 3, 5]` → Expected: `3 3`  
- Test Case 3: `[1, 2, 5, 6, 7]` → Expected: `2 3`

