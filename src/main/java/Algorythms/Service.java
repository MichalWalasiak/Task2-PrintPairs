package Algorythms;

import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);

    public Integer[] parse(String[] input){
        int i = 0;
        Integer[] numbers = new Integer[input.length];
            try {
                for (String str : input) {
                    numbers[i++] = Integer.parseInt(str);
                }
            }catch (NumberFormatException e){
                throw new NumberFormatException("wrong format or empty input");
            }
        return numbers;
    }

    public String[] getNumbers() {
        return scanner.nextLine().split(",");
    }
}
