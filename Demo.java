import java.util.Scanner;

public class Demo {
    public static void main(String[] args){


        System.out.println("In java training");
		// Testing Git changes.

        // If condition Example
//        // byte, short, int , long, float, double, char, boolean
//        int Number1 = sc.nextInt();  // -> Implicit
//
//        System.out.println("Value in Number1 : " + Number1);
//        // checking Even or Odd
//        if(Number1 % 2 == 0){
//            System.out.println("Number1 is Even");
//        }else{
//            System.out.println("Number1 is Odd");
//        }

//        switch (variable){
//            case value1 :
//                ---------
//            break;
//            case value2:
//                ---------
//            break;
//            case value3:
//                --------
//            break;
//
//            default :
//                ----------------
//        }

        Scanner sc = new Scanner(System.in);
        int percentage = sc.nextInt();
        percentage = percentage/10;

        switch(percentage){
            case 10:  // 100
            case 9: // 90 - 99
                System.out.println("A");
                break;
            case 8: // 80 -89
                System.out.println("B");
                break;
            case 7:  // 70 - 79
                System.out.println("C");
                break;
            case 6:  // 60 - 69
                System.out.println("D");
                break;
            default :  // Below 60
                System.out.println("F");
        }

//        if(condition){
//            if the condition mets -> this will get executed.
//        }
//
//        if(Condition){
//            if Condition met then gets Executed.
//        }else{
//            if Condition not met then this logic gets Executed.
//        }

//        if(marksA < 35){
//            System.out.println("Student got Failed");  // -> marks less than 35 -> Failed
//        }else if(marksA <= 60){
//                System.out.println("Student got Passed But Needs improvement");  // -> marks less than 60 -> Pased, need to score
//            }else if(marksA <=80){
//                System.out.println("Student got Passed with Good Mraks");
//            }else if(marksA >80){
//                System.out.println("Student got Passed & Keep it up");
//            }


//        if(condition1){
//            ..............
//        }else{
//            ..................
//        }
//
//  if(condition1) {
//      .............
//  }else if(condtion2){
//      ...................
//  }else if(condition3){
//      ........................
//  }else if(condtion4){
//      ................
//  }else if(conditionN){
//
//  }


 //      if, else , elseif  & Switch Case , Operators


    }
}
