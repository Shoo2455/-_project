package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDB {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/product_management?useSSL=false&serverTimezone=UTC";//接続したいデータベース名
		String username = "Shoo2455";//ユーザー(select user,host from mysql.user)
		String password = "Shoo0036";//パスワード

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
			Statement stmt = conn.createStatement();

			System.out.println("DB接続成功\n");
			System.out.println("--productsテーブルの全ての商品情報を表示--\n\n");

			String sql = "SELECT id, name, price, stock, category_id FROM products";//SELECT 列名, FROM テーブル名
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				int stock = rs.getInt("stock");
			    int category_id = rs.getInt("category_id");

				System.out.println("id: " + id + "\nname: " + name + "\nprice: " + price + "\nstock: " + stock + "\ncategory_id: " + category_id +"\n");
			}

			rs.close();

			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("DB接続失敗");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB接続失敗");
			e.printStackTrace();
		}
	}
}
