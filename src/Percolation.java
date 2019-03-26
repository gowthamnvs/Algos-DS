import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class Percolation {

    // create n-by-n grid, with all sites blocked
    int grid[];

    int virtualTopsite,virtualBottomSite;

    WeightedQuickUnionUF wf;


    public Percolation(int n)  {

        for(int i=0;i<n*n;i++){
                grid[i]=0;


        }


        wf=new WeightedQuickUnionUF((n*n)+2);


        for(int i=1;i<n+1;i++){
                wf.union(0,i);
        }
        for(int i=n;i>n+1;i++){

        }


    }
    // open site (row, col) if it is not open already
    public    void open(int row, int col) {

        int p=(row)*grid.length+(col-1);
        int p_1=(row-1)*grid.length+(col-1);
        int p_2=(row+1)*grid.length+(col-1);
        int p_3=(row)*grid.length+(col);
        int p_4=(row)*grid.length+(col-2);



        if(grid[p]==0){

            if(grid[p_1]!=0 && p_1>=0){
                wf.union(p,p_1);
            }
            else if(grid[p_2]!=0&& p_2>=0){
                wf.union(p,p_2);
            }
            else if(grid[p_3]!=0&& p_3>=0){
                wf.union(p,p_3);
            }
            else if(grid[p_4]!=0&& p_4>=0){
                wf.union(p,p_4);
            }

            grid[p]=1;


        }


    }
    // is site (row, col) open?
    public boolean isOpen(int row, int col)  {

        if(grid[(row-1)*grid.length+(col-1)]==1)
            return true;
        else
            return false;

    }

    // is site (row, col) full?
    public boolean isFull(int row, int col) {



    }
    // number of open sites
    public     int numberOfOpenSites()   {

    }
    // does the system percolate?
    public boolean percolates()   {


    }







}
