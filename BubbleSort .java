class BubbleSort {
public static void sort(int[] arr) {
int n = arr.length;
boolean swapped;
do {
swapped = false;
for (int i = 1; i < n; i++) {
 if (arr[i - 1] > arr[i]) {
// Swap arr[i-1] and arr[i]
int temp = arr[i - 1];
arr[i - 1] = arr[i];
arr[i] = temp;
swapped = true;
}}
n--;
} while (swapped);
}
}
