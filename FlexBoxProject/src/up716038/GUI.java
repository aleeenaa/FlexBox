/*
 * This is the GUI Class.
 */
package up716038;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.text.DecimalFormat;

/**
 *
 * @author up716038
 */
public class GUI extends javax.swing.JFrame {
    
    int grade, colour, amount;
    double length, width, height;
    boolean tops, corners, bottoms;
    ArrayList<Order> allOrders = new ArrayList();
    private Order order;
    private DefaultListModel listModel;
    private DecimalFormat t2dp = new DecimalFormat("####.##");

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        initListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Order_list = new javax.swing.JList();
        total_order_txt = new javax.swing.JLabel();
        remove_bt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        width_txt = new javax.swing.JTextField();
        height_txt = new javax.swing.JTextField();
        length_txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        grade_combo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        colour_combo = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        seal_cb = new javax.swing.JCheckBox();
        corners_cb = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        bottoms_cb = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        quantity_txt = new javax.swing.JTextField();
        checkout_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("FlexBox Ordering ");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        orderButton.setText("Add");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(Order_list);

        total_order_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        total_order_txt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        remove_bt.setText("Remove");
        remove_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.activeCaption, 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Size Constraints (m)");

        jLabel3.setText("Length:");

        jLabel4.setText("Height:");

        jLabel5.setText("Width:");

        height_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                height_txtActionPerformed(evt);
            }
        });

        length_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                length_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(length_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(height_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(width_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(length_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(height_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(width_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.activeCaption, 1, true));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Grade of Card");

        jLabel7.setText("Grade:");

        grade_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Colour Printing");

        jLabel9.setText("Number of Colours:");

        colour_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(grade_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colour_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(grade_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(colour_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.activeCaption, 1, true));

        seal_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seal_cbActionPerformed(evt);
            }
        });

        corners_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corners_cbActionPerformed(evt);
            }
        });

        jLabel13.setText("Reinforced Corners:");

        bottoms_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoms_cbActionPerformed(evt);
            }
        });

        jLabel12.setText("Reinforced Bottoms:");

        jLabel11.setText("Sealable Tops:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Extras");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(corners_cb))
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seal_cb)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bottoms_cb)))
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottoms_cb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(seal_cb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(corners_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(java.awt.SystemColor.activeCaption, 1, true));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Quantity");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantity_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantity_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        checkout_bt.setText("Checkout");
        checkout_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkout_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(orderButton)
                                    .addGap(14, 14, 14)
                                    .addComponent(remove_bt)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearButton)
                                    .addGap(116, 116, 116)
                                    .addComponent(checkout_bt)
                                    .addGap(18, 18, 18)
                                    .addComponent(exitButton))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(total_order_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(total_order_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderButton)
                            .addComponent(remove_bt)
                            .addComponent(clearButton)
                            .addComponent(exitButton)
                            .addComponent(checkout_bt))
                        .addContainerGap())
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoms_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoms_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bottoms_cbActionPerformed

    private void corners_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corners_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corners_cbActionPerformed

    private void seal_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seal_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seal_cbActionPerformed

    private void length_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_length_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_length_txtActionPerformed

    private void height_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_height_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_height_txtActionPerformed

    private void remove_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btActionPerformed
        removeOrder();
    }//GEN-LAST:event_remove_btActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // Error checking for input entered incorrectly, such as numbers out 
        // of range and unknown characters.
        try {
            length = Double.parseDouble(length_txt.getText());
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Please enter a valid value"
                + " for the length.",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (length < 1 || length > 5) {
            JOptionPane.showMessageDialog(this, "Please enter a length"
                + " between 1 and 5 metres.",
                "Invalid Length Value", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            height = Double.parseDouble(height_txt.getText());
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Please enter a valid value"
                + " for the height.",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (height < 1 || height > 4) {
            JOptionPane.showMessageDialog(this, "Please enter a height"
                + " between 1 and 4 metres.",
                "Invalid Height Value", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            width = Double.parseDouble(width_txt.getText());
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Please enter a valid value"
                + " for the width.",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (width < 1 || width > 5) {
            JOptionPane.showMessageDialog(this, "Please enter a width"
                + " between 1 and 5 metres.",
                "Invalid Width Value", JOptionPane.ERROR_MESSAGE);
            return;
        }
        grade = grade_combo.getSelectedIndex() + 1;
        colour = colour_combo.getSelectedIndex();
        try {
            amount = Integer.parseInt(quantity_txt.getText());
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Please enter a valid value"
                + " for the amount.",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (amount < 1 || amount > 100 ) {
            JOptionPane.showMessageDialog(this, "Please enter a minimum"
                + " amount of 1 or a maximum amount of 10 boxes.",
                "Invalid Quantity Value", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tops = seal_cb.isSelected();
        bottoms = bottoms_cb.isSelected();
        corners = corners_cb.isSelected();
        // Creates a box which will be used for comparison to see 
        // if the box type exists by calling the createBox method.
        // Adds the specified box type to the array list if match found.
        // Shows an error message if no match is found.
        BoxType box = createBox(length, height, width, grade, colour,
            bottoms, corners, tops);
        if (box == null) {
            JOptionPane.showMessageDialog(this, "Sorry, we don't make that kind"
                    + " of FlexBox.","Error", JOptionPane.ERROR_MESSAGE); }
        else {
            order = new Order(box, amount);
            allOrders.add(order);
            listModel.addElement(order.toString());
            changeTotal();
        }
    }//GEN-LAST:event_orderButtonActionPerformed
/** This event clears all the fields in the GUI. 
 */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        length_txt.setText("");
        height_txt.setText("");
        width_txt.setText("");
        grade_combo.setSelectedIndex(0);
        colour_combo.setSelectedIndex(0);
        quantity_txt.setText("");
        seal_cb.setSelected(false);
        bottoms_cb.setSelected(false);
        corners_cb.setSelected(false);
    }//GEN-LAST:event_clearButtonActionPerformed
/** This event exits the GUI. 
 */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
/** This event clears the input fields and the list.
 */
    private void checkout_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkout_btActionPerformed
        JOptionPane.showMessageDialog(this, "Thank you for shopping with us "
                + "here at FlexBox. Please Come Again!",
                "Checkout Complete", JOptionPane.INFORMATION_MESSAGE);
        clearButtonActionPerformed(evt);
        removeAllOrders();
        
    }//GEN-LAST:event_checkout_btActionPerformed

    private BoxType createBox(double length, double height, double width, 
            int grade, int colour, boolean bottoms, boolean corners, 
            boolean tops) {
        if (grade <= 3 && colour == 0 && bottoms == false && corners == false)
            return new Type1(length, height, width, grade, colour, tops);
        else if (2 <= grade && grade <= 4 && colour == 1 && bottoms == false && 
                corners == false)
            return new Type2(length, height, width, grade, colour, tops);
        else if (2 <= grade && grade <= 5 && colour == 2 && bottoms == false && 
                corners == false)
            return new Type3(length, height, width, grade, colour, tops);
        else if (2 <= grade && grade <=5 && colour == 2 && bottoms == true && 
                corners == false)
            return new Type4(length, height, width, grade, colour, bottoms,
                    tops);
        else if (3 <= grade && grade <= 5 && colour == 2 && bottoms == true && 
                corners == true)
            return new Type5(width, height, width, grade, colour, bottoms, 
                    corners, tops);
        return null;
        }
    
    private void initListModel() {
        listModel = new DefaultListModel();
        Order_list.setModel(listModel);
    }
    
    private void changeTotal() {
        double totalCost = 0;
        for(Order singleOrder : allOrders) {
            totalCost += singleOrder.totalCost();
        }
        total_order_txt.setText("Order Cost: £" + String.valueOf(t2dp.format
        (totalCost)));
    }
    
    private void removeOrder() {
        int lastSelected;
        try {
            lastSelected = Order_list.getSelectedIndex();
            allOrders.remove(lastSelected);
            listModel.remove(lastSelected);
            changeTotal();
        }
        catch(ArrayIndexOutOfBoundsException pens) {
        }
        catch(IndexOutOfBoundsException snep) {            
        }
    }
    
    private void removeAllOrders() {
        allOrders.removeAll(allOrders);
        listModel.removeAllElements();
        changeTotal();
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Order_list;
    private javax.swing.JCheckBox bottoms_cb;
    private javax.swing.JButton checkout_bt;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox colour_combo;
    private javax.swing.JCheckBox corners_cb;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox grade_combo;
    private javax.swing.JTextField height_txt;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField length_txt;
    private javax.swing.JButton orderButton;
    private javax.swing.JTextField quantity_txt;
    private javax.swing.JButton remove_bt;
    private javax.swing.JCheckBox seal_cb;
    private javax.swing.JLabel total_order_txt;
    private javax.swing.JTextField width_txt;
    // End of variables declaration//GEN-END:variables
}
