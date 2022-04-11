/* package codechef; // don't place package name! */


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i =0;i<N;i++){
		    A[i] = sc.nextInt();
		}
		 
		 /*int start=0;
		 int end=N-1;
		 while(start<end){
		     int temp = A[start];
		     A[start] = A[end];
		     A[end] = temp;
		     start++;
		     end--;}*/
		     int x = Integer.MIN_VALUE/Integer.MAX_VALUE;
		     for(int i=0;i<N/2;i++){
		         int j = N+(x*i)+x; // j = n-i-1;
		         int temp= A[i];
		         A[i]=A[j];
		         A[j]=temp;
		                           }
		 
		 for(int k =0;k<N;k++){
            System.out.print(A[k]+" ");}
	
	System.out.println();
	T--;
	}
}
}