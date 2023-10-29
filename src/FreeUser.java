public class FreeUser implements MusicObserver {
    @Override
    public void update(String song) {
        System.out.println("Free User: New Song Available - " + song);
    }
}