
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Regi
 */
public class DocentenTab extends javax.swing.JPanel {

    /**
     * Creates new form DocentenTab
     */
    public DocentenTab() {
        initComponents();
        fillSelecteerDocentList();
        vulZoekComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        docentVoornaamField = new javax.swing.JTextField();
        docentTussenVoegselField = new javax.swing.JTextField();
        docentAchternaamField = new javax.swing.JTextField();
        docentStraatField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        docentPostcodeField = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        docentHuisnummerField = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        docentPlaatsField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        docentVastField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        docentMobielField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        docentEmailField = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        docentWijzigButton = new javax.swing.JButton();
        docentToevoegButton = new javax.swing.JButton();
        docentZoekButton = new javax.swing.JButton();
        docentZoekCombo = new javax.swing.JComboBox();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        docentRekeningField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        lijstDocenten = new javax.swing.JList();

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel33.setText("Voornaam");

        jLabel41.setText("Tussenvoegsel");

        jLabel42.setText("Achternaam");

        jLabel34.setText("Straat");

        jLabel40.setText("Postcode");

        jLabel43.setText("Huisnummer");

        jLabel44.setText("Plaats");

        jLabel35.setText("Telefoon - Thuis");

        jLabel36.setText("Telefoon - Mobiel");

        jLabel37.setText("Email");

        jLabel38.setText("Rekeningnummer");

        docentWijzigButton.setText("Wijzig");
        docentWijzigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docentWijzigButtonActionPerformed(evt);
            }
        });

        docentToevoegButton.setText("Voeg docent toe");
        docentToevoegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docentToevoegButtonActionPerformed(evt);
            }
        });

        docentZoekButton.setText("Zoek op");
        docentZoekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docentZoekButtonActionPerformed(evt);
            }
        });

        docentZoekCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Naam" }));
        docentZoekCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                docentZoekComboItemStateChanged(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

        label2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

        label3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docentVoornaamField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docentTussenVoegselField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(docentAchternaamField)))
            .addComponent(docentStraatField)
            .addComponent(docentVastField)
            .addComponent(docentMobielField)
            .addComponent(docentEmailField)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(docentWijzigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(docentToevoegButton))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(docentRekeningField)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(docentZoekButton)
                        .addGap(27, 27, 27)
                        .addComponent(docentZoekCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 145, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docentPostcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel40))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(docentHuisnummerField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(docentPlaatsField))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docentVoornaamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docentTussenVoegselField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docentAchternaamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docentStraatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docentPostcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docentHuisnummerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docentPlaatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docentVastField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docentMobielField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docentEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(docentRekeningField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(docentWijzigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docentToevoegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(docentZoekButton)
                                .addComponent(docentZoekCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 74, Short.MAX_VALUE))
        );

        lijstDocenten.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "--Nieuwe Speler--", "Piet Pieterson", "Henk Henkstra" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lijstDocenten.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lijstDocentenValueChanged(evt);
            }
        });
        jScrollPane9.setViewportView(lijstDocenten);

        jScrollPane2.setViewportView(jScrollPane9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void docentWijzigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docentWijzigButtonActionPerformed
    wijzigenDocent();
    }//GEN-LAST:event_docentWijzigButtonActionPerformed

    private void docentZoekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docentZoekButtonActionPerformed
    zoekDocenten();
       
    }//GEN-LAST:event_docentZoekButtonActionPerformed

    private void docentToevoegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docentToevoegButtonActionPerformed
    toevoegenDocent();
    }//GEN-LAST:event_docentToevoegButtonActionPerformed

    private void docentZoekComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_docentZoekComboItemStateChanged
        if (evt.getItem().equals("ID")) {
            clearText(text2);
            clearText(text3);
            clearText(text1);
            text1.setEnabled(true);
            text2.setEnabled(false);
            text3.setEnabled(false);
            label1.setText("ID");
            label2.setText("");
            label3.setText("");
        } else if (evt.getItem().equals("Postcode/Huisnummer")) {
            text1.setEnabled(true);
            text2.setEnabled(true);
            text3.setEnabled(false);
            label1.setText("Postcode");
            label2.setText("Huisnummer");
            label3.setText("");
        } else if (evt.getItem().equals("Naam/Achternaam")) {
            text1.setEnabled(true);
            text2.setEnabled(true);
            text3.setEnabled(true);
            clearText(text1);
            clearText(text2);
            clearText(text3);
            label1.setText("Naam");
            label2.setText("Tussenvoegsel");
            label3.setText("Achternaam");
        } else if (evt.getItem().equals("Toon alle docenten")) {
            text1.setEnabled(false);
            text2.setEnabled(false);
            text3.setEnabled(false);
            clearText(text1);
            clearText(text2);
            clearText(text3);
            label1.setText("");
            label2.setText("");
            label3.setText("");
            fillSelecteerDocentList();
        }
    }//GEN-LAST:event_docentZoekComboItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        helpDocent();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lijstDocentenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lijstDocentenValueChanged
        if (lijstDocenten.getSelectedValue() != null && lijstDocenten.getSelectedValue() instanceof Docent) {
            fillDocentFields((Docent)lijstDocenten.getSelectedValue());
            docentWijzigButton.setEnabled(true);
            docentToevoegButton.setEnabled(false);
        }
        else if (lijstDocenten.getSelectedIndex() == 0 || lijstDocenten.getSelectedValue() == null) {
            docentWijzigButton.setEnabled(false);
            docentToevoegButton.setEnabled(true);
            resetDocentFields();

        }

    }//GEN-LAST:event_lijstDocentenValueChanged
    private void helpDocent()
    {
     JOptionPane.showMessageDialog(this, "Toevoegen- Voeg een docent toe door de lege velden in te vullen en klik op 'Voeg docent toe'"
             + "                          \nWijzigen- Om een docent te wijzigen klik op 'Wijzig'"
             + "                          \nZoeken- \t Selecteer een zoekcriteria uit de lijst en klik op 'Zoek op' om de lijst te filteren"
             , "Help", JOptionPane.QUESTION_MESSAGE);
    }
    
    private void zoekDocenten()
    {
        String selectedItem = (String) docentZoekCombo.getSelectedItem();
         String query = "";
         PreparedStatement stat;
        try {
            Connection conn = FullHouseDatabase.getConnection();

            if (selectedItem.equals("ID")) {
                query = "SELECT * from persoon join docent on persoon_nr=docent_nr where persoon_nr not in(select speler_nr from speler ) and persoon_nr=? order by voornaam";
                stat = conn.prepareStatement(query);
                stat.setInt(1, Integer.parseInt(text1.getText()));
                ResultSet result = stat.executeQuery();
                maakDocent(result);
                
            } else if (selectedItem.equals("Postcode/Huisnummer")) {
                query = "SELECT * FROM persoon join docent on persoon_nr=docent_nr where persoon_nr not in(select speler_nr from speler) and postcode like ? and huisnummer like ? order by voornaam";
                stat = conn.prepareStatement(query);
                stat.setString(1, (text1.getText()));
                stat.setString(2, "%" + text2.getText());
                ResultSet result = stat.executeQuery();
                maakDocent(result);
               
            } else if (selectedItem.equals("Naam/Achternaam")) {
                query = "SELECT * FROM persoon join docent on persoon_nr=docent_nr where persoon_nr not in(select speler_nr from speler) and voornaam like ? and tussenvoegsel like ? and achternaam like? order by voornaam";
                stat = conn.prepareStatement(query);
                stat.setString(1, (text1.getText() + "%"));
                stat.setString(2, "%" + text2.getText() + "%");
                stat.setString(3, "%" + text3.getText() + "%");
                ResultSet result = stat.executeQuery();
                maakDocent(result);
            }
        } catch (SQLException e) {
        JOptionPane.showMessageDialog( null, e, "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
    private void maakDocent(ResultSet rs)
    {
        try {

            DefaultListModel dm = new DefaultListModel();
            dm.addElement("--Nieuwe Docent--");
            while (rs.next()) {
                String voornaam= rs.getString("voornaam");
                String tussenvoegsel= rs.getString("tussenvoegsel");
                String achternaam= rs.getString("achternaam");
                String straat=rs.getString("straat");
                String huisnummer= rs.getString("huisnummer");
                String woonplaats= rs.getString("woonplaats");
                String postcode= rs.getString("postcode");
                String mobiel=rs.getString("mobiel_nr");
                String vast=rs.getString("vast_nr");
                String email= rs.getString("emailadres");
                String rekening= rs.getString("rekening_nr");
                Docent docent = new Docent(voornaam, tussenvoegsel, achternaam, straat, huisnummer, postcode, woonplaats, mobiel, vast, email, rekening);
                docent.writeToDB();

                dm.addElement(docent);
            }
            lijstDocenten.setModel(dm);
        } catch (SQLException e) {
           JOptionPane.showMessageDialog( null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    //Haalt de doorgegeven textfield leeg
    private void clearText(JTextField text)
    {
       text.setText(null);
    }
    
    private void vulZoekComboBox() {
        DefaultComboBoxModel dfcm = new DefaultComboBoxModel();
        String[] zoekopties = {"Toon alle docenten", "ID", "Postcode/Huisnummer", "Naam/Achternaam"};

        for (String zoekoptie : zoekopties) {
            dfcm.addElement(zoekoptie);
        }
        docentZoekCombo.setModel(dfcm);
    }
    
    private void resetDocentFields()
    {
       docentVoornaamField.setText(null);
        docentTussenVoegselField.setText(null);
        docentAchternaamField.setText(null);
        docentStraatField.setText(null);
        docentHuisnummerField.setText(null);
        docentPostcodeField.setText(null);
        docentPlaatsField.setText(null);
        docentEmailField.setText(null);
        docentVastField.setText(null);
        docentMobielField.setText(null);
        docentRekeningField.setText(null);  
    }
    // Vult de textfields met de gegevens van de geselecteerde docent
    private void fillDocentFields(Docent docent) {
        docentVoornaamField.setText(docent.getVoornaam());
        docentTussenVoegselField.setText(docent.getTussenvoegsel());
        docentAchternaamField.setText(docent.getAchternaam());
        docentStraatField.setText(docent.getStraat());
        docentHuisnummerField.setText(docent.getHuisnummer());
        docentPostcodeField.setText(docent.getPostcode());
        docentPlaatsField.setText(docent.getWoonplaats());
        docentEmailField.setText(docent.getEmail());
        docentVastField.setText(docent.getVNR());
        docentMobielField.setText(docent.getMNR());
        docentRekeningField.setText((docent.getRekening()));
    }

    private ArrayList<Docent> getDocenten() {
        String query = "SELECT docent_nr FROM docent;";
        ArrayList<Docent> docenten = new ArrayList();
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);

            
            while (result.next()) {
                docenten.add(new Docent(result.getInt("docent_nr")));
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return docenten;
    }
    
    //Wijzigt de geselecteerde docent in de database en in de docentenlijst
    private void wijzigenDocent() {
        boolean valid = true;
        if (lijstDocenten.getSelectedValue() instanceof Docent) {
            Docent selectedDocent = (Docent) lijstDocenten.getSelectedValue();
            if (selectedDocent.existsInDB()) {
                selectedDocent.setAdres(docentStraatField.getText(), docentHuisnummerField.getText(), docentPlaatsField.getText(), docentPostcodeField.getText());
                selectedDocent.setNaam(docentVoornaamField.getText(), docentTussenVoegselField.getText(), docentAchternaamField.getText());
                selectedDocent.setContactGegevens(docentVastField.getText(), docentMobielField.getText(), docentEmailField.getText());
                try {
                    String rekening = docentRekeningField.getText();
                    selectedDocent.setRekening(rekening);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Rekening moet een getal zijn!");
                    valid = false;
                }
            }
            if (valid) {
                selectedDocent.writeToDB();
            }
            JOptionPane.showMessageDialog(this, selectedDocent + " is gewijzigd", "Wijziging voltooid", JOptionPane.INFORMATION_MESSAGE);
            fillSelecteerDocentList();
        }
    }

    private void toevoegenDocent() {
        String voornaam = docentVoornaamField.getText();
        String tussenVoegsel = docentTussenVoegselField.getText();
        String achternaam = docentAchternaamField.getText();
        String straat = docentStraatField.getText();
        String huisnummer = docentHuisnummerField.getText();
        String postcode = docentPostcodeField.getText();
        String plaats = docentPlaatsField.getText();
        String mobiel = docentMobielField.getText();
        String vast = docentVastField.getText();
        String email = docentEmailField.getText();
        String rekening = null;
        boolean valid = true;
        try {
            rekening = docentRekeningField.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        if (valid) {
            Docent docent = new Docent(voornaam, tussenVoegsel, achternaam, straat, huisnummer, postcode, plaats, mobiel, vast, email, rekening);
            docent.writeToDB();
            JOptionPane.showMessageDialog(this, docent + " is toegevoegd", "Toevoeging voltooid", JOptionPane.INFORMATION_MESSAGE);
            ((DefaultListModel) lijstDocenten.getModel()).addElement(docent);
        }
    }
  
    private void fillSelecteerDocentList() {
        DefaultListModel dml = new DefaultListModel();
        ArrayList<Docent> docenten = getDocenten();
        dml.addElement("--Nieuwe Docent--");
        for (Docent docent : docenten) {
            dml.addElement(docent);
        }
        lijstDocenten.setModel(dml);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField docentAchternaamField;
    private javax.swing.JTextField docentEmailField;
    private javax.swing.JTextField docentHuisnummerField;
    private javax.swing.JTextField docentMobielField;
    private javax.swing.JTextField docentPlaatsField;
    private javax.swing.JTextField docentPostcodeField;
    private javax.swing.JTextField docentRekeningField;
    private javax.swing.JTextField docentStraatField;
    private javax.swing.JButton docentToevoegButton;
    private javax.swing.JTextField docentTussenVoegselField;
    private javax.swing.JTextField docentVastField;
    private javax.swing.JTextField docentVoornaamField;
    private javax.swing.JButton docentWijzigButton;
    private javax.swing.JButton docentZoekButton;
    private javax.swing.JComboBox docentZoekCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JList lijstDocenten;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    // End of variables declaration//GEN-END:variables
}
