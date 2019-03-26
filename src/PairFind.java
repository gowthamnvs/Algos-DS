import java.util.HashSet;
import java.util.Iterator;

public class PairFind {

    public static void main(String args[]){


        Integer  n =10;

        Integer numList[]={1,1,2,2,2};

        //new Integer[n];
        Integer k=1;
        HashSet<String> uniquePairs=new HashSet<>();

        for(Integer i=0;i<numList.length;i++){

            for(Integer j=i;j<numList.length;j++){

                if(numList[i]+k==numList[j]){
                    uniquePairs.add(numList[i].toString()+numList[j].toString());
                }

            }

        }

        Iterator itr=uniquePairs.iterator();
        while(itr.hasNext()){
            String pair=itr.next().toString();
            System.out.println(pair.charAt(0)+","+pair.charAt(1));
        }




    }





}
