package Level1_08_02_26.Javaeight;

@FunctionalInterface
interface Square {
    int square(int x);

    default void print(int result) {
        System.out.println("Square result = " + result);
    }
}