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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Yaseen
 */
public class searchb extends javax.swing.JFrame {
    Connection c = libr.DBc.DBCon();
    PreparedStatement st = null;
    ResultSet rs;
    String name;
    int co = 0;
    ArrayList<String> bidi = new ArrayList();
    final DefaultListModel<String> model = new DefaultListModel<>();
    public searchb() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dia = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bidbi = new javax.swing.JLabel();
        bnbi = new javax.swing.JLabel();
        babi = new javax.swing.JLabel();
        btbi = new javax.swing.JLabel();
        bpbi = new javax.swing.JLabel();
        bsbi = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        res = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        booki = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        b = new javax.swing.JButton();
        s = new javax.swing.JComboBox<>();
        sb = new javax.swing.JTextField();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(34, 54, 113));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libr/Digimon-logos_transparent.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Prototype", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Book's Info");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(35, 35, 35))
        );

        bidbi.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        bidbi.setText("The Book's ID is : ");

        bnbi.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        bnbi.setText("The Book's Name is :");

        babi.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        babi.setText("The Book's Author is :");

        btbi.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        btbi.setText("The Book's Type is :");

        bpbi.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        bpbi.setText("The Book's Publisher is :");

        bsbi.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        bsbi.setText("The Book's Stock is :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bidbi)
                    .addComponent(bnbi)
                    .addComponent(babi)
                    .addComponent(btbi)
                    .addComponent(bpbi)
                    .addComponent(bsbi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bidbi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnbi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btbi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(babi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bpbi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsbi)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout diaLayout = new javax.swing.GroupLayout(dia.getContentPane());
        dia.getContentPane().setLayout(diaLayout);
        diaLayout.setHorizontalGroup(
            diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        diaLayout.setVerticalGroup(
            diaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(34, 54, 113));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libr/Digimon-logos_transparent.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Prototype", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search for a Book Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        res.setFont(new java.awt.Font("Prototype", 0, 28)); // NOI18N
        res.setForeground(new java.awt.Color(34, 54, 113));
        res.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(res);

        jLabel3.setFont(new java.awt.Font("Prototype", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 54, 113));
        jLabel3.setText("Search By :");

        jLabel8.setFont(new java.awt.Font("Prototype", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(34, 54, 113));
        jLabel8.setText("Results :");

        booki.setBackground(new java.awt.Color(34, 54, 113));
        booki.setFont(new java.awt.Font("Prototype", 0, 36)); // NOI18N
        booki.setForeground(new java.awt.Color(255, 255, 255));
        booki.setText("Show Book's Info :");
        booki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookiActionPerformed(evt);
            }
        });

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

        b.setBackground(new java.awt.Color(34, 54, 113));
        b.setFont(new java.awt.Font("Prototype", 0, 24)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setText("Search");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        s.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N
        s.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOOK's ID", "BOOK's Name", "BOOK's Author", "BOOK's Type", "BOOK's Publisher" }));

        sb.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(booki, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(booki, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookiActionPerformed
        
        if(co == 0){
        JOptionPane.showMessageDialog(this, "NO RESULT IS SELECTED","ERROR",2);
        }else{
            dia.setVisible(true);
            dia.setBounds(500, 400, 600, 400);
            try {
            st = c.prepareStatement("SELECT books.BOOK_ID,books.BOOK_NAME,book_author.AUTHOR,book_type.TYPE,book_publisher.PUBLISHER,books.BOOK_STOCK FROM books,book_type,book_author,book_publisher WHERE BOOK_ID = ? AND (books.BOOK_AUTHOR = book_author.AUTHOR_ID) AND (books.BOOK_TYPE = book_type.TYPE_ID) AND (books.BOOK_PUBLISHER = book_publisher.PUBLISHER_ID) ORDER BY BOOK_ID");
            st.setString(1, bidi.get(res.getSelectedIndex()));
            rs = st.executeQuery();
            while(rs.next()){
                bidbi.setText("The Book's ID is : " + rs.getString("BOOK_ID"));
                bnbi.setText("The Book's Name is : " + rs.getString("BOOK_NAME"));
                btbi.setText("The Book's Type is : " + rs.getString("TYPE"));
                babi.setText("The Book's Author is : " + rs.getString("AUTHOR"));
                bpbi.setText("The Book's Publisher is : " + rs.getString("PUBLISHER"));
                bsbi.setText("The Book's Stock is : " + rs.getString("BOOK_STOCK"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(searchb.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
    }//GEN-LAST:event_bookiActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        (mainm.sb).setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        if(s.getSelectedIndex() == 0){
        res.setModel(model);
        model.removeAllElements();
        bidi.clear();
        try{
               Integer.parseInt(sb.getText());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Enter the ID in Integers!","Error",2);
            }
        name = sb.getText();
        try {
            st = c.prepareStatement("SELECT * FROM BOOKS WHERE BOOK_ID = ?");
            st.setString(1, name);
            rs = st.executeQuery();
            co = 0;
            while(rs.next()){
                model.addElement(rs.getString("BOOK_NAME"));
                bidi.add(co, rs.getString("BOOK_ID"));
                co++;
            }
            if(co==0){
                JOptionPane.showMessageDialog(this, "No Result!","NO RESULT",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(searchb.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else if(s.getSelectedIndex() == 1){
        res.setModel(model);
        model.removeAllElements();
        bidi.clear();
        name = sb.getText();
        try {
            st = c.prepareStatement("SELECT * FROM BOOKS WHERE BOOK_NAME = ?");
            st.setString(1, name);
            rs = st.executeQuery();
            co = 0;
            while(rs.next()){
                model.addElement(rs.getString("BOOK_NAME"));
                bidi.add(co, rs.getString("BOOK_ID"));
                co++;
            }
            if(co==0){
                JOptionPane.showMessageDialog(this, "No Result!","NO RESULT",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(searchb.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else if(s.getSelectedIndex() == 2){
        res.setModel(model);
        model.removeAllElements();
        bidi.clear();
        name = sb.getText();
        try {
            st = c.prepareStatement("SELECT books.BOOK_ID,books.BOOK_NAME,book_author.AUTHOR,book_type.TYPE,book_publisher.PUBLISHER,books.BOOK_STOCK FROM books,book_type,book_author,book_publisher WHERE AUTHOR = ? AND (books.BOOK_AUTHOR = book_author.AUTHOR_ID) AND (books.BOOK_TYPE = book_type.TYPE_ID) AND (books.BOOK_PUBLISHER = book_publisher.PUBLISHER_ID) ORDER BY BOOK_ID");
            st.setString(1, name);
            rs = st.executeQuery();
            co = 0;
            while(rs.next()){
                model.addElement(rs.getString("BOOK_NAME"));
                bidi.add(co, rs.getString("BOOK_ID"));
                co++;
            }
            if(co==0){
                JOptionPane.showMessageDialog(this, "No Result!","NO RESULT",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(searchb.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else if(s.getSelectedIndex() == 3){
        res.setModel(model);
        model.removeAllElements();
        bidi.clear();
        name = sb.getText();
        try {
            st = c.prepareStatement("SELECT books.BOOK_ID,books.BOOK_NAME,book_author.AUTHOR,book_type.TYPE,book_publisher.PUBLISHER,books.BOOK_STOCK FROM books,book_type,book_author,book_publisher WHERE TYPE = ? AND (books.BOOK_AUTHOR = book_author.AUTHOR_ID) AND (books.BOOK_TYPE = book_type.TYPE_ID) AND (books.BOOK_PUBLISHER = book_publisher.PUBLISHER_ID) ORDER BY BOOK_ID");
            st.setString(1, name);
            rs = st.executeQuery();
            co = 0;
            while(rs.next()){
                model.addElement(rs.getString("BOOK_NAME"));
                bidi.add(co, rs.getString("BOOK_ID"));
                co++;
            }
            if(co==0){
                JOptionPane.showMessageDialog(this, "No Result!","NO RESULT",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(searchb.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else if(s.getSelectedIndex() == 4){
        res.setModel(model);
        model.removeAllElements();
        bidi.clear();
        name = sb.getText();
        try {
            st = c.prepareStatement("SELECT books.BOOK_ID,books.BOOK_NAME,book_author.AUTHOR,book_type.TYPE,book_publisher.PUBLISHER,books.BOOK_STOCK FROM books,book_type,book_author,book_publisher WHERE PUBLISHER = ? AND (books.BOOK_AUTHOR = book_author.AUTHOR_ID) AND (books.BOOK_TYPE = book_type.TYPE_ID) AND (books.BOOK_PUBLISHER = book_publisher.PUBLISHER_ID) ORDER BY BOOK_ID");
            st.setString(1, name);
            rs = st.executeQuery();
            co = 0;
            while(rs.next()){
                model.addElement(rs.getString("BOOK_NAME"));
                bidi.add(co, rs.getString("BOOK_ID"));
                co++;
            }
            if(co==0){
                JOptionPane.showMessageDialog(this, "No Result!","NO RESULT",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(searchb.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_bActionPerformed

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
            java.util.logging.Logger.getLogger(searchb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                (mainm.sb).setBounds(450, 200, 1024, 660);
                (mainm.sb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JLabel babi;
    private javax.swing.JLabel bidbi;
    private javax.swing.JLabel bnbi;
    private javax.swing.JButton booki;
    private javax.swing.JLabel bpbi;
    private javax.swing.JLabel bsbi;
    private javax.swing.JLabel btbi;
    private javax.swing.JDialog dia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> res;
    private javax.swing.JComboBox<String> s;
    private javax.swing.JTextField sb;
    // End of variables declaration//GEN-END:variables
}
