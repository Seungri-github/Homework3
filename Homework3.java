import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        System.out.printf("몇 개의 수를 입력할 예정인가요? ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.printf("수를 입력하세요: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

    }
}
