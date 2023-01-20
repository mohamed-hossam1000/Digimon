/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libr;
import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Yaseen
 */
public class addb extends javax.swing.JFrame {

    Connection c = libr.DBc.DBCon();
    PreparedStatement st = null;
    ResultSet rs;
    String name;
    static addb j =new addb();
    ArrayList<String> bt1 = new ArrayList();
    ArrayList<String> ba1 = new ArrayList();
    ArrayList<String> bp1 = new ArrayList();
    public addb() {
        initComponents();
        updateBP();
        updateBT();
        updateBA();
        this.setLocationRelativeTo(null);
               
    }
    public void updateBP(){
        try {
                    bp1.clear();
                    st = c.prepareStatement("SELECT * FROM BOOK_Publisher");
                    rs = st.executeQuery();
                    int co = 0; 
                    while(rs.next()){
                        bp.addItem(rs.getString("PUBLISHER"));
                        bp1.add(co,rs.getString("PUBLISHER_ID"));
                        co++;
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public void updateBT(){
                try {
                    bt1.clear();
                    st = c.prepareStatement("SELECT * FROM BOOK_TYPE");
                    rs = st.executeQuery();
                    int co = 0;
                    while(rs.next()){
                        bt.addItem(rs.getString("TYPE"));
                        bt1.add(co,rs.getString("TYPE_ID"));
                        co++;
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    public void updateBA(){
                try {
                    ba1.clear();
                    st = c.prepareStatement("SELECT * FROM BOOK_AUTHOR");
                    rs = st.executeQuery();
                    int co = 0;
                    while(rs.next()){
                        ba.addItem(rs.getString("AUTHOR"));
                        ba1.add(co,rs.getString("AUTHOR_ID"));
                        co++;
                    }    
                } catch (SQLException ex) {
                    Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ba = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bp = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        bt = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        bs = new javax.swing.JTextField();
        anp = new javax.swing.JButton();
        ant = new javax.swing.JButton();
        ana = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(67, 105, 221));
        jLabel2.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 54, 113));
        jLabel2.setText("BOOK's Name :");

        bn.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 54, 113));
        jLabel3.setText("BOOK's Author :");

        ba.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 54, 113));
        jLabel4.setText("BOOK's Publisher :");

        bp.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 54, 113));
        jLabel5.setText("BOOK's Type :");

        bt.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 54, 113));
        jLabel6.setText("BOOK's Stock :");

        bs.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N

        anp.setBackground(new java.awt.Color(34, 54, 113));
        anp.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        anp.setForeground(new java.awt.Color(255, 255, 255));
        anp.setText("Add a new Publisher");
        anp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anpActionPerformed(evt);
            }
        });

        ant.setBackground(new java.awt.Color(34, 54, 113));
        ant.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        ant.setForeground(new java.awt.Color(255, 255, 255));
        ant.setText("Add a new Type");
        ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antActionPerformed(evt);
            }
        });

        ana.setBackground(new java.awt.Color(34, 54, 113));
        ana.setFont(new java.awt.Font("Prototype", 0, 14)); // NOI18N
        ana.setForeground(new java.awt.Color(255, 255, 255));
        ana.setText("Add a new Author");
        ana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(34, 54, 113));
        add.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(34, 54, 113));

        jLabel1.setFont(new java.awt.Font("Prototype", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add a new Book");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libr/Digimon-logos_transparent.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(34, 54, 113));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MAIN MENU");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(ba, 0, 302, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(bs)
                        .addComponent(bn))
                    .addComponent(ana, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(bt, 0, 302, Short.MAX_VALUE))
                    .addComponent(ant, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ba, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bs, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ant)
                            .addComponent(ana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anpActionPerformed
        String add = JOptionPane.showInputDialog(this, "Enter the Publisher's name : ");
        try {
            st = c.prepareStatement("INSERT INTO BOOK_PUBLISHER (PUBLISHER) VALUES (?)");
            st.setString(1, add);
            st.executeUpdate();
            bp.removeAllItems();
            updateBP();
        } catch (SQLException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anpActionPerformed

    private void anaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaActionPerformed
        String add = JOptionPane.showInputDialog(this, "Enter the Author's name : ");
        try {
            st = c.prepareStatement("INSERT INTO BOOK_AUTHOR (AUTHOR) VALUES (?)");
            st.setString(1, add);
            st.executeUpdate();
            ba.removeAllItems();
            updateBA();
        } catch (SQLException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anaActionPerformed

    private void antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antActionPerformed
        String add = JOptionPane.showInputDialog(this, "Enter the Type : ");
        try {
            st = c.prepareStatement("INSERT INTO BOOK_TYPE (TYPE) VALUES (?)");
            st.setString(1, add);
            st.executeUpdate();
            bt.removeAllItems();
            updateBT();
        } catch (SQLException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_antActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
            try{
               Integer.parseInt(bs.getText());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Enter the Stock in Integers!","Error",2);
            }
        try {
            String bookn = bn.getText();
            String books = bs.getText();
            String id = null;
            st = c.prepareStatement("INSERT INTO BOOKS (BOOK_NAME,BOOK_TYPE,BOOK_AUTHOR,BOOK_PUBLISHER,BOOK_STOCK,N_OF_RATINGS,RATING) VALUES (?,?,?,?,?,?,?)");
            st.setString(1, bookn);
            st.setString(2, (bt1.get(bt.getSelectedIndex())));
            st.setString(3, (ba1.get(ba.getSelectedIndex())));
            st.setString(4, (bp1.get(bp.getSelectedIndex())));
            st.setString(5, books);
            st.setString(6, "0");
            st.setString(7, "0");
            st.executeUpdate();
            st = c.prepareStatement("SELECT * FROM BOOKS");
            rs = st.executeQuery();
            while(rs.next()){
                if(rs.isLast()){
                id = rs.getString("BOOK_ID");
            }}
            JOptionPane.showMessageDialog(this, "Added Successfully!\nAnd the ID = "+id, "Done!", 1);
        } catch (SQLException ex) {
            Logger.getLogger(addb.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_addActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        (mainm.ab).setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

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
            java.util.logging.Logger.getLogger(addb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                (mainm.ab).setTitle("Add New BOOK");
                (mainm.ab).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton ana;
    private javax.swing.JButton anp;
    private javax.swing.JButton ant;
    private javax.swing.JComboBox<String> ba;
    private javax.swing.JTextField bn;
    private javax.swing.JComboBox<String> bp;
    private javax.swing.JTextField bs;
    private javax.swing.JComboBox<String> bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
