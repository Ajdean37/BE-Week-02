public class Labs {
  public static void main(String[] args) {

    //1, 2, 3 and 4
    int age = 16;
    boolean hasLicense = false;

    if (age >= 16 && hasLicense) {
      System.out.println("You can drive!");
    }  else {
      System.out.println("You cannot drive");
    }

    //5
    double costOfMilk = 2.00;
    int thirstLevel = 7;

    if (costOfMilk < 2.50 || thirstLevel > 6) {
      System.out.println("Milk Please");
    } else {
      System.out.println("No Thanks");
    }

    //6
    int numberOfCookies = 20;
    int numberOfChildren = 8;

    if (numberOfCookies % numberOfChildren == 0) {
      System.out.println("Sad face");
    } else if (numberOfCookies % numberOfChildren < 2) {
      System.out.println("YES");
    } else if (numberOfCookies % numberOfChildren < 5) {
      System.out.println("WOOHOO");
    } else  {
      System.out.println("Jackpot");
    }

    //7 
    String loyaltyMemberStatus = "GOLD";
    double loyaltyMemberDiscount = 0.0;


    switch (loyaltyMemberStatus) {
      case "SILVER":
        loyaltyMemberDiscount = 0.10;
        break;
      case "GOLD":
        loyaltyMemberDiscount = 0.15;
        break;
      case "PLATINUM":
        loyaltyMemberDiscount = 0.25;
        break;
      default: 
        System.out.println("You are not a member");
        break;
    }
    System.out.println(loyaltyMemberDiscount);
    
    //8
    double billTotal = 650.00;
    double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;

    System.out.println(adjustedTotal);

    if (adjustedTotal > 500.00) {
      if (loyaltyMemberStatus == "SILVER") {
        loyaltyMemberStatus = "GOLD";
      } else if (loyaltyMemberStatus == "GOLD") {
        loyaltyMemberStatus = "PLATINUM";
      }
    } 

    System.out.println(loyaltyMemberStatus);

    //9
    String username = "ajdean37";
    String password = "12345";

    if (username.equals("ajdean37") && password.equals("12345")) {
      System.out.println("login successful");
    } else {
      System.out.println("access denied");
    }

    //10

    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    //11
    for (int i = 10; i >= 0; i--) {
      System.out.println(i);
    }

    //12
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    //13
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        System.out.println("EVEN");
      } else {
        System.out.println("ODD");
      }
    }

    //14
    int x = 100;
    while (x > 0) {
      System.out.println(x + " " + (x % 3));
      x--;
    }
  }
}
