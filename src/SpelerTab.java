
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
       
        toonLijstSpelers();
        toonLijstToernooien();
        toonLijstMasterclassen();
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
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        inschrijvenToernooiButton = new javax.swing.JButton();
        zoekDatum = new javax.swing.JTextField();
        zoekPlaats = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        spelerMasterclassFrame = new javax.swing.JFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        lijstMasterclassen = new javax.swing.JList();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        inschrijvenMasterclassButton = new javax.swing.JButton();
        zoekDatumMasterclass = new javax.swing.JTextField();
        zoekPlaatsMasterclass = new javax.swing.JTextField();
        resetMasterclass = new javax.swing.JButton();
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

        jScrollPane6.setViewportView(lijstToernooien);

        jLabel19.setText("Zoek op datum:");

        jLabel20.setText("Zoek op plaats:");

        inschrijvenToernooiButton.setText("Schrijf speler in");
        inschrijvenToernooiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inschrijvenToernooiButtonActionPerformed(evt);
            }
        });

        zoekDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekDatumActionPerformed(evt);
            }
        });

        zoekPlaats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekPlaatsActionPerformed(evt);
            }
        });
        zoekPlaats.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                zoekPlaatsInputMethodTextChanged(evt);
            }
        });

        reset.setText("Toon alle toernooien");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout spelerToernooiFrameLayout = new javax.swing.GroupLayout(spelerToernooiFrame.getContentPane());
        spelerToernooiFrame.getContentPane().setLayout(spelerToernooiFrameLayout);
        spelerToernooiFrameLayout.setHorizontalGroup(
            spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inschrijvenToernooiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                        .addGroup(spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(zoekPlaats))
                            .addComponent(jLabel21)
                            .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(zoekDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        spelerToernooiFrameLayout.setVerticalGroup(
            spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(spelerToernooiFrameLayout.createSequentialGroup()
                        .addGroup(spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(zoekDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(spelerToernooiFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(zoekPlaats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inschrijvenToernooiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );

        jScrollPane7.setViewportView(lijstMasterclassen);

        jLabel22.setText("Zoek op datum:");

        jLabel27.setText("Zoek op plaats:");

        inschrijvenMasterclassButton.setText("Schrijf speler in");
        inschrijvenMasterclassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inschrijvenMasterclassButtonActionPerformed(evt);
            }
        });

        zoekDatumMasterclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekDatumMasterclassActionPerformed(evt);
            }
        });

        zoekPlaatsMasterclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekPlaatsMasterclassActionPerformed(evt);
            }
        });
        zoekPlaatsMasterclass.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                zoekPlaatsMasterclassInputMethodTextChanged(evt);
            }
        });

        resetMasterclass.setText("Toon alle masterclassen");
        resetMasterclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMasterclassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout spelerMasterclassFrameLayout = new javax.swing.GroupLayout(spelerMasterclassFrame.getContentPane());
        spelerMasterclassFrame.getContentPane().setLayout(spelerMasterclassFrameLayout);
        spelerMasterclassFrameLayout.setHorizontalGroup(
            spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inschrijvenMasterclassButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                        .addGroup(spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(zoekPlaatsMasterclass))
                            .addComponent(jLabel28)
                            .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(zoekDatumMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(resetMasterclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        spelerMasterclassFrameLayout.setVerticalGroup(
            spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(spelerMasterclassFrameLayout.createSequentialGroup()
                        .addGroup(spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(zoekDatumMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(spelerMasterclassFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(zoekPlaatsMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inschrijvenMasterclassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetMasterclass, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );

        lijstSpelers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "--Nieuwe Speler--", "Piet Pieterson", "Henk Henkstra" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lijstSpelers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lijstSpelersMouseClicked(evt);
            }
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

        jLabel25.setText("Huisnr");

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
                            .addComponent(spelerEmailField)
                            .addComponent(spelerThuisMobielField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(spelerVoornaamField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spelerTussenField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel23)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(spelerAchternaamField)))
                            .addComponent(spelerStraatField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zoekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(spelerSchrijfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spelerToernooiButton)
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
                                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(35, 43, Short.MAX_VALUE))
                            .addComponent(spelerTelThuisField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spelerWijzigButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spelerVerwijderButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spelerVoegButton)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(gewonnengeld, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spelerPostcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(spelerNummerFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(spelerPlaatsField, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spelerVoornaamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spelerTussenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spelerAchternaamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spelerTelThuisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(spelerThuisMobielField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spelerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gewonnengeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spelerRatingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spelerWijzigButton)
                            .addComponent(spelerVoegButton)
                            .addComponent(spelerVerwijderButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spelerSchrijfButton)
                            .addComponent(spelerToernooiButton)
                            .addComponent(spelerMasterclassButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zoekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lijstSpelersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lijstSpelersMouseClicked

    }//GEN-LAST:event_lijstSpelersMouseClicked

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
        spelerToernooiFrame.setSize(700, 300);
        }
        else if (spelerMasterclassButton.isSelected())
        {
        spelerMasterclassFrame.setVisible(true);
        spelerMasterclassFrame.setSize(700, 300);
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

    private void zoekPlaatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekPlaatsActionPerformed
        zoekToernooiOpPlaats();
    }//GEN-LAST:event_zoekPlaatsActionPerformed

    private void zoekDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekDatumActionPerformed
        zoekToernooiOpDatum();
    }//GEN-LAST:event_zoekDatumActionPerformed

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

    private void zoekPlaatsInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_zoekPlaatsInputMethodTextChanged

    }//GEN-LAST:event_zoekPlaatsInputMethodTextChanged

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        toonLijstToernooien();
    }//GEN-LAST:event_resetActionPerformed

    private void inschrijvenMasterclassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inschrijvenMasterclassButtonActionPerformed
        inschrijvenSpelerMasterclass();
    }//GEN-LAST:event_inschrijvenMasterclassButtonActionPerformed

    private void zoekDatumMasterclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekDatumMasterclassActionPerformed
	    zoekMasterclassOpDatum();
    }//GEN-LAST:event_zoekDatumMasterclassActionPerformed

    private void zoekPlaatsMasterclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekPlaatsMasterclassActionPerformed
	    zoekMasterclassOpPlaats();
    }//GEN-LAST:event_zoekPlaatsMasterclassActionPerformed

    private void zoekPlaatsMasterclassInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_zoekPlaatsMasterclassInputMethodTextChanged
       
    }//GEN-LAST:event_zoekPlaatsMasterclassInputMethodTextChanged

    private void resetMasterclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMasterclassActionPerformed
	    toonLijstMasterclassen();
    }//GEN-LAST:event_resetMasterclassActionPerformed
     
    private void zoekToernooiOpDatum() {
        try {

            Connection conn = FullHouseDatabase.getConnection();
            String query = "SELECT * FROM toernooi join event on event_nr=toernooi_nr where toernooi_nr not in(select masterclass_nr from masterclass) and datum like ?";
            PreparedStatement stat = conn.prepareStatement(query);
            Date datum = new Date(zoekDatum.getText() + "%'");
            java.sql.Date convertedDatum = new java.sql.Date(datum.getTime());
            stat.setDate(1, convertedDatum);
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
    
    private void zoekToernooiOpPlaats() {
        try {
            Connection conn = FullHouseDatabase.getConnection();
            String query = "SELECT * FROM toernooi join event on event_nr=toernooi_nr where toernooi_nr not in(select masterclass_nr from masterclass) and plaats like ?";
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setString(1, zoekPlaats.getText() + "%");
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
            String query = "SELECT * FROM masterclass join event on event_nr=masterclass_nr where masterclass_nr not in(select masterclass_nr from masterclass) and datum like ?";
            PreparedStatement stat = conn.prepareStatement(query);
            Date datum = new Date(zoekDatum.getText() + "%'");
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
            String query = "SELECT * FROM masterclass join event on event_nr=masterclass_nr where masterclass_nr not in(select masterclass_nr from masterclass) and plaats like ?";
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setString(1, zoekPlaats.getText() + "%");
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
   
    //Een speler kan ingeschreven worden in een masterclass mits hij niet al ingeschreven staat voor de geselecteerde masterclass
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

    private void resetSpelerTextFields() {
        spelerVoornaamField.setText("");
        spelerTussenField.setText("");
        spelerAchternaamField.setText("");
        spelerStraatField.setText("");
        spelerNummerFIeld.setText("");
        spelerPlaatsField.setText("");
        spelerPostcodeField.setText("");
        spelerTelThuisField.setText("");
        spelerThuisMobielField.setText("");
        spelerEmailField.setText("");
        spelerRatingField.setText("");
        gewonnengeld.setText("");
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
    private javax.swing.JButton inschrijvenMasterclassButton;
    private javax.swing.JButton inschrijvenToernooiButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
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
    // End of variables declaration//GEN-END:variables
}
