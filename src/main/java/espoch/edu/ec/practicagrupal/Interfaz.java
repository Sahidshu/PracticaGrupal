/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package espoch.edu.ec.practicagrupal;

/**
 *
 * @author mundo
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        txtEscrito = new javax.swing.JTextField();
        cbxOpcions = new javax.swing.JComboBox<>();
        cbxTransporte = new javax.swing.JCheckBox();
        cbxAlmuerzo = new javax.swing.JCheckBox();
        cbxMaterial = new javax.swing.JCheckBox();
        rbtMañana = new javax.swing.JRadioButton();
        rbtTarde = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTitulo.setText("Registro de Participantes:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre del Participante: ");

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        cbxOpcions.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cbxOpcions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Profesional", "Invitado Especial" }));
        cbxOpcions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOpcionsActionPerformed(evt);
            }
        });

        cbxTransporte.setText("Transporte");
        cbxTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTransporteActionPerformed(evt);
            }
        });

        cbxAlmuerzo.setText("Almuerzo");

        cbxMaterial.setText("Material de Apoyo");
        cbxMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMaterialActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtMañana);
        rbtMañana.setText("Mañana");

        buttonGroup1.add(rbtTarde);
        rbtTarde.setText("Tarde");

        txtLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(txtLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(cbxAlmuerzo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(cbxTransporte)
                .addGap(109, 109, 109)
                .addComponent(cbxMaterial)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))
                            .addComponent(btnRegistrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtMañana)
                        .addGap(176, 176, 176)
                        .addComponent(rbtTarde)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(cbxOpcions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEscrito)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtEscrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxOpcions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTransporte)
                    .addComponent(cbxAlmuerzo)
                    .addComponent(cbxMaterial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtMañana)
                    .addComponent(rbtTarde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtEscrito.getText();
        String ocupacion= cbxOpcions.getName();
        
        boolean almuerzo = cbxAlmuerzo.isSelected();
        boolean transporte = cbxTransporte.isSelected();
        boolean material = cbxMaterial.isSelected();
        boolean morning = rbtMañana.isSelected();
        boolean tarde = rbtTarde.isSelected();
        
        String opcion;
        
        switch (opcion){
            case "almuerzo":
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void cbxOpcionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOpcionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOpcionsActionPerformed

    private void cbxTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTransporteActionPerformed

    private void cbxMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMaterialActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbxAlmuerzo;
    private javax.swing.JCheckBox cbxMaterial;
    private javax.swing.JComboBox<String> cbxOpcions;
    private javax.swing.JCheckBox cbxTransporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtMañana;
    private javax.swing.JRadioButton rbtTarde;
    private javax.swing.JTextField txtEscrito;
    private javax.swing.JList<String> txtLista;
    // End of variables declaration//GEN-END:variables
}
