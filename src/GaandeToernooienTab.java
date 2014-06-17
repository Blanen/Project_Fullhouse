
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/*
 * 
 */

/**
 *
 * @author Matthias
 */
public class GaandeToernooienTab extends javax.swing.JPanel {

    /**
     * Creates new form GaandeToernooienTab
     */
    public GaandeToernooienTab() {
        initComponents();
        getGaandeToernooien();
        getNietGestarteToernooien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        deelnemendeSpelersList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gaandeToernooienComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        nietGestarteToernooienComboBox = new javax.swing.JComboBox();
        startToernooiButton = new javax.swing.JButton();
        selecteerToeernooiButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        geselecteerdToernooiLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        selecteerTafelComboBox = new javax.swing.JComboBox();
        selecteerTafelWinnaarComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        eerstePlaatsComboBox = new javax.swing.JComboBox();
        tweedePlaatsComboBox = new javax.swing.JComboBox();
        derdePlaatsComboBox = new javax.swing.JComboBox();
        bevestigTafelWinnaarButton = new javax.swing.JButton();
        bevestigWinnaarsToernooiButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        huidigeRondeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        deelnemendeSpelersList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(deelnemendeSpelersList);

        jLabel1.setText("Deelneemende spelers:");

        jLabel2.setText("Selecteer een gaand toernooi:");

        gaandeToernooienComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Of start een toernooi:");

        nietGestarteToernooienComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        startToernooiButton.setText("Start toernooi");
        startToernooiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startToernooiButtonActionPerformed(evt);
            }
        });

        selecteerToeernooiButton.setText("Selecteer toernooi");

        jLabel4.setText("Geselecteerd toernooi:");

        geselecteerdToernooiLabel.setText("Geen");

        jLabel6.setText("Voer de winnaar van een tafel in:");

        jLabel7.setText("Tafel:");

        jLabel8.setText("Winnaar:");

        selecteerTafelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selecteerTafelWinnaarComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Voer de winnende spelers van het toernooi in:");

        jLabel10.setText("Eerste plaats:");

        jLabel11.setText("Tweede plaats:");

        jLabel12.setText("Derde plaats:");

        eerstePlaatsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tweedePlaatsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        derdePlaatsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bevestigTafelWinnaarButton.setText("Bevestig");

        bevestigWinnaarsToernooiButton.setText("Bevestig");

        jLabel13.setText("Huidige ronde:");

        huidigeRondeLabel.setText("Geen toernooi geselecteerd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(selecteerTafelWinnaarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(selecteerTafelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(derdePlaatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tweedePlaatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eerstePlaatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(bevestigTafelWinnaarButton)
                                    .addComponent(bevestigWinnaarsToernooiButton))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gaandeToernooienComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selecteerToeernooiButton)
                            .addComponent(jLabel2)
                            .addComponent(geselecteerdToernooiLabel)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(nietGestarteToernooienComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startToernooiButton))
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(huidigeRondeLabel)
                                    .addComponent(jLabel13))
                                .addGap(0, 102, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gaandeToernooienComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nietGestarteToernooienComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startToernooiButton)
                            .addComponent(selecteerToeernooiButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(huidigeRondeLabel)
                            .addComponent(geselecteerdToernooiLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(selecteerTafelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(selecteerTafelWinnaarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bevestigTafelWinnaarButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(eerstePlaatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tweedePlaatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(derdePlaatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bevestigWinnaarsToernooiButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startToernooiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startToernooiButtonActionPerformed
        
    }//GEN-LAST:event_startToernooiButtonActionPerformed
    
    private void getTafelsInRonde () {
        DefaultComboBoxModel<Tafel> model = new DefaultComboBoxModel();
        
        try {
            String query = "SELECT toernooi_nr FROM toernooi JOIN event ON toernooi_nr = event_nr"
                            + " WHERE toernooi.eerste_plaats is null"
                            + " AND NOT toernooi_nr IN (SELECT toernooi FROM tafel_indeling)"
                            + " ORDER BY datum DESC;";
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while (result.next()) {
                //model.addElement(new Tafel(result.getInt("toernooi_nr")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private void getGaandeToernooien () {
        DefaultComboBoxModel<Toernooi> model = new DefaultComboBoxModel();
        try {

            String query = "SELECT toernooi_nr FROM toernooi JOIN event ON toernooi_nr = event_nr"
                            + " WHERE toernooi.eerste_plaats is null"
                            + " AND toernooi_nr IN (SELECT toernooi FROM tafel_indeling)"
                            + " ORDER BY datum DESC;";
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while (result.next()) {
                model.addElement(new Toernooi(result.getInt("toernooi_nr")));
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        gaandeToernooienComboBox.setModel(model);
    }
    
    private void getNietGestarteToernooien () {
        DefaultComboBoxModel<Toernooi> model = new DefaultComboBoxModel();
        try {

            String query = "SELECT toernooi_nr FROM toernooi JOIN event ON toernooi_nr = event_nr"
                            + " WHERE toernooi.eerste_plaats is null"
                            + " AND NOT toernooi_nr IN (SELECT toernooi FROM tafel_indeling)"
                            + " ORDER BY datum DESC;";
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while (result.next()) {
                model.addElement(new Toernooi(result.getInt("toernooi_nr")));
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        nietGestarteToernooienComboBox.setModel(model);
    }
    
    private Toernooi geselecteerdToernooi;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bevestigTafelWinnaarButton;
    private javax.swing.JButton bevestigWinnaarsToernooiButton;
    private javax.swing.JList deelnemendeSpelersList;
    private javax.swing.JComboBox derdePlaatsComboBox;
    private javax.swing.JComboBox eerstePlaatsComboBox;
    private javax.swing.JComboBox gaandeToernooienComboBox;
    private javax.swing.JLabel geselecteerdToernooiLabel;
    private javax.swing.JLabel huidigeRondeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox nietGestarteToernooienComboBox;
    private javax.swing.JComboBox selecteerTafelComboBox;
    private javax.swing.JComboBox selecteerTafelWinnaarComboBox;
    private javax.swing.JButton selecteerToeernooiButton;
    private javax.swing.JButton startToernooiButton;
    private javax.swing.JComboBox tweedePlaatsComboBox;
    // End of variables declaration//GEN-END:variables
}
