package stackproblems;

import java.util.ArrayList;


public class NearestGraterToRight {
    static  void simpleMethod(int arr[]){
         int size = arr.length;
        int next, i ,j ;
        for( i=0;i<size;i++){
            next = -1;
            for(j =i+1;j<size;j++){
                if(arr[i] <arr[j]){
                    next = arr[j];
                    break;
                }

            }
            System.out.println(arr[i]+ "--- "+ next);
        }
//        System.out.println(output);
    }
    public  static  void main(String args[]){

        int arr[] = {11,13,21,3};
        System.out.println(arr.length);
        simpleMethod(arr);
//        stackBasedMethod(arr);
    }

    static  void stackBasedMethod(int arr[]) {
        Stack s = new Stack(arr.length);
        int nge[] = new int[arr.length];

        for(int i= arr.length -1; i>=0; i--){

            if(!s.isEmpty()){
                while (!s.isEmpty() && s.peek() <= arr[i]){
                    s.pop();
                }

            }
            nge[i] = s.isEmpty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        for(int i= 0; i< arr.length ;i++){
            System.out.println(arr[i] +"----------->"+nge[i]);
        }
    }
}
