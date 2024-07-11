import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class DisplayTableData extends JFrame
{
	private JTable table;
	private DefaultTableModel model;
	
	public DisplayTableData()
	{
		setTitle(" Display Table Data in JTable");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,400);
		String[] columns={"ID","Name","Age","City"};
		model = new DefaultTableModel(columns,0);
		table= new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane);
		fetchData();
		setVisible(true);
	}
	
	private void fetchData()
	{
		
		try
		
			(
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","ahilanas@786");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Student"))
			{
				model.setRowCount(0);
				while(rs.next())
				{
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					String city = rs.getString("city");
					model.addRow(new Object[]{id,name,age,city});
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
	}
	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(DisplayTableData::new);
	}
}
