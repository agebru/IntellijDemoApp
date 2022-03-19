package com.app.demoapp;

import com.app.demoapp.exception.NotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

public class CheckPalindrom {

    @Autowired
    private Doctor doctor;

    @PostConstruct
    public void initDoctor(){
        System.out.println("Doctor post construction ...");
    }

    public static void main(String[] args) throws NotFoundExeption {

      Map<Integer,Integer> StringAndNumMap= checkDigitExists("Emanul323");
        System.out.println(StringAndNumMap);


        String fullName="Amanuel Gebru";
        String s = fullName.replaceAll("u", "Au");

        String name="Alexander";
        String contains=name.contains("x") ? "Yes":"NO";
        System.out.println("Contains: "+contains);
        System.out.println(s);

        String[] nameSplit = fullName.split(",");
         if(nameSplit.length==0) throw new NotFoundExeption("There is no message split. Ok!");
            for(String ss:nameSplit){
                System.out.println(ss.toUpperCase());
            }


        String str = "rewer";
        boolean result = isPalindrom(str);
        System.out.println(result);


     // Applying lambda
        IFunction<String,Integer> StringLength=(str2)->str2.length();

        System.out.println("Size: "+StringLength.apply("Hello"));


        int sum =sumDigits(53);
        System.out.println("Sum using String parsing "+sum);

        int sum2=addDigits(67);
        System.out.println("Sum using modules: "+sum2);

        int nthFib=NthFib(10);
        System.out.println("10th Fibonnaci "+nthFib);
    }

    private static boolean isPalindrom(String str) {
        // String reversed=new StringBuilder(str).reverse().toString();
        //return reversed.equals(str);
        //List<Integer> integers = List.of(1, 2, 2);
        char[] ch = str.toCharArray();
        char[] temp = new char[ch.length];

        for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
            temp[i] = ch[j];
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == temp[i]) {
                return true;
            }
        }

        return false;
    }

    public static int sumDigits(int num){
        String numberString=String.valueOf(num);
        int sum=0;
        for(int i=0;i<numberString.length();i++){
            sum+=Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }
        return sum;
    }

    public static int addDigits(int num){
        int sum=0;
        int reminder=0;
        while(num>0){
          reminder=num%10;
          sum+=reminder;
          num=num/10;
        }
        return sum;
    }

    public static int NthFib(int n){
        if(n==0 || n==1)
            return n;
        return NthFib(n-1)+NthFib(n-2);
    }

    public static Map<Integer,Integer> checkDigitExists(String input){
       char[] inputs= input.toCharArray();
        Map<Integer,Integer> occurenceMap=new HashMap<>();
       for(int i=0;i<inputs.length;i++){
           if(Character.isDigit(inputs[i])){

               int digit=  Character.getNumericValue(inputs[i]);
               if(!occurenceMap.containsKey(digit)){
                   occurenceMap.put(digit,1);

               }
               else{
                   int countFrequency=occurenceMap.get(digit);
                   occurenceMap.put(digit,countFrequency+1);
               }

           }

       }
       return occurenceMap;
    }
}
