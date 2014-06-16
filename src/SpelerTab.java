
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Regi
 */
public class SpelerTab extends javax.swing.JPanel {

    /**
     * Creates new form SpelerTab
     */
    public SpelerTab() {
        initComponents();
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(spelerToernooiButton);
        buttonGroup1.add(spelerMasterclassButton);
        toonLijstMasterclassen();
        toonLijstSpelers();
        toonLijstToernooien();
        vulZoekComboBox();

        spelerWijzigButton.setEnabled(false);
        spelerVerwijderButton.setEnabled(false);
        spelerSchrijfButton.setEnabled(false);
        text1.setEnabled(false);
        text2.setEnabled(false);
        text3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spelerToernooiFrame = new javax.swing.JFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        lijstToernooien = new javax.swing.JList();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        zoekToernooiDatum = new javax.swing.JButton();
        zoekDatum = new javax.swing.JTextField();
        zoekToernooiPlaats = new javax.swing.JButton();
        zoekPlaats = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        inschrijvenToernooiButton = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        help = new javax.swing.JButton();
        spelerMasterclassFrame = new javax.swing.JFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        lijstMasterclassen = new javax.swing.JList();
        jLabel28 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        zoekDatumMasterclass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        zoekPlaatsMasterclass = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        inschrijvenMasterclassButton = new javax.swing.JButton();
        resetMasterclass = new javax.swing.JButton();
        helpMasterclass = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lijstSpelers = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spelerVoornaamField = new javax.swing.JTextField();
        spelerStraatField = new javax.swing.JTextField();
        spelerTelThuisField = new javax.swing.JTextField();
        spelerThuisMobielField = new javax.swing.JTextField();
        spelerEmailField = new javax.swing.JTextField();
        spelerWijzigButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        spelerRatingField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gewonnengeld = new javax.swing.JTextField();
        zoekComboBox = new javax.swing.JComboBox();
        spelerSchrijfButton = new javax.swing.JButton();
        spelerToernooiButton = new javax.swing.JRadioButton();
        spelerMasterclassButton = new javax.swing.JRadioButton();
        spelerVoegButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        spelerTussenField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        spelerAchternaamField = new javax.swing.JTextField();
        spelerPostcodeField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        spelerNummerFIeld = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        spelerPlaatsField = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        spelerVerwijderButton = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        helpSpeler = new javax.swing.JButton();

        jScrollPane6.setViewportView(lijstToernooien);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Inschrijving Toernooi");

        zoekToernooiDatum.setText("Zoek op datum (dd/mm/yyyy):");
        zoekToernooiDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekToernooiDatumActionPerformed(evt);
            }
        });

        zoekToernooiPlaats.setText("Zoek op plaats:");
        zoekToernooiPlaats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekToernooiPlaatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zoekToernooiDatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zoekDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zoekToernooiPlaats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zoekPlaats, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zoekToernooiDatum)
                    .addComponent(zoekDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zoekToernooiPlaats)
                    .addComponent(zoekPlaats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        inschrijvenToernooiButton.setText("Inschrijven");
        inschrijvenToernooiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inschrijvenToernooiButtonActionPerformed(evt);
            }
        });

        reset.setText("Toon alles");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inschrijvenToernooiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inschrijvenToernooiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        help.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        help.setText("?");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout spelerToernooiFrameLayout = new javax.swing.GroupLayout(spelerToernooiFrame.getContentPane());
        spelerToernooiFrame.getContentPane().setLayout(spelerToernooiFrameLayout);
        spelerToernooiFrameLayout.setHorizontalGroup(
            spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245)
                .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                .addGroup(spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(jLabel21))
                    .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        spelerToernooiFrameLayout.setVerticalGroup(
            spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                .addGroup(spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addGap(20, 20, 20)
                .addGroup(spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane7.setViewportView(lijstMasterclassen);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Inschrijving Masterclass");

        jButton3.setText("Zoek op datum (dd/mm/yyyy):");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Zoek op plaats:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zoekDatumMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zoekPlaatsMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(zoekDatumMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(zoekPlaatsMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        inschrijvenMasterclassButton.setText("Schrijf speler in");
        inschrijvenMasterclassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inschrijvenMasterclassButtonActionPerformed(evt);
            }
        });

        resetMasterclass.setText("Toon alle masterclassen");
        resetMasterclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMasterclassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(inschrijvenMasterclassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(inschrijvenMasterclassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetMasterclass, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        helpMasterclass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        helpMasterclass.setText("?");
        helpMasterclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMasterclassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout spelerMasterclassFrameLayout = new javax.swing.GroupLayout(spelerMasterclassFrame.getContentPane());
        spelerMasterclassFrame.getContentPane().setLayout(spelerMasterclassFrameLayout);
        spelerMasterclassFrameLayout.setHorizontalGroup(
            spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 448, Short.MAX_VALUE)
                .addComponent(helpMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        spelerMasterclassFrameLayout.setVerticalGroup(
            spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                .addGroup(spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(helpMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel28))
                            .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        lijstSpelers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "--Nieuwe Speler--", "Piet Pieterson", "Henk Henkstra" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lijstSpelers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lijstSpelersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lijstSpelers);

        jLabel1.setText("Voornaam");

        jLabel2.setText("Straat");

        jLabel3.setText("Telefoon - Thuis");

        jLabel4.setText("Telefoon - Mobiel");

        jLabel5.setText("Email");

        spelerWijzigButton.setText("Wijzig");
        spelerWijzigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spelerWijzigButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Zoek op");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Rating");

        spelerRatingField.setEditable(false);

        jLabel10.setText("Gewonnen Geld");

        gewonnengeld.setEditable(false);

        zoekComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Naam" }));
        zoekComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                zoekComboBoxItemStateChanged(evt);
            }
        });

        spelerSchrijfButton.setText("Schrijf speler in voor");
        spelerSchrijfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spelerSchrijfButtonActionPerformed(evt);
            }
        });

        spelerToernooiButton.setText("Toernooi");

        spelerMasterclassButton.setText("Masterclass");

        spelerVoegButton.setText("Voeg speler toe");
        spelerVoegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spelerVoegButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Postcode");

        jLabel23.setText("Tussenvoegsel");

        jLabel24.setText("Achternaam");

        jLabel25.setText("Huisnummer");

        jLabel26.setText("Plaats");

        spelerPlaatsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spelerPlaatsFieldActionPerformed(evt);
            }
        });

        spelerVerwijderButton.setText("Verwijder");
        spelerVerwijderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spelerVerwijderButtonActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

        label2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

        label3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

        helpSpeler.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        helpSpeler.setText("?");
        helpSpeler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpSpelerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spelerVoornaamField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spelerTussenField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(spelerAchternaamField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spelerEmailField)
                            .addComponent(spelerThuisMobielField)
                            .addComponent(spelerStraatField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spelerTelThuisField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spelerWijzigButton)
                                .addGap(18, 18, 18)
                                .addComponent(spelerVerwijderButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spelerVoegButton)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(gewonnengeld, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(69, 69, 69))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(zoekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(spelerSchrijfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spelerToernooiButton)
                                            .addGap(2, 2, 2)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(spelerRatingField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spelerMasterclassButton)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spelerPostcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel25)
                                                .addComponent(spelerNummerFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26)
                                        .addComponent(spelerPlaatsField, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(helpSpeler, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(helpSpeler, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spelerVoornaamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spelerTussenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spelerAchternaamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spelerStraatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spelerPostcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spelerNummerFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spelerPlaatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spelerTelThuisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spelerThuisMobielField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spelerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gewonnengeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spelerRatingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spelerVerwijderButton)
                                .addComponent(spelerVoegButton))
                            .addComponent(spelerWijzigButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spelerToernooiButton)
                                .addComponent(spelerMasterclassButton))
                            .addComponent(spelerSchrijfButton))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zoekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2)
                                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lijstSpelersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lijstSpelersValueChanged

        if (lijstSpelers.getSelectedIndex() == 0 || lijstSpelers.getSelectedValue() == null) {
            spelerWijzigButton.setEnabled(false);
            spelerVoegButton.setEnabled(true);
            spelerSchrijfButton.setEnabled(true);
            spelerVerwijderButton.setEnabled(false);
            spelerSchrijfButton.setEnabled(false);  
            
            
            resetSpelerTextFields();
            
        } 
        else {
            Speler selectedSpeler = (Speler) lijstSpelers.getSelectedValue();
            spelerWijzigButton.setEnabled(true);
            spelerVoegButton.setEnabled(false);
            spelerSchrijfButton.setEnabled(true);
            spelerVerwijderButton.setEnabled(true);
            spelerSchrijfButton.setEnabled(true);
            spelerVoornaamField.setText(selectedSpeler.getVoornaam());
            spelerTussenField.setText(selectedSpeler.getTussenvoegsel());
            spelerAchternaamField.setText(selectedSpeler.getAchternaam());
            spelerStraatField.setText(selectedSpeler.getStraat());
            spelerNummerFIeld.setText(selectedSpeler.getHuisnummer());
            spelerPlaatsField.setText(selectedSpeler.getWoonplaats());
            spelerPostcodeField.setText(selectedSpeler.getPostcode());
            spelerTelThuisField.setText(selectedSpeler.getVNR());
            spelerThuisMobielField.setText(selectedSpeler.getMNR());
            spelerEmailField.setText(selectedSpeler.getEmail());
            spelerRatingField.setText(Double.toString(selectedSpeler.getRating()));
            gewonnengeld.setText(Double.toString(selectedSpeler.getGeld()));
        }
    }//GEN-LAST:event_lijstSpelersValueChanged

    private void spelerWijzigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spelerWijzigButtonActionPerformed
        wijzigenSpeler();
    }//GEN-LAST:event_spelerWijzigButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        zoekSpelers();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void spelerSchrijfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spelerSchrijfButtonActionPerformed
        if (spelerToernooiButton.isSelected())
        {
        spelerToernooiFrame.setVisible(true);
        spelerToernooiFrame.setSize(1000, 300);
        }
        else if (spelerMasterclassButton.isSelected())
        {
        spelerMasterclassFrame.setVisible(true);
        spelerMasterclassFrame.setSize(1000, 300);
        }
    }//GEN-LAST:event_spelerSchrijfButtonActionPerformed

    private void spelerVoegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spelerVoegButtonActionPerformed
        toevoegenSpeler();
    }//GEN-LAST:event_spelerVoegButtonActionPerformed

    private void spelerPlaatsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spelerPlaatsFieldActionPerformed

    }//GEN-LAST:event_spelerPlaatsFieldActionPerformed

    private void inschrijvenToernooiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inschrijvenToernooiButtonActionPerformed
        inschrijvenSpelerToernooi();
    }//GEN-LAST:event_inschrijvenToernooiButtonActionPerformed

    private void spelerVerwijderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spelerVerwijderButtonActionPerformed
        verwijderenSpeler();
    }//GEN-LAST:event_spelerVerwijderButtonActionPerformed

    private void zoekComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_zoekComboBoxItemStateChanged
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
        } else if (evt.getItem().equals("Toon alle spelers")) {
            text1.setEnabled(false);
            text2.setEnabled(false);
            text3.setEnabled(false);
            clearText(text1);
            clearText(text2);
            clearText(text3);
            label1.setText("");
            label2.setText("");
            label3.setText("");
            toonLijstSpelers();
        }
    }//GEN-LAST:event_zoekComboBoxItemStateChanged

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        toonLijstToernooien();
    }//GEN-LAST:event_resetActionPerformed

    private void inschrijvenMasterclassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inschrijvenMasterclassButtonActionPerformed
        inschrijvenSpelerMasterclass();
    }//GEN-LAST:event_inschrijvenMasterclassButtonActionPerformed

    private void resetMasterclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMasterclassActionPerformed
	toonLijstMasterclassen();
    }//GEN-LAST:event_resetMasterclassActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        zoekMasterclassOpDatum();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        zoekMasterclassOpPlaats();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void zoekToernooiDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekToernooiDatumActionPerformed
        zoekToernooiOpDatum();
    }//GEN-LAST:event_zoekToernooiDatumActionPerformed

    private void zoekToernooiPlaatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekToernooiPlaatsActionPerformed
        zoekToernooiOpPlaats();
    }//GEN-LAST:event_zoekToernooiPlaatsActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        helpToernooi();
    }//GEN-LAST:event_helpActionPerformed

    private void helpMasterclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMasterclassActionPerformed
        helpMasterclass();
    }//GEN-LAST:event_helpMasterclassActionPerformed

    private void helpSpelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpSpelerActionPerformed
        helpSpeler();
    }//GEN-LAST:event_helpSpelerActionPerformed
    private void helpSpeler()
    {
     JOptionPane.showMessageDialog(this, "Wijzigen-\t Selecteer een speler uit de lijst en klik op 'Wijzigen' om een speler te wijzigen"
             + "\nToevoegen-\t Klik op --Nieuwe Speler-- en op de knop 'Toevoegen' om een nieuwe speler toe te voegen"
             + "\nVerwijderen-\t Selecteer een speler uit de lijst en op de knop 'Verwijderen' om een speler te verwijderen"
             + "\nZoeken- \t Selecteer een zoekcriteria uit de lijst en klik op 'Zoek op' om de lijst te filteren"
             , "Help", JOptionPane.QUESTION_MESSAGE );
         
    }
    private void helpMasterclass()
    {
    JOptionPane.showMessageDialog(this, "Inschrijven-\t Om een speler in te schrijven selecteert u een masterclass uit de lijst en drukt op de knop 'Inschrijven'"
                                            +"\nZoeken-\t Voer de naam of de datum van de gewenste masterclass en druk op de bijbehorende 'Zoek' knop"
                                            +"\nBeschikbare masterclasses-\t Om een lijst met alle masterclasses te tonen, klik op 'Toon alles'", "Help", JOptionPane.QUESTION_MESSAGE );
    }    
    
    private void helpToernooi()
    {
        JOptionPane.showMessageDialog(this, "Inschrijven-\t Om een speler in te schrijven selecteert u een toernooi uit de lijst en drukt op de knop 'Inschrijven'"
                                            +"\nZoeken-\t Voer de naam of de datum van de gewenste toernooi en druk op de bijbehorende 'Zoek' knop"
                                            +"\nBeschikbare toernooien-\t Om een lijst met alle toernooien te tonen, klik op 'Toon alles'", "Help", JOptionPane.QUESTION_MESSAGE );
    }
    private void zoekToernooiOpDatum() {
        try {

            Connection conn = FullHouseDatabase.getConnection();
            String query = "SELECT * FROM toernooi join event on event_nr=toernooi_nr where toernooi_nr not in(select masterclass_nr from masterclass) and datum = ?";
            PreparedStatement stat = conn.prepareStatement(query);
            Date datum = new Date(zoekDatum.getText());
            java.sql.Date convertedDatum = new java.sql.Date(datum.getTime());
            stat.setDate(1, convertedDatum);
            ResultSet result = stat.executeQuery();
            System.out.println(query);
            DefaultListModel dflm = new DefaultListModel();

            while (result.next()) {
                Toernooi toernooi = new Toernooi(result.getInt("toernooi_nr"));
                dflm.addElement(toernooi);
            }

            lijstToernooien.setModel(dflm);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Fout", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void zoekToernooiOpPlaats() {
        try {
            Connection conn = FullHouseDatabase.getConnection();
            String query = "SELECT * FROM toernooi join event on event_nr=toernooi_nr where toernooi_nr not in(select masterclass_nr from masterclass) and plaats like ?";
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setString(1, zoekPlaats.getText() +"%" );
            ResultSet result = stat.executeQuery();
            DefaultListModel dflm = new DefaultListModel();

            while (result.next()) {
                Toernooi toernooi = new Toernooi(result.getInt("toernooi_nr"));
                dflm.addElement(toernooi);
            }

            lijstToernooien.setModel(dflm);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Fout", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void zoekMasterclassOpDatum() {
        try {

            Connection conn = FullHouseDatabase.getConnection();
            String query = "SELECT * FROM masterclass join event on event_nr=masterclass_nr where masterclass_nr not in(select toernooi_nr from toernooi) and datum like ?";
            PreparedStatement stat = conn.prepareStatement(query);
            Date datum = new Date(zoekDatum.getText());
            java.sql.Date convertedDatum = new java.sql.Date(datum.getTime());
            stat.setDate(1, convertedDatum);
            ResultSet result = stat.executeQuery();
            DefaultListModel dflm = new DefaultListModel();

            while (result.next()) {
                MasterClass masterclass = new MasterClass(result.getInt("masterclass_nr"));
                dflm.addElement(masterclass);
            }

            lijstMasterclassen.setModel(dflm);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Fout", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void zoekMasterclassOpPlaats() {
        try {
            Connection conn = FullHouseDatabase.getConnection();
            String query = "SELECT * FROM masterclass join event on event_nr=masterclass_nr where masterclass_nr not in(select toernooi_nr from toernooi) and plaats like ?";
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setString(1, zoekPlaats.getText()+"%");
            ResultSet result = stat.executeQuery();
            DefaultListModel dflm = new DefaultListModel();

            while (result.next()) {
                MasterClass masterclass = new MasterClass(result.getInt("masterclass_nr"));
                dflm.addElement(masterclass);
            }

            lijstMasterclassen.setModel(dflm);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Fout", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //De doorgegeven JTextField wordt leeggehaald
    private void clearText(JTextField text) {
        text.setText("");
    }
    
    //Een speler kan ingeschreven worden in een toernooi mits hij niet al ingeschreven staat voor de geselecteerde toernooi
    private void inschrijvenSpelerToernooi() {
        Speler selectedSpeler = (Speler) lijstSpelers.getSelectedValue();
        Toernooi selectedToernooi = (Toernooi) lijstToernooien.getSelectedValue();
        int aantal_inschrijvingen = 0;
        int max_inschrijvingen = 0;
        try {

            Connection conn = FullHouseDatabase.getConnection();
            String query = "INSERT into toernooi_inschrijving VALUES(?,?,?)";
            String query2 = "select count(*) as aantal_inschr, max_inschrijvingen from event join toernooi on toernooi_nr=event_nr left "
                    + "join toernooi_inschrijving on toernooi_nr=toernooi "
                    + "where event_nr not in(select masterclass_nr from masterclass) and toernooi_nr=? ";

            PreparedStatement stat = conn.prepareStatement(query);
            PreparedStatement stat2 = conn.prepareStatement(query2);

            stat.setInt(1, selectedSpeler.getPNR());
            stat.setInt(2, selectedToernooi.getEventNr());
            stat.setString(3, null);
            stat2.setInt(1, selectedToernooi.getEventNr());

            ResultSet result = stat2.executeQuery();

            while (result.next()) {
                aantal_inschrijvingen = result.getInt("aantal_inschr");
                max_inschrijvingen = result.getInt("max_inschrijvingen");
            }
            if (aantal_inschrijvingen < max_inschrijvingen) {
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, selectedSpeler + " staat nu ingeschreven voor " + selectedToernooi, "Inschrijving voltooid", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Maximum inschrijvingen is bereikt", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (MySQLIntegrityConstraintViolationException e) {
            //Als de geselecteerde speler al ingeschreven staat voor de geselecteerde toernooi
            JOptionPane.showMessageDialog(null, selectedSpeler + " is al ingeschreven voor " + selectedToernooi, "Inschrijving niet mogelijk", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Fout", JOptionPane.ERROR_MESSAGE);
        }
    }
   
   // Een speler kan ingeschreven worden in een masterclass mits hij niet al ingeschreven staat voor de geselecteerde masterclass
    private void inschrijvenSpelerMasterclass()
    {
        Speler selectedSpeler = (Speler) lijstSpelers.getSelectedValue();
        MasterClass selectedMasterclass = (MasterClass) lijstMasterclassen.getSelectedValue();
        int aantal_inschrijvingen = 0;
        int max_inschrijvingen = 0;
        try {

            Connection conn = FullHouseDatabase.getConnection();
            String query =  "INSERT into masterclass_inschrijving VALUES(?,?,?)";
            String query2 = "select count(*) as aantal_inschr, max_inschrijvingen from event join masterclass on masterclass_nr=event_nr left "
                            + "join masterclass_inschrijving on masterclass_nr=masterclass "
                            + "where event_nr not in(select toernooi_nr from toernooi) and masterclass_nr=? ";

            PreparedStatement stat = conn.prepareStatement(query);
            PreparedStatement stat2 = conn.prepareStatement(query2);

            stat.setInt(1, selectedMasterclass.getEventNr());
            stat.setInt(2, selectedSpeler.getPNR());
            stat.setString(3, null);
            
            stat2.setInt(1, selectedMasterclass.getEventNr());

            ResultSet result = stat2.executeQuery();

            while (result.next()) {
                aantal_inschrijvingen = result.getInt("aantal_inschr");
                max_inschrijvingen = result.getInt("max_inschrijvingen");
            }
            if (aantal_inschrijvingen < max_inschrijvingen) {
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, selectedSpeler + " staat nu ingeschreven voor " + selectedMasterclass, "Inschrijving voltooid", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Maximum inschrijvingen is bereikt", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (MySQLIntegrityConstraintViolationException e) {
            //Als de geselecteerde speler al ingeschreven staat voor de geselecteerde masterclass
  
            JOptionPane.showMessageDialog(null, selectedSpeler + " is al ingeschreven voor " + selectedMasterclass, "Inschrijving niet mogelijk", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Fout", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
   //Toon alle toernooien die in de database aanwezig zijn
    private void toonLijstToernooien() {
        try {
            Connection conn = FullHouseDatabase.getConnection();
            String query = "SELECT * from toernooi join event on event_nr=toernooi_nr where event_nr not in(select masterclass_nr from masterclass) ";
            PreparedStatement stat = conn.prepareStatement(query);
            ResultSet result = stat.executeQuery();
            DefaultListModel dflm = new DefaultListModel();
            while (result.next()) {

                dflm.addElement(new Toernooi(result.getInt("toernooi_nr")));

            }
            lijstToernooien.setModel(dflm);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Fout", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    //Toon alle masterclassen die in de database aanwezig zijn
    private void toonLijstMasterclassen()
    {
      try {
            Connection conn = FullHouseDatabase.getConnection();
            String query = "SELECT * from masterclass join event on event_nr=masterclass_nr where masterclass_nr not in(select toernooi_nr from toernooi) ";
            PreparedStatement stat = conn.prepareStatement(query);
            
            ResultSet result = stat.executeQuery();
            DefaultListModel dflm = new DefaultListModel();
            while (result.next()) {

                dflm.addElement(new MasterClass(result.getInt("masterclass_nr")));

            }
            lijstMasterclassen.setModel(dflm);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Fout", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    //Vul de combobox met de verschillende zoekopties die de gebruiker op kan zoeken
    private void vulZoekComboBox() {
        DefaultComboBoxModel dfcm = new DefaultComboBoxModel();
        String[] zoekopties = {"Toon alle spelers", "ID", "Postcode/Huisnummer", "Naam/Achternaam"};

        for (String zoekoptie : zoekopties) {
            dfcm.addElement(zoekoptie);
        }
        zoekComboBox.setModel(dfcm);
    }
    
    //Zoek spelers op ID, Postcode/Huisnummer, Naam/Achternaam, 
    private void zoekSpelers() {
         String selectedItem = (String) zoekComboBox.getSelectedItem();
         String query = "";
         PreparedStatement stat;
        try {
            Connection conn = FullHouseDatabase.getConnection();

            if (selectedItem.equals("ID")) {
                query = "SELECT * from persoon join speler on persoon_nr=speler_nr where persoon_nr not in(select docent_nr from docent ) and persoon_nr=? order by voornaam";
                stat = conn.prepareStatement(query);
                stat.setInt(1, Integer.parseInt(text1.getText()));
                ResultSet result = stat.executeQuery();
                maakSpeler(result);
            } else if (selectedItem.equals("Postcode/Huisnummer")) {
                query = "SELECT * FROM persoon join speler on persoon_nr=speler_nr where persoon_nr not in(select docent_nr from docent) and postcode like ? and huisnummer like ? order by voornaam";
                stat = conn.prepareStatement(query);
                stat.setString(1, (text1.getText()));
                stat.setString(2, "%" + text2.getText());
                ResultSet result = stat.executeQuery();
                maakSpeler(result);
            } else if (selectedItem.equals("Naam/Achternaam")) {
                query = "SELECT * FROM persoon join speler on persoon_nr=speler_nr where persoon_nr not in(select docent_nr from docent) and voornaam like ? and tussenvoegsel like ? and achternaam like? order by voornaam";
                stat = conn.prepareStatement(query);
                stat.setString(1, (text1.getText() + "%"));
                stat.setString(2, "%" + text2.getText() + "%");
                stat.setString(3, "%" + text3.getText() + "%");
                ResultSet result = stat.executeQuery();
                maakSpeler(result);
            }
        } catch (SQLException e) {
        JOptionPane.showMessageDialog( null, e, "Error", JOptionPane.ERROR_MESSAGE);

        }

    }
    //Het leeghalen van de textfields
    private void resetSpelerTextFields() {
        spelerVoornaamField.setText(null);
        spelerTussenField.setText(null);
        spelerAchternaamField.setText(null);
        spelerStraatField.setText(null);
        spelerNummerFIeld.setText(null);
        spelerPlaatsField.setText(null);
        spelerPostcodeField.setText(null);
        spelerTelThuisField.setText(null);
        spelerThuisMobielField.setText(null);
        spelerEmailField.setText(null);
        spelerRatingField.setText(null);
        gewonnengeld.setText(null);
    }

    //Toevoegen van speler aan de database
    private void toevoegenSpeler() {
       
        try {
            Connection conn = FullHouseDatabase.getConnection();
            String query = "select max(persoon_nr)from persoon";
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            int pnr = 0;

            while (result.next()) {
                pnr = result.getInt("max(persoon_nr)") + 1;
                
            }
            String query2 = "INSERT INTO persoon VALUES(?,?,?,?,?,?,?,?, ?, ?, ?)";
            String query3 = "INSERT INTO speler VALUES(?,?,?)";

            PreparedStatement stat2 = conn.prepareStatement(query2);
            PreparedStatement stat3 = conn.prepareStatement(query3);
            stat3.setInt(1, pnr);
            stat3.setString(2, null);
            stat3.setString(3, null);

            stat2.setInt(1, pnr);
            stat2.setString(2, spelerVoornaamField.getText());
            stat2.setString(3, spelerTussenField.getText());
            stat2.setString(4, spelerAchternaamField.getText());
            stat2.setString(5, spelerStraatField.getText());
            stat2.setString(6, spelerNummerFIeld.getText());
            stat2.setString(7, spelerPostcodeField.getText());
            stat2.setString(8, spelerPlaatsField.getText());

            stat2.setString(9, spelerTelThuisField.getText());
            stat2.setString(10, spelerThuisMobielField.getText());
            stat2.setString(11, spelerEmailField.getText());
    
            stat2.executeUpdate();
            stat3.executeUpdate();
            
            String naamToegevoegdeSpeler= spelerVoornaamField.getText()+" "+ spelerTussenField.getText()+" " + spelerAchternaamField.getText();
            JOptionPane.showMessageDialog(null, naamToegevoegdeSpeler+ " is toegevoegd", "Toevoeging voltooid", JOptionPane.INFORMATION_MESSAGE);
            toonLijstSpelers();
            resetSpelerTextFields();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog( null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void wijzigenSpeler() {
        try {

            Speler selectedSpeler = (Speler) lijstSpelers.getSelectedValue();
            int pnr = selectedSpeler.getPNR();
            Connection conn = FullHouseDatabase.getConnection();
            String query = "UPDATE persoon SET voornaam=?, tussenvoegsel=?, achternaam=?, straat=?, huisnummer=?, woonplaats=?, postcode=?, mobiel_nr=?, vast_nr=?, emailadres=?where persoon_nr= " + pnr;
//          String query2="UPDATE speler SET rating=?,  gewonnen_geld=? where speler_nr= "+pnr;
            PreparedStatement stat = conn.prepareStatement(query);
//          PreparedStatement stat2=conn.prepareStatement(query2);
            stat.setString(1, spelerVoornaamField.getText());
            stat.setString(2, spelerTussenField.getText());
            stat.setString(3, spelerAchternaamField.getText());
            stat.setString(4, spelerStraatField.getText());
            stat.setString(5, spelerNummerFIeld.getText());
            stat.setString(6, spelerPlaatsField.getText());
            stat.setString(7, spelerPostcodeField.getText());
            stat.setString(8, spelerTelThuisField.getText());
            stat.setString(9, spelerThuisMobielField.getText());
            stat.setString(10, spelerEmailField.getText());
//          stat2.setDouble(1, Double.parseDouble(spelerRatingField.getText()));
//          stat2.setDouble(2, Double.parseDouble(gewonnengeld.getText()));
            
            
            stat.executeUpdate();
//          int effectedRecords2=stat2.executeUpdate();

            JOptionPane.showMessageDialog(null, selectedSpeler + " is gewijzigd", "Wijziging voltooid", JOptionPane.INFORMATION_MESSAGE);

            toonLijstSpelers();
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Genereert een lijst van alle spelers afhankelijk van de zoekopdracht  
    private void toonLijstSpelers() {
        try {

            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            String query = "SELECT * FROM speler join persoon on speler_nr=persoon_nr where persoon_nr not in (select docent_nr from docent) order by voornaam";
            ResultSet result = stat.executeQuery(query);

           
            maakSpeler(result);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog( null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Verwijderen van spelers door het ophalen van de geselecteerde item in lijstSpelers
    private void verwijderenSpeler() {
        try {

            Connection conn = FullHouseDatabase.getConnection();

            Speler selectedSpeler = (Speler) lijstSpelers.getSelectedValue();

            String query = "DELETE  from persoon where persoon_nr=?";
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setInt(1, selectedSpeler.getPNR());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, selectedSpeler+ " is verwijderd", "Verwijdering voltooid", JOptionPane.INFORMATION_MESSAGE);
            ((DefaultListModel) lijstSpelers.getModel()).removeElement(selectedSpeler);
            zoekComboBox.setSelectedIndex(2);
            zoekComboBox.setSelectedIndex(0);
            lijstSpelers.setSelectedIndex(0);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog( null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    //Maakt een nieuw spelerobject met behulp van de klasse Speler
    private void maakSpeler(ResultSet rs) {
        try {

            DefaultListModel dm = new DefaultListModel();
            dm.addElement("--Nieuwe Speler--");
            while (rs.next()) {
                Speler speler = new Speler();
                speler.setNr(rs.getInt("speler_nr"));
                speler.setNaam(rs.getString("voornaam"), rs.getString("tussenvoegsel"), rs.getString("achternaam"));
                speler.setAdres(rs.getString("straat"), rs.getString("huisnummer"), rs.getString("woonplaats"), rs.getString("postcode"));
                speler.setContactGegevens(rs.getString("mobiel_nr"), rs.getString("vast_nr"), rs.getString("emailadres"));
                speler.setRating(rs.getDouble("rating"));
                speler.setGewonnenGeld(rs.getDouble("gewonnen_geld"));

                dm.addElement(speler);
            }
            lijstSpelers.setModel(dm);
        } catch (SQLException e) {
           JOptionPane.showMessageDialog( null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Haalt spelers op met evt een extra WHERE query (bv "naam = 'Peter'")
    private ArrayList<Speler> getSpelers(String whereClause) {
        String query = "SELECT * FROM speler inner join persoon on speler_nr=persoon_nr where persoon_nr not in (select docent_nr from docent)";
        if (!(whereClause == null || whereClause.isEmpty())) {
            query += " AND " + whereClause;
        }
        query += ";";
        ArrayList<Speler> spelers = new ArrayList();
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);

           
            while (result.next()) {

                Speler speler = new Speler();
                speler.setNr(result.getInt("speler_nr"));
                speler.setNaam(result.getString("voornaam"), result.getString("tussenvoegsel"), result.getString("achternaam"));
                speler.setAdres(result.getString("straat"), result.getString("huisnummer"), result.getString("woonplaats"), result.getString("postcode"));
                speler.setContactGegevens(result.getString("mobiel_nr"), result.getString("vast_nr"), result.getString("emailadres"));
                speler.setRating(result.getDouble("rating"));
                speler.setGewonnenGeld(result.getDouble("gewonnen_geld"));
                spelers.add(speler);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog( null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return spelers;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gewonnengeld;
    private javax.swing.JButton help;
    private javax.swing.JButton helpMasterclass;
    private javax.swing.JButton helpSpeler;
    private javax.swing.JButton inschrijvenMasterclassButton;
    private javax.swing.JButton inschrijvenToernooiButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JList lijstMasterclassen;
    private javax.swing.JList lijstSpelers;
    private javax.swing.JList lijstToernooien;
    private javax.swing.JButton reset;
    private javax.swing.JButton resetMasterclass;
    private javax.swing.JTextField spelerAchternaamField;
    private javax.swing.JTextField spelerEmailField;
    private javax.swing.JRadioButton spelerMasterclassButton;
    private javax.swing.JFrame spelerMasterclassFrame;
    private javax.swing.JTextField spelerNummerFIeld;
    private javax.swing.JTextField spelerPlaatsField;
    private javax.swing.JTextField spelerPostcodeField;
    private javax.swing.JTextField spelerRatingField;
    private javax.swing.JButton spelerSchrijfButton;
    private javax.swing.JTextField spelerStraatField;
    private javax.swing.JTextField spelerTelThuisField;
    private javax.swing.JTextField spelerThuisMobielField;
    private javax.swing.JRadioButton spelerToernooiButton;
    private javax.swing.JFrame spelerToernooiFrame;
    private javax.swing.JTextField spelerTussenField;
    private javax.swing.JButton spelerVerwijderButton;
    private javax.swing.JButton spelerVoegButton;
    private javax.swing.JTextField spelerVoornaamField;
    private javax.swing.JButton spelerWijzigButton;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JComboBox zoekComboBox;
    private javax.swing.JTextField zoekDatum;
    private javax.swing.JTextField zoekDatumMasterclass;
    private javax.swing.JTextField zoekPlaats;
    private javax.swing.JTextField zoekPlaatsMasterclass;
    private javax.swing.JButton zoekToernooiDatum;
    private javax.swing.JButton zoekToernooiPlaats;
    // End of variables declaration//GEN-END:variables
}
