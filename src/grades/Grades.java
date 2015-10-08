
package grades;

import java.util.Scanner;

public class Grades {


    public static void main(String[] args) {
        int English,Hindi,Maths,Science,SocialScience;
        float total,Average;
        Scanner Enter = new Scanner(System.in);
        System.out.print("Enter the marks for English ? ");
        English = Enter.nextInt();
        System.out.print("Enter the marks for Hindi ? ");
        Hindi = Enter.nextInt();
        System.out.print("Enter the marks for Maths ? ");
        Maths = Enter.nextInt();
        System.out.print("Enter the marks for Science ? ");
        Science = Enter.nextInt();
        System.out.print("Enter the marks for social science ? ");
        SocialScience = Enter.nextInt();
        total = English + Hindi + Maths + Science + SocialScience;
        Average = total /5;
        if (Average < 40){
           System.out.println("Your total is: " + total + " with the percentage of " +Average+" and your performance seems to be Poor");
        }else if (Average >= 40 || Average < 59){
           System.out.println("Your total is: " + total + " with the percentage of " +Average+" and your performance seems to be Average");
        }else if (Average >= 60 || Average <79){
           System.out.println("Your total is: " + total + " with the percentage of " +Average+" and your performance seems to be Good");
        }else if (Average >= 80 || Average <89){
           System.out.println("Your total is: " + total + " with the percentage of " +Average+" and your performance seems to be very Good");
        }else if (Average > 90){
           System.out.println("Your total is: " + total + " with the percentage of " +Average+" and your performance seems to be Excellent");
        }
    }
    
}
