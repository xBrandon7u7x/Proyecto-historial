/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xBrandon7u7x
 */
public class buscarhistoriaginecologica extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form buscarhistorialclinico
     */
    public buscarhistoriaginecologica() {
        initComponents();
        buscar("");
    }
    void buscar(String valor){
        String [] titulos={"Num. de historia", "fecha_registro", "nombre_paciente", "fecha_nacimiento", "edad", "tel", "direcc", "estado_civil", "alergias", "madre_vive", "madre_sana", "madre_enfermedades", "padre_vive", "padre_sano", "padre_enfermedades", "herm", "abu", "tios", "hijos", "originario", "residente", "escolaridad", "ocupacion", "deportes", "habitacion", "mascotas", "habitos_dieteticos", "alcoholismo", "tabaquismo", "adicciones", "padecimientos_infancia", "infecciones", "fracturas", "cirugias", "transfuciones", "gpo_rh", "Vacunaciones", "Enfermedades_actuales", "menor_cantidad", "ritmo", "coagulos", "dismenorrea", "inicio_vida_sexual", "dispaurencia", "orgasmo", "disminucion_libido", "planificacion_familiar", "tratamiento_hormonal", "gesta", "paras", "aborto", "legrado", "cesarea", "lactancia", "papanicolao", "mastografia", "ultima_regla", "leucorrea", "menopausia", "ipa_respiratorio", "ipa_digestivo", "ipa_urinario", "ipa_endorcinos", "ipa_sistema_nerviso", "ipa_sistema_muscular", "ipa_tegumentos", "peso", "talla", "temperatura", "presion", "f_respiratoria", "f_cardiaca", "glucosa", "oximetria", "inspeccion_general", "fecha de examenes previos", "diagnostico", "tratamiento", "pronostico", "consulta_subsiguiente"
};
        String [] registros = new String [80];
        model = new DefaultTableModel(null,titulos);
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String sql="";
        if(valor.equals("")){
            sql="SELECT * FROM historia_gine";
        }else{
            sql="SELECT * FROM historia_gine WHERE nombre_paciente LIKE '%"+valor+"%'";
        }
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            
registros[0]=rs.getString("id_historia_gine");
registros[1]=rs.getString("fecha_registro");
registros[2]=rs.getString("nombre_paciente");
registros[3]=rs.getString("fecha_nacimiento");
registros[4]=rs.getString("edad");
registros[5]=rs.getString("tel");
registros[6]=rs.getString("direcc");
registros[7]=rs.getString("estado_civil");
registros[8]=rs.getString("alergias");
registros[9]=rs.getString("madre_vive");
registros[10]=rs.getString("madre_sana");
registros[11]=rs.getString("madre_enfermedades");
registros[12]=rs.getString("padre_vive");
registros[13]=rs.getString("padre_sano");
registros[14]=rs.getString("padre_enfermedades");
registros[15]=rs.getString("herm");
registros[16]=rs.getString("abu");
registros[17]=rs.getString("tios");
registros[18]=rs.getString("hijos");
registros[19]=rs.getString("originario");
registros[20]=rs.getString("residente");
registros[21]=rs.getString("escolaridad");
registros[22]=rs.getString("ocupacion");
registros[23]=rs.getString("deportes");
registros[24]=rs.getString("habitacion");
registros[25]=rs.getString("mascotas");
registros[26]=rs.getString("habitos_dieteticos");
registros[27]=rs.getString("alcoholismo");
registros[28]=rs.getString("tabaquismo");
registros[29]=rs.getString("adicciones");
registros[30]=rs.getString("padecimientos_infancia");
registros[31]=rs.getString("infecciones");
registros[32]=rs.getString("fracturas");
registros[33]=rs.getString("cirugias");
registros[34]=rs.getString("transfuciones");
registros[35]=rs.getString("gpo_rh");
registros[36]=rs.getString("Vacunaciones");
registros[37]=rs.getString("Enfermedades_actuales");
registros[38]=rs.getString("menor_cantidad");
registros[39]=rs.getString("ritmo");
registros[40]=rs.getString("coagulos");
registros[41]=rs.getString("dismenorrea");
registros[42]=rs.getString("inicio_vida_sexual");
registros[43]=rs.getString("dispaurencia");
registros[44]=rs.getString("orgasmo");
registros[45]=rs.getString("disminucion_libido");
registros[46]=rs.getString("planificacion_familiar");
registros[47]=rs.getString("tratamiento_hormonal");
registros[48]=rs.getString("gesta");
registros[49]=rs.getString("paras");
registros[50]=rs.getString("aborto");
registros[51]=rs.getString("legrado");
registros[52]=rs.getString("cesarea");
registros[53]=rs.getString("lactancia");
registros[54]=rs.getString("papanicolao");
registros[55]=rs.getString("mastografia");
registros[56]=rs.getString("ultima_regla");
registros[57]=rs.getString("leucorrea");
registros[58]=rs.getString("menopausia");
registros[59]=rs.getString("ipa_respiratorio");
registros[60]=rs.getString("ipa_digestivo");
registros[61]=rs.getString("ipa_urinario");
registros[62]=rs.getString("ipa_endorcinos");
registros[63]=rs.getString("ipa_sistema_nerviso");
registros[64]=rs.getString("ipa_sistema_muscular");
registros[65]=rs.getString("ipa_tegumentos");
registros[66]=rs.getString("peso");
registros[67]=rs.getString("talla");
registros[68]=rs.getString("temperatura");
registros[69]=rs.getString("presion");
registros[70]=rs.getString("f_respiratoria");
registros[71]=rs.getString("f_cardiaca");
registros[72]=rs.getString("glucosa");
registros[73]=rs.getString("oximetria");
registros[74]=rs.getString("inspeccion_general");
registros[75]=rs.getString("fecha_examenes");
registros[76]=rs.getString("diagnostico");
registros[77]=rs.getString("tratamiento");
registros[78]=rs.getString("pronostico");
registros[79]=rs.getString("consulta_subsiguiente");
            model.addRow(registros);            
        }
        tpacientes.setModel(model);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"No se eoncotro");
    }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtbuscarnombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tpacientes = new javax.swing.JTable();
        btnregresar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtconsultasub = new javax.swing.JTextArea();
        btnactualizar = new javax.swing.JButton();

        jMenuItem1.setText("Actualizar historia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtbuscarnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarnombreKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Nombre del paciente:");

        tpacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tpacientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tpacientes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane3.setViewportView(tpacientes);

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnmostrar.setText("Mostrar todos los pacientes");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Consulta subsiguiente:");

        txtconsultasub.setColumns(20);
        txtconsultasub.setRows(5);
        jScrollPane7.setViewportView(txtconsultasub);

        btnactualizar.setText("Actualizar Historia");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmostrar)
                                .addGap(66, 66, 66)
                                .addComponent(btnregresar))
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 7000, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(btnactualizar)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnregresar)
                    .addComponent(btnbuscar)
                    .addComponent(btnmostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnactualizar)
                .addContainerGap(445, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarnombreKeyReleased

    }//GEN-LAST:event_txtbuscarnombreKeyReleased

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
    menubuscar abrir= new menubuscar();
    abrir.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
    buscar(txtbuscarnombre.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
    buscar("");
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    int registros=tpacientes.getSelectedRow();
    if(registros>=0){
        txtconsultasub.setText(tpacientes.getValueAt(registros, 79).toString());
    }else{
        JOptionPane.showMessageDialog(null,"No selecciono un paciente");
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    try {
        PreparedStatement pst = cn.prepareStatement("Update historia_gine SET consulta_subsiguiente='"+txtconsultasub.getText()+"' WHERE nombre_paciente='"+txtbuscarnombre.getText()+"'");
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Historia actualizada");
        buscar("");
    } catch (SQLException ex) {
        Logger.getLogger(buscarhistoriaginecologica.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Error al actualizar");
    }
    }//GEN-LAST:event_btnactualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(buscarhistoriaginecologica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarhistoriaginecologica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarhistoriaginecologica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarhistoriaginecologica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarhistoriaginecologica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tpacientes;
    private javax.swing.JTextField txtbuscarnombre;
    private javax.swing.JTextArea txtconsultasub;
    // End of variables declaration//GEN-END:variables
}
