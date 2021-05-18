
package internship;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class users extends javax.swing.JFrame {
 
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
 

    public users() {
   initComponents();   
    }
private void Fillcombobox(){
     
     
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User_name ", " User_Id", "Gender", "City", " Mobile_number  ", "Date_signed_Up"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(t1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 810, 350);

        jButton1.setText("Remove User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 360, 130, 23);

        jButton2.setText("X");
        getContentPane().add(jButton2);
        jButton2.setBounds(810, 0, 50, 30);

        jButton3.setText("Remove All Users");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 360, 130, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
         try {
             DefaultTableModel users = (DefaultTableModel) t1.getModel();
                 
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Internship","root","");
        String sql ="select user_name, user_id, Gender, City, Mobile_No, Date_signed_Up from signin";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
            if(rs.next()==true)
            {
                      String un = rs.getString("user_name");
                      String uuid= rs.getString("user_id");
                      String mob = rs.getString("Mobile_No");
                      String gend = rs.getString("Gender");
                      String city = rs.getString("City");
                      String dt = rs.getString("Date_signed_Up");
             users.addRow(new Object[] {un, uuid, mob, gend, city, dt});
           /* while(rs.next()) {
                String name =rs.getString("id");*/
              }
        }catch (ClassNotFoundException | SQLException e){
            
            JOptionPane.showMessageDialog(null, e);  
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();
      new internship.Delete_User().setVisible(true);
              

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","");
            Statement stmt=conn.createStatement();
            String qry = "(Delete * from signin)";
            pst=conn.prepareStatement(qry);
            rs= pst.executeQuery(qry);
            if(rs.next()==true)
             {
               JOptionPane.showMessageDialog(null, "All users are successfully removed....");
             }    
            else
             {
               JOptionPane.showMessageDialog(null, "There are no users in database");               
             }   
         }catch (SQLException | ClassNotFoundException ex) 
         {
            System.out.println(""+ex.getMessage());
         }         
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(() -> {
         new users().setVisible(true);
     });
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
