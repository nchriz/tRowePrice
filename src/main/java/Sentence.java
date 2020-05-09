import model.Pair;

public class Sentence {

    public Pair getLongestWord(String sentence) {
        if (sentence.length() == 0)
            return new Pair("", 0);
        String[] words = sentence.split("[^\\w'-]+");
        String longest = words[0];
        for (String word : words)
            if (word.length() >= longest.length())
                longest = word;

        return new Pair(longest, longest.length());
    }

    public Pair getShortestWord(String sentence) {
        if (sentence.length() == 0)
            return new Pair("", 0);
        String[] words = sentence.split("[^\\w'-]+");
        String shortest = words[0];
        for (String word : words)
            if (word.length() <= shortest.length())
                shortest = word;

        return new Pair(shortest, shortest.length());
    }
}
