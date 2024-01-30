package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import java.util.*;

public class Sorting {
        public static int smallest(int[] array){
            int smallestNum = array[0];
            for (int i = 0; i < array.length; i++){
                if(array[i] < smallestNum){
                    smallestNum = array[i];
                }
            }
            return smallestNum;

        }
        public static int indexOfSmallest(int[] array){
            int index = array[0];
            for (int i = 0; i < array.length; i++){
                if(array[i] < index){
                    index = i;
                }
            }
            return index;
        }
        public static int indexOfSmallestFrom(int[] table, int startIndex) {
            int index = startIndex;
            for (int i = startIndex; i < table.length; i++){
                if(table[i] < table[startIndex]){
                    index = i;
                }
            }
            return index;
        }
        public static void swap(int[] array, int index1, int index2) {
            int num1 = index1;
            array[index1] = array[index2];
            array[index2] = array[num1];
        }

        // Tests
        @Test
        public void testSmallest(){
            int[] numbers = {6, 5, 8, 7, 11};
            assertEquals(5, Sorting.smallest(numbers));
        }
        @Test
        public void testIndex(){
            // indices:      0  1  2  3  4
            int[] numbers = {6, 5, 8, 7, 11};
            assertEquals(1, Sorting.indexOfSmallest(numbers));
        }
        @Test
        public void testIndexOfSmallestFrom(){
            // indices:       0  1  2  3   4
            int[] numbers = {-1, 6, 9, 8, 12};
            assertEquals(0, Sorting.indexOfSmallestFrom(numbers, 0));
            assertEquals(1, Sorting.indexOfSmallestFrom(numbers, 1));
            assertEquals(3, Sorting.indexOfSmallestFrom(numbers, 2));
        }
        @Test
        public void testSwap(){
            int[] numbers = {3, 2, 5, 4, 8};

            System.out.println(Arrays.toString(numbers));

            Sorting.swap(numbers, 1, 0);
            System.out.println(Arrays.toString(numbers));

            Sorting.swap(numbers, 0, 3);
            System.out.println(Arrays.toString(numbers));
        }
}
