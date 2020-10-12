public class BoxingExample {
    public static void main(String[] args) {
        Integer i = 10;

        IntExample intExample = new IntExample();
        BoxingEnum value = BoxingEnum.values()[intExample.getInt()];
    }
}
