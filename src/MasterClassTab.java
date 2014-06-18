
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Regi
 */
public class MasterClassTab extends javax.swing.JPanel {
    private Docent curDocent;

    /**
     * Creates new form MasterClassTab
     */
    public MasterClassTab() {
        initComponents();
        getMasterClassList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectDocentFrame = new javax.swing.JFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        selecteerDocentList = new javax.swing.JList();
        masterclassDocentWasSelectedButton = new javax.swing.JButton();
        masterclassTijdField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        masterclassDatumField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        masterclassMinRatingField = new javax.swing.JTextField();
        masterclassInschrijfgeldField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        masterclassPlaatsField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        masterclassList = new javax.swing.JList();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        masterclassToevoegButton = new javax.swing.JButton();
        toernooiInschrijvingenButton1 = new javax.swing.JButton();
        masterclassWijzigButton = new javax.swing.JButton();
        masterclassDocentButton = new javax.swing.JButton();
        masterclassDocentField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        masterClassMaxInschrijvingenField = new javax.swing.JTextField();

        jScrollPane8.setViewportView(selecteerDocentList);

        masterclassDocentWasSelectedButton.setText("Selecteer");
        masterclassDocentWasSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassDocentWasSelectedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectDocentFrameLayout = new javax.swing.GroupLayout(selectDocentFrame.getContentPane());
        selectDocentFrame.getContentPane().setLayout(selectDocentFrameLayout);
        selectDocentFrameLayout.setHorizontalGroup(
            selectDocentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectDocentFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(masterclassDocentWasSelectedButton)
                .addContainerGap())
        );
        selectDocentFrameLayout.setVerticalGroup(
            selectDocentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectDocentFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectDocentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(selectDocentFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(masterclassDocentWasSelectedButton))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel30.setText("Inschrijfgeld");

        jLabel29.setText("Tijd");

        jLabel31.setText("Minimum Rating");

        masterclassPlaatsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassPlaatsFieldActionPerformed(evt);
            }
        });

        jLabel28.setText("Datum (yyyy-mm-dd)");

        masterclassList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterclassListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(masterclassList);

        jLabel27.setText("Plaats");

        jLabel32.setText("Docent");

        masterclassToevoegButton.setText("Voeg toe");
        masterclassToevoegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassToevoegButtonActionPerformed(evt);
            }
        });

        toernooiInschrijvingenButton1.setText("Lijst met spelers en hun inschrijfstatus");
        toernooiInschrijvingenButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toernooiInschrijvingenButton1ActionPerformed(evt);
            }
        });

        masterclassWijzigButton.setText("Wijzig");
        masterclassWijzigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassWijzigButtonActionPerformed(evt);
            }
        });

        masterclassDocentButton.setText("Selecteer Docent");
        masterclassDocentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassDocentButtonActionPerformed(evt);
            }
        });

        masterclassDocentField.setEditable(false);

        jLabel1.setText("Maximum Inschrijvingen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(masterclassPlaatsField)
                            .addComponent(masterclassDatumField)
                            .addComponent(masterclassTijdField)
                            .addComponent(masterclassInschrijfgeldField)
                            .addComponent(masterclassMinRatingField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(toernooiInschrijvingenButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(masterclassWijzigButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(masterclassToevoegButton)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(masterclassDocentField)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(masterclassDocentButton)
                            .addComponent(jLabel1)
                            .addComponent(masterClassMaxInschrijvingenField))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masterclassPlaatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masterclassDatumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masterclassTijdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masterclassInschrijfgeldField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masterclassMinRatingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masterClassMaxInschrijvingenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masterclassDocentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masterclassDocentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(masterclassToevoegButton)
                            .addComponent(masterclassWijzigButton))
                        .addGap(18, 18, 18)
                        .addComponent(toernooiInschrijvingenButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void masterclassPlaatsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterclassPlaatsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masterclassPlaatsFieldActionPerformed

    private void masterclassListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterclassListMouseClicked
        if (masterclassList.getSelectedValue() != null) {
            fillMasterClassFields((MasterClass) masterclassList.getSelectedValue());
        }
    }//GEN-LAST:event_masterclassListMouseClicked

    private void masterclassToevoegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterclassToevoegButtonActionPerformed
        MasterClass masterclass = maakMasterClass();
        if (masterclass != null) {
            masterclass.writeToDB();
            ((DefaultListModel) masterclassList.getModel()).addElement(masterclass);
        }
    }//GEN-LAST:event_masterclassToevoegButtonActionPerformed

    private void toernooiInschrijvingenButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toernooiInschrijvingenButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toernooiInschrijvingenButton1ActionPerformed

    private void masterclassWijzigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterclassWijzigButtonActionPerformed
        if (masterclassList.getSelectedValue() != null) {
            MasterClass masterclass = (MasterClass) masterclassList.getSelectedValue();
            updateMasterClass(masterclass);
            masterclass.writeToDB();
        }
    }//GEN-LAST:event_masterclassWijzigButtonActionPerformed

    private void masterclassDocentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterclassDocentButtonActionPerformed
        selectDocentFrame.setVisible(true);
        selectDocentFrame.setSize(400, 300);
        getDocentList();
    }//GEN-LAST:event_masterclassDocentButtonActionPerformed

    private void masterclassDocentWasSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterclassDocentWasSelectedButtonActionPerformed
        curDocent = (Docent) selecteerDocentList.getSelectedValue();
        selectDocentFrame.setVisible(false);
        masterclassDocentField.setText(curDocent.toString());
    }//GEN-LAST:event_masterclassDocentWasSelectedButtonActionPerformed

    private MasterClass maakMasterClass() {
        String plaats = masterclassPlaatsField.getText();
        String datumStr = masterclassDatumField.getText();
        String tijd = masterclassTijdField.getText();
        String inschrijfGeldStr = masterclassInschrijfgeldField.getText();
        String minRatingStr = masterclassMinRatingField.getText();
        String max_spelersStr = masterClassMaxInschrijvingenField.getText();

        Date datum = null;
        int minRating = 0;
        int max_spelers = 0;
        double inschrijfGeld = 0;

        boolean valid = true;

        valid &= plaats.length() <= 50;
        valid &= tijd.length() <= 5;
        if (curDocent == null) {
            valid = false;
        } else {
            try {
                inschrijfGeld = Double.parseDouble(inschrijfGeldStr);
                minRating = Integer.parseInt(minRatingStr);
                max_spelers = Integer.parseInt(max_spelersStr);
                datum = Date.valueOf(datumStr);
            } catch (NumberFormatException e) {
                System.out.println(e);
                valid = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong date!\t" + e);
                valid = false;
            }
        }
        if (valid) {
            return new MasterClass(plaats, datum, tijd, inschrijfGeld, max_spelers, minRating, curDocent);
        } else {
            return null;
        }

    }

    private void updateMasterClass(MasterClass mc) {
        String plaats = masterclassPlaatsField.getText();
        String datumStr = masterclassDatumField.getText();
        String tijd = masterclassTijdField.getText();
        String inschrijfGeldStr = masterclassInschrijfgeldField.getText();
        String minRatingStr = masterclassMinRatingField.getText();
        String max_spelersStr = masterClassMaxInschrijvingenField.getText();

        Date datum = null;
        double minRating = 0;
        int max_spelers = 0;
        double inschrijfGeld = 0;

        boolean valid = true;

        valid &= plaats.length() <= 50;
        valid &= tijd.length() <= 5;
        if (curDocent == null) {
            valid = false;
        } else {
            try {
                inschrijfGeld = Double.parseDouble(inschrijfGeldStr);
                minRating = Double.parseDouble(minRatingStr);
                max_spelers = Integer.parseInt(max_spelersStr);
                datum = Date.valueOf(datumStr);
            } catch (NumberFormatException e) {
                System.out.println(e);
                valid = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong date!\t" + e);
                valid = false;
            }
        }
        if (valid) {
            mc.setDatum(datum);
            mc.setMinRating(minRating);
            mc.setMax_inschrijvingen(max_spelers);
            mc.setPlaats(plaats);
            mc.setTijd(tijd);
            mc.setInschrijfGeld(inschrijfGeld);
            mc.setDocent(curDocent);
            mc.writeToDB();
        }
    }

    private void fillMasterClassFields(MasterClass masterclass) {
        masterclassPlaatsField.setText(masterclass.getPlaats());
        masterclassDatumField.setText(masterclass.getDatum().toString());
        masterclassInschrijfgeldField.setText(Double.toString(masterclass.getInschrijfGeld()));
        masterclassTijdField.setText(masterclass.getTijd());
        masterclassMinRatingField.setText(Double.toString(masterclass.getMinRating()));
        masterclassDocentField.setText(masterclass.getDocent().toString());
        masterClassMaxInschrijvingenField.setText(Integer.toString(masterclass.getMax_inschrijvingen()));
        curDocent = masterclass.getDocent();
    }
    
    private void getMasterClassList() {
        DefaultListModel<MasterClass> model = new DefaultListModel();
        try {

            String query = "SELECT masterclass_nr FROM masterclass JOIN event on masterclass_nr = event_nr ORDER BY datum DESC; ";
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while (result.next()) {
                model.addElement(new MasterClass(result.getInt("masterclass_nr")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        masterclassList.setModel(model);
    }
    
    private void getDocentList(){
        String query = "SELECT docent_nr FROM docent;";
        DefaultListModel dml = new DefaultListModel();
        try{
            ResultSet res = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while(res.next()){
                dml.addElement(new Docent(res.getInt("docent_nr")));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        selecteerDocentList.setModel(dml);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField masterClassMaxInschrijvingenField;
    private javax.swing.JTextField masterclassDatumField;
    private javax.swing.JButton masterclassDocentButton;
    private javax.swing.JTextField masterclassDocentField;
    private javax.swing.JButton masterclassDocentWasSelectedButton;
    private javax.swing.JTextField masterclassInschrijfgeldField;
    private javax.swing.JList masterclassList;
    private javax.swing.JTextField masterclassMinRatingField;
    private javax.swing.JTextField masterclassPlaatsField;
    private javax.swing.JTextField masterclassTijdField;
    private javax.swing.JButton masterclassToevoegButton;
    private javax.swing.JButton masterclassWijzigButton;
    private javax.swing.JFrame selectDocentFrame;
    private javax.swing.JList selecteerDocentList;
    private javax.swing.JButton toernooiInschrijvingenButton1;
    // End of variables declaration//GEN-END:variables
}
