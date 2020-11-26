package com.klasevich.array.creator;

import com.klasevich.array.entity.ArrayWrapper;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FillArray {
    private static final Logger logger = LogManager.getLogger();

    public ArrayWrapper fillFromConsole(ArrayWrapper arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter numbers>>");

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Type a number, not a text");
        } finally {
            assert scanner != null;
            scanner.close();
        }
        arrayWrapper.setArray(array);
        logger.info("filling array from console - {} ", array);
        return arrayWrapper;
    }

    public ArrayWrapper fillFromFile(ArrayWrapper arrayWrapper, String fileName) {

        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                arrayWrapper.add(number);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
            e.getStackTrace();
        }
        logger.info("filling array from file - {} ", arrayWrapper);
        return arrayWrapper;
    }

    public ArrayWrapper generateArray(ArrayWrapper arrayWrapper) {
        int arraySize = (int) (Math.random() * 10);
        logger.info("arraySize {}", arraySize);

        for (int i = 0; i < arraySize; i++) {
            int number = (int) (Math.random() * 200);
            arrayWrapper.add(number);
        }
        logger.info("generated array is - {} ", arrayWrapper);
        return arrayWrapper;
    }
}

