
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
        jScrollPane5 = new javax.swing.JScrollPane();
        masterclassList = new javax.swing.JList();
        toernooiInschrijvingenButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        masterclassPlaatsField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        masterclassDatumField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        masterclassTijdField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        masterclassInschrijfgeldField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        masterclassMinRatingField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        masterclassDocentField = new javax.swing.JTextField();
        masterclassDocentButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        masterclassWijzigButton = new javax.swing.JButton();
        masterclassToevoegButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

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

        masterclassList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterclassListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(masterclassList);

        toernooiInschrijvingenButton1.setText("Lijst met spelers en hun inschrijfstatus");
        toernooiInschrijvingenButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toernooiInschrijvingenButton1ActionPerformed(evt);
            }
        });

        masterclassPlaatsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassPlaatsFieldActionPerformed(evt);
            }
        });

        jLabel27.setText("Plaats");

        jLabel28.setText("Datum (yyyy-mm-dd)");

        jLabel29.setText("Tijd");

        jLabel30.setText("Inschrijfgeld");

        jLabel31.setText("Minimum Rating");

        jLabel32.setText("Docent");

        masterclassDocentField.setEditable(false);

        masterclassDocentButton.setText("Selecteer Docent");
        masterclassDocentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassDocentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masterclassPlaatsField)
            .addComponent(masterclassDatumField)
            .addComponent(masterclassTijdField)
            .addComponent(masterclassInschrijfgeldField)
            .addComponent(masterclassMinRatingField)
            .addComponent(masterclassDocentField)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(masterclassDocentButton))
                .addGap(0, 457, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
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
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masterclassDocentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masterclassDocentButton)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        masterclassWijzigButton.setText("Wijzig");
        masterclassWijzigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassWijzigButtonActionPerformed(evt);
            }
        });

        masterclassToevoegButton.setText("Voeg toe");
        masterclassToevoegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterclassToevoegButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(masterclassWijzigButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(masterclassToevoegButton))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masterclassWijzigButton)
                    .addComponent(masterclassToevoegButton))
                .addGap(0, 77, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(toernooiInschrijvingenButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(toernooiInschrijvingenButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
    }//GEN-LAST:event_masterclassDocentButtonActionPerformed

    private void masterclassDocentWasSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterclassDocentWasSelectedButtonActionPerformed
        curDocent = (Docent) selecteerDocentList.getSelectedValue();
        selectDocentFrame.setVisible(false);
        masterclassDocentField.setText(curDocent.toString());
    }//GEN-LAST:event_masterclassDocentWasSelectedButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        helpMasterclass();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void helpMasterclass()
    {
        
    }
    private MasterClass maakMasterClass() {
        String plaats = masterclassPlaatsField.getText();
        String datumStr = masterclassDatumField.getText();
        String tijd = masterclassTijdField.getText();
        String inschrijfGeldStr = masterclassInschrijfgeldField.getText();
        String minRatingStr = masterclassMinRatingField.getText();
        String max_spelersStr = "100";

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
        String max_spelersStr = "100";

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
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
