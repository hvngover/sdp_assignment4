import java.util.Scanner;
import java.util.List;

public class MusicStreamingApp {
    public static void main(String[] args) {
        MusicService musicService = new MusicService();
        UserFactory userFactory = new UserFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of user (Free or Premium): ");
        String userType = scanner.nextLine();
        MusicObserver user = userFactory.createUser(userType);
        musicService.registerUser(user);

        List<String> allReleasedSongs = musicService.getReleasedSongs();
        if (!allReleasedSongs.isEmpty()) {
            System.out.println("Existing Released Songs:");
            for (String song : allReleasedSongs) {
                System.out.println(song);
            }
        } else {
            System.out.println("No songs released yet.");
        }

        boolean addMoreSongs = true;

        while (addMoreSongs) {
            System.out.print("Enter the name of the new song (or type 'exit' to finish): ");
            String newSong = scanner.nextLine();

            if (newSong.equalsIgnoreCase("exit")) {
                addMoreSongs = false;
            } else {
                musicService.releaseNewSong(newSong);
            }
        }

        allReleasedSongs = musicService.getReleasedSongs();
        System.out.println("All Released Songs:");
        for (String song : allReleasedSongs) {
            System.out.println(song);
        }
    }
}
