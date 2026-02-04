package socialmedia;

public class SocialMedia {
    private String platformName;

    public SocialMedia(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public void displayPlatform() {
        System.out.println("Platform: " + platformName);
    }
}
