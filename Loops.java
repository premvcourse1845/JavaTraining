public class Loops {
    public static void main(String[] args){

        // Loops

        // For Loop Structure

//        Structure of Do While
//        do{
//            ----------
//                    ------------
//        }while(condition);
//        1,2,3,4,5
//                1 + 2 = 3
//                        3 + 3 = 6
//                              6 + 4 = 10
//                              10 + 5 = 15
        // Sum of First N Numbers

        int number = 1;
        int n = 50;
        int sum = 0;

        do{
            sum = sum + number;
            number = number + 1;  // number += 1  || number++ || ++number
        }while (number<=n);

        // Sum of First n numbers is sum
        System.out.println("Sum of First " + n + " numbers is : " + sum);


        // c++ -> &var ->

//
//        while(condition){
//            .....................
//            .........
//        }

        // Print n numbers
//        int n = 100;
//        int printingNumber = 1;
//
//        while(printingNumber <= n){
//            System.out.println("printingNumber :" +printingNumber);
//            printingNumber++;
//        }






        //        for(intialValue declaration ; condition; updatedValue){
//            ..............
//        }

//        int count=1;
//        for(count = 1 ; count <=50 ; count++  ){
//            System.out.println("Hello Java " + count);
//        }

//        count : 1 ->  Hello Java
//                count : 2 -> Hello Java
//                count : 3 -> Hello Java
//                count : 4 -> Hello Java
//                count : 5  -> Hello Java
//                count : 6 -> -------------




        // age criteria > 22
        // Degree -> true

//        (age > 22 && hasDegree == true) -> Eligibility job
//                else -> Not eligible for Job
//                int age = 22;
//                boolean hasDegree = false;
//                // Job Eligibility Check
//
//                if( age >=22 && hasDegree){
//                    System.out.println("Eligible for Job");
//                }else{
//                    System.out.println("Not Eligible for Job");
//                }

                // Delivery Fees logic
//        int orderAmountForFreeDelivery = 500;
//                int cartValue = 300;
//                boolean hasMembership = false;
//
//                if( (cartValue >= orderAmountForFreeDelivery) || hasMembership){
//                    System.out.println("Eligible for Free Delivery");
//                }else {
//                    System.out.println("Not Eligible for Free Delivery");
//                }
//
//                        OR
//                        X Y -> Z
//                        0 0 -> 0
//                        1 0 -> 1
//                        0 1 -> 1
//                        1 1 -> 1
//
//        AND
//        X Y -> Z
//        0 0 -> 0
//        1 0 -> 0
//        0 1 -> 0
//        1 1 -> 1
    }

}
