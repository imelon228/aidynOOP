package database;

import Entities.Treatment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TreatmentDAO {

    public void insertStaff(Treatment treatment) {
        String sql = "INSERT INTO treatment (treatment_name, cost, is_completed) VALUES (?, ?, ?)";
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            // Set parameters (? → actual values)
            statement.setString(1, treatment.getTreatmentName());
            statement.setDouble(2, treatment.getCost());
            statement.setBoolean(3, treatment.getComplete());
            // Execute INSERT
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println(" Staff inserted successfully!");
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println(" Insert failed!");
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(connection);
        }
    }
    public void getAllTreatment() {
        String sql = "SELECT * FROM treatment";
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("\n--- ALL TREATMENT FROM DATABASE ---");
            while (resultSet.next()) {
                int id = resultSet.getInt("treatment_id");
                String name = resultSet.getString("treatment_name");
                double cost = resultSet.getDouble("cost");
                boolean completed = resultSet.getBoolean("is_completed");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Cost: " + cost);
                System.out.println("Is completed " + completed);
                System.out.println("---");
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println(" Select failed!");
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(connection);
        }
    }
}