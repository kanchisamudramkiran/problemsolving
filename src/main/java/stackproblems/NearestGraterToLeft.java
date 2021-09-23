package stackproblems;


import java.util.ArrayList;

public class NearestGraterToLeft {

    static  void simpleMethod(int[] inputArr)
    {
        int n= inputArr.length;
        int next;
        ArrayList<Integer> output = new ArrayList<>();
         for(int i=0;i<n; i++){
            next = -1;
            for(int j= i-1; j>= 0;j--){
                if(inputArr[j] > inputArr[i]){
                    next = inputArr[j];
                    break;
                }
            }
             output.add(next);
        }

        for(int i= 0; i< output.size() ;i++){
            System.out.println(inputArr[i] +"----------->"+output.get(i));
        }

    }


    static  void StackMethod(int[] arr){
        int n = arr.length;
        int[] vector = new int[arr.length];
        Stack s = new Stack(n);

        for(int i=0;i<=n-1;i++){
            if(!s.isEmpty()){

                while(!s.isEmpty() && s.peek()< arr[i]){
                    s.pop();
                }

            }
            vector[i]= s.isEmpty()?  -1 : s.peek();
            s.push(arr[i]);
        }
        for(int i= 0; i< arr.length ;i++){
            System.out.println(arr[i] +"----------->"+vector[i]);
        }
    }


    public static  void main(String args[]){
        int arr[] = {11,13,21,3};
        System.out.println(arr.length);
//        simpleMethod(arr);
        StackMethod(arr);
    }
}
