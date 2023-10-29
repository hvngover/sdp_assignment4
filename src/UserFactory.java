public class UserFactory {
    public MusicObserver createUser(String userType) {
        if (userType.equalsIgnoreCase("Free")) {
            return new FreeUser();
        } else if (userType.equalsIgnoreCase("Premium")) {
            return new PremiumUser();
        }
        // Add more user types as needed

        return null;
    }
}
