public class WeightedQuickUnion {


    private  int[] id;

    private int[] sz;

    public WeightedQuickUnion(int n){
        id=new int[n];
        for(int i=0;i<n;i++){
            id[i]=i;
        }
        sz=new int[n];
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
        if(root(p)==root(q))
            return;
        if(sz[p]<sz[q]){
        id[root(p)]=root(q);
        sz[q]=sz[q]++;}
        else {

            id[root(q)]=root(p);
            sz[p]=sz[p]++;
        }


    }
}
