package socialmedia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SocialMedia {

    private List<Post> posts = new ArrayList<>();

    // add to data pool
    public void addPost(Post post) {
        posts.add(post);
    }

    // filtering
    public List<Post> filterByUser(User user) {
        return posts.stream()
                .filter(p -> p.getAuthor().equals(user))
                .collect(Collectors.toList());
    }

    // searching
    public List<Post> searchByKeyword(String keyword) {
        return posts.stream()
                .filter(p -> p.getContent().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    // sorting
    public List<Post> sortByContent() {
        return posts.stream()
                .sorted(Comparator.comparing(Post::getContent))
                .collect(Collectors.toList());
    }
}

