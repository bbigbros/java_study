import java.io.IOException;

/**
 * Created by stripes on 2016. 12. 26..
 */
abstract class Hello {
    String name;
    abstract public void hello();

    public Hello() {
        this.name = "wow";
    }
    public void print() {
        System.out.println("11:11");
    }
    public String getName(){
        return this.name;
    }
}

class A extends Hello {
    @Override
    public void hello() {
        System.out.println("override hello()");
    }
}
public class Bbigbros {
    public static void main(String[] args) {
        A h = new A();
        h.print();
        h.hello();
        System.out.println(h.getName());
    }
}
