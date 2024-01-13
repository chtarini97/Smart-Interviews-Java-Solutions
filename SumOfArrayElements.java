/* Problem statement - 
 * Given an array of integers, find the sum of the elements of the given array.
Note: Try to solve this without declaring/storing the array elements.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array and second line contains the elements of the array.

Constraints

1 <= T <= 100
1 <= N <= 1000
1 <= ar[i] <= 1015

Output Format

For each test case, print the sum of the elements of the array, separated by new line.
Sample Input 0
2
3
5 15 3 
2
70 100 
Sample Output 0
23
170
 */


import java.io.*;
import java.util.*;

public class SumOfArrayElements {

    //created a method here just to try methods concept
    static long sumOfElements(int n, long arr[]){
        long sum=0;
        for(int i=0; i<n; i++)
            sum = sum + arr[i];
        
        return sum;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- >0){
            int size = sc.nextInt();
            long[] arr = new long[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextLong();
            }
            long res = sumOfElements(size, arr);
            System.out.println(res);
        }

        sc.close();
    }
}