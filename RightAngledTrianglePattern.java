/* Problem Statement - 
 * Print mirror image of right-angled triangle using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single integer N - the size of the pattern.

Constraints

1 <= T <= 100
1 <= N <= 100

Output Format

For each test case, print the test case number as shown, followed by the pattern, separated by newline.

Sample Input 0

4
2
1
5
10
Sample Output 0

Case #1:
 *
**
Case #2:
*
Case #3:
    *
   **
  ***
 ****
*****
Case #4:
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
 */

import java.io.*;
import java.util.*;

public class RightAngledTrianglePattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int k=1;
        while(t-- >0){
            int n = sc.nextInt();
            System.out.println("Case #"+k+":");
            k++;
            for(int i=0; i<n; i++){
                for(int j=n; j>i+1; j--)
                    System.out.print(" ");
                for(int j=0; j<i+1; j++)
                    System.out.print("*");
                System.out.println();
            }
            
        }
    }
}