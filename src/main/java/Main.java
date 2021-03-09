public class Main {
    public static void main(String[] args) {
        final Shop shop = new Shop();
        new Thread(null, shop::sellAuto, "Покупатель Григорий").start();
        new Thread(null, shop::sellAuto, "Покупатель Артемий").start();
        new Thread(null, shop::sellAuto, "Покупатель Станислав").start();

        new Thread(null, shop::acceptAuto, "Производитель Toyota").start();
        new Thread(null, shop::acceptAuto, "Производитель Honda").start();
        new Thread(null, shop::acceptAuto, "Производитель Mitsubishi").start();
    }
}
