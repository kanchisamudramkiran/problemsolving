package stackproblems;

import java.util.ArrayList;

public class NearestSmallerRight {

    public  static void main(String[] args){
//        int arr[] = {11,13,21,3};
        int arr[] = {4,5,2,10,8};
        stackMethod(arr);
    }

    static  void simpleMethod(int arr[]){

        int next, i, j;
        int n = arr.length;
     for(i=0 ; i< n; i++){
         next = -1;
         for(j=i+1; j<n; j++){
                if(arr[j] < arr[i]){
                    next = arr[j];
                    break;
                }
         }
         System.out.println(arr[i]+"------------------>"+next);
     }

    }

   static  void stackMethod(int[] arr){
        Stack s = new Stack(arr.length);
       int[] vector = new int[arr.length];
       int i,n, next;
       n = arr.length;
       for(i =n-1; i>=0; i--){
           if(!s.isEmpty()){
           while (!s.isEmpty() && s.peek() > arr[i])
           {
               s.pop();
//               vector.(s.peek());
           }

       }

           vector[i] = s.isEmpty() ? -1 : s.peek();
           s.push(arr[i]);
   }

       for(i=0; i< n;i++){
           System.out.println(arr[i]+"-------------------->"+vector[i]);
       }
}}
