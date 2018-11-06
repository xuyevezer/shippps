package main;

import javax.swing.SwingUtilities;

import view.Battlefield_view;

public class Main {
	public static void main(String[] args) {
		Battlefield_view battlefield_view = new Battlefield_view();
		
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                battlefield_view.setVisible(true);
            }
        });
	}
}
