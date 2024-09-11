import java.util.HashMap;
// o
public class Dictionary {
    private HashMap<String,String> translations;

    public Dictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        if (word == null || word.isEmpty()) {
            return null;
        } else {
        return this.translations.get(word);
        }
    }
    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
    }
}
