

public class BinarySearch {

    public static void main(String[] args) {

        Integer[] binaryList={1,2,3,4,5,6,7,8};

        Integer element =10;

        System.out.println(binarySearch(binaryList,0,binaryList.length-1,element));

    }

    private static Integer  binarySearch( Integer [] binaryList, Integer low, Integer high , Integer element){


        Integer mid =(low+high)/2;

        if(binaryList[mid].equals(element)) {
            return mid;
        }

        else if(element >binaryList[mid]) {
            binarySearch(binaryList, mid + 1, high, element);
        }
        else if(element <binaryList[mid]){
            binarySearch(binaryList, low, mid-1, element);

        }


            return -1;






    }
}
