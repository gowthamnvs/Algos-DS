import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.We;
public class Percolation {


    int grid[][];
    int status[][];
    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        if(n>0){
            grid =new int[n][n];
            status=new int[n][n];
            int count=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){

                    status[i][j]=0;
                    grid[i][j]=count;
                    count=count+1;
                }
            }
            WeightedQuickUnionUF algo=new WeightedQuickUnionUF(grid);

        }
        else{

            throw new IllegalArgumentException("n should be greater than 0");
        }
    }
    // open site (row, col) if it is not open already
    public    void open(int row, int col) {

              status[row][col]=1;

              if(status[row+1][col]==1){




              }



            }


                    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        if(grid[row][col]==1)
            return true;
        else
                    return false;


    }
    public boolean isFull(int row, int col){


            }

        }

    }  // is site (row, col) full?
    public     int numberOfOpenSites()       // number of open sites
    public boolean percolates()              // does the system percolate?

    public static void main(String[] args)
}
