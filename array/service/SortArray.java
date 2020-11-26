package com.klasevich.array.service;

import com.klasevich.array.entity.ArrayWrapper;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class SortArray {
    private static final Logger logger = (Logger) LogManager.getLogger();

    public ArrayWrapper BubbleSort(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();

        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        logger.log(Level.INFO, Arrays.toString(array));
        arrayWrapper.setArray(array);
        return arrayWrapper;
    }

    public ArrayWrapper ChoiceSort(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();

        for (int left = 0; left < array.length; left++) {
            int maxElement = left;
            for (int i = left + 1; i < array.length; i++) {
                if (array[i] > array[maxElement]) {
                    maxElement = i;
                }
            }
            int temp = array[left];
            array[left] = array[maxElement];
            array[maxElement] = temp;
        }
        logger.log(Level.INFO, Arrays.toString(array));
        arrayWrapper.setArray(array);
        return arrayWrapper;
    }

    public ArrayWrapper ShellSort(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int gap = array.length / 2;

        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        int temp = array[c];
                        array[c] = array[c + gap];
                        array[c + gap] = temp;
                    }
                }
            }
            gap = gap / 2;
        }
        logger.log(Level.INFO, Arrays.toString(array));
        arrayWrapper.setArray(array);
        return arrayWrapper;
    }
}
