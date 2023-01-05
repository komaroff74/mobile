public class Main {
    public static void main(String[] args) {
        int amount = 1000;
        int bonus = amount / 100 * 1;

        if (amount > 1100) ;
        {
            bonus = 11;
        }
        if (amount > 1200) ;
        {
            bonus = 12;
        }
        {
            System.out.println(bonus);
        }
        {System.out.println("При пополнении счета более 1000 рублей, бонус 1 рубль за каждые 100 рублей");}
    }
}