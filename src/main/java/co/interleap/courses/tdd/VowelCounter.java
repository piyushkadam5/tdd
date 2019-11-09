package co.interleap.courses.tdd;

public class VowelCounter {
    public int count(String input){
        int count = 0;
        if(input.length() == 0){
            return count;
        }
        else{
            char []vowels = {'a','e','i','o','u','A','E','I','O','U'};
            for(int index=0;index < input.length();index++){
                char input_char = input.charAt(index);
                for(char vowel:vowels){
                    if(input_char == vowel){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
