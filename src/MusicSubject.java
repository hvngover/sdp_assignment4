import java.util.List;

public interface MusicSubject {
    void registerUser(MusicObserver user);
    void notifyUsers(String song);
}
