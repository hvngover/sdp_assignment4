public class PremiumUser implements MusicObserver {
    @Override
    public void update(String song) {
        System.out.println("Premium User: Enjoy the New Song - " + song);
    }
}