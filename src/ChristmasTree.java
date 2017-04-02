import java.util.Scanner;
/**
 * Created by Tomal on 2017-03-21.
 */
public class ChristmasTree {
public static void main(String args[]){
    int a;

    a=ChristmasTree.gettingArguments();
    System.out.println(a);
    ChristmasTree.drawingTree(a);


}

    public static int gettingArguments()
    {
        System.out.println("Podaj wyokosc:");
        Scanner length= new Scanner(System.in);
        while(length.hasNextInt()) {
            length.nextInt();
        }
        return length.nextInt();
    }

    public static void drawingTree(int length){
    for(int i=0;i<length;i++)
    {
        for(int j=0;j<length-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=0;k<(length*2-i-1);k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }


    }

}
