package SkyScrapper;

import java.util.*;

public class SkyScrapper {
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number floors in the building : ");
        int noOfFloors = sc.nextInt();
        int floorSizeByDay[] = new int[noOfFloors+1];
        for(int i=1;i<noOfFloors+1;i++){
            System.out.println("Enter the floor size given on day : "+i);
            int floorSize=sc.nextInt();
            floorSizeByDay[floorSize]=i;
        }
        int j=noOfFloors;
        boolean control;
        System.out.println("The order of construction is as follows ");
        for(int i=1;i<=noOfFloors;i++){
            control=false;
            System.out.println("Day: "+ i);
            while(j>=1 && floorSizeByDay[j]<=i){
                control=true;
                System.out.print(j +" ");
                j--;
            }
            if(control==true){
                System.out.println();
            }
            sc.close();
        }
    }

}
