#COVID-19 INFECTION SPREAD

##PROBLEM STATEMENT

There are N number of people standing in row(like a points in a straight line)
. Initially one person will be infected
. The virus spreads to any person whose distance from an infected person is atmost 2 units
Task:
. Find the minimum number of people that can be infected 
. Find the maximum number of people that can be infected

##INPUT FORMAT

###First line(T) :
       Number of test cases
###For each test case :
       Line 1(n) : Total number of people
       Line 2(points) : Positions of n people

 ##OUTPUT FORMAT
 
 . For each iteration we get the output in the format of
    minInfected maxInfected

 ###SAMPLE INPUT

 3           <!-- Test cases (T) -->
 2           <!-- First TestCase (n) -->
 3 6         <!-- Positions (points) -->
 3           <!-- Second TestCase (n) -->
 1 3 5       <!-- Positions (points) -->
 5           <!-- Third TestCase (n) -->
 1 2 5 6 7   <!-- Positions (points)-->

 ###SAMPLE OUTPUT

 1 1         <!-- minInfected,maxInfected of TestCase1 -->
 3 3         <!-- minInfected,maxInfected of TestCase2 -->
 2 3         <!-- minInfected,maxInfected of TestCase3 -->
 
 

