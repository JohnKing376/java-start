class Main {
    public static void main(String[] args) {
        // int x = 1;
        // int y = 1;

        // System.out.println(x == y); // boolean expression

        // System.out.println(x != y);

        // System.out.println(x <= y);
        // System.out.println(x >= y);


        // int temp = 12;
        // boolean isWarm = temp > 20 && temp < 30;

        // System.out.println(isWarm);


        // boolean hasHighIncome = false;
        // boolean hasGoodCredit = true;
        // boolean hasCriminalRecord = true;
        // boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        // System.out.println(isEligible);

        // Conditions

        // int temp = 32;

        // if (temp > 30) {
        //     System.out.println("it's a hot day");
        //     System.out.println("drink water");
        // } 
        // else if (temp > 20) 
        //     System.out.println("beautiful day"); 
        // else 
        //     System.out.println("cold day");

        // int income = 120_000;
        // boolean hasHighIncome = (income > 100_100);

        // if(income > 100_000)
        //     hasHighIncome = true;
        // else
        //     hasHighIncome = false;


        // Teneary in Java

        // int income = 120_000;

        // String className = income > 100_000 ? "First Class" : "Economy";

        // switch statements

        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You are an Admin lol");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("you are a guest");
        }



        
    }
}
