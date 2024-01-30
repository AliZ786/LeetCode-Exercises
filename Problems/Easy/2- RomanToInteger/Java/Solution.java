package Problems.Easy.2- RomanToInteger.Java;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int value = romanMap.get(s.charAt(s.length()-1));
        for (int i = s.length() -2; i>=0; i--){
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))){
                value -= romanMap.get(s.charAt(i));
            }else{
            value += romanMap.get(s.charAt(i));
        }
        }
        return value;
        
    }
}

/*
 * Runtime: 6ms
 */