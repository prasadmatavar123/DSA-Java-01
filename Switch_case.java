import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 10:
            System.out.println("You are boy");
            break;

            case 20:
            System.out.println("You are not boy");
            break;

            case 30:
            System.out.println("You are man");
            break;

            default:
            System.out.println("Enjoy your day");
        }
        System.out.println("Thanks for using my java code");

        /* 

        if(age>55){
            System.out.println("You are experience");
        }
        else if(age>46){
            System.out.println("You are semi-experience");
        }
        else if(age>36){
            System.out.println("You are semi semi-experience");
        }
        else{
            System.out.println("You are not experience");
        }

        */
    }
    
}
