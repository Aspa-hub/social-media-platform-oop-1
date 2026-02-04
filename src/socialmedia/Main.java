package socialmedia;

public class Main {
    public static void main(String[] args) {

        SocialMedia platform = new SocialMedia("MySocial");

        User user1 = new User(1, "alice", "alice@mail.com");
        User user2 = new User(2, "bob", "bob@mail.com");

        Post post1 = new Post(1, "Hello world!", user1);
        Post post2 = new Post(2, "My first post", user1);

        platform.displayPlatform();

        user1.displayInfo();
        user2.displayInfo();

        post1.displayPost();
        post2.displayPost();

        if (user1.getId() == user2.getId()) {
            System.out.println("Users are the same");
        } else {
            System.out.println("Users are different");
        }
    }
}


