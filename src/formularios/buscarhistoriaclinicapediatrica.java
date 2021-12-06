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
public class buscarhistoriaclinicapediatrica extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form buscarhistorialclinico
     */
    public buscarhistoriaclinicapediatrica() {
        initComponents();
        buscar("");
    }
    void buscar(String valor){
        String [] titulos={"Num. de historia","Fecha de registro","Nombre del paciente","Fecha nacimiento","Edad","Sexo","Telefono","Direccion","Informante","Alergia","Madre vive","Madre sana","Enfermedades de la madre","Escolaridad de la madre","Ocupacion de madre","Gesta","Abortos","Toxicomaniacos madre","Padre vive","Padre sano","Enfermedades del padre", "Escolaridad del padre","Ocupacion del padre","Toxicomaniacos padre","Numero hermanos","Hermanos vivos","Hermanos muertos","Edad hermanos","Hermanos sanos","Hermanos enfermos", "Antecendentes heredofam","Num. embarazo","Normal","Edad gestinal","Parto distocico","Ruptura de membrana","Anestesia general","Bloqueo","Apnea neodental","Cianosis", "Hemoragias","Convulciones","Ictericia","Peso","Talla","Materna","Ablactacion","Destete","Vecindad","Departamento","Casa sola","Agua intra","Mascotas","Siguio objetos","Sosten cefalico","Se mantuvo sentado","Camino","Inmunizaciones","Gpo sanguineo","Primeras palabras","Control anal","Denticion","Anormalidades perianales", "Infecciosos","Traumaticas","Quirurgicos","Transfusion","Otros","Padecimiento actual","P. Cefalica","P. Toracico","P. Abdominal", "P. Brazo","P. Pierna","F. Cardiaca","F. Respiratoria","Temperatura","Diagnostico","Tratamiento","Pronostico","Consulta subsiguiente"};
        String [] registros = new String [81];
        model = new DefaultTableModel(null,titulos);
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String sql="";
        if(valor.equals("")){
            sql="SELECT * FROM historia_clinica_pediatrica";
        }else{
            sql="SELECT * FROM historia_clinica_pediatrica WHERE nombre_paciente LIKE '%"+valor+"%'";
        }
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            registros[0]=rs.getString("id_historiapediatrica");
            registros[1]=rs.getString("fecha_registro"); 
            registros[2]=rs.getString("nombre_paciente");
            registros[3]=rs.getString("fecha_naci");
            registros[4]=rs.getString("edad"); 
            registros[5]=rs.getString("sexo");
            registros[6]=rs.getString("telefono");
            registros[7]=rs.getString("direccion");
            registros[8]=rs.getString("informante");
            registros[9]=rs.getString("alergia");
            registros[10]=rs.getString("madre_vive");
            registros[11]=rs.getString("madre_sana");
            registros[12]=rs.getString("madre_enfermedades");
            registros[13]=rs.getString("escolaridad_madre");
            registros[14]=rs.getString("ocupacion_madre");
            registros[15]=rs.getString("gesta");
            registros[16]=rs.getString("abortos");
            registros[17]=rs.getString("toxicomaniacos_madre");
            registros[18]=rs.getString("padre_vive");
            registros[19]=rs.getString("padre_sano");
            registros[20]=rs.getString("padre_enfermedades");
            registros[21]=rs.getString("escolaridad_padre");
            registros[22]=rs.getString("ocupacion_padre");
            registros[23]=rs.getString("toxicomaniacos_padre");
            registros[24]=rs.getString("numero_hermanos");
            registros[25]=rs.getString("hermanos_vivos");
            registros[26]=rs.getString("hermanos_muertos");
            registros[27]=rs.getString("edad_hermanos");
            registros[28]=rs.getString("hermanos_sanos");
            registros[29]=rs.getString("hermanos_enfermos");
            registros[30]=rs.getString("antecendentes_heredofam");
            registros[31]=rs.getString("num_embarazo");
            registros[32]=rs.getString("normal");
            registros[33]=rs.getString("edad_gestinal");
            registros[34]=rs.getString("parto_distocico");
            registros[35]=rs.getString("ruptura_membrana");
            registros[36]=rs.getString("anestesia_general");
            registros[37]=rs.getString("bloqueo");
            registros[38]=rs.getString("apnea_neodental");
            registros[39]=rs.getString("cianosis");
            registros[40]=rs.getString("hemoragias");
            registros[41]=rs.getString("convulciones");
            registros[42]=rs.getString("ictericia");
            registros[43]=rs.getString("peso");
            registros[44]=rs.getString("talla");
            registros[45]=rs.getString("materna");
            registros[46]=rs.getString("ablactacion");
            registros[47]=rs.getString("destete");
            registros[48]=rs.getString("vecindad");
            registros[49]=rs.getString("departamento");
            registros[50]=rs.getString("casa_sola");
            registros[51]=rs.getString("agua_intra");
            registros[52]=rs.getString("mascotas");
            registros[53]=rs.getString("siguio_objetos");
            registros[54]=rs.getString("sosten_cefalico");
            registros[55]=rs.getString("se_mantuvo_sentado");
            registros[56]=rs.getString("camino");
            registros[57]=rs.getString("inmunizaciones");
            registros[58]=rs.getString("gpo_sanguineo");
            registros[59]=rs.getString("primeras_palabras");
            registros[60]=rs.getString("control_anal");
            registros[61]=rs.getString("denticion");
            registros[62]=rs.getString("anormalidades_perianales");
            registros[63]=rs.getString("infecciosos");
            registros[64]=rs.getString("traumaticas");
            registros[65]=rs.getString("quirurgicos");
            registros[66]=rs.getString("transfusion");
            registros[67]=rs.getString("otros");
            registros[68]=rs.getString("padecimiento_actual");
            registros[69]=rs.getString("p_cefalica");
            registros[70]=rs.getString("p_toracico");
            registros[71]=rs.getString("p_abdominal");
            registros[72]=rs.getString("p_brazo");
            registros[73]=rs.getString("p_pierna");
            registros[74]=rs.getString("f_cardiaca");
            registros[75]=rs.getString("f_respiratoria");
            registros[76]=rs.getString("temperatura");
            registros[77]=rs.getString("diagnostico");
            registros[78]=rs.getString("tratamiento");
            registros[79]=rs.getString("pronostico");
            registros[80]=rs.getString("consulta_subsiguiente");
            model.addRow(registros);            
        }
        tpacientes.setModel(model);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,ex);
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
        jLabel10 = new javax.swing.JLabel();

        jMenuItem1.setText("Actualizar Historia Clinica");
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

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Buscar Historia Pediatrica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 4523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnbuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnmostrar)
                                        .addGap(66, 66, 66)
                                        .addComponent(btnregresar))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(btnactualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnregresar)
                    .addComponent(btnbuscar)
                    .addComponent(btnmostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnactualizar)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1987, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
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
        txtconsultasub.setText(tpacientes.getValueAt(registros, 80).toString());
    }else{
        JOptionPane.showMessageDialog(null,"No selecciono un paciente");
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    try {
        PreparedStatement pst = cn.prepareStatement("Update historia_clinica_pediatrica SET consulta_subsiguiente='"+txtconsultasub.getText()+"' WHERE nombre_paciente='"+txtbuscarnombre.getText()+"'");
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Historia actualizada");
        buscar("");
    } catch (SQLException ex) {
        Logger.getLogger(buscarhistoriaclinicapediatrica.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(buscarhistoriaclinicapediatrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarhistoriaclinicapediatrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarhistoriaclinicapediatrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarhistoriaclinicapediatrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new buscarhistoriaclinicapediatrica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel10;
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
