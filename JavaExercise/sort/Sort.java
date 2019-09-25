/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author enoch
 */
public class Sort {

    static StopWatch time = new StopWatch();

    public static void main(String[] args) {

        int a = 1000;
        int b = 5000;
        int c = 10000;
        int d = 50000;
        int e = 100000;
        int f = 500000;
        int g = 1000000;

        //randomized 1000 numbers 
        int[] random = new int[a];
        for (int i = 0; i < a; i++) {
            random[i] = (int) (Math.random() * 100);
        }
        //randomized 5000 numbers
        int[] random2 = new int[b];
        for (int i = 0; i < b; i++) {
            random2[i] = (int) (Math.random() * 100);
        }
        //randomizes 10000 numbers
        int[] random3 = new int[c];
        for (int i = 0; i < a; i++) {
            random3[i] = (int) (Math.random() * 100);
        }
        //randomizes 50000 numbers
        int[] random4 = new int[d];
        for (int i = 0; i < a; i++) {
            random4[i] = (int) (Math.random() * 100);
        }
        //randomized 100000 numbers
        int[] random5 = new int[e];
        for (int i = 0; i < a; i++) {
            random4[i] = (int) (Math.random() * 100);
        }
        //randomizes 500000 numbers
        int[] random6 = new int[f];
        for (int i = 0; i < a; i++) {
            random6[i] = (int) (Math.random() * 100);
        }
        //randomizes 1000000 numbers 
        int[] random7 = new int[g];
        for (int i = 0; i < a; i++) {
            random6[i] = (int) (Math.random() * 100);
        }

        //1000 time for each sort printed out 
        time.start();
        bubbleSort.bubble(random);
        time.stop();
        System.out.print("1000 Bubble sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        SelectionSort.selectionSort(random);
        time.stop();
        System.out.print("1000 Selection sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        QuickSort.quickSort(random);
        time.stop();
        System.out.print("1000 QuickSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        MergeSort.mergeSort(random);
        time.stop();
        System.out.print("1000 MergeSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        InsertionSort.insertionSort(random);
        time.stop();
        System.out.print("1000 Insertion sort time : " + " " + time.getElapsedTime() + "\n");

        //5000 time for each sort printed out 
        time.start();
        bubbleSort.bubble(random2);
        time.stop();
        System.out.print("5000 Bubble sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        SelectionSort.selectionSort(random2);
        time.stop();
        System.out.print("5000 Selection sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        QuickSort.quickSort(random2);
        time.stop();
        System.out.print("5000 QuickSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        MergeSort.mergeSort(random2);
        time.stop();
        System.out.print("5000 MergeSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        InsertionSort.insertionSort(random2);
        time.stop();
        System.out.print("5000 Insertion sort time : " + " " + time.getElapsedTime() + "\n");

        //10000 time for each sort printed out 
        time.start();
        bubbleSort.bubble(random3);
        time.stop();
        System.out.print("10000 Bubble sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        SelectionSort.selectionSort(random3);
        time.stop();
        System.out.print("10000 Selection sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        QuickSort.quickSort(random3);
        time.stop();
        System.out.print("10000 QuickSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        MergeSort.mergeSort(random3);
        time.stop();
        System.out.print("10000 MergeSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        InsertionSort.insertionSort(random3);
        time.stop();
        System.out.print("10000 Insertion sort time : " + " " + time.getElapsedTime() + "\n");

        //50000 time for each sort printed out 
        time.start();
        bubbleSort.bubble(random4);
        time.stop();
        System.out.print("50000 Bubble sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        SelectionSort.selectionSort(random4);
        time.stop();
        System.out.print("50000 Selection sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        QuickSort.quickSort(random4);
        time.stop();
        System.out.print("50000 QuickSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        MergeSort.mergeSort(random4);
        time.stop();
        System.out.print("50000 MergeSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        InsertionSort.insertionSort(random4);
        time.stop();
        System.out.print("50000 Insertion sort time : " + " " + time.getElapsedTime() + "\n");

        //100000 time for each sort printed out 
        time.start();
        bubbleSort.bubble(random5);
        time.stop();
        System.out.print("100000 Bubble sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        SelectionSort.selectionSort(random5);
        time.stop();
        System.out.print("100000 Selection sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        QuickSort.quickSort(random5);
        time.stop();
        System.out.print("100000 QuickSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        MergeSort.mergeSort(random5);
        time.stop();
        System.out.print("100000 MergeSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        InsertionSort.insertionSort(random5);
        time.stop();
        System.out.print("100000 Insertion sort time : " + " " + time.getElapsedTime() + "\n");

        //500000 time for each sort printed out 
        time.start();
        bubbleSort.bubble(random6);
        time.stop();
        System.out.print("500000 Bubble sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        SelectionSort.selectionSort(random6);
        time.stop();
        System.out.print("500000 Selection sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        QuickSort.quickSort(random6);
        time.stop();
        System.out.print("500000 QuickSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        MergeSort.mergeSort(random6);
        time.stop();
        System.out.print("500000 MergeSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        InsertionSort.insertionSort(random6);
        time.stop();
        System.out.print("500000 Insertion sort time : " + " " + time.getElapsedTime() + "\n");

        //1000000 time for each sort printed out 
        time.start();
        bubbleSort.bubble(random7);
        time.stop();
        System.out.print("1000000 Bubble sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        SelectionSort.selectionSort(random7);
        time.stop();
        System.out.print("1000000 Selection sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        QuickSort.quickSort(random7);
        time.stop();
        System.out.print("1000000 QuickSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        MergeSort.mergeSort(random7);
        time.stop();
        System.out.print("1000000 MergeSort sort time : " + " " + time.getElapsedTime() + "\n");

        time.start();
        InsertionSort.insertionSort(random7);
        time.stop();
        System.out.print("1000000 Insertion sort time : " + " " + time.getElapsedTime() + "\n");

    }
}
