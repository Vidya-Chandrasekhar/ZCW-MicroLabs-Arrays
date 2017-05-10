package io.zipcoder.microlabs.arrays;


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



    public String lastButOne(String[] inputArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*** Output ***\n");
        stringBuilder.append(inputArray[inputArray.length - 2]);

        return stringBuilder.toString();
    }

}

//TODO Define the method lastButOne

//TODO Define the method reverse

//TODO Define the method isPalindrome

//TODO Define the method compress

//TODO Define the method pack

    


