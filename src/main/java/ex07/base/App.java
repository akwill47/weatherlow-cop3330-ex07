package ex07.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 William Weatherlow
 */
public class App {
    Scanner in = new Scanner(System.in);
    final double conv = 0.09290304;
    public static void main(String[] args){

        App myApp= new App();
        System.out.print("What is the length of the room in feet? ");
        int length = myApp.readInput();
        System.out.print("What is the width of the room in feet? ");
        int width = myApp.readInput();
        int areaFeet= myApp.doMath(length,width);
        double areaMeter = areaFeet * myApp.conv;
        myApp.displayMath(areaFeet,areaMeter,length,width);
    }
    private int readInput(){
        String input= in.nextLine();
        int num = Integer.parseInt(input);
        return num;
    }

    private int doMath(int length, int width) {
        int area = length * width;
        return area;
    }
    private void displayMath(int areaFeet, double areaMeter,int length,int width){
        System.out.printf("You entered dimensions of %d feet by %d feet.\nThe area is\n%d square feet\n%.3f square meters",length,width,areaFeet,areaMeter);
    }
}
