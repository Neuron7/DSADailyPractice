import java.util.*;

public class DuplicateCount {
    public static void main(String[] args){
        //System.out.println("Enter the number of cases");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scn.nextInt();
        int arr[] = new int[size];
        Integer carr[] = new Integer[size];//"used Integer class"second array to store latest element and avoid operation on duplicate elements
        for(int i=0;i<size;i++){
            carr[i]= null;
        }
        //array elements
        for(int i=0; i<size;i++){
            arr[i] = scn.nextInt();
        }
        //logic
        for(int i=0;i<size;i++){
            int count=0;
            int flag=0;
            for(int k=0;k<i;k++){   //this loop detects the duplicate and prevents it to go through the duplication check and count
              if(arr[i]==carr[k]){
                    flag=1;
                }
            }
            if(flag==0){
                for(int j=0;j<size;j++){  // main loop for duplication check and count
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            }
            
            carr[i] = arr[i]; 
            if(count>1){
                System.out.println(arr[i]+" occurred "+ count+" times");
            }
            
        }

    }    
}