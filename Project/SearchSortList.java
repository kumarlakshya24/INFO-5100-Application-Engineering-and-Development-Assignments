package dealersearch;

import javax.swing.SwingUtilities;

public class SearchSortList {
		 
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new MainFrame().setVisible(true);
	            }
	        });
	    }
	}