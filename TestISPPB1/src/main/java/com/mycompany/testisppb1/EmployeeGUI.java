/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.mycompany.testisppb1;

/**
 *
 * @author Sebi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmployeeGUI extends JFrame {
    private final JTextField nameField;
    private final JTextField rateField;
    private final JTextField hoursField;
    private final JTextArea recordsArea;

    public EmployeeGUI() {
        setTitle("Employee Records");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        JLabel nameLabel = new JLabel("Employee Name: ");
        nameField = new JTextField();
        JLabel rateLabel = new JLabel("Hourly Rate: ");
        rateField = new JTextField();
        JLabel hoursLabel = new JLabel("Hours Worked: ");
        hoursField = new JTextField();
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(rateLabel);
        inputPanel.add(rateField);
        inputPanel.add(hoursLabel);
        inputPanel.add(hoursField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton addButton = new JButton("Add Employee");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addEmployeeRecord();
            }
        });
        JButton calculateButton = new JButton("Calculate Total Salary");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateTotalSalary();
            }
        });
        JButton saveButton = new JButton("Save Records");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveEmployeeRecords();
            }
        });
        JButton loadButton = new JButton("Load Records");
        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadEmployeeRecords();
            }
        });
        buttonPanel.add(addButton);
        buttonPanel.add(calculateButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);

        recordsArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(recordsArea);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }
    private void addEmployeeRecord() {
        String name = nameField.getText();
        double rate = Double.parseDouble(rateField.getText());
        double hours = Double.parseDouble(hoursField.getText());

        // Perform necessary operations to add the employee record to the list

        // Display the updated records in the text area
        recordsArea.append("Employee Name: " + name + ", Hourly Rate: " + rate + ", Hours Worked: " + hours + "\n");

        // Clear the input fields
        nameField.setText("");
        rateField.setText("");
        hoursField.setText("");
    }

    private void calculateTotalSalary() {
        // Perform necessary operations to calculate the total salary

        // Display the total salary
        // recordsArea.append("Total Salary: " + totalSalary + "\n");
    }

    private void saveEmployeeRecords() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                Iterable<Employee> employeeList = null;
                for (Employee employee : employeeList) {
                    writer.println("Employee Name: " + employee.getName() + ", Hourly Rate: " + employee.getHourly_Rate() +
                            ", Hours Worked: " + employee.getHours_Worked());
                }
                JOptionPane.showMessageDialog(this, "Employee records saved successfully.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving employee records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void loadEmployeeRecords() {
        String name = nameField.getText();
        double rate = Double.parseDouble(rateField.getText());
        double hours = Double.parseDouble(hoursField.getText());
        // Perform necessary operations to load the employee records from a file
        // Display the loaded records in the text area
        recordsArea.append("Employee Name: " + name + ", Hourly Rate: " + rate + ", Hours Worked: " + hours + "\n");

        // Clear the input fields
        nameField.setText("");
        rateField.setText("");
        hoursField.setText("");
    }
   
     
}