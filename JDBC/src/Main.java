import java.sql.*;
public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "rahul950@$";
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();


//            fetching the data from data base
//            String quary = "select * from student";
//            ResultSet resultSet = statement.executeQuery(quary);
//            while(resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String age  = resultSet.getString("age");
//                String marks  = resultSet.getString("marks");
//                System.out.println(id);
//                System.out.println(name);
//                System.out.println(age);
//                System.out.println(marks);
//            }

//            insert the data in data base;
//            String quary1  = String.format( "INSERT INTO student(name,age,marks) VALUES ('%s',%o, %f)","rahul",21,98.45);
//            int rowEffected = statement.executeUpdate(quary1);
//            if(rowEffected > 0){
//                System.out.println("data inserted successfully");
//            }else{
//                System.out.println("data not inserted");
//            }

//            update the data in database
//            String quary3 = String.format("UPDATE student SET marks = %f WHERE id = %d",89.3,2);
//            int roweffected = statement.executeUpdate(quary3);
//            if(roweffected > 0){
//                System.out.println("data inserted successfully");
//            }else{
//                System.out.println("data not insert ed");
//            }

//            delete the data from the database

            String quary4 = String.format("DELETE FROM student where ID = 2");
            int roweffected = statement.executeUpdate(quary4);
            if(roweffected > 0){
                System.out.println("data inserted successfully");
            }else{
                System.out.println("data not inserted");
            }

        }catch ( SQLException e){
            System.out.println(e.getMessage());
        }
    }
}