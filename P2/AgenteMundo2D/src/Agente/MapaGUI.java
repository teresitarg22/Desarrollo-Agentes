/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Agente;

import jade.core.behaviours.Behaviour;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author marta
 */
public class MapaGUI extends javax.swing.JFrame {
    private Mapa mapa;
    private Entorno entorno;
    JPanel panelEtiquetas = new JPanel();
    private Map < SimpleEntry <Integer, Integer >, JLabel> etiquetasMapa;
    
    /**
     * Creates new form MapaGUI
     * @param mapa
     */
    public MapaGUI(Mapa mapa, Entorno entorno) {
        this.mapa = mapa;
        this.entorno = entorno;
        initComponents();
               
        panelEtiquetas.setLayout(new BoxLayout(panelEtiquetas, BoxLayout.Y_AXIS));
        etiquetasMapa = new HashMap<>();
        
        visualizarMapa();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabelCoordInicAgent = new javax.swing.JLabel();
        jLabelCoordXAgent = new javax.swing.JLabel();
        jLabelCoordYAgent = new javax.swing.JLabel();
        jTextFieldCoordXAgent = new javax.swing.JTextField();
        jTextFieldCoordYAgent = new javax.swing.JTextField();
        jLabelCoordInicObj = new javax.swing.JLabel();
        jLabelCoordXObj = new javax.swing.JLabel();
        jTextFieldCoordXObj = new javax.swing.JTextField();
        jLabelCoordYObj = new javax.swing.JLabel();
        jTextFieldCoordYObj = new javax.swing.JTextField();
        jButtonSet = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelMapa = new javax.swing.JPanel();
        jLabelDecision = new javax.swing.JLabel();
        jScrollPanelDecision = new javax.swing.JScrollPane();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabelCoordInicAgent.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabelCoordInicAgent.setText("Coordenadas inicio agente:");

        jLabelCoordXAgent.setText("x:");

        jLabelCoordYAgent.setText("y:");

        jTextFieldCoordXAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoordXAgentActionPerformed(evt);
            }
        });

        jLabelCoordInicObj.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabelCoordInicObj.setText("Coordenadas del objetivo:");

        jLabelCoordXObj.setText("x:");

        jTextFieldCoordXObj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCoordXObjActionPerformed(evt);
            }
        });

        jLabelCoordYObj.setText("y:");

        jButtonSet.setText("Establecer");
        jButtonSet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelMapaLayout = new javax.swing.GroupLayout(jPanelMapa);
        jPanelMapa.setLayout(jPanelMapaLayout);
        jPanelMapaLayout.setHorizontalGroup(
            jPanelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        jPanelMapaLayout.setVerticalGroup(
            jPanelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelDecision.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabelDecision.setText("Decisiones tomadas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCoordInicObj)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabelCoordInicAgent)
                                            .addGap(34, 34, 34))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabelCoordXAgent)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldCoordXAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelCoordYAgent)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldCoordYAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(77, 77, 77))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabelCoordXObj)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCoordXObj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelCoordYObj)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldCoordYObj, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(76, 76, 76))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jScrollPanelDecision, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelDecision))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButtonSet)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelCoordInicAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoordXAgent)
                    .addComponent(jTextFieldCoordXAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCoordYAgent)
                    .addComponent(jTextFieldCoordYAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelCoordInicObj)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoordXObj)
                    .addComponent(jTextFieldCoordXObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCoordYObj)
                    .addComponent(jTextFieldCoordYObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSet)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDecision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPanelDecision, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizarMapa() {
        int filas = mapa.getFilas();
        int columnas = mapa.getColumnas();
        //Creo un grid del tamaño del mapa
        jPanelMapa.setLayout(new GridLayout(filas, columnas));
         
        // Establezco que el tamaño del jPanel para que el Gridlayout se extienda entero 
        jPanelMapa.setPreferredSize(new Dimension(jPanelMapa.getWidth(), jPanelMapa.getHeight()));
    
         for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                JLabel label = new JLabel();
                
                label.setOpaque(true);
                label.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1 ));
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setVerticalAlignment(JLabel.CENTER);
                
                if ( mapa.esAccesible(i, j)) {
                    label.setBackground(Color.getHSBColor((float)0.488, (float)0.24, (float)0.97)); // Casilla con valor 0
                } else {
                    label.setBackground(Color.DARK_GRAY); // Casilla con valor -1
                }
                jPanelMapa.add(label);
                etiquetasMapa.put(new SimpleEntry<>(i, j), label);
            }
        }     
    }
  
    private void visualizarAccion(Behaviour behaviour) {
        // Crear una nueva etiqueta con el texto proporcionado
        JLabel nuevaEtiqueta = new JLabel(behaviour.getBehaviourName());

        // Agregar la nueva etiqueta al panel
        panelEtiquetas.add(nuevaEtiqueta);

        // Agregar el panel al JScrollPane
        jScrollPanelDecision.setViewportView(panelEtiquetas);
        
        // Desplazar automáticamente hacia abajo el JScrollPane
        SwingUtilities.invokeLater(() -> {
            Rectangle bounds = nuevaEtiqueta.getBounds();
            jScrollPanelDecision.getViewport().scrollRectToVisible(bounds);
        });

        jScrollPanelDecision.revalidate();
        jScrollPanelDecision.repaint();
        
    }
    
    private void jTextFieldCoordXAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoordXAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCoordXAgentActionPerformed

    private void jTextFieldCoordXObjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCoordXObjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCoordXObjActionPerformed

    private void jButtonSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetActionPerformed
        String coordXStr = jTextFieldCoordXAgent.getText();
        String coordYStr = jTextFieldCoordYAgent.getText();
        
        String coordXObjStr = jTextFieldCoordXObj.getText();
        String coordYObjStr = jTextFieldCoordYObj.getText();
        
        if ( (!coordXStr.isEmpty() && !coordYStr.isEmpty() ) && (!coordXObjStr.isEmpty() && !coordYObjStr.isEmpty() )) {
        try {
            // Convertir los valores de texto a enteros
            int coordX = Integer.parseInt(coordXStr); // Agente
            int coordY = Integer.parseInt(coordYStr);
            
            int coordXObj = Integer.parseInt(coordXObjStr); // Objetivo
            int coordYObj = Integer.parseInt(coordYObjStr);

            // Llamar al método del agente con los valores
            //agente.setPosicionAgente(coordX, coordY);
            
            //Establecer la imagen del agente en la casilla
            ImageIcon imagenAg = new ImageIcon("/Img/agente.png");
            SimpleEntry<Integer, Integer> coordenadasAg = new SimpleEntry<>(coordX, coordY);
            JLabel labelAg = etiquetasMapa.get(coordenadasAg);
            labelAg.setIcon(imagenAg);
            
            //Llamo al método para establecer los valores del objetivo
            //entorno.setPosicionObjetivo(coordXObj, coordYObj);
            
            //Establecer la imagen del objetivo en la casilla
            ImageIcon imagenObj = new ImageIcon("/Img/objetivo.png");
            SimpleEntry<Integer, Integer> coordenadasObj = new SimpleEntry<>(coordXObj, coordYObj);
            JLabel labelObj = etiquetasMapa.get(coordenadasObj);
            labelObj.setIcon(imagenObj);
            
            JOptionPane.showMessageDialog(this, "Coordenadas del agente y objetivo establecidas con éxito.", "Éxito", JOptionPane.DEFAULT_OPTION);
            
        } catch (NumberFormatException e) {
            // Manejar error si los valores no son enteros
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores enteros para X e Y.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Manejar error si algún campo está vacío
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButtonSetActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSet;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabelCoordInicAgent;
    private javax.swing.JLabel jLabelCoordInicObj;
    private javax.swing.JLabel jLabelCoordXAgent;
    private javax.swing.JLabel jLabelCoordXObj;
    private javax.swing.JLabel jLabelCoordYAgent;
    private javax.swing.JLabel jLabelCoordYObj;
    private javax.swing.JLabel jLabelDecision;
    private javax.swing.JPanel jPanelMapa;
    private javax.swing.JScrollPane jScrollPanelDecision;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCoordXAgent;
    private javax.swing.JTextField jTextFieldCoordXObj;
    private javax.swing.JTextField jTextFieldCoordYAgent;
    private javax.swing.JTextField jTextFieldCoordYObj;
    // End of variables declaration//GEN-END:variables
}