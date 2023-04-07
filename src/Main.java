public class Main {
    public static void main(String[] args) {
        BonusMilesServise servise = new BonusMilesServise();
        int price = 10_000;
        int miles = servise.calculate(price);
        System.out.println(miles);

    }
}
