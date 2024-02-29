import java.util.ArrayList;
import java.util.Objects;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> listeners = new ArrayList<>();

    public Song(String title, String artist)
    {
        this.title = title;
        this.artist = artist;
    }
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public int howMany(ArrayList<String> names)
    {
        int newListeners = 0;

        for (String listener : names) {
            String lowercaseListener = listener.toLowerCase();

            if (!this.listeners.contains(listener.toLowerCase())) {
                listeners.add(lowercaseListener);
                newListeners++;
            }
        }

        return newListeners;
    }
}
