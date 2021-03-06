
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
public class Test3 extends javax.swing.JFrame {

    double precio;
    double precioMasa;
    double suplementoTipo;
    double suplementoIngredientes;
    double porcentajeTamaño = 1.0;
    double suplemento = 0.0;
    double PRECIO_NORMAL = 9.0;
    double PRECIO_INTEGRAL = 9.5;
    double sumaIngredientes;
    String opcionMasa;
    String opcionTipo;
    String opcionTamaño;
    
    DecimalFormat dosDec = new DecimalFormat("0.00");
    
    public Test3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoMasa = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        masaNormal = new javax.swing.JRadioButton();
        masaIntegral = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        tipoPizza = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredienteExtra = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        tamaño = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        panelInformacion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        etiquetaMasa = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        etiquetaTipo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        etiquetaIngrediente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        etiquetaTamaño = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Masa");

        jLabel2.setText("Tipo Pizza");

        jLabel3.setText("Ingredientes Extra");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tipoMasa.add(masaNormal);
        masaNormal.setText("Normal");
        masaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masaNormalActionPerformed(evt);
            }
        });

        tipoMasa.add(masaIntegral);
        masaIntegral.setText("Integral");
        masaIntegral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masaIntegralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(masaIntegral)
                    .addComponent(masaNormal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(masaNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masaIntegral)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tipoPizza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Básica", "Cuatro quesos", "Barbacoa", "Mexicana" }));
        tipoPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ingredienteExtra.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Sin ingrediente extra", "Jamón", "Queso", "Tomate", "Cebollas", "Olivas" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ingredienteExtra.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ingredienteExtraValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ingredienteExtra);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel4.setText("Tamaño");

        tamaño.setModel(new javax.swing.SpinnerListModel(new String[] {"Pequeña", "Mediana", "Familiar"}));
        tamaño.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tamañoStateChanged(evt);
            }
        });

        jLabel5.setText("Pedido");

        panelInformacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("MASA");

        etiquetaMasa.setText("0");

        jLabel7.setText("TIPO PIZZA");

        etiquetaTipo.setText("0");

        jLabel8.setText("INGREDIENTE EXTRA");

        etiquetaIngrediente.setText("0");

        jLabel9.setText("TAMAÑO");

        etiquetaTamaño.setText("0");

        jLabel10.setText("TOTAL");

        etiquetaTotal.setText("0");

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(73, 73, 73)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTotal)
                    .addComponent(etiquetaTamaño)
                    .addComponent(etiquetaIngrediente)
                    .addComponent(etiquetaTipo)
                    .addComponent(etiquetaMasa))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(etiquetaMasa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(etiquetaTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(etiquetaIngrediente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(etiquetaTamaño))
                .addGap(18, 18, 18)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(etiquetaTotal))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(panelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masaNormalActionPerformed
        precioMasa = PRECIO_NORMAL;
        etiquetaMasa.setText(dosDec.format(precioMasa));
        opcionTipo = tipoPizza.getSelectedItem().toString();
        switch(opcionTipo){
            case "Básica":
                suplementoTipo = 3.0;
                break;
            case "Cuatro quesos":
                suplementoTipo = 5.0;
                break;
            case "Barbacoa":
                suplementoTipo = 7.0;
                break;
            case "Mexicana":
                suplementoTipo = 8.5;
         }
        etiquetaTipo.setText(dosDec.format(suplementoTipo));
        opcionTamaño = tamaño.getModel().getValue().toString();
        switch(opcionTamaño){
            case "Pequeña":
                porcentajeTamaño = 1;
                break;
            case "Mediana":
                porcentajeTamaño = 1.15;
                break;
            case "Familiar":
                porcentajeTamaño = 1.3;
        }
        precio = 0.0;
        precio = (precioMasa + suplementoTipo + suplementoIngredientes)*porcentajeTamaño;
        etiquetaTamaño.setText(dosDec.format((precioMasa + suplementoTipo + suplementoIngredientes)*(porcentajeTamaño-1)));
        etiquetaTotal.setText(dosDec.format(precio));
    }//GEN-LAST:event_masaNormalActionPerformed

    private void masaIntegralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masaIntegralActionPerformed
        precioMasa = PRECIO_INTEGRAL;
        etiquetaMasa.setText(dosDec.format(precioMasa));
        opcionTipo = tipoPizza.getSelectedItem().toString();
        switch(opcionTipo){
            case "Básica":
                suplementoTipo = 3.0;
                break;
            case "Cuatro quesos":
                suplementoTipo = 5.0;
                break;
            case "Barbacoa":
                suplementoTipo = 7.0;
                break;
            case "Mexicana":
                suplementoTipo = 8.5;
         }
        etiquetaTipo.setText(dosDec.format(suplementoTipo));
        opcionTamaño = tamaño.getModel().getValue().toString();
        switch(opcionTamaño){
            case "Pequeña":
                porcentajeTamaño = 1;
                break;
            case "Mediana":
                porcentajeTamaño = 1.15;
                break;
            case "Familiar":
                porcentajeTamaño = 1.3;
        }
        precio = 0.0;
        precio = (precioMasa + suplementoTipo + suplementoIngredientes)*porcentajeTamaño;
        etiquetaTamaño.setText(dosDec.format((precioMasa + suplementoTipo + suplementoIngredientes)*(porcentajeTamaño-1)));
        etiquetaTotal.setText(dosDec.format(precio));
    }//GEN-LAST:event_masaIntegralActionPerformed

    private void tipoPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPizzaActionPerformed
        opcionTipo = tipoPizza.getSelectedItem().toString();
        switch(opcionTipo){
            case "Básica":
                suplementoTipo = 3.0;
                break;
            case "Cuatro quesos":
                suplementoTipo = 5.0;
                break;
            case "Barbacoa":
                suplementoTipo = 7.0;
                break;
            case "Mexicana":
                suplementoTipo = 8.5;
         }
        etiquetaTipo.setText(dosDec.format(suplementoTipo));
        opcionTamaño = tamaño.getModel().getValue().toString();
        switch(opcionTamaño){
            case "Pequeña":
                porcentajeTamaño = 1;
                break;
            case "Mediana":
                porcentajeTamaño = 1.15;
                break;
            case "Familiar":
                porcentajeTamaño = 1.3;
        }
        precio = 0.0;
        precio = (precioMasa + suplementoTipo + suplementoIngredientes)*porcentajeTamaño;
        etiquetaTamaño.setText(dosDec.format((precioMasa + suplementoTipo + suplementoIngredientes)*(porcentajeTamaño-1)));
        etiquetaTotal.setText(dosDec.format(precio));
    }//GEN-LAST:event_tipoPizzaActionPerformed

    private void ingredienteExtraValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ingredienteExtraValueChanged
        suplementoIngredientes = 0.0;
        if(ingredienteExtra.isSelectedIndex(0)){//Sin ingrediente extra
            suplemento = 0.0;
            suplementoIngredientes += suplemento;
        }
        if(ingredienteExtra.isSelectedIndex(1)){//Jamón
            suplemento = 0.5;
            suplementoIngredientes += suplemento;
        }
        if(ingredienteExtra.isSelectedIndex(2)){//Queso
            suplemento = 0.75;
            suplementoIngredientes += suplemento;
        }
        if(ingredienteExtra.isSelectedIndex(3)){//Tomate
            suplemento = 1.5;
            suplementoIngredientes += suplemento;
        }
        if(ingredienteExtra.isSelectedIndex(4)){//Cebolla
            suplemento = 2.5;
            suplementoIngredientes += suplemento;
        }
        if(ingredienteExtra.isSelectedIndex(5)){//Olivas
            suplemento = 1.0;
            suplementoIngredientes += suplemento;
        }
        etiquetaIngrediente.setText(dosDec.format(suplementoIngredientes));
        opcionTamaño = tamaño.getModel().getValue().toString();
        switch(opcionTamaño){
            case "Pequeña":
                porcentajeTamaño = 1;
                break;
            case "Mediana":
                porcentajeTamaño = 1.15;
                break;
            case "Familiar":
                porcentajeTamaño = 1.3;
        }
        precio = 0.0;
        precio = (precioMasa + suplementoTipo + suplementoIngredientes)*porcentajeTamaño;
        etiquetaTamaño.setText(dosDec.format((precioMasa + suplementoTipo + suplementoIngredientes)*(porcentajeTamaño-1)));
        etiquetaTotal.setText(dosDec.format(precio));
    }//GEN-LAST:event_ingredienteExtraValueChanged

    private void tamañoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tamañoStateChanged
        opcionTamaño = tamaño.getModel().getValue().toString();
        switch(opcionTamaño){
            case "Pequeña":
                porcentajeTamaño = 1;
                break;
            case "Mediana":
                porcentajeTamaño = 1.15;
                break;
            case "Familiar":
                porcentajeTamaño = 1.3;
        }
        precio = 0.0;
        precio = (precioMasa + suplementoTipo + suplementoIngredientes)*porcentajeTamaño;
        etiquetaTamaño.setText(dosDec.format((precioMasa + suplementoTipo + suplementoIngredientes)*(porcentajeTamaño-1)));
        etiquetaTotal.setText(dosDec.format(precio));
    }//GEN-LAST:event_tamañoStateChanged

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
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaIngrediente;
    private javax.swing.JLabel etiquetaMasa;
    private javax.swing.JLabel etiquetaTamaño;
    private javax.swing.JLabel etiquetaTipo;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JList ingredienteExtra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton masaIntegral;
    private javax.swing.JRadioButton masaNormal;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JSpinner tamaño;
    private javax.swing.ButtonGroup tipoMasa;
    private javax.swing.JComboBox tipoPizza;
    // End of variables declaration//GEN-END:variables
}
