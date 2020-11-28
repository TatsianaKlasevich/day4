package com.klasevich.array.service;

import com.klasevich.array.entity.ArrayWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SearchService {
    private static final Logger logger = LogManager.getLogger();

    public int searchMaxElement(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        logger.info("max - {}", max);
        return max;
    }

    public int searchMinElement(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        logger.info("min - {}", min);
        return min;
    }

    public ArrayWrapper searchPrimeDigit(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        ArrayWrapper arrayWrapperResult = new ArrayWrapper();


        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                arrayWrapperResult.add(array[i]);
            }
        }
        logger.info("Prime numbers are {}", Arrays.toString(arrayWrapperResult.getArray()));
        return arrayWrapperResult;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public ArrayWrapper searchFibonacci(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        ArrayWrapper arrayWrapperResult = new ArrayWrapper();

        for (int i = 0; i < array.length; i++) {
            if (isFibonacci(array[i])) {
                arrayWrapperResult.add(array[i]);
            }
        }

        logger.info("Fibonacci numbers are {}", Arrays.toString(arrayWrapperResult.getArray()));
        return arrayWrapperResult;
    }

    private boolean isFibonacci(int number) {
        int first = 0;
        int second = 1;
        boolean result;

        while (number > second) {
            int temp = second;
            second = first + second;
            first = temp;
        }
        result = number == second;
        logger.info("Number {} is Fibonacci? - {}", number, result);
        return result;
    }


    public ArrayWrapper searchThreeUnique(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        ArrayWrapper arrayWrapperResult = new ArrayWrapper();

        for (int i = 0; i < array.length; i++) {
            if (hasThreeUnique(array[i])) {
                arrayWrapperResult.add(array[i]);
            }
        }
        logger.info("Numbers with three unique digits are {}", Arrays.toString(arrayWrapperResult.getArray()));
        return arrayWrapperResult;
    }

    private boolean hasThreeUnique(int number) {
        int first = number % 10;
        int second = (int) Math.floor(((number - first) % 100) / 10);
        int third = (int) Math.floor(number / 100);

        if (first == second || second == third || first == third) {
            return false;
        }
        return true;
    }

    public int binarySearch(ArrayWrapper arrayWrapper, int key) {
        SortArrayService sortArray = new SortArrayService();
        sortArray.BubbleSort(arrayWrapper);
        int[] array = arrayWrapper.getArray();
        int first = 0;
        int last = array.length - 1;
        int index = Integer.MAX_VALUE;

        while (first <= last) {
            int middle = (first + last) / 2;
            if (array[middle] < key) {
                first = middle + 1;
            } else if (array[middle] > key) {
                last = middle - 1;
            } else if (array[middle] == key) {
                index = middle;
                break;
            }
        }
        logger.info("index of {} is {}", key, index);
        return index;
    }
}

