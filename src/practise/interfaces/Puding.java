package practise.interfaces;

interface Puding {

    // 암시적으로 public
    default void run() {
        System.out.println("Puding");
    }
    default void bark(){
        System.out.println("pudding bark");
    }
}
