/* Problem Statement - 
 * Print hollow diamond pattern using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single odd integer N - the size of the diamond.

Constraints

1 <= T <= 100
3 <= N <= 201

Output Format

For each test case, print the test case number as shown, followed by the diamond pattern, separated by newline.

Sample Input 0

4
3
7
Sample Output 0

Case #1:
 *
* *
 *
Case #2:
   *
  * *
 *   *
*     *
 *   *
  * *
   *
 */

import java.io.*;
import java.util.*;

public class HollowDiamond {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k=1;
        
        while(t-- >0){
            int n = sc.nextInt();
            System.out.println("Case #"+k+":");
            int mid = n/2;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    //upper triangle
                    if(i<mid){
                        if(j==mid-i || j==mid+i)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    else if(i==mid){
                    //middle line
                        if(j==0 || j== n-1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    else{
                    //lower triangle  
                        if(j==i-mid || j==(n-1)-(i-mid))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
            k++;
        }
        
    }
}