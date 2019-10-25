import java.sql.SQLOutput;

public class ArrayEx1 {

    public static void main(String[] args) {


        int pos[] = {10, 45, 7, 834, 8};
        int neg[] = {-5, -35, -14, -43, -82};
        int odd[] = {3, 5, 9, 11, 1};
        int even[] = {2, 6, 8, 10, 16};

        System.out.print("Positive Number: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(pos[i] + ", ");
        }
        System.out.println("]");

        System.out.print("Negative Number: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(neg[i] + ", ");
        }
        System.out.println("]");

        System.out.print("Odd Number: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(odd[i] + ", ");
        }
        System.out.println("]");

        System.out.print("Even Number: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(even[i] + ", ");
        }
        System.out.println("]");
    }

}

