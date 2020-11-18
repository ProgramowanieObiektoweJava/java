
import Strategy.SportsmanFactoryJump;
import Strategy.SportsmanFactoryRun;
import Strategy.SportsmanFactorySwim;
import Strategy.SportsmanStrategyJump;
import Strategy.SportsmanStrategyRun;
import Strategy.SportsmanStrategySwim;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class CommandForm extends javax.swing.JFrame
{

   final DefaultListModel<SportsmanCommand> listModel = new DefaultListModel<>();
   final DefaultListModel<SportsmanCommand> listModelTraining = new DefaultListModel<>();

   final DefaultComboBoxModel<SportsmanStrategyRun> cbRunModel = new DefaultComboBoxModel<>();
   final DefaultComboBoxModel<SportsmanStrategyJump> cbJumpModel = new DefaultComboBoxModel<>();
   final DefaultComboBoxModel<SportsmanStrategySwim> cbSwimModel = new DefaultComboBoxModel<>();

   public CommandForm(){
      initComponents();
      
    LbCommandList.setModel(listModel);
    listModel.addElement(new SportsmanCommandRun());
    listModel.addElement(new SportsmanCommandSwim());
    listModel.addElement(new SportsmanCommandJump());
    LbCommandList.setSelectedIndex(0);
    LbTrenigList.setModel(listModelTraining);

    cbStrategyRun.setModel(cbRunModel);
    cbStrategyJump.setModel(cbJumpModel);
    cbStrategySwim.setModel(cbSwimModel);

    SportsmanFactoryRun.keys().forEach(key->cbRunModel.addElement(SportsmanFactoryRun.get(key)));
    SportsmanFactoryJump.keys().forEach(key->cbJumpModel.addElement(SportsmanFactoryJump.get(key)));
    SportsmanFactorySwim.keys().forEach(key->cbSwimModel.addElement(SportsmanFactorySwim.get(key)));
   }
   
   private String getTreningName() {
       return EdTreningName.getText();
   }

   private int getLoopCount() {
       return Integer.parseInt(EdCount.getValue().toString());
   }
   
   private SportsmanCommand getSelectedCommand() {
       return LbCommandList.getSelectedValue();
   }
   
   private void setLastTreningItem() {
       LbTrenigList.setSelectedIndex(listModelTraining.size()-1);
   }
   
    private void setLastCommandItem() {
       LbCommandList.setSelectedIndex(listModel.size()-1);
   }

    private String getSportsmanName() {
        return EdSportsmenName.getText();
    }

    private void appendLogArea(String str) {
        EdLogArea.append(str + System.lineSeparator());
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbCommandListScroll = new javax.swing.JScrollPane();
        LbCommandList = new javax.swing.JList<>();
        LbTrenigListScroll = new javax.swing.JScrollPane();
        LbTrenigList = new javax.swing.JList<>();
        BtnAddToTrening = new javax.swing.JButton();
        EdTreningName = new javax.swing.JTextField();
        BtnAddTreningToList = new javax.swing.JButton();
        EdCount = new javax.swing.JSpinner();
        BtnAddLoopToList = new javax.swing.JButton();
        EdSportsmenName = new javax.swing.JTextField();
        BtnExecute = new javax.swing.JButton();
        EdLogAreaScroll = new javax.swing.JScrollPane();
        EdLogArea = new javax.swing.JTextArea();
        BtnRemoveFromList = new javax.swing.JButton();
        BtnRemoveFromTrening = new javax.swing.JButton();
        cbStrategyRun = new javax.swing.JComboBox<>();
        cbStrategyJump = new javax.swing.JComboBox<>();
        cbStrategySwim = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LbCommandListScroll.setViewportView(LbCommandList);

        LbTrenigListScroll.setViewportView(LbTrenigList);

        BtnAddToTrening.setText("=>");
        BtnAddToTrening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddToTreningActionPerformed(evt);
            }
        });

        EdTreningName.setText("TreningName");

        BtnAddTreningToList.setText("<=");
        BtnAddTreningToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddTreningToListActionPerformed(evt);
            }
        });

        EdCount.setModel(new javax.swing.SpinnerNumberModel(2, 2, 9, 1));

        BtnAddLoopToList.setText("<=");
        BtnAddLoopToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddLoopToListActionPerformed(evt);
            }
        });

        EdSportsmenName.setText("Kowalski");

        BtnExecute.setText("Execute");
        BtnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExecuteActionPerformed(evt);
            }
        });

        EdLogArea.setColumns(20);
        EdLogArea.setRows(5);
        EdLogAreaScroll.setViewportView(EdLogArea);

        BtnRemoveFromList.setText("X");

        BtnRemoveFromTrening.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EdLogAreaScroll)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EdSportsmenName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnExecute))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbCommandListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 95, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BtnAddTreningToList)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EdTreningName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnAddLoopToList)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EdCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAddToTrening)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnRemoveFromList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnRemoveFromTrening)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbTrenigListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbStrategyRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStrategyJump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStrategySwim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAddToTrening)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EdTreningName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnAddTreningToList))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EdCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnAddLoopToList))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnRemoveFromList)
                                    .addComponent(BtnRemoveFromTrening)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LbTrenigListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LbCommandListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStrategyRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStrategyJump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStrategySwim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EdSportsmenName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExecute))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdLogAreaScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddToTreningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddToTreningActionPerformed
        listModelTraining.addElement(getSelectedCommand());
        setLastTreningItem();
    }//GEN-LAST:event_BtnAddToTreningActionPerformed

    private void BtnAddTreningToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddTreningToListActionPerformed
        final String treningName = getTreningName();
        final ArrayList<SportsmanCommand> list = new ArrayList<>();
        for (int i =0; i<listModelTraining.size();  ++i) {  list.add(listModelTraining.getElementAt(i)); }
        SportsmanCommand cmd = new SportsmanCommandTrening(treningName, list);
        listModel.addElement(cmd);
        setLastCommandItem();
    }//GEN-LAST:event_BtnAddTreningToListActionPerformed

    private void BtnAddLoopToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddLoopToListActionPerformed
        final String treningName = getTreningName();
        final int loopCount = getLoopCount();
        final SportsmanCommand currentCommand = getSelectedCommand();

        SportsmanCommand cmd = new SportsmanCommandLoop(treningName, loopCount, currentCommand);
        listModel.addElement(cmd);
        setLastCommandItem();
    }//GEN-LAST:event_BtnAddLoopToListActionPerformed

    private void BtnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExecuteActionPerformed
        final String sportsmanName = getSportsmanName();
        final SportsmanCommand currentCommand = getSelectedCommand();
        final SportsmanStrategyRun ssRun=(SportsmanStrategyRun)cbStrategyRun.getSelectedItem();
        final SportsmanStrategySwim ssSwim=(SportsmanStrategySwim)cbStrategySwim.getSelectedItem();
        final SportsmanStrategyJump ssJump=(SportsmanStrategyJump)cbStrategyJump.getSelectedItem();
        
        final Sportsman sportsman = new Sportsman(sportsmanName,ssRun, ssJump, ssSwim);
        appendLogArea(sportsman.execute(currentCommand));
    }//GEN-LAST:event_BtnExecuteActionPerformed

   
    
   public static void main(String args[])
   {
      java.awt.EventQueue.invokeLater(() -> new CommandForm().setVisible(true));
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddLoopToList;
    private javax.swing.JButton BtnAddToTrening;
    private javax.swing.JButton BtnAddTreningToList;
    private javax.swing.JButton BtnExecute;
    private javax.swing.JButton BtnRemoveFromList;
    private javax.swing.JButton BtnRemoveFromTrening;
    private javax.swing.JSpinner EdCount;
    private javax.swing.JTextArea EdLogArea;
    private javax.swing.JScrollPane EdLogAreaScroll;
    private javax.swing.JTextField EdSportsmenName;
    private javax.swing.JTextField EdTreningName;
    private javax.swing.JList<SportsmanCommand> LbCommandList;
    private javax.swing.JScrollPane LbCommandListScroll;
    private javax.swing.JList<SportsmanCommand> LbTrenigList;
    private javax.swing.JScrollPane LbTrenigListScroll;
    private javax.swing.JComboBox<SportsmanStrategyJump> cbStrategyJump;
    private javax.swing.JComboBox<SportsmanStrategyRun> cbStrategyRun;
    private javax.swing.JComboBox<SportsmanStrategySwim> cbStrategySwim;
    // End of variables declaration//GEN-END:variables
}
