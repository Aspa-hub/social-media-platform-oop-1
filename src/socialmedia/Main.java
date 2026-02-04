package socialmedia;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Alice", "alice@mail.com");
        User user2 = new User(2, "Bob", "bob@mail.com");

        Post p1 = new Post(1, "Hello world", user1);
        Post p2 = new Post(2, "Java is cool", user1);
        Post p3 = new Post(3, "OOP principles", user2);

        SocialMedia sm = new SocialMedia();
        sm.addPost(p1);
        sm.addPost(p2);
        sm.addPost(p3);

        System.out.println("Filtered by user:");
        sm.filterByUser(user1).forEach(System.out::println);

        System.out.println("\nSearch keyword 'Java':");
        sm.searchByKeyword("Java").forEach(System.out::println);

        System.out.println("\nSorted posts:");
        sm.sortByContent().forEach(System.out::println);
    }
}


