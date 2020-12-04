/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prompts;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import frames.AppFrame;
import frames.UtilFrame;
import main.ArrayManager;
import panes.JErrorPane;
import utils.Distributions;
import utils.Shuffles;

/*
 * 
MIT License

Copyright (c) 2019 w0rthy

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 *
 */

/**
 *
 * @author S630690
 */
final public class ShufflePrompt extends javax.swing.JFrame implements AppFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private ArrayManager ArrayManager;
    private JFrame Frame;
    private UtilFrame UtilFrame;
    
    /**
     * Creates new form SortPrompt
     */
    @SuppressWarnings("unchecked")
    public ShufflePrompt(ArrayManager ArrayManager, JFrame frame, UtilFrame utilFrame) {
        this.ArrayManager = ArrayManager;
        this.Frame = frame;
        this.UtilFrame = utilFrame;
        
        setAlwaysOnTop(true);
        setUndecorated(true);
        initComponents();
        jList1.setListData(ArrayManager.getDistributionIDs());
        for(int i = 0; i < ArrayManager.getDistributions().length; i++) {
            if(ArrayManager.getDistribution().equals(ArrayManager.getDistributions()[i])) {
                jList1.setSelectedIndex(i);
                break;
            }
        }
        jList2.setListData(ArrayManager.getShuffleIDs());
        for(int i = 0; i < ArrayManager.getShuffles().length; i++) {
            if(ArrayManager.getShuffle().equals(ArrayManager.getShuffles()[i])) {
                jList2.setSelectedIndex(i);
                break;
            }
        }
        reposition();
        setVisible(true); 
    }

    @Override
    public void reposition() {
        setLocation(Frame.getX()+(Frame.getWidth()-getWidth())/2,Frame.getY()+(Frame.getHeight()-getHeight())/2);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.jLabel1 = new javax.swing.JLabel();
        this.jScrollPane1 = new javax.swing.JScrollPane();
        this.jList1 = new javax.swing.JList();

        this.jLabel2 = new javax.swing.JLabel();
        this.jScrollPane2 = new javax.swing.JScrollPane();
        this.jList2 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("What shape do you want the array to have?");
        jLabel2.setText("How do you want the array to be shuffled?");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jScrollPane1.setViewportView(this.jList1);
        jScrollPane2.setViewportView(this.jList2);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                try {
                    jList1ValueChanged(evt);
                } catch (Exception e) {
                    JErrorPane.invokeErrorMessage(e);
                }
            }
        });

        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                try {
                    jList2ValueChanged(evt);
                } catch (Exception e) {
                    JErrorPane.invokeErrorMessage(e);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(this.jLabel1)
                            .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGap(475, 475, 475)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(this.jLabel2)
                                .addGap(5, 5, 5))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(this.jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))
                );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(this.jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, true)
                                .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(this.jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, true)
                                .addComponent(this.jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) throws Exception {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        int selection = jList1.getSelectedIndex();
        Distributions[] distributions = ArrayManager.getDistributions();
        if (selection >= 0 && selection < distributions.length)
            ArrayManager.setDistribution(distributions[selection]);
        UtilFrame.jButton6ResetText();
        dispose();
    }//GEN-LAST:event_jList1ValueChanged

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) throws Exception {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        int selection = jList2.getSelectedIndex();
        Shuffles[] shuffles = ArrayManager.getShuffles();
        if (selection >= 0 && selection < shuffles.length)
            ArrayManager.setShuffle(shuffles[selection]);
        UtilFrame.jButton6ResetText();
        dispose();
    }//GEN-LAST:event_jList1ValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    @SuppressWarnings("rawtypes")
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JLabel jLabel2;
    @SuppressWarnings("rawtypes")
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}