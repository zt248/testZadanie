import java.sql.*;


public class DBConnection {

    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String JDBC_URL = "jdbc:derby:testproject;create=true";

    Connection conn;

    public DBConnection() {
        try {
            Class.forName(DRIVER);
            this.conn = DriverManager.getConnection(JDBC_URL);
            if (this.conn != null) {
                System.out.println("Connect to Databace");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        try {
            conn.createStatement().execute("CREATE TABLE MYTABLE (Vvodnay_stroka VARCHAR (50),otvet INT)");
            System.out.println("База создана");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void insertIntoTable(String vvodnay_stroka, int otvet) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO MYTABLE VALUES (?,?)");
            ps.setString(1, vvodnay_stroka);
            ps.setInt(2,otvet);
            System.out.println("объект добавлен");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printAll() {
        try {
            Statement statement = this.conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM MYTABLE");
            System.out.println("Все объекты");
            while (rs.next()) {
                String vvodnay_stroka = rs.getString("vvodnay_stroka");
                String otvet = rs.getString("otvet");
                System.out.println("vvodnay_stroka - " + vvodnay_stroka + "; Otvet - "  + otvet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
