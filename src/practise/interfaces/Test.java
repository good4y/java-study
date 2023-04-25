package practise.interfaces;

public class Test {
    interface Top {
        default String name() {
            return "unnamed";
        }
    }

    interface Left extends Top {
        default String name() {
            return getClass().getName();
        }
    }

    interface Right extends Top {
    }

    interface Bottom extends Left, Right {
        default String name() {
            return Left.super.name();
        }
    }

    public static void main(String[] args) {
        Bottom bottom = new Bottom() {
        };
        System.out.println(bottom.name());
    }
}
