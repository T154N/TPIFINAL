package com.company.views;


import Clases.Bodega;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class tablaCU extends javax.swing.JPanel {

    public tablaCU() {
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBodegas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        botonConfirmar = new javax.swing.JButton();

        backGround2.setBackground(new java.awt.Color(123, 38, 66));

        tablaBodegas.setBackground(new java.awt.Color(204, 182, 155));
        tablaBodegas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Fecha Ult. Act.", "Periodo Act.", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBodegas.setGridColor(new java.awt.Color(102, 102, 102));
        tablaBodegas.setShowGrid(true);
        jScrollPane1.setViewportView(tablaBodegas);

        jPanel2.setBackground(new java.awt.Color(123, 38, 66));
        jPanel2.setPreferredSize(new java.awt.Dimension(182, 37));

        botonConfirmar.setBackground(new java.awt.Color(204, 182, 155));
        botonConfirmar.setText("confirmar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonConfirmar)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backGround2Layout = new javax.swing.GroupLayout(backGround2);
        backGround2.setLayout(backGround2Layout);
        backGround2Layout.setHorizontalGroup(
            backGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
        );
        backGround2Layout.setVerticalGroup(
            backGround2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGround2Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents



    private javax.swing.JPanel backGround2;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaBodegas;
}
