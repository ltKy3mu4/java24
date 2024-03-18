package ru.mpei;

public class Lecture1 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = a && b;
        System.out.println(c);

        byte a1 = 127;
        byte a2 = 2;

        byte c1 = (byte) (a1 + a2);
        System.out.println(c1);

        double m = 2.5;
        double mn = 2.5;

        System.out.println(m * mn);

        char chr1 = 'a';
        char chr2 = 25;

        System.out.println(chr1);
        System.out.println(chr2);

        int lVal = 5, rVal = 10;
        lVal = 2;
        System.out.println(lVal);
        System.out.println(rVal);

        System.out.println("Value of variable lVal equals " + lVal + " !!!");

//        boolean g = true;
        if (lVal == 3) {
            System.out.println("g = true");
        } else if (lVal == 5) {
            System.out.println("val = 5");
        } else {
            System.out.println("g = false");
        }

        if ((a == false && b == true) || (lVal == 10 || lVal == 3)) {
            System.out.println("unreachable condition");
        } else {
            System.out.println("common ");
        }

        int t = 123142124;
        switch (t) {
            case 1:
                System.out.println("t = 1");
                break;
            case 2:
                System.out.println("t = 2");
                break;
            case 3:
                System.out.println("t = 3");
                break;
            case 4:
                System.out.println("t = 4");
                break;
            default:
                System.out.println("another t");
                break;
        }

//        if (t == 1){
//            System.out.println("t = 1");
//        } else if (t == 2){
//            System.out.println("t = 2");
//        }

        int r = 10;
        int k=0;
        while (k < 10){
            System.out.println(r);
            k = k+1;
        }

        boolean p = true;
        int j = 100;
        while (p){
//            System.out.println(j);
            if (j < 50 ){
                p = false;
            }
            j = j -1;
        }

        for (int i =0; i < 5; i++) {
            System.out.println(i);
//            i++;
        }
        int kk = 0;
        kk++;
        kk = kk + 1;


        int h = 10;
        for (int i =0; i < 5; i++) {
            if (i == 2) {
                 continue;
            }
//            if (i== 3){
//                return;
//            }
            h = h - i;
            if (h < 6) {
                System.out.println("HHHHH ====== " + h);
                break;
            }
//            i++;
        }

        int[] arrInt = new int[10];
        int[] arrInt2 = {100,200,300};
        int[] arrInt3 = new int[]{1,2,3,4,5,6};

        for(int i=0; i < arrInt2.length; i ++){
            System.out.println(arrInt2[i]);
        }
        arrInt2[100]=10;

    }
}