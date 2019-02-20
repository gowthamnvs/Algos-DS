public class UnionMax {
    private int id[],sz[];

    UnionMax(int N){
        id=new int[N];
        sz=new int[N];

        for(int i=0;i<N;i++){
            id[i]=i;

        }

        for(int i=0;i<N;i++){
            sz[i]=1;

        }


    }

    int find(int i){

        int finding[]=new int[id.length];
        int max=0;

        for(int j=0;j<id.length;j++){

            if(id[i]==id[j]){
                if(j>max){

                    max=j;

                }

            }

        }

        return max;



    }

    public static void main(String args){


    }


}
