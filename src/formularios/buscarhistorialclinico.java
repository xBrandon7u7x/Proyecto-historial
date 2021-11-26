/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JOptionPane;
import java.sql.Connection;
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
public class buscarhistorialclinico extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form buscarhistorialclinico
     */
    public buscarhistorialclinico() {
        initComponents();
        
    }
    void cargar(String valor){
        String [] titulos={"id de historial","fecha de registro","nombre del paciente","fecha de nacimiento","edad","sexo","telefono","direccion","estado civil","madre vive","madre sana","madre_enfermedades","padre_vive","padre_sano","padre_enfermedades","herm","abu","tios","hijos","originario","residente","escolaridad","ocupacion","deportes","habitacion","mascotas","habitos dieteticos","alcoholismo","tabaquismo", "adicciones", "padecimientos_infancia","infecciones","alergias","fracturas","cirugias","transfuciones","gpo_rh","Vacunaciones","Enfermedades_actuales","ipa_respiratorio","ipa_digestivo","ipa_urinario","ipa_endorcinos","ipa_sistema_nerviso","ipa_sistema_muscular","ipa_tegumentos","peso","talla","temperatura","presion","frecuencia respiratoria","frecuencia cardiaca","glucosa","oximetria","inspeccion_general","fecha_examenes","diagnostico","tratamiento","pronostico","consulta_subsiguiente"};
        String [] registros = new String [60];
        String sql = "SELECT * FROM historial_clinico WHERE nombre_paciente LIKE '%"+valor+"%'";
        model = new DefaultTableModel(null,titulos);
        conectar cc = new conectar();
        Connection cn = cc.conexion();
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            registros[0]=rs.getString("id_historial");
            registros[1]=rs.getString("fecha_registro");
            registros[2]=rs.getString("nombre_paciente");
            registros[3]=rs.getString("fecha_nacimiento");
            registros[4]=rs.getString("edad");
            registros[5]=rs.getString("sexo");
            registros[6]=rs.getString("tel");
            registros[7]=rs.getString("direcc");
            registros[8]=rs.getString("estado_civil");
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
            registros[32]=rs.getString("alergias");
            registros[33]=rs.getString("fracturas");
            registros[34]=rs.getString("cirugias");
            registros[35]=rs.getString("transfuciones");
            registros[36]=rs.getString("gpo_rh");
            registros[37]=rs.getString("Vacunaciones");
            registros[38]=rs.getString("Enfermedades_actuales");
            registros[39]=rs.getString("ipa_respiratorio");
            registros[40]=rs.getString("ipa_digestivo");
            registros[41]=rs.getString("ipa_urinario");
            registros[42]=rs.getString("ipa_endorcinos");
            registros[43]=rs.getString("ipa_sistema_nerviso");
            registros[44]=rs.getString("ipa_sistema_muscular");
            registros[45]=rs.getString("ipa_tegumentos");
            registros[46]=rs.getString("peso");
            registros[47]=rs.getString("talla");
            registros[48]=rs.getString("temperatura");
            registros[49]=rs.getString("presion");
            registros[50]=rs.getString("f_respiratoria");
            registros[51]=rs.getString("f_cardiaca");
            registros[52]=rs.getString("glucosa");
            registros[53]=rs.getString("oximetria");
            registros[54]=rs.getString("inspeccion_general");
            registros[55]=rs.getString("fecha_examenes");
            registros[56]=rs.getString("diagnostico");
            registros[57]=rs.getString("tratamiento");
            registros[58]=rs.getString("pronostico");
            registros[59]=rs.getString("consulta_subsiguiente");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtbuscarnombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tpacientes = new javax.swing.JTable();

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
        jScrollPane3.setViewportView(tpacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 3507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarnombreKeyReleased
       cargar(txtbuscarnombre.getText());
    }//GEN-LAST:event_txtbuscarnombreKeyReleased

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
            java.util.logging.Logger.getLogger(buscarhistorialclinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarhistorialclinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarhistorialclinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarhistorialclinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarhistorialclinico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tpacientes;
    private javax.swing.JTextField txtbuscarnombre;
    // End of variables declaration//GEN-END:variables
}
