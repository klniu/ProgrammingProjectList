import static org.junit.Assert.assertEquals;

/**
 * Created by klniu on 16-9-24.
 * Pig Latin – Pig Latin is a game of alterations played on the English language game. To create the Pig Latin form of an English word the initial consonant sound is transposed to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay). Read Wikipedia for more information on rules.
 */
public class PigLatinTest {
    @org.junit.Test
    public void makePigLatin() throws Exception {
        assertEquals(PigLatin.makePigLatin(""), "");
        assertEquals(PigLatin.makePigLatin(" "), "");
        assertEquals(PigLatin.makePigLatin("pig"), "igpay");
        assertEquals(PigLatin.makePigLatin("banana"), "ananabay");
        assertEquals(PigLatin.makePigLatin("trash"), "ashtray");
        assertEquals(PigLatin.makePigLatin("happy"), "appyhay");
        assertEquals(PigLatin.makePigLatin("duck"), "uckday");
        assertEquals(PigLatin.makePigLatin("glove"), "oveglay");
        assertEquals(PigLatin.makePigLatin("eat"), "eatyay");
        assertEquals(PigLatin.makePigLatin("omelet"), "omeletyay");
        assertEquals(PigLatin.makePigLatin("are"), "areyay");
    }
}