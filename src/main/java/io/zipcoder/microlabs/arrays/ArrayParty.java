package io.zipcoder.microlabs.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayParty {


    public String printArray(String[] inputArray) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*** Output ***");
        for (String food : inputArray) {
            stringBuilder.append("\n" + food);

        }
        return stringBuilder.toString();

    }


    public String lastElement(String[] inputArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*** Output ***\n");
        stringBuilder.append(inputArray[inputArray.length - 1]);

        return stringBuilder.toString();
    }

    //TODO Define the method lastButOne

    public String lastButOne(String[] inputArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*** Output ***\n");
        stringBuilder.append(inputArray[inputArray.length - 2]);

        return stringBuilder.toString();
    }


    //TODO Define the method reverse

    public String reverse(String[] inputArray) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*** Output ***\n");
        int i;
        for (i = 0; i < inputArray.length; i++) {
            String temp = inputArray[inputArray.length - 1 - i];
            stringBuilder.append(inputArray[inputArray.length - 1 - i] + "\n");
        }
        return stringBuilder.toString();
    }


    //TODO Define the method isPalindrome

    public boolean isPalindrome(String[] inputArray) {


        for (int i = 0; i < inputArray.length / 2; i++) {
            if (!inputArray[i].equals(inputArray[inputArray.length - (i + 1)])) {
                return false;
            }
        }

        return true;
    }


    //TODO Define the method compress

    public String compress(int[] inputArray) {

        List<Integer> returnList = new ArrayList<Integer>();
        int prevElement = inputArray[0];
        returnList.add(inputArray[0]);
        for (int currentElement : inputArray) {
            if (currentElement != prevElement) {
                returnList.add(currentElement);
                prevElement = currentElement;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int element : returnList) {
            sb.append(element + "\n");
        }
        return sb.toString();

    }




    //TODO Define the method pack


    public String pack(char[] inputArray) {
        char prevElement = inputArray[0];
        StringBuilder sb = new StringBuilder();
        for (char currentElement : inputArray) {
            if (currentElement == prevElement) {
                sb.append(currentElement);
            } else {
                sb.append(", ");
                sb.append(currentElement);
                prevElement = currentElement;
            }
        }
        return sb.toString();

    }
}

