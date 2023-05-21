/*
Question : Write a program to print the given string in reverse.
 */
import java.util.Scanner;
public class Main {
    static String ReverseMethod(String Letter, int index){
        if (index == Letter.length())return "";
        String SmallAns = ReverseMethod(Letter, index + 1);
        return SmallAns + Letter.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Letter;
        int initialization,index = 0;
        System.out.println("Enter the word ");
        Letter = sc.nextLine();
        System.out.println("Printing result without using recursion :");
        for (initialization = Letter.length() - 1; initialization >= 0; initialization--){
            System.out.print(Letter.charAt(initialization));
        }
        System.out.println();
        System.out.println("Now,Printing the result with help pf recursion :");
        System.out.println(ReverseMethod(Letter,index));
    }
}