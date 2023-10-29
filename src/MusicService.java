import java.util.ArrayList;
import java.util.List;

public class MusicService implements MusicSubject {
    private List<MusicObserver> users = new ArrayList<>();
    private List<String> releasedSongs = new ArrayList<>();

    public void releaseNewSong(String song) {
        System.out.println("New Song Released: " + song);
        releasedSongs.add(song);
        notifyUsers(song);
    }

    @Override
    public void registerUser(MusicObserver user) {
        users.add(user);
    }

    @Override
    public void notifyUsers(String song) {
        for (MusicObserver user : users) {
            user.update(song);
        }
    }

    public List<String> getReleasedSongs() {
        return releasedSongs;
    }
}
