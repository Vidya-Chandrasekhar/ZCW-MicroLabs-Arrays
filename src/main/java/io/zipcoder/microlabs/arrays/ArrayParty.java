package io.zipcoder.microlabs.arrays;


import java.util.ArrayList;
import java.util.Collections;
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
            stringBuilder.append(inputArray[inputArray.length - 1 - i]+"\n" );
        }
        return stringBuilder.toString();
    }


//TODO Define the method isPalindrome



//TODO Define the method compress

//TODO Define the method pack


}

