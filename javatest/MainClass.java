package javatest;

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        MainClass obj=new MainClass();
        System.out.println(obj.reverseString("String"));
   

    }
    public String reverseString(String input){

        char reverseArray[]=new char[input.length()];
       char []inputArray=input.toCharArray();
       for(int i=0;i<inputArray.length;i++){
           reverseArray[i]=inputArray[inputArray.length-i-1];
       }
       return String.valueOf(reverseArray);
    }
    public boolean isPalindrome(String input){
        String reverseString=reverseString(input);
        return input.equals(reverseString);
    }
    public boolean checkOnlyDigits(String input){
        for(int i=0;i<input.length();i++){
            if(!Character.isDigit(input.charAt(i)))
                return false;
        }
        return true;
    }
   public void countDuplicateCharacter(String input){
       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       for (int i = 0; i < input.length(); i++) {
           char c = input.charAt(i);
           if (map.containsKey(c)) {
               int cnt = map.get(c);
               map.put(c, ++cnt);
           } else {
               map.put(c, 1);
           }
       }
       System.out.println(map);
   }
}
