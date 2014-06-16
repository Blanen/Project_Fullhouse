
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Regi
 */
public class ToernooiTab extends javax.swing.JPanel {

    /**
     * Creates new form ToernooiTab
     */
    public ToernooiTab() {
        initComponents();
        getToernooiList();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inschrijvingToernooiFrame = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        toernooiInschrijvingTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        totaaInschrijvingenlField = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        toernooiList = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        toernooiPlaatsField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        toernooiDatumField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        toernooiTijdField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        toernooiInschrijfgeldField = new javax.swing.JTextField();
        toernooiRondesField = new javax.swing.JTextField();
        toernooiInschrijvingenButton = new javax.swing.JButton();
        toernooiWijzigButton = new javax.swing.JButton();
        toernooiToevoegButton = new javax.swing.JButton();

        toernooiInschrijvingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(123), "Ja"},
                { new Integer(321), "Nee"},
                {null, null},
                {null, null}
            },
            new String [] {
                "SpelerID", "Inschrijfgeld Betaald"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(toernooiInschrijvingTable);

        jLabel14.setText("Toernooi ID: ");

        jLabel22.setText("Totaal aantal spelers:");

        totaaInschrijvingenlField.setEditable(false);
        totaaInschrijvingenlField.setText("2");

        jToggleButton1.setText("Alleen onbetaald");

        javax.swing.GroupLayout inschrijvingToernooiFrameLayout = new javax.swing.GroupLayout(inschrijvingToernooiFrame.getContentPane());
        inschrijvingToernooiFrame.getContentPane().setLayout(inschrijvingToernooiFrameLayout);
        inschrijvingToernooiFrameLayout.setHorizontalGroup(
            inschrijvingToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inschrijvingToernooiFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inschrijvingToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inschrijvingToernooiFrameLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totaaInschrijvingenlField))
                    .addGroup(inschrijvingToernooiFrameLayout.createSequentialGroup()
                        .addGroup(inschrijvingToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jToggleButton1))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inschrijvingToernooiFrameLayout.setVerticalGroup(
            inschrijvingToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inschrijvingToernooiFrameLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inschrijvingToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(totaaInschrijvingenlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        toernooiList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "--Nieuw toernooi--", "1-1-2001", "2-2-2002" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        toernooiList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toernooiListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(toernooiList);

        jLabel7.setText("Plaats");

        toernooiPlaatsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toernooiPlaatsFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Datum (yyyy-mm-dd)");

        jLabel11.setText("Tijd");

        jLabel12.setText("Inschrijfgeld");

        jLabel13.setText("Rondes");

        toernooiInschrijfgeldField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toernooiInschrijfgeldFieldActionPerformed(evt);
            }
        });

        toernooiInschrijvingenButton.setText("Lijst met spelers en hun inschrijfstatus");
        toernooiInschrijvingenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toernooiInschrijvingenButtonActionPerformed(evt);
            }
        });

        toernooiWijzigButton.setText("Wijzig");
        toernooiWijzigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toernooiWijzigButtonActionPerformed(evt);
            }
        });

        toernooiToevoegButton.setText("Voeg toe");
        toernooiToevoegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toernooiToevoegButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toernooiPlaatsField)
                    .addComponent(toernooiDatumField)
                    .addComponent(toernooiTijdField)
                    .addComponent(toernooiInschrijfgeldField)
                    .addComponent(toernooiInschrijvingenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toernooiWijzigButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toernooiToevoegButton))
                    .addComponent(toernooiRondesField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toernooiPlaatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toernooiDatumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toernooiTijdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toernooiInschrijfgeldField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toernooiRondesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toernooiWijzigButton)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(toernooiToevoegButton)
                                .addGap(18, 18, 18)))
                        .addComponent(toernooiInschrijvingenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void toernooiListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toernooiListMouseClicked
        if (toernooiList.getSelectedValue() != null) {
            fillToernooiFields((Toernooi) toernooiList.getSelectedValue());
        }
    }//GEN-LAST:event_toernooiListMouseClicked

    private void toernooiPlaatsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toernooiPlaatsFieldActionPerformed

    }//GEN-LAST:event_toernooiPlaatsFieldActionPerformed

    private void toernooiInschrijvingenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toernooiInschrijvingenButtonActionPerformed
        // TODO add your handling code here:
        if (!toernooiList.isSelectionEmpty()) {
            inschrijvingToernooiFrame.setVisible(true);
            inschrijvingToernooiFrame.setSize(400, 300);
            maakToernooiFrame();
        } else {
            JOptionPane.showMessageDialog(this, "Selecteer een toernooi!");
        }
    }//GEN-LAST:event_toernooiInschrijvingenButtonActionPerformed

    private void toernooiWijzigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toernooiWijzigButtonActionPerformed
        if (toernooiList.getSelectedValue() != null) {
            Toernooi toernooi = (Toernooi) toernooiList.getSelectedValue();
            updateToernooi(toernooi);
            toernooi.writeToDB();
        }
    }//GEN-LAST:event_toernooiWijzigButtonActionPerformed

    private void toernooiToevoegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toernooiToevoegButtonActionPerformed
        Toernooi toernooi = maakToernooi();
        if (toernooi != null) {
            toernooi.writeToDB();
            ((DefaultListModel) toernooiList.getModel()).addElement(toernooi);
        }
    }//GEN-LAST:event_toernooiToevoegButtonActionPerformed

    private void toernooiInschrijfgeldFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toernooiInschrijfgeldFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toernooiInschrijfgeldFieldActionPerformed

    private void fillToernooiFields(Toernooi toernooi) {
        toernooiPlaatsField.setText(toernooi.getPlaats());
        toernooiDatumField.setText(toernooi.getDatum().toString());
        toernooiInschrijfgeldField.setText(Double.toString(toernooi.getInschrijfGeld()));
        toernooiTijdField.setText(toernooi.getTijd());
        toernooiRondesField.setText(Integer.toString(toernooi.getRondes()));
    }

    private void updateToernooi(Toernooi toernooi) {
        String plaats = toernooiPlaatsField.getText();
        String datumStr = toernooiDatumField.getText();
        String tijd = toernooiTijdField.getText();
        String inschrijfGeldStr = toernooiInschrijfgeldField.getText();
        String rondesStr = toernooiRondesField.getText();
        String max_spelersStr = "100";

        Date datum = null;
        int rondes = 0;
        int max_spelers = 0;
        double inschrijfGeld = 0;

        boolean valid = true;

        valid &= plaats.length() <= 50;
        valid &= tijd.length() <= 5;
        try {
            inschrijfGeld = Double.parseDouble(inschrijfGeldStr);
            rondes = Integer.parseInt(rondesStr);
            max_spelers = Integer.parseInt(max_spelersStr);
            datum = Date.valueOf(datumStr);
        } catch (NumberFormatException e) {
            System.out.println(e);
            valid = false;
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong date!\t" + e);

            valid = false;
        }
        if (valid) {
            toernooi.setDatum(datum);
            toernooi.setRondes(rondes);
            toernooi.setMax_inschrijvingen(max_spelers);
            toernooi.setPlaats(plaats);
            toernooi.setTijd(tijd);
            toernooi.setInschrijfGeld(inschrijfGeld);
            toernooi.writeToDB();
        }
    }

    private Toernooi maakToernooi() {
        String plaats = toernooiPlaatsField.getText();
        String datumStr = toernooiDatumField.getText();
        String tijd = toernooiTijdField.getText();
        String inschrijfGeldStr = toernooiInschrijfgeldField.getText();
        String rondesStr = toernooiRondesField.getText();
        String max_spelersStr = "100";

        Date datum = null;
        int rondes = 0;
        int max_spelers = 0;
        double inschrijfGeld = 0;

        boolean valid = true;

        valid &= plaats.length() <= 50;
        valid &= tijd.length() <= 5;
        try {
            inschrijfGeld = Double.parseDouble(inschrijfGeldStr);
            rondes = Integer.parseInt(rondesStr);
            max_spelers = Integer.parseInt(max_spelersStr);
            datum = Date.valueOf(datumStr);
        } catch (NumberFormatException e) {
            System.out.println(e);
            valid = false;
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong date!\t" + e);

            valid = false;
        }
        if (valid) {
            return new Toernooi(plaats, datum, tijd, inschrijfGeld, max_spelers, 8, rondes);
        } else {
            return null;
        }
    }
    
    private void maakToernooiFrame() {
        ArrayList<ToernooiInschrijving> inschrijvingen = ToernooiInschrijving.getToernooiInschrijvingByToernooi((Toernooi) toernooiList.getSelectedValue());
        DefaultTableModel mdl = new DefaultTableModel();
        mdl.addColumn("Speler");
        mdl.addColumn("Heeft betaald");
        mdl.setRowCount(inschrijvingen.size());
        totaaInschrijvingenlField.setText(Integer.toString(inschrijvingen.size()));
        for (int i = 0; i < inschrijvingen.size(); i++) {
            mdl.setValueAt(inschrijvingen.get(i).getSpeler(), i, 0);
            mdl.setValueAt(inschrijvingen.get(i).isBetaald(), i, 1);
        }
        toernooiInschrijvingTable.setModel(mdl);
    }
    
    private void getToernooiList() {
        DefaultListModel<Toernooi> model = new DefaultListModel();
        try {

            String query = "SELECT toernooi_nr FROM toernooi JOIN event on toernooi_nr = event_nr ORDER BY datum DESC; ";
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while (result.next()) {
                model.addElement(new Toernooi(result.getInt("toernooi_nr")));
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        toernooiList.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame inschrijvingToernooiFrame;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField toernooiDatumField;
    private javax.swing.JTextField toernooiInschrijfgeldField;
    private javax.swing.JTable toernooiInschrijvingTable;
    private javax.swing.JButton toernooiInschrijvingenButton;
    private javax.swing.JList toernooiList;
    private javax.swing.JTextField toernooiPlaatsField;
    private javax.swing.JTextField toernooiRondesField;
    private javax.swing.JTextField toernooiTijdField;
    private javax.swing.JButton toernooiToevoegButton;
    private javax.swing.JButton toernooiWijzigButton;
    private javax.swing.JTextField totaaInschrijvingenlField;
    // End of variables declaration//GEN-END:variables
}
