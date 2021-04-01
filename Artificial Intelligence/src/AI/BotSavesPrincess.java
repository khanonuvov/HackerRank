package AI;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotSavesPrincess {
	static void displayPathtoPrincess(int n, String[][] grid) {
		int b_x = 0, b_y = 0, p_x = 0, p_y = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j].equals("m")) {
					b_x = i;
					b_y = j;
				}
				if (grid[i][j].equals("p")) {
					p_x = i;
					p_y = j;
				}
			}
		}
		while (b_x != p_x || b_y != p_y) {
			if (b_y > p_y) {
				b_y--;
				System.out.println("LEFT");
			} else if (b_y < p_y) {
				b_y++;
				System.out.println("RIGHT");
			}
			if (b_x < p_x) {
				b_x++;
				System.out.println("DOWN");
			} else if (b_x > p_x) {
				b_x--;
				System.out.println("UP");
			}
			
		}

	}
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[][] = new String[m][m];
        for(int i = 0; i < m; i++) {
        	for(int j=0;j<m;j++){
        		grid[i][j] = in.next();
        	}
            
        }

    displayPathtoPrincess(m,grid);
    }
}