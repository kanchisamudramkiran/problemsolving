package stackproblems;

public class NextSmallerToLeft {
    public  static void main(String[] args){
//        int arr[] = {11,13,21,3};
        int arr[] = {4,5,2,10,8};
        StackMethod(arr);
    }

    static  void simpleMethod(int arr[]){
        int i, j, n, next;
        n = arr.length;
    for(i =0; i< n;i++){
        next =-1;
        for(j=i;j>=0; j--){
            if(arr[j] < arr[i]){
                next = arr[j];
                break;
            }
        }
        System.out.println(arr[i]+"------------->"+next);
    }
    }

    static  void StackMethod(int[] arr){
        int n = arr.length;
        Stack s = new Stack(n);
        int i, j;
        int[] output = new int[n];
        for(i =0;i<n;i++){

            if(!s.isEmpty()){
                while (!s.isEmpty() && s.peek() > arr[i]){
                    s.pop();
                }
            }
            output[i] = s.isEmpty() ? -1: s.peek();
            s.push(arr[i]);
        }

        for(i= 0; i<n;i++){
            System.out.println(arr[i]+"-------->"+output[i]);
        }
    }
}
