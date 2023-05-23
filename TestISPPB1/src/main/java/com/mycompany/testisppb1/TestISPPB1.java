/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testisppb1;

import javax.swing.SwingUtilities;

/**
 *
 * @author Sebi
 */
public class TestISPPB1 {

    public static void main(String[] args) {
           SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                EmployeeGUI gui = new EmployeeGUI();
                gui.setVisible(true);
            }
        });
    }
}
