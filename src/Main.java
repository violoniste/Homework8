import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("task1:");

        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        float[] j = { 1.57f, 7.654f, 9.986f };

        int[] k = { 5, 6, 7, 8, 9};
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2:");

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;

        float[] floats = { 1.57f, 7.654f, 9.986f };

        int[] ints1 = { 5, 6, 7, 8, 9};

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i != ints.length - 1)
                System.out.print(", ");
        }

        System.out.println();

        for (int i = 0; i < floats.length; i++) {
            System.out.print(floats[i]);
            if (i != floats.length - 1)
                System.out.print(", ");
        }

        System.out.println();

        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]);
            if (i != ints1.length - 1)
                System.out.print(", ");
        }

        System.out.println();
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3:");

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;

        float[] floats = { 1.57f, 7.654f, 9.986f };

        int[] ints1 = { 5, 6, 7, 8, 9};

        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0)
                System.out.print(", ");
        }

        System.out.println();

        for (int i = floats.length - 1; i >= 0; i--) {
            System.out.print(floats[i]);
            if (i != 0)
                System.out.print(", ");
        }

        System.out.println();

        for (int i = ints1.length - 1; i >= 0; i--) {
            System.out.print(ints1[i]);
            if (i != 0)
                System.out.print(", ");
        }

        System.out.println();
    }

    public static void task4() {
        System.out.println();
        System.out.println("task4:");

        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;

        for (int i = ints.length - 1; i >= 0; i--) {
            if (ints[i] % 2 != 0)
                ints[i]++;
        }

        System.out.println(Arrays.toString(ints));
    }
}