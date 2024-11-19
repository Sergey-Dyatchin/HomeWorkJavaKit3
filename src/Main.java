public class Main {
    public static void main(String[] args) {
        demoPair();
        demoCompareArrays();
        demoCalc();
    }

    public static void demoCalc(){
        System.out.println("Демонстрация калькулятора");
        System.out.println(Calculator.sum(5, 5.6f));
        System.out.println(Calculator.subtract(5.15, 4.66f));
        System.out.println(Calculator.multiply(10, 10));
        System.out.println(Calculator.divide(10, 2));
        System.out.println(Calculator.divide(5, 0));
    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length){
            return false;
        }
        for (int i = 0; i <array1.length ; i++) {
            if (!array1[i].getClass().equals(array2[i].getClass())) {
                return false;
            }
        }
        return true;
    }

    public static void demoCompareArrays() {
        System.out.println("Демонстрация сравнения массивов");
        String [] array1 = {"Hello", "world", "!"};
        String [] array2 = {"Hello", "world", "!"};
        String [] array3 = {"hello", "world", "!"};
        String [] array4 = {"Hello", "world", "!", " "};
        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));
        System.out.println(compareArrays(array1, array4));
    }

    public static void demoPair() {
        System.out.println("Демонстрация Pair");
        Pair pair = new Pair("Текст", 6);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }

}

