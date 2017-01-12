/**
 * Created by stripes on 2016. 12. 25..
 */
public class Test {
    public void sayNick(String nick) throws FoolException {
        try {
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch (FoolException e) {
            System.out.println("FoolException 오류가 발생했습니다.");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.sayNick("fool");
            test.sayNick("genious");

        }catch (FoolException e) {
            System.out.println("FoolException 오류가 발생");
        }
    }
}
