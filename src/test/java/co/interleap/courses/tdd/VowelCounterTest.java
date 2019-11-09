package co.interleap.courses.tdd;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VowelCounterTest {

    @Test
    public void shouldCountToZeroWithAnEmptyString(){
        assertEquals(0, new VowelCounter().count(""));
    }

    @Test
    public void shouldCountToOneWithAStringContainingOneVowel(){
        assertEquals(1, new VowelCounter().count("e"));
    }

    @Test
    public void shouldCountVowelsWithStringContainingMultipleVowels(){
        assertEquals(10, new VowelCounter().count("aaeeiioouu"));
    }

    @Test
    public void shouldCountVowelsWithStringContainingUpperAndLowerCaseLetters(){
        assertEquals(7, new VowelCounter().count("Hello My NAME is Piyush"));
    }
}