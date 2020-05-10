import model.Pair;

import java.util.function.BiFunction;

public class Sentence {

    private Pair getWord(String sentence, BiFunction<Integer, Integer, Boolean> predicate) {
        if (sentence.length() == 0)
            return new Pair("", 0);
        String[] words = sentence.split("[^\\w'-]+");
        String saved = words[0];
        for (String word : words)
            if (predicate.apply(word.length(), saved.length()))
                saved = word;

        return new Pair(saved, saved.length());
    }

    public Pair getShortestWord(String sentence) {
        return getWord(sentence, (M, N) -> M <= N);
    }

    public Pair getLongestWord(String sentence) {
        return getWord(sentence, (M, N) -> M >= N);
    }

}
