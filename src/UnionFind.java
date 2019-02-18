import java.util.*;

public class UnionFind{

    private int id[],sz[];

    UnionFind(int N){

        id=new int[N];
        sz=new int[N];

        for(int i=0;i<N;i++){
            id[i]=i;

        }

        for(int i=0;i<N;i++){
            sz[i]=1;

        }

    }


    public  boolean isConnected(int p,int q){

        return root(p)==root(q);


    }

    private int root(int i){

        while(i!=id[i]){
            id[i]=id[id[i]];
            i=id[i];

        }

        return i;


    }

    public void union(int p,int q){

        int i=root(p);
        int j=root(q);



        if(i==j)
            return;
        if(sz[i]<sz[j]){
            id[i]=j;
            sz[j] +=sz[i];
        }
        else{

            id[j]=i;
            sz[i]+=sz[j];
        }



    }

    public String minTime(HashMap<String,int[]> friends) {
        String mintime=new String();
        Iterator<String> itr = friends.keySet().iterator();
        while (itr.hasNext()) {
            String time = itr.next();
            int[] conn_points = friends.get(time);
            union(conn_points[0], conn_points[1]);

            if ((root(0) == root(1)) && (root(1) == root(2)) && (root(2) == root(3)) && (root(3) == root(4))) {

                mintime = time;
                break;
            } else {
                mintime = "not connected yet";

            }




        }
        return mintime;

    }




        public static void main(String []args){
            UnionFind init=new UnionFind(5);

            HashMap<String,int []> fb;
            fb = new HashMap<>();
            int[] p={0,1};
            int[] q={2,3};
            int[] r={3,4};
            int[] s={1,4};
            int[] t={2,1};
            fb.put("1",p);
            fb.put("2",q);
            fb.put("3",r);
            fb.put("4",s);
            fb.put("5",t);


            System.out.println(init.minTime(fb));








        }




    }

