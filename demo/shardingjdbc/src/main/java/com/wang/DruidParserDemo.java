//package com.wang;
//
//import com.alibaba.druid.sql.ast.SQLStatement;
//import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
//import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
//import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
//import com.alibaba.druid.sql.parser.SQLStatementParser;
//
///**
// * @ClassName DruidParserDemo
// * @Description druid sql解析器
// * @Author liningwang
// * @Date 2020-11-14 10:54
// * @Version 1.0
// */
//public class DruidParserDemo {
//    public static void parse(String[] args) {
//        String sql = "select id,name from user where id = 1";
//
//        // 新建 MySQL Parser
//        SQLStatementParser parser = new MySqlStatementParser(sql);
//
//        // 使用Parser解析生成AST，这里SQLStatement就是AST
//        SQLSelectStatement statement = (SQLSelectStatement) parser.parseStatement();
//
//        // 使用visitor来访问AST
//        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
//        statement.accept(visitor);
//
////        statement.setSelect(); //此方法可以覆盖原来的sql
////        visitor.getConditions().get(0);
//        // 从visitor中拿出你所关注的信息
//        System.out.println(visitor.getColumns());
//    }
//
//    public static void main(String[] args) {
//        parse(null);
//    }
//}
