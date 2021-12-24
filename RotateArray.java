import java.util.*;

public class RotateArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scn.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]= scn.nextInt();
        }
        System.out.println("enter the number of left rotation");
        int ro = scn.nextInt();
        int res[]= new int[size];
        res = rotateLeft(arr, ro);
        for(int i=0;i<size;i++){
            System.out.print(res[i]);
        }
    }
    public static int[] rotateLeft(int[] a, int d) {
        int count=0;
        int[] newArray = new int[a.length];
        if(a.length==d){//
            return a;
        }
        else{
            
            for(int i=0;i<a.length;i++){
                if(i<a.length-d){
                    newArray[i]= a[d+i];//
                }
                else{
                    newArray[i]=a[count];
                    count++;
                }
            }


        }
        return newArray;
    }
}