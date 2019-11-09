package co.interleap.courses.tdd;

public class VowelCounter {
    public int count(String input){
        int count = 0;
        for(int index = 0 ;index < input.length(); index++ ){
            String current = input.substring(index,index+1);
            if(this.isVowel(current)){
                count++;
            }
        }
        return count;
    }

    public boolean isVowel(String current){
        return "aeiouAEIOU".contains(current);
    }
}
