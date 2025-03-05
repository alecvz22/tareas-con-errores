/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act12estructura;

import java.util.Arrays;

/**
 *
 * @author alessiacavazos
 */
public class Act12estructura {
       
    public static void main(String[] args) {
        int[] smallArray = generateRandomArray(10);
        int[] mediumArray = generateRandomArray(100);
        int[] largeArray = generateRandomArray(1000);

        testAlgorithm("Bubble Sort", smallArray.clone());
        testAlgorithm("Bubble Sort", mediumArray.clone());
        testAlgorithm("Bubble Sort", largeArray.clone());

        testAlgorithm("Selection Sort", smallArray.clone());
        testAlgorithm("Selection Sort", mediumArray.clone());
        testAlgorithm("Selection Sort", largeArray.clone());

        testAlgorithm("Insertion Sort", smallArray.clone());
        testAlgorithm("Insertion Sort", mediumArray.clone());
        testAlgorithm("Insertion Sort", largeArray.clone());

        testAlgorithm("Shell Sort", smallArray.clone());
        testAlgorithm("Shell Sort", mediumArray.clone());
        testAlgorithm("Shell Sort", largeArray.clone());
    }



    public static void testAlgorithm(String algorithmName, int[] arr) {
        long startTime = System.nanoTime();
        switch (algorithmName) {
            case "Bubble Sort":
                bubbleSort(arr);
                break;
            case "Selection Sort":
                selectionSort(arr);
                break;
            case "Insertion Sort":
                insertionSort(arr);
                break;
            case "Shell Sort":
                shellSort(arr);
                break;
            default:
                break;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Convertir nanosegundos a milisegundos
        System.out.println(algorithmName + " - Array size: " + arr.length + " - Duration: " + duration + " ms");
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000); // Números aleatorios entre 0 y 999
        }
        return arr;
    }

    // Implementación de algoritmos de ordenamiento
    public static void bubbleSort(int[] arr) {
          int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble Sorted array: " + Arrays.toString(arr));
    }

    

    public static void selectionSort(int[] arr) {
         int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection Sorted array: " + Arrays.toString(arr));
    
    }

    public static void insertionSort(int[] arr) {
         int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sorted array: " + Arrays.toString(arr));
    }
    

    public static void shellSort(int[] arr) {
            int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        System.out.println("Shell Sorted array: " + Arrays.toString(arr));
    }
}


