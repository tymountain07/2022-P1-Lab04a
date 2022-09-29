// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args) {
        System.out.println("Lab04a, Student Version\n");

        double principal = 250000;
        double annualRate = 4.85;
        double numYears = 30;
        double monthlyRate = (4.85/12);
        double monthsPayed = (12 * numYears);
        double monthlyPayment = ((monthlyRate + (Math.pow(monthlyRate + 1, monthsPayed))/(Math.pow(1 + monthlyRate, monthsPayed) - 1)));



        System.out.println("Principle:          $" + principal);
        System.out.println("Annual Rate:        " + annualRate + "%");
        System.out.println("Number of Years:    " + numYears);


        }
    }