/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Q1 {
    
    public static void displaySqrt(int max){
        
        System.out.println("Number  SquareRoot");
        
        for(int i=0;i<=max;i++){
            System.out.printf("%d \t %.4f\n" , i  ,Math.sqrt(i));
          
    }

}
    public static void main(String[] args) {
        displaySqrt(20);
    }
}
