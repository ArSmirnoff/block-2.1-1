public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1500;
        int x = 20; //количество рублей для одной мили
        int y = ticketPrice / x; // колличество миль

        System.out.println("Вам доступны мили в количестве:" + y);
    }
}