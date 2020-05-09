import model.Pair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SentenceTest {

    private Sentence sentence;

    @Before
    public void setup() {
        sentence = new Sentence();
    }

    @Test
    public void testGetLongestWord() {
        String testSentence = "this is the longest word";

        Pair pair = sentence.getLongestWord(testSentence);

        Assert.assertEquals(7, pair.getValue());
        Assert.assertEquals("longest", pair.getName());
    }

    @Test
    public void testLongestApostrophe() {
        String testSentence = "now it's";

        Pair pair = sentence.getLongestWord(testSentence);

        Assert.assertEquals(4, pair.getValue());
        Assert.assertEquals("it's", pair.getName());
    }

    @Test
    public void testLongestSpecialCharacters() {
        String testSentence = "this?is not!!the longest&^word";

        Pair pair = sentence.getLongestWord(testSentence);

        Assert.assertEquals(7, pair.getValue());
        Assert.assertEquals("longest", pair.getName());
    }

    @Test
    public void testLongestWordNoInput() {
        Pair pair = sentence.getLongestWord("");

        Assert.assertEquals(0, pair.getValue());
        Assert.assertEquals("", pair.getName());
    }

    @Test
    public void testLongestNumber() {
        String testSentence = "123 45";

        Pair pair = sentence.getLongestWord(testSentence);

        Assert.assertEquals(3, pair.getValue());
        Assert.assertEquals("123", pair.getName());
    }

    @Test
    public void testGetShortestWord() {
        String testSentence = "this is the shortest word";

        Pair pair = sentence.getShortestWord(testSentence);

        Assert.assertEquals(2, pair.getValue());
        Assert.assertEquals("is", pair.getName());
    }

    @Test
    public void testShortestApostrophe() {
        String testSentence = "now it's";

        Pair pair = sentence.getShortestWord(testSentence);

        Assert.assertEquals(3, pair.getValue());
        Assert.assertEquals("now", pair.getName());
    }

    @Test
    public void testShortestSpecialCharacters() {
        String testSentence = "this?is not!!the shortest&^word";

        Pair pair = sentence.getShortestWord(testSentence);

        Assert.assertEquals(2, pair.getValue());
        Assert.assertEquals("is", pair.getName());
    }

    @Test
    public void testShortestWordNoInput() {
        Pair pair = sentence.getShortestWord("");

        Assert.assertEquals(0, pair.getValue());
        Assert.assertEquals("", pair.getName());
    }

    @Test
    public void testShortestNumber() {
        String testSentence = "123 45";

        Pair pair = sentence.getShortestWord(testSentence);

        Assert.assertEquals(2, pair.getValue());
        Assert.assertEquals("45", pair.getName());
    }
}
