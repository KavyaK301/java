import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            int sr=4;
          int sc=4;
          printMazePaths(sr,sc,0,0,"");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	          if(dr==sc-1 && dc==sr-1){
                System.out.println(psf);
                return;
              }
          if(dr<sc-1){
            printMazePaths(sr,sc,dr+1,dc,psf + "h");
          }
          if(dc<sr-1){
            printMazePaths(sr,sc,dc+1,dr,psf + "v");
          }
	    }

	}
