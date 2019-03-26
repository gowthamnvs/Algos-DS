import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    static int countingValleys(int n, String s) {

        int valleyCount=0;
        int count=0;
        for(int i=0;i<n;i++){

            if(s.charAt(i)=='U'){

                int j=i;
                int count_U=0;

                while(s.charAt(j)!='D' && j<n){
                    count_U=count_U+1;
                    j=j+1;
                }
                count=count+count_U;

                i=i+count_U;

            }
            else{

                int k=i;
                int count_D=0;

                while(s.charAt(k)!='U' && k<n){
                    count_D=count_D+1;
                    k=k+1;
                }
                count=count+count_D;
                i=i+count_D;

            }

            if(count==0){
                valleyCount=valleyCount+1;
            }

        }

        return valleyCount;


    }



    public static void main(String[] args) throws IOException {


        int n = 8;
        String s ="UDDDUDUU";

        int result = countingValleys(n, s);

        System.out.println(result);
    }
}
