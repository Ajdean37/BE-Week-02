import java.util.Scanner;

public class Videos {
  public static void main(String[] args) {
    // BOOLEAN 
    // == equality operator
    System.out.println(2 == 2);
    System.out.println(2 > 5);
    System.out.println(3 <= 5);
    System.out.println(5 <= 5);

    // && and || or
    System.out.println(2 == 2 && 1 < 5);
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(true || false);
    System.out.println(false || false);
    System.out.println(2 == 2 || 1 == 5);

    //CONDITIONAL STATEMENTS
    String Myname = "Tom";

    if ( Myname == "Amanda" ) {
      System.out.println("Hello" + " " + Myname);
    } else {
      System.out.println("You are not Amanda," + " " + Myname);
    }

    int age = 20;

    if (age >= 16) {
      System.out.println("You can get your license!");
    } else {
      System.out.println("Please wait " + (16 - age) + " year(s) to get your license");
    }

    double costOfMilk = 4;

    if (costOfMilk >= 2) {
      System.out.println("buying 2");
    } else if (costOfMilk <= 3) {
    System.out.println("Buying 1");
    } else {
      System.out.println("Not buying any milk");
    }

    char grade = 'D';

    switch (grade) {
      case 'A':
        System.out.println("90%");
        break;
      case 'B':
        System.out.println("80%");
        break;
      case 'C':
        System.out.println("70%");
        break;
      default:
        System.out.println("0%");
    }

    if (5 == 5) {
      if (4 == 6) {
        System.out.println("5 is 5 and 4 is 4");
      } else {
        System.out.println("5 is 5");
      }
    }

    if (5 == 5 && 4 == 4) {
      System.out.println("yes");
    }

    //LOOPS
    // for loop
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    for ( int i = 1; i <= 10; i ++) {
      System.out.println(i);
    }

    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
      System.out.println(i);
      }
    }

    //while loop
    int x = 0;
    while (x < 10) {
      System.out.println(x);
      x++;
    }

    //do-while loop
    do {
      System.out.println(x);
      x++;
     } while (x < 2);

     //USER INPUT
     Scanner sc = new Scanner(System.in);

    //  System.out.print("Enter your name: ");
    //  String name = sc.nextLine();

    //  System.out.println("Welcome, " + name);

    int selection = 0;
    double total = 0;

    while (selection != 4) {
      
     System.out.println("Select an option ");
     System.out.println("1) add candybar to shopping cart 1.99");
     System.out.println("2) add cheese to shopping cart 4.99");
     System.out.println("3) add soccerball to shopping cart 12.99");
     System.out.println("4) check out");

     selection = sc.nextInt();

     switch (selection) {
      case 1:
        total += 1.99;
        break;
      case 2:
        total += 4.99;
        break;
      case 3:
        total += 12.99;
        break;
      case 4:
        break;
      default:
        System.out.println("Please pick a valid option");
        break;
     }
    }
     System.out.println("Your current total is " + total);
    }
}
