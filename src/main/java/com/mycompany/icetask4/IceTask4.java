package com.mycompany.icetask4;
import java.util.Scanner;

public class IceTask4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[8];
                
        
       for(int a = 0; a < 8; a = a + 1){
            System.out.print("Enter a name: ");
            names[a] = scan.next();
        }
       nameCheck(names);
        
    }
    
    static void nameCheck(String[] nms){
        if(nms[7].contains("Jack")){
            System.out.println("There is Jack in the seventh index!");
        }else{
            System.out.println("There is no Jack in the seventh index!");
        }
    }
}
