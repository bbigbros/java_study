import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by stripes on 2016. 12. 24..
 */

public class StringCalculator {
    int add(String text){
        // null 과 빈 문자열일 경우 처리를 위한 구문
        if (isBlank(text)) {
            return 0;
        }

//        String[] values = text.split(",");


        return sum(toInts(split(text)));
    }

    // null 또는 빈 문자열인지 하기 위한 함수
    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    // "문자열 -> 숫자배열" 를 위한 함수
    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];

        for(int i = 0; i < values.length; i++) {
            numbers[i] = toPositive(values[i]);
        }
        return numbers;
    }

    // 합을 구하는 함수
    private int sum(int[] values) {
        int sum = 0;

        for(int number : values) {
            sum += number;
        }
        return sum;
    }

    // 여러가지 구분자를 구분하기 위한 함수
    private String[] split(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            System.out.println("In m.find()");
            String customDelimiter = m.group(1);

            return m.group(2).split(customDelimiter);
        }
        return text.split(",|:");
    }

    // 음수 구분을 위한 함수
    private int toPositive(String value) {
        int number = Integer.parseInt(value);

        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }
}
