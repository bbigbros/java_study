/**
 * Created by stripes on 2017. 1. 12..
 */

class Ex {
    String a;

    // 생성자
    public Ex() {
        this.a = "A";
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getA() {
        return this.a;
    }

    // throws는 상위 메소드로 예외처리를 전달하는 것이므로 호출 한 곳에서 try/catch를 써야 한다
    public void request() throws Exception {
        if(1 < 10)
            throw new Exception("강제 오류 발생");
    }
}

public class ExceptStudy {
    public static void main(String[] args) {

        Ex ex = new Ex();
        System.out.println(ex.getA());

        // 1) 이 상태에서는 오류
        // e.request();

        // 2) try - catch 사용 후 에러 사라짐
        try {
            ex.request();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
