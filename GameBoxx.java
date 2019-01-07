import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class GameBoxx extends javax.swing.JFrame {

    private String startGame="X";
    private double xCount=0;
    private double oCount=0;
    
    
    public GameBoxx() {
        initComponents();
      
    }

     public GameBoxx(String a,String b) {
        initComponents();
        jLabel1.setText(a+"-(X)");
        jLabel3.setText(b+"-(O)");
        setSize(868,500);
        setLocationRelativeTo(null);
    }
     private void gameScore(){
            
       
            jplayerx.setText(String.valueOf(xCount));
            jplayero.setText(String.valueOf(oCount));
        }
        
        private void choseAPlayer(){
            if(startGame.equalsIgnoreCase("X") ){
            startGame="O";
            }
            else{
                startGame="X";
            }
        }
        
        private void winner(){
            
            String a1=jButton1.getText();
            String a2=jButton2.getText();
            String a3=jButton3.getText();
            String a4=jButton4.getText();
            String a5=jButton5.getText();
            
            String a6=jButton6.getText();
            String a7=jButton7.getText();
            String a8=jButton8.getText();
            String a9=jButton9.getText();
            String a10=jButton10.getText();
            
            String a11=jButton11.getText();
            String a12=jButton12.getText();
            String a13=jButton13.getText();
            String a14=jButton14.getText();
            String a15=jButton15.getText();
            
            String a16=jButton16.getText();
            String a17=jButton17.getText();
            String a18=jButton18.getText();
            String a19=jButton19.getText();
            String a20=jButton20.getText();
            
            String a21=jButton21.getText();
            String a22=jButton22.getText();
            String a23=jButton23.getText();
            String a24=jButton24.getText();
            String a25=jButton25.getText();
            
        if(a1==("X") && a2==("X") && a3==("X") && a4==("X") && a5==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.GRAY);
            jButton2.setBackground(Color.GRAY);
            jButton3.setBackground(Color.GRAY);
            jButton4.setBackground(Color.GRAY);
            jButton5.setBackground(Color.GRAY);

                        
            
        } 
        if(a6==("X") && a7==("X") && a8==("X") && a9==("X") && a10==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton6.setBackground(Color.GRAY);
            jButton7.setBackground(Color.GRAY);
            jButton8.setBackground(Color.GRAY);
            jButton9.setBackground(Color.GRAY);
            jButton10.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a11==("X") && a12==("X") && a13==("X") && a14==("X") && a15==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton11.setBackground(Color.GRAY);
            jButton12.setBackground(Color.GRAY);
            jButton13.setBackground(Color.GRAY);
            jButton14.setBackground(Color.GRAY);
            jButton15.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a16==("X") && a17==("X") && a18==("X") && a19==("X") && a20==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton16.setBackground(Color.GRAY);
            jButton17.setBackground(Color.GRAY);
            jButton18.setBackground(Color.GRAY);
            jButton19.setBackground(Color.GRAY);
            jButton20.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a21==("X") && a22==("X") && a23==("X") && a24==("X") && a25==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton21.setBackground(Color.GRAY);
            jButton22.setBackground(Color.GRAY);
            jButton23.setBackground(Color.GRAY);
            jButton24.setBackground(Color.GRAY);
            jButton25.setBackground(Color.GRAY);

                        
            
        } 
        if(a1==("X") && a6==("X") && a11==("X") && a16==("X") && a21==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.GRAY);
            jButton6.setBackground(Color.GRAY);
            jButton11.setBackground(Color.GRAY);
            jButton16.setBackground(Color.GRAY);
            jButton21.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a1==("X") && a7==("X") && a13==("X") && a19==("X") && a25==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.GRAY);
            jButton7.setBackground(Color.GRAY);
            jButton13.setBackground(Color.GRAY);
            jButton19.setBackground(Color.GRAY);
            jButton25.setBackground(Color.GRAY);

                        
            
        } 
        if(a5==("X") && a10==("X") && a15==("X") && a20==("X") && a25==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X)WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton5.setBackground(Color.GRAY);
            jButton10.setBackground(Color.GRAY);
            jButton15.setBackground(Color.GRAY);
            jButton20.setBackground(Color.GRAY);
            jButton25.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a5==("X") && a9==("X") && a13==("X") && a17==("X") && a21==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton5.setBackground(Color.GRAY);
            jButton9.setBackground(Color.GRAY);
            jButton13.setBackground(Color.GRAY);
            jButton17.setBackground(Color.GRAY);
            jButton21.setBackground(Color.GRAY);

                        
       
        }
        
         //
        if(a2==("X") && a7==("X") && a12==("X") && a17==("X") && a22==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.GRAY);
            jButton7.setBackground(Color.GRAY);
            jButton12.setBackground(Color.GRAY);
            jButton17.setBackground(Color.GRAY);
            jButton22.setBackground(Color.GRAY);

                        
            
        } 
        if(a3==("X") && a8==("X") && a13==("X") && a18==("X") && a23==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.GRAY);
            jButton8.setBackground(Color.GRAY);
            jButton13.setBackground(Color.GRAY);
            jButton18.setBackground(Color.GRAY);
            jButton23.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a4==("X") && a9==("X") && a14==("X") && a19==("X") && a24==("X")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (X) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton4.setBackground(Color.GRAY);
            jButton9.setBackground(Color.GRAY);
            jButton14.setBackground(Color.GRAY);
            jButton19.setBackground(Color.GRAY);
            jButton24.setBackground(Color.GRAY);

                        
            
        } 

         if(a1==("O") && a2==("O") && a3==("O") && a4==("O") && a5==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.GRAY);
            jButton2.setBackground(Color.GRAY);
            jButton3.setBackground(Color.GRAY);
            jButton4.setBackground(Color.GRAY);
            jButton5.setBackground(Color.GRAY);

                        
            
        } 
        if(a6==("O") && a7==("O") && a8==("O") && a9==("O") && a10==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton6.setBackground(Color.GRAY);
            jButton7.setBackground(Color.GRAY);
            jButton8.setBackground(Color.GRAY);
            jButton9.setBackground(Color.GRAY);
            jButton10.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a11==("O") && a12==("O") && a13==("O") && a14==("O") && a15==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton11.setBackground(Color.GRAY);
            jButton12.setBackground(Color.GRAY);
            jButton13.setBackground(Color.GRAY);
            jButton14.setBackground(Color.GRAY);
            jButton15.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a16==("O") && a17==("O") && a18==("O") && a19==("O") && a20==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton16.setBackground(Color.GRAY);
            jButton17.setBackground(Color.GRAY);
            jButton18.setBackground(Color.GRAY);
            jButton19.setBackground(Color.GRAY);
            jButton20.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a21==("O") && a22==("O") && a23==("O") && a24==("O") && a25==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton21.setBackground(Color.GRAY);
            jButton22.setBackground(Color.GRAY);
            jButton23.setBackground(Color.GRAY);
            jButton24.setBackground(Color.GRAY);
            jButton25.setBackground(Color.GRAY);

                        
            
        } 
        if(a1==("O") && a6==("O") && a11==("O") && a16==("O") && a21==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.GRAY);
            jButton6.setBackground(Color.GRAY);
            jButton11.setBackground(Color.GRAY);
            jButton16.setBackground(Color.GRAY);
            jButton21.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a1==("O") && a7==("O") && a13==("O") && a19==("O") && a25==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.GRAY);
            jButton7.setBackground(Color.GRAY);
            jButton13.setBackground(Color.GRAY);
            jButton19.setBackground(Color.GRAY);
            jButton25.setBackground(Color.GRAY);

                        
            
        } 
        if(a5==("O") && a10==("O") && a15==("O") && a20==("O") && a25==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton5.setBackground(Color.GRAY);
            jButton10.setBackground(Color.GRAY);
            jButton15.setBackground(Color.GRAY);
            jButton20.setBackground(Color.GRAY);
            jButton25.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a5==("O") && a9==("O") && a13==("O") && a17==("O") && a21==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton5.setBackground(Color.GRAY);
            jButton9.setBackground(Color.GRAY);
            jButton13.setBackground(Color.GRAY);
            jButton17.setBackground(Color.GRAY);
            jButton21.setBackground(Color.GRAY);

                        
            
        } 
        //
        if(a2==("O") && a7==("O") && a12==("O") && a17==("O") && a22==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton2.setBackground(Color.GRAY);
            jButton7.setBackground(Color.GRAY);
            jButton12.setBackground(Color.GRAY);
            jButton17.setBackground(Color.GRAY);
            jButton22.setBackground(Color.GRAY);

                        
            
        } 
        if(a3==("O") && a8==("O") && a13==("O") && a18==("O") && a23==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.GRAY);
            jButton8.setBackground(Color.GRAY);
            jButton13.setBackground(Color.GRAY);
            jButton18.setBackground(Color.GRAY);
            jButton23.setBackground(Color.GRAY);

                        
            
        } 
        
        if(a4==("O") && a9==("O") && a14==("O") && a19==("O") && a24==("O")){
            
            JOptionPane.showMessageDialog(this,"PLAYER (O) WINNER WINNER CHICKEN DINER!!","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton4.setBackground(Color.GRAY);
            jButton9.setBackground(Color.GRAY);
            jButton14.setBackground(Color.GRAY);
            jButton19.setBackground(Color.GRAY);
            jButton24.setBackground(Color.GRAY);

                        
            
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jplayerx = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jplayero = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe - Game Tab");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 90, 80);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(110, 10, 90, 80);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(210, 10, 90, 80);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(310, 10, 90, 80);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(410, 10, 90, 80);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(10, 100, 90, 80);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);
        jPanel8.setBounds(110, 100, 90, 80);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);
        jPanel9.setBounds(210, 100, 90, 80);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);
        jPanel10.setBounds(310, 100, 90, 80);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel11);
        jPanel11.setBounds(410, 100, 90, 80);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel12);
        jPanel12.setBounds(10, 190, 90, 80);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel13);
        jPanel13.setBounds(110, 190, 90, 80);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel14);
        jPanel14.setBounds(210, 190, 90, 80);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton14, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel15);
        jPanel15.setBounds(310, 190, 90, 80);

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton15, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel16);
        jPanel16.setBounds(410, 190, 90, 80);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton16, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel17);
        jPanel17.setBounds(10, 280, 90, 80);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton17.setBackground(new java.awt.Color(204, 204, 204));
        jButton17.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton17, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel18);
        jPanel18.setBounds(110, 280, 90, 80);

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jButton18.setBackground(new java.awt.Color(204, 204, 204));
        jButton18.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton18, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel19);
        jPanel19.setBounds(210, 280, 90, 80);

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jButton19.setBackground(new java.awt.Color(204, 204, 204));
        jButton19.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton19, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel20);
        jPanel20.setBounds(310, 280, 90, 80);

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jButton20.setBackground(new java.awt.Color(204, 204, 204));
        jButton20.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton20, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel21);
        jPanel21.setBounds(410, 280, 90, 80);

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jButton21.setBackground(new java.awt.Color(204, 204, 204));
        jButton21.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton21, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel22);
        jPanel22.setBounds(10, 370, 90, 80);

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jButton22.setBackground(new java.awt.Color(204, 204, 204));
        jButton22.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton22, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel23);
        jPanel23.setBounds(110, 370, 90, 80);

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jButton23.setBackground(new java.awt.Color(204, 204, 204));
        jButton23.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton23, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel24);
        jPanel24.setBounds(210, 370, 90, 80);

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jButton24.setBackground(new java.awt.Color(204, 204, 204));
        jButton24.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton24, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel25);
        jPanel25.setBounds(310, 370, 90, 80);

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jButton25.setBackground(new java.awt.Color(204, 204, 204));
        jButton25.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton25, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel26);
        jPanel26.setBounds(410, 370, 90, 80);

        jPanel27.setBackground(new java.awt.Color(153, 153, 153));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jplayerx.setBackground(new java.awt.Color(0, 102, 102));
        jplayerx.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jplayerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel27.add(jplayerx, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel27);
        jPanel27.setBounds(700, 100, 140, 80);

        jPanel28.setBackground(new java.awt.Color(153, 153, 153));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jplayero.setBackground(new java.awt.Color(0, 102, 102));
        jplayero.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jplayero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel28.add(jplayero, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel28);
        jPanel28.setBounds(700, 190, 140, 80);

        jPanel29.setBackground(new java.awt.Color(153, 153, 153));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel29.setLayout(new java.awt.BorderLayout());

        jButton26.setBackground(new java.awt.Color(102, 102, 102));
        jButton26.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton26.setText("Reset");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel29.add(jButton26, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel29);
        jPanel29.setBounds(510, 280, 330, 80);

        jPanel30.setBackground(new java.awt.Color(153, 153, 153));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel30.setLayout(new java.awt.BorderLayout());

        jButton27.setBackground(new java.awt.Color(102, 102, 102));
        jButton27.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton27.setText("Exit");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton27, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel30);
        jPanel30.setBounds(510, 370, 330, 80);

        jPanel31.setBackground(new java.awt.Color(0, 102, 102));
        jPanel31.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("   SCORE BOARD");
        jPanel31.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel31);
        jPanel31.setBounds(510, 10, 330, 80);

        jPanel32.setBackground(new java.awt.Color(153, 153, 153));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel32.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-(X)");
        jPanel32.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel32);
        jPanel32.setBounds(510, 100, 180, 80);

        jPanel33.setBackground(new java.awt.Color(153, 153, 153));
        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel33.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-(O)");
        jLabel3.setToolTipText("");
        jPanel33.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel33);
        jPanel33.setBounds(510, 190, 180, 80);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        
        frame =new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Are You Sure Want To Quit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
        
        System.exit(0);
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton1.setForeground(Color.red);
            }
            else{
                jButton1.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton2.setForeground(Color.red);
            }
            else{
                jButton2.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton3.setForeground(Color.red);
            }
            else{
                jButton3.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton4.setForeground(Color.red);
            }
            else{
                jButton4.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton5.setForeground(Color.red);
            }
            else{
                jButton5.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton6.setForeground(Color.red);
            }
            else{
                jButton6.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton7.setForeground(Color.red);
            }
            else{
                jButton7.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton8.setForeground(Color.red);
            }
            else{
                jButton8.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton9.setForeground(Color.red);
            }
            else{
                jButton9.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton10.setForeground(Color.red);
            }
            else{
                jButton10.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton11.setForeground(Color.red);
            }
            else{
                jButton11.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton12.setForeground(Color.red);
            }
            else{
                jButton12.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton13.setForeground(Color.red);
            }
            else{
                jButton13.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton14.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton14.setForeground(Color.red);
            }
            else{
                jButton14.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton15.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton15.setForeground(Color.red);
            }
            else{
                jButton15.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jButton16.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton16.setForeground(Color.red);
            }
            else{
                jButton16.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jButton17.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton17.setForeground(Color.red);
            }
            else{
                jButton17.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jButton18.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton18.setForeground(Color.red);
            }
            else{
                jButton18.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jButton19.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton19.setForeground(Color.red);
            }
            else{
                jButton19.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton20.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton20.setForeground(Color.red);
            }
            else{
                jButton20.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jButton21.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton21.setForeground(Color.red);
            }
            else{
                jButton21.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       jButton22.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton22.setForeground(Color.red);
            }
            else{
                jButton22.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jButton23.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton23.setForeground(Color.red);
            }
            else{
                jButton23.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       jButton24.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton24.setForeground(Color.red);
            }
            else{
                jButton24.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jButton25.setText(startGame);
            
            if(startGame.equalsIgnoreCase("X") ){
            jButton25.setForeground(Color.red);
            }
            else{
                jButton25.setForeground(Color.blue);
            }
            
            choseAPlayer();
            winner();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        jButton10.setText(null);
        
        jButton11.setText(null);
        jButton12.setText(null);
        jButton13.setText(null);
        jButton14.setText(null);
        jButton15.setText(null);
        
        jButton16.setText(null);
        jButton17.setText(null);
        jButton18.setText(null);
        jButton19.setText(null);
        jButton20.setText(null);
        
        jButton21.setText(null);
        jButton22.setText(null);
        jButton23.setText(null);
        jButton24.setText(null);
        jButton25.setText(null);
        
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        jButton14.setBackground(Color.LIGHT_GRAY);
        jButton15.setBackground(Color.LIGHT_GRAY);
        
        
        jButton16.setBackground(Color.LIGHT_GRAY);
        jButton17.setBackground(Color.LIGHT_GRAY);
        jButton18.setBackground(Color.LIGHT_GRAY);
        jButton19.setBackground(Color.LIGHT_GRAY);
        jButton20.setBackground(Color.LIGHT_GRAY);
        
        jButton21.setBackground(Color.LIGHT_GRAY);
        jButton22.setBackground(Color.LIGHT_GRAY);
        jButton23.setBackground(Color.LIGHT_GRAY);
        jButton24.setBackground(Color.LIGHT_GRAY);
        jButton25.setBackground(Color.LIGHT_GRAY);

        
    }//GEN-LAST:event_jButton26ActionPerformed

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
            java.util.logging.Logger.getLogger(GameBoxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoxx().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jplayero;
    private javax.swing.JLabel jplayerx;
    // End of variables declaration//GEN-END:variables
}
