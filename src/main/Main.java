package main;

import javax.swing.SwingUtilities;

import view.Battlefield_view;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Battlefield_view().setVisible(true);
            }
        });
	}
}
