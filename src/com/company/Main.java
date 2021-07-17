package com.company;

import java.util.Scanner;

public class Main {

    public void binarySearch(int[] arr, int ele, int left, int right){
        if(left > right)
        {
            System.out.println("Element not present.");
        }else{
            int mid = left + (right-left)/2;
            if(arr[mid] == ele){
                System.out.println("Element found at index: "+ mid);
            }else if(arr[mid] > ele){
                binarySearch(arr, ele, left,mid - 1);
            }else{
                binarySearch(arr, ele,mid + 1, right);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,8,9,10};
        int right = arr.length - 1;
        int left = 0;
        int ele = 8;
        Main a = new Main();
        a.binarySearch(arr,ele,left,right);
    }
}


// Below code is with out recursion, uncomment to use, also do not forget to comment upper code (except import part) while using the below code.

//class Main {
//
//    static boolean Search(int array[], int SearchNumber){
//        int left = 0;
//        int right = array.length-1;
//        while(left<=right){
//            System.out.println("called");
//            int mid = left + ((right-left)/2);
//            if(array[mid] == SearchNumber){
//                return true;
//            }else{
//                if(SearchNumber < array[mid]){
//                    right = mid - 1;
//                }
//                else{
//                    left = mid + 1;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args){
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array: ");
//        int length = Sc.nextInt();
//        int array[] = new int[length];
//        System.out.println("Enter The array elements in increasing order: ");
//        for(int i=0 ; i<length; i++){
//            array[i]=Sc.nextInt();
//        }
//        System.out.println("Enter The number for search: ");
//        int num = Sc.nextInt();
//        boolean isPresent = Search(array,num);
//        if(isPresent){
//            System.out.println("Given number is present in the array.");
//        }else{
//            System.out.println("Given number is not present in the array.");
//        }
//    }
//}