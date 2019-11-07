package by.rubakhin.database;

import by.rubakhin.entity.Tasks;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionDB {

    public static List<Tasks> getTasksList(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/tasks?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String userName = "root";
        String password = "root";


        ArrayList<Tasks> tasks = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(url, userName, password);
             PreparedStatement ps = createPreparedStatement(con);
             ResultSet rs = ps.executeQuery()) {



            while (rs.next()){
                int id = rs.getInt(1);
                String summary = rs.getString(2);
                Date startDate = rs.getDate(3);
                Date endDate = rs.getDate(4);
                String assignee = rs.getString(5);
                Tasks t = new Tasks(id, summary, startDate, endDate, assignee);
                tasks.add(t);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return tasks;
    }


    private static PreparedStatement createPreparedStatement(Connection con /*, int userId*/) throws SQLException {
     //   String sql = "SELECT id, username FROM users WHERE id = ?";
        String sql = "SELECT * FROM tasks";

        PreparedStatement ps = con.prepareStatement(sql);
    //    ps.setInt(1, userId);
        return ps;
    }

}
