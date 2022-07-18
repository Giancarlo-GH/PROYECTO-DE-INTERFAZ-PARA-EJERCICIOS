package MenuFormulario;
import java.awt.Color;
public class Register extends javax.swing.JFrame {
    Mensajes pc = new Mensajes();
    static String usuario,pass1,pass2;
    public Register() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        txtUser.setBackground(new Color(0,0,0,0));
        txtPass.setBackground(new Color(0,0,0,0));
        txtPass2.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);//para centrar la consola
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        LblPersona = new javax.swing.JLabel();
        LblUsua = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblContraseña = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        LblContra1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblesperando = new javax.swing.JLabel();
        txtPass2 = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        LblContra3 = new javax.swing.JLabel();
        lblContraseña2 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        LblWelcome = new javax.swing.JLabel();
        LblPingui = new javax.swing.JLabel();
        LblBlanco = new javax.swing.JLabel();
        LblAzul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(157, 190, 230));
        jSeparator3.setForeground(new java.awt.Color(157, 190, 230));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 10));

        LblPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logopersona.png"))); // NOI18N
        jPanel1.add(LblPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 90, 90));

        LblUsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginPersona.png"))); // NOI18N
        jPanel1.add(LblUsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Nombre de Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        txtUser.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(null);
        txtUser.setOpaque(false);
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 220, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 280, 10));

        lblContraseña.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Ingrese Contraseña");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        txtPass.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        txtPass.setOpaque(false);
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 220, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 280, 10));

        LblContra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginContra.png"))); // NOI18N
        jPanel1.add(LblContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(157, 195, 230));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton2.png"))); // NOI18N
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegister.setFocusPainted(false);
        btnRegister.setFocusable(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 120, 50));

        lblesperando.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        lblesperando.setForeground(new java.awt.Color(255, 255, 255));
        lblesperando.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblesperando, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 280, 30));

        txtPass2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        txtPass2.setForeground(new java.awt.Color(255, 255, 255));
        txtPass2.setBorder(null);
        txtPass2.setOpaque(false);
        txtPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPass2FocusGained(evt);
            }
        });
        txtPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 220, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 280, 10));

        LblContra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginContra.png"))); // NOI18N
        jPanel1.add(LblContra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        lblContraseña2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblContraseña2.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña2.setText("Confirmar Contraseña");
        jPanel1.add(lblContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        btncerrar.setBackground(new java.awt.Color(255, 255, 255));
        btncerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(255, 255, 255));
        btncerrar.setText("X");
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncerrar.setFocusPainted(false);
        btncerrar.setFocusable(false);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        LblWelcome.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        LblWelcome.setForeground(new java.awt.Color(157, 195, 255));
        LblWelcome.setText("REGISTER");
        jPanel1.add(LblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        LblPingui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pinguino.png"))); // NOI18N
        jPanel1.add(LblPingui, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        LblBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/celeste2.png"))); // NOI18N
        LblBlanco.setToolTipText("");
        jPanel1.add(LblBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 410, 470));

        LblAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blanco2.png"))); // NOI18N
        jPanel1.add(LblAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        usuario=txtUser.getText();
        pass1=String.valueOf(txtPass.getPassword());
        pass2=String.valueOf(txtPass2.getPassword());
        if(usuario.isEmpty() && pass1.isEmpty() && pass2.isEmpty())
        {
            pc.Condi6();
            pc.setVisible(true);
        }else{
            if(usuario.isEmpty()){
                pc.Condi2();
                pc.setVisible(true);
            }else{
                if(pass1.isEmpty()){
                    pc.Condi3();
                    pc.setVisible(true);
                }else{
                    if(pass2.isEmpty()){
                        pc.Condi4();
                        pc.setVisible(true);
                    }else{
                        if(pass1.compareTo(pass2)!=0){
                            pc.Condi5();
                            pc.setVisible(true);
                            limpiar();
                        }else{
                            lblesperando.setText("¡El usuario ha sido registrado!");
                        }
                    }
                } 
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtPass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPass2FocusGained

    private void txtPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPass2ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed

    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained

    }//GEN-LAST:event_txtPassFocusGained

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained

    }//GEN-LAST:event_txtUserFocusGained

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       Login_Password S1=new Login_Password();
        S1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public String Usuario(){
        return usuario;
    }
    public String Pass(){
        return pass1;
    }
    public void limpiar() {
        txtPass.setText("");
        txtPass2.setText("");
        txtPass.requestFocus();
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAzul;
    private javax.swing.JLabel LblBlanco;
    private javax.swing.JLabel LblContra1;
    private javax.swing.JLabel LblContra3;
    private javax.swing.JLabel LblPersona;
    private javax.swing.JLabel LblPingui;
    private javax.swing.JLabel LblUsua;
    private javax.swing.JLabel LblWelcome;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btncerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblesperando;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
