public class Test {
    public void greet(){
        System.out.println("Greetings");
    }

    public static void main(String[] args){
        String s1 = "hello";
//        String s2 = "hello";
        String s2 = new String("hello");

        System.out.println(s1==s2);
    }

}
