package com.mxudong.dochelper.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dong
 * <p>
 * Class Name : DescUtil
 * Create Time : 11:17
 * Create Date : 2019/3/20
 * Project : Java_Doc Helper
 */

public class DescUtil {

    public static void main(String[] args) {
        String temp = "import java.sql.*;\n" +
                "\n" +
                "public class TestMain {\n" +
                "    /**\n" +
                "     * Test\n" +
                "     *\n" +
                "     * @param args\n" +
                "     */\n" +
                "    public static void main(String[] args) {\n" +
                "        String URL = \"jdbc:mysql://127.0.0.1:3306/d_pet_info?useUnicode=true&amp;characterEncoding=utf-8\";\n" +
                "        String USER = \"root\";\n" +
                "        String PASSWORD = \"a123456\";\n" +
                "\n" +
                "        try {\n" +
                "            Class.forName(\"com.mysql.jdbc.Driver\");\n" +
                "\n" +
                "            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);\n" +
                "            Statement st = conn.createStatement();\n" +
                "\n" +
                "            ResultSet rs = st.executeQuery(\"select * from t_user_info\");\n" +
                "\n" +
                "            while (rs.next()) {\n" +
                "                System.out.println(rs.getString(\"user_name\") + \" \"\n" +
                "                        + rs.getString(\"password\"));\n" +
                "            }\n" +
                "            rs.close();\n" +
                "            st.close();\n" +
                "            conn.close();\n" +
                "        } catch (ClassNotFoundException e) {\n" +
                "            e.printStackTrace();\n" +
                "        } catch (SQLException e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * @param null\n" +
                "     * @throws null\n" +
                "     */\n" +
                "    public static void Test() {\n" +
                "        main(null);\n" +
                "    }\n" +
                "}\n";
        String [] res = GetDoc(temp);
        for(String str : res){
            System.out.println(str);
            System.out.println("OK");
        }
    }

    public static String[] GetDoc (String document){

        String parrent = "/\\*(.|[\\s\\S])*\\*/";
        Pattern pattern = Pattern.compile(parrent);

        Matcher matcher = pattern.matcher(document);

        String [] str = new String[0];

        if(matcher.find()){
            str = matcher.group().split("\\*/");
        }
        return str;
    }
}
