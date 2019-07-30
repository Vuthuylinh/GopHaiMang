import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1=new int[5];
        int[] array2= new int[3];
        int[] array3=new  int[array1.length+array2.length];
        System.out.println("Enter list element of array1: ");
        for(int i=0;i<array1.length;i++){
            System.out.print("Enter element "+ (i+1)+":");
            array1[i]=input.nextInt();
            array3[i]=array1[i];
        }
        System.out.println();
        System.out.println("Enter list element of array2: ");
        for(int j=0;j<array2.length;j++){
            System.out.print("Enter element "+(j+1) +":");
            array2[j]=input.nextInt();
            array3[array1.length+j]=array2[j];
        }
        System.out.println();
        System.out.println("List element of array1: ");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"; ");
        }
        System.out.println();
        System.out.println("List element of array2: ");
        for(int j=0;j<array2.length;j++){
            System.out.print(array2[j]+"; ");
        }
        System.out.println();
        System.out.println("List element of array 3 is: ");
        for(int i=0; i<array3.length;i++){
            System.out.print(array3[i]+ "; ");
        }


    }
}
