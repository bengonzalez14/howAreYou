/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package github.helloworldscanner;
import java.util.Scanner;

/**
 *
 * @author ben-g
 */
public class GitHubHelloWorldScanner {

   
   
    public static void main(String[] args) {
     
       Scanner HowAreYou = new Scanner(System.in);
        
        System.out.println("Hello, how are you?");
       
        String answer = HowAreYou.nextLine();
        System.out.println(answer);
    }
    
}
