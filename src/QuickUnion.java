public class QuickUnion {
    private  int[] id;

    public QuickUnion(int n){
        id=new int[n];
        for(int i=0;i<n;i++){
            id[i]=i;
        }
    }

    public boolean isConnected(int p,int q){

        return root(p)==root(q);
    }

    public int root(int p){

        while(id[p]!=p){

            p=id[p];
        }

        return p;

    }

    public void union(int p,int q){

        id[root(p)]=root(q);
    }
}
