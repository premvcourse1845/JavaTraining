public class Arrays {
    public static void main(String[] args){

        int[][] matrix = {
                {10,20,30,40},
                {11,21,31,41,232,56,43,22,0},
                {12,22,31,42},
                {41,67,58,43}
        };

        int totalSum = 0;

        for(int[] row : matrix){
            for(int column : row){
                totalSum = totalSum + column;
            }
        }

        System.out.println("Total Sum : "+totalSum);



        // Using For Loops

        // Using Enhanced Loops







        // DataType[] variableName = new DataType[capacity/length of array];
        //
//        int[] nums = new int[5];  // returns the address of the first block of array

//        int[][] twoDarr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        // Enhanced Loops
        //        DataType[] arrayName = new DataType[size];

//        for(DataType var :  arrayName){
//            System.out.println(var);
//        }


//        int[] nums = {10,20,30,40,50};
//
//        for(int i : nums){
//            System.out.println(i);
//        }


//        int[][] matrix = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };

        //        [1,2,3,4] -> 1st row arr
//        [5,6,7,8]
//        [9,10,11,12]
//        [13,14,15,16]


//        for(int[] row : matrix){  // row = [1,2,3,4]
//            for(int column : row){   // coulmn = 1
//                System.out.print(column + " ");
//            }
//            System.out.println("");
//        }



//        for(int row=0;row<matrix.length;row++){
//            for(int column=0; column<matrix[row].length;column++){
//                System.out.print(matrix[row][column] +" ");
//            }
//            System.out.println("");
//        }





//        1 -> (0,0)  2 -> (0,1)  3 -> (0,2)
//        4 -> (1,0)  5 -> (1,1)  6 -> (1,2)
//        7 -> (2,0)  8 -> (2,1)  9 -> (2,2)


        // Printing Diagonal Elements
//        System.out.println("Diagonal Elements in array are ");
//        for(int row=0;row<twoDarr.length;row++){
//            System.out.println(twoDarr[row][row] + " ");
//        }



////        [1,2,3,4] -> 1st row arr
////        [5,6,7,8]
////        [9,10,11,12]
////        [13,14,15,16]
//
//
//        for(int row=0;row<twoDarr.length;row++){
//            for(int column=0; column<twoDarr[row].length;column++){
//                System.out.print(twoDarr[row][column] +" ");
//            }
//            System.out.println("");
//        }



//        // Arrays Declaration.
//        int[] numbers = {1,2,3,4,167,45,169, 168 ,18,10,7}; // length -> 4
//
//        // Return Maximum number / largest Number from the array
//
//        int maximum = numbers[0];  // maximum -> 1
//
//        for(int i=1;i<numbers.length;i++){
//            if(numbers[i] > maximum){  // 7 > 167
//                maximum = numbers[i];   // maximum =167
//            }
//        }
//
//        System.out.println("Largest Number in the array is :" + maximum);


        // Sum of Array
//        int sum = 0;
//        for(int i=0;i<numbers.length;i++){
//            sum = sum + numbers[i];
//        }
//
//        System.out.println("Sum of the Array is : "+sum);
//        i =1 -> nums[i-1] = nums[0]
//                i=2 -> nums[1]
//                i=3 -> nums[2]
//                i=5 -> nums[4]

    }
}
