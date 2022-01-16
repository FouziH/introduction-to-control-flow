import java.util.Arrays;

public class EmptyArray {
    String[] topics = { "Opinion", "Tech", "Science", "Health" };
    int[] views = { 0, 0, 0, 0 };
    String[] favoriteArticles;

    public EmptyArray() {

        // initialize favoriteArticles here:
        favoriteArticles = new String[10];

    }

    public void setFavoriteArticles(int favoriteIndex, String newArticle) {
    // Add newArticle to favoriteArticles:
    favoriteArticles[favoriteIndex] = newArticle;
    }

    public  static void main (String[] args) {
        EmptyArray sampleFeed = new EmptyArray();

        sampleFeed.setFavoriteArticles(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticles(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticles(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    
    }

}
