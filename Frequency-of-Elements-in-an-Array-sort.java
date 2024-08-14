package frequencyofelementsinanarraysort;
import java.util.Scanner;
class FrequencySorter {
    public FrequencySorter(int size) {
        int[] arr = new int[size];
        int[] frequency = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = -1;
                }
            }if (frequency[i] != -1) {
                frequency[i] = count;
            }
        }for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (frequency[i] < frequency[j]) {
                    int tempFreq = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = tempFreq;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (frequency[i] == frequency[j] && arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }System.out.println("Array sorted by frequency: ");
        for (int i = 0; i < size; i++) {
            if (frequency[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
public class Frequencyofelementsinanarraysort {
    public static void main(String[] args) {
        FrequencySorter sorter = new FrequencySorter(6);
    }
}
