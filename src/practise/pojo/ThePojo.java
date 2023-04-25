package practise.pojo;

public class ThePojo {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            PojoRecord s = new PojoRecord("S92300" + i,
                    switch (i) {
                        case 1 -> "홍길동";
                        case 2 -> "김길동";
                        case 3 -> "박길동";
                        case 4 -> "이길동";
                        case 5 -> "최길동";
                        default -> "이름 없음";
                    },
                    "05/11/1999",
                    "Java class");
            System.out.println(s);
        }

        PojoRecord s = new PojoRecord("S923001", "홍길동", "05/11/1999", "Java class");
        PojoStudent student = new PojoStudent("S923001", "홍길동", "05/11/1999", "Java class");

        System.out.println();
        System.out.println(s);
        System.out.println(student);

        System.out.println(s.name());
        System.out.println(student.getName());
    }
}

