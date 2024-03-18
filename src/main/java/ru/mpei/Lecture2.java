package ru.mpei;

public class Lecture2 {
    public static void main(String[] args) {
        String myFirstString = new String("My first string");
        String mySecondStr = "My second String";
        System.out.println(myFirstString);
        System.out.println(mySecondStr);
        String str3 = myFirstString + " " + mySecondStr;

        System.out.println(str3);
        int res = sum(10, 12);
        System.out.println(res);

        printArray(new int[]{10,20,30,40});

//        Student studentEgor = new Student("Ivanov", 18, "e-13-24");
//        Student studentLisa = new Student("Krasnova", 17, "e-13-24");
//
//        studentEgor.setSurname("Lex");
//        String surname = studentEgor.getSurname();
//        System.out.println(surname);
//
//        boolean skuf = studentEgor.isSkuf();
//        System.out.println(skuf);
        Student s1= new Student();
        Student s2 = new Student("Ivanov", 18, "e13");
        Student s3 = new Student("Alexeeva", 20, "e12");

//        System.out.println(s1.surname);
//        System.out.println(s2.surname);
//        System.out.println(s3.surname);
//
        System.out.println("--------------------------");
//
//        System.out.println(s1.age);
//        System.out.println(s2.age);
//        System.out.println(s3.age);
//
        s1.setAge(-1);

        System.out.println(s1.getAge());

        System.out.println(s1.getClass());
        System.out.println(s1.toString());
        System.out.println(s1.hashCode());
        System.out.println(s1.equals(s2));

    }

    private static int sum(int a, int b){
        int res = a + b;
        return res;
    }

    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
