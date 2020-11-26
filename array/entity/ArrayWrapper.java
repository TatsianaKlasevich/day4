package com.klasevich.array.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayWrapper {
    private static final Logger logger = LogManager.getLogger();
    private int[] array;

    public ArrayWrapper() {
        this.array = new int[0];
    }

    public ArrayWrapper(int[] array) {
        this.array = array;
    }

    public ArrayWrapper(int size) {
        this.array = new int[size];
    }

    public int size() {
        return array.length;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    public void add(int element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        logger.info("Adding element {}", element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayWrapper that = (ArrayWrapper) o;

        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayWrapper{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}
