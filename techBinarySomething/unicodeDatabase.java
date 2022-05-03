import java.sql.*;
import java.util.stream.IntStream;

import static javax.swing.UIManager.getInt;

public class unicodeDatabase {

    public static void unicodeLoop() {
        //IntStream.range(0, 10001).mapToObj(i -> +i + new String(Character.toChars(i)) + " ").forEach(System.out::print);
        String query = "INSERT INTO actor(first_name,last_name) " + "VALUES(?,?)";
        String connectionUrl = "jdbc:mysql://localhost:3306/unicodeTech";

        try (Connection conn = DriverManager.getConnection(connectionUrl, "username", "password");
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int code = rs.getInt("code");
                int binary = rs.getInt("binary");
                int decimal = rs.getInt("decimal");
                System.out.println(code+binary+decimal);

                // do something with the extracted data...
            }
        } catch (SQLException e) {
            // handle the exception
        }
    }
}
