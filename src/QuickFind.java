public class QuickFind {


    private int [] id;

    public QuickFind(int n){
        id=new int[n];
        for(int i=0;i<n;i++){
            id[i]=i;
        }
    }

    public  boolean isConnected(int p,int q){

        return id[p]==id[q];
    }

    public void union(int p,int q){

        int pid=id[p];
        int qid=id[q];

        for(int i=0;i<id.length;i++){
            if(id[i]==pid){
                id[i]=qid;
            }
        }
    }

    public static void main(String[] args) {
        QuickFind testObject =new QuickFind(10);
        testObject.union(1,2);
        testObject.union(1,6);
        System.out.println(testObject.isConnected(2,5));
    }
}
