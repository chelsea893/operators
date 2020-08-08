package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 3;
        // hi i'm a comment
        System.out.println("1+2 = "+ result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result -1;
        System.out.println("3-1= " + result);
        System.out.println("previous result = " + previousResult);
        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result /5;
        System.out.println("20/5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4%3 = " + result);
        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1+1 = " + result);
        result--; // 2 -1 = 1
        System.out.println("2-1 = " + result);
        //result = result + 2
        result += 2; //1+2 = 3
        System.out.println("1 + 2 = " + result);
        //result = result * 10
        result *= 10; //3*10 = 30
        System.out.println("3*10 = " + result);
        result /= 3; //30/3 = 10
        System.out.println("30/3 = " + result);
        //result = result -2
        result -= 2; // 10 -2 = 8
        System.out.println("10-2 = "+ result);

        boolean isAlien = false;
        if (isAlien == false) { // don't need semicolon or colon
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore<= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) { // need two equals here
            System.out.println("This is an error");
        }
        boolean isCar = false;
        if (!isCar) { // don't need equal here for to test can tho (isCar !=  true)
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false; // value assigned if first true (true) if first conditon is false (false)
        // boolean is EighteenOrOVer = (ageOfClient == 20? true: false);
        // operand one (ageOfClient == 20) in this case the condition we are checking. It needs to return true or false
        // operand two = true here is the value to assign the variable ifEighteenOrOver if the condition above is true
        //Operand three = false here is the value to assign the variable ifEighteenOrOVer if the condition above is false
        double value = 20.00d;
        double value_ = 80.00d;
        double totalvalue_ = (value + value_) * 100.00d;
        System.out.println(totalvalue_);
        double remainder = totalvalue_% 40.00d;
        System.out.println(remainder);
        boolean variable = (remainder == 0? true: false);
        System.out.println(variable);
        if (variable != true) {
            System.out.println("Got some remainder");
        }










	// write your code here
    }
}
