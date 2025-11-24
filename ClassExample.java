public class ClassExample {

//    static class Student{
//        // Fields / Property
//        int rollNo;
//        String name;
//
//        void study(){
//            System.out.println(" Student is studying");
//        }
//
//    }


//    static class Mobile{
//        Long mobileNumber;
//        int storage;
//        String brand;
//        String accountHolderName;
//
//        void call(){
//            System.out.println("Calling is working");
//        }
//
//        void playMusic(){
//            System.out.println("playing Music");
//        }
//
//    }

    public static void display(){
        System.out.println("Hello");
    }

    public static void greet(String name){
        System.out.println("Good Morning "+name);
    }

    public static int add(int x, int y){
        int z = x+y;
        System.out.println("Method adding integers ");
        return z;
    }

    public static float add(float x,float y){
        System.out.println("Methods adding float values ");
        return (x+y);
    }
    public static double rectangleArea(float length){
        System.out.print("Area of a Square : ");
        return (length * length);
    }

    public static double rectangleArea(float length, float breadth){
        System.out.print("Area of a Rectangle : ");
        return (length * breadth);
    }


    public static void main(String[] args){


        float length = 10.132f;
        float breadth = 10.456f;

        double area = rectangleArea(length,breadth);
        System.out.println(" : "+area);
        String val = String.format("%.4f",area);
        System.out.println(val);

        float side = 15.25f;

        double areaofSquare = rectangleArea(side);
        System.out.println(" : "+areaofSquare);










//        greet("Anil");
//        greet("Pavan");
//        greet("Prakash");

//       int a = 5;
//       int b = 6;
//       float c = 10.13f;
//       float d = 20.32f;
//
//        int sum = add(a,b);
//        System.out.println("a + b : "+sum);
//       float val = add(c,d);
//        System.out.println("c + d : "+val);



        // className variableName = new className();
//
//        Mobile mobile1 = new Mobile();
//        mobile1.mobileNumber = 9876543210L;
//        mobile1.storage = 512;
//        mobile1.brand = "Iphone";
//        mobile1.accountHolderName = "Kiran";
//
//        System.out.println(mobile1.accountHolderName + " : "+mobile1.brand+","+mobile1.mobileNumber+","+mobile1.storage);
//
//        mobile1.call();
//        mobile1.playMusic();




//        Student student1 = new Student();
//
//        student1.name = "Harish";
//        student1.rollNo = 1001;
//
//        System.out.println("Student Object Values are : "+ student1.name + " : "+ student1.rollNo);
//
//        student1.study();
//
//        Student student2 = new Student();
//
//        student2.name = "Charan";
//        student2.rollNo = 1002;
//        System.out.println("Student Name : "+ student2.name + " Roll No : "+student2.rollNo);
//
//        student2.study();

//        System.out.println(" End of the Program : ");
    }

}
