package internship;
import Internship.LogInn;
import java.awt.Image;
import java.util.regex.Pattern;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.util.Date;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.regex.Matcher; 
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;  
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class SignUp extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    byte[] image;
    String imagepath="";
    ImageIcon myimage;
    int maxid;
    String query;
    
    
public SignUp() 
  {
    initComponents();
    dt.setEditable(false);
    dt.setVisible(false);
    browse.setVisible(false);
    accn.setEditable(false);
    browse.setEditable(false);
    Date d = new Date();  
    SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");  
    String strDate= f.format(d);  
    dt.setText(strDate);    
    inm.setVisible(false);
    agp.setVisible(false);
    
  }

void getMaxId() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Internship","root","");
        query = "Select max(ID) from SignIn;";
        Statement stmt = conn.createStatement();
        rs=stmt.executeQuery(query);
        rs.beforeFirst();
        while(rs.next())
        {
            maxid=rs.getInt(1);
            if(maxid==0)
            {
                maxid=101;
            }
            else
            {
                maxid=maxid+1;
            }
            accn.setText(""+maxid);
        }
 }

public ImageIcon section(String m,byte[] image)
{
    if(m!=null)
    {
        myimage=new ImageIcon(m);
    }else {
       myimage=new ImageIcon(image);   
    }
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(imglab.getWidth(), imglab.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        return i;
    
}
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        again = new javax.swing.JPasswordField();
        dt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cd = new javax.swing.JComboBox();
        cm = new javax.swing.JComboBox();
        cy = new javax.swing.JComboBox();
        browse = new javax.swing.JTextField();
        imglab = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        mn = new javax.swing.JTextField();
        inm = new javax.swing.JLabel();
        agp = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        st = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        accn = new javax.swing.JTextField();
        ct = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Core Techies");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 530, 80);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ID / UserName");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(700, 280, 140, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(700, 480, 150, 50);

        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(id);
        id.setBounds(890, 290, 200, 30);
        id.getAccessibleContext().setAccessibleDescription("Enter ID");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Conform Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(700, 530, 150, 50);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText(" Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(920, 660, 130, 30);

        pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass);
        pass.setBounds(890, 490, 200, 30);
        pass.getAccessibleContext().setAccessibleDescription("Enter Password");

        again.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                againActionPerformed(evt);
            }
        });
        getContentPane().add(again);
        again.setBounds(890, 540, 200, 30);
        again.getAccessibleContext().setAccessibleDescription("Enter Password Again");

        dt.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        dt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtActionPerformed(evt);
            }
        });
        getContentPane().add(dt);
        dt.setBounds(30, 70, 160, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("First Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(700, 160, 150, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(700, 240, 140, 50);

        fname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname);
        fname.setBounds(890, 150, 200, 30);
        fname.getAccessibleContext().setAccessibleDescription("Enter First Name");

        lname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(lname);
        lname.setBounds(890, 200, 200, 30);
        lname.getAccessibleContext().setAccessibleDescription("Enter Las Name");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 600, 110, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Date Of Birth");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(750, 600, 120, 22);

        cd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cd);
        cd.setBounds(870, 600, 90, 27);

        cm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmActionPerformed(evt);
            }
        });
        getContentPane().add(cm);
        cm.setBounds(960, 600, 90, 27);

        cy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", " " }));
        cy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cy);
        cy.setBounds(1050, 600, 90, 27);

        browse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        getContentPane().add(browse);
        browse.setBounds(80, 660, 340, 30);

        imglab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        getContentPane().add(imglab);
        imglab.setBounds(40, 120, 440, 450);
        imglab.getAccessibleContext().setAccessibleDescription("Profile Picture");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Add A picture");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 600, 110, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Already Have an account? ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(700, 20, 210, 40);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(970, 30, 90, 27);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Mobile Number");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(700, 340, 150, 30);

        mn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActionPerformed(evt);
            }
        });
        getContentPane().add(mn);
        mn.setBounds(890, 340, 200, 30);
        mn.getAccessibleContext().setAccessibleDescription(" Enter Mobile Number");

        inm.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        inm.setForeground(java.awt.Color.red);
        inm.setText("INVALID!");
        getContentPane().add(inm);
        inm.setBounds(1100, 340, 80, 20);

        agp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        agp.setForeground(java.awt.Color.red);
        agp.setText("INVALID!");
        getContentPane().add(agp);
        agp.setBounds(1100, 540, 80, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Account Number");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(700, 100, 150, 30);

        st.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(st);
        st.setBounds(890, 440, 200, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Last Name");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(700, 210, 130, 20);

        male.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(900, 250, 55, 25);

        female.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female);
        female.setBounds(970, 250, 93, 25);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("City ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(700, 390, 150, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("State");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(700, 440, 150, 30);

        accn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(accn);
        accn.setBounds(890, 100, 200, 30);

        ct.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(ct);
        ct.setBounds(890, 390, 200, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        {     
          String UID=id.getText();
          String fn=fname.getText();
          String ln=lname.getText();
          String mob=mn.getText();
          Pattern.matches("[8-9][0-9]{10}",mob);
          Pattern p = Pattern.compile(mn.getText());
          Matcher nm = p.matcher(mn.getText());
          if(nm.find()==false)
          {
              inm.setVisible(true);
          }
          String city=ct.getText();
          String state=st.getText();
          String password=pass.getText();
          Pattern.matches("[a-zA-Z0-9]{15}",password);
          Pattern pa = Pattern.compile(pass.getText());
          Matcher m = pa.matcher(again.getText());
     
          try{ 
                        if( pass!=null && again!=null)
                        {
                            if(m.find()==true)
                           {
                             
                               Class.forName("com.mysql.jdbc.Driver");
                               conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Internship","root","");
                               int value1=maxid;
                               String value2=fn+ln;
                               String value3=UID;
                               String value4=password;
                               String value5=mob;
                               String value6="";
                               if(male.isSelected())
                               {
                                    value6=male.getText();
                               }
                                if(female.isSelected())
                               {
                                    value6=female.getText();
                               }
                               String value7=city;
                               String value8=state;
                               String value9=cd.getSelectedItem().toString();
                               String value10=cm.getSelectedItem().toString();
                               String value11=cy.getSelectedItem().toString();
                               
                                                              
                               query = "insert into SignIn(id, user_name, user_id, user_password, Mobile_No, Gender, City, State, DOB, Date_signed_Up) values(?,?,?,?,?,?,?,?,?,?)";
                                 try{
                                         pst=conn.prepareStatement(query);
                                         pst.setString(1,accn.getText());
                                         pst.setString(2,fname.getText()+lname.getText());
                                         pst.setString(3,id.getText());
                                         pst.setString(4,pass.getText());
                                         pst.setString(5,mn.getText());
                                         pst.setString(6,value6);
                                         pst.setString(7,ct.getText());
                                         pst.setString(8,st.getText());
                                         pst.setString(9,value9+"-"+value10+"-"+value11);
                                         pst.setString(10,dt.getText());
                                         pst.executeUpdate();                                        
                                         this.dispose();
                                    }
                                 catch(Exception e)
                                 {
                                     JOptionPane.showMessageDialog(null, e);
                                 }  
                                 
                                 
                             fname.setText("");  
                             lname.setText("");
                             imglab.setIcon(null);
                             browse.setText("");
                             id.setText("");
                             mn.setText("");
                             male.setSelected(false);
                             female.setSelected(false);
                             ct.setText("");
                             st.setText("");
                             pass.setText("");
                             again.setText("");
                             cd.setSelectedIndex(0);
                             cm.setSelectedIndex(0);
                             cy.setSelectedIndex(0);
                             JOptionPane.showMessageDialog(null,"Welcome! " + fn + " " + ln +"\n You're successfully signed up");
                             
                             
                             dispose();
                             new LogInn().setVisible(true);
                             
                                             
                             
                           }  }
                      else 
                           {
                            agp.setVisible(true);
                            JOptionPane.showMessageDialog(null,"You Entered Wrong password, Try Again..............");
                           }
            }catch(Exception e){System.out.println(e);}
          
          
                  
    }//GEN-LAST:event_jButton1ActionPerformed
       }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        JFileChooser ch= new JFileChooser();
        ch.setCurrentDirectory(new File("user dir"));
        FileNameExtensionFilter fil=new FileNameExtensionFilter("All Pic", "png", "jpg", "jpeg", "gif");                
        ch.addChoosableFileFilter(fil);
        int a=ch.showOpenDialog(null);
        if(a==JFileChooser.APPROVE_OPTION)
        {
            File f=ch.getSelectedFile();  
            String p=f.getAbsolutePath();
            browse.setText(ch.getSelectedFile().getAbsolutePath());
            imglab.setIcon(section(p, image));
        }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtActionPerformed
     
     
              
    }//GEN-LAST:event_dtActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_browseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new LogInn().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
        getMaxId();
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Internship","root","");
            
           }catch (ClassNotFoundException | SQLException e)
           {
            JOptionPane.showMessageDialog(null, e);
           }
    }//GEN-LAST:event_formWindowOpened

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnActionPerformed

    private void againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_againActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_againActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        
        male.setSelected(true);
        female.setSelected(false);
       
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
               male.setSelected(false);
        female.setSelected(true);
    }//GEN-LAST:event_femaleActionPerformed

    private void cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmActionPerformed

    
    public static void main(String args[]) 
  {
     
    java.awt.EventQueue.invokeLater
        (() -> {
            new SignUp().setVisible(true);
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accn;
    private javax.swing.JPasswordField again;
    private javax.swing.JLabel agp;
    private javax.swing.JTextField browse;
    private javax.swing.JComboBox cd;
    private javax.swing.JComboBox cm;
    private javax.swing.JTextField ct;
    private javax.swing.JComboBox cy;
    private javax.swing.JTextField dt;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imglab;
    private javax.swing.JLabel inm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mn;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField st;
    // End of variables declaration//GEN-END:variables

   
}
