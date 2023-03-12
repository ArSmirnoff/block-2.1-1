public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1500;
        int bonus = 20; //количество рублей для одной мили
        int miles = ticketPrice / bonus; // колличество миль

        System.out.println("Вам доступны мили в количестве:" + miles);
    }
}