package com.geek.homework.lesson6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class InfoMapperImpl implements InfoMapper {

    private static final String insertInfoQuery = "INSERT INTO info" +
            " (id," +
            " subject, " +
            " description,)" +
            " VALUES (?, ?, ?, ?, ?, ?)";

    private static PreparedStatement selectAllInfoPreparedStmt;

    private static PreparedStatement insertInfoPreparedStmt;

    InfoMapperImpl() {
        ConnectionFactory connectionFactory = ConnectionFactory.getInstance();
        try {
            Connection connection = connectionFactory.getConnection();
            insertInfoPreparedStmt = connection.prepareStatement(insertInfoQuery);
            String selectAllInfoQuery = "SELECT id, subject, description FROM info;";
            PreparedStatement selectAllInfoPreparedStmt = connection.prepareStatement(selectAllInfoQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public boolean insert(Info info) {

        try {

            insertInfoPreparedStmt.setLong(1, info.getId());

            insertInfoPreparedStmt.setString(2, info.getSubject());

            insertInfoPreparedStmt.setString(3, info.getDescription());

            return insertInfoPreparedStmt.executeUpdate() == 1;

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

        return false;

    }

    public List<Info> readAllInfo() {
        try {
            List<Info> allInfo = new ArrayList<Info>();
            ResultSet resultSetForAllInfo = selectAllInfoPreparedStmt.executeQuery();

            while (resultSetForAllInfo.next()) {
                Info info = new Info();
                info.setId(resultSetForAllInfo.getLong("id"));
                info.setSubject(resultSetForAllInfo.getString("subject"));
                info.setDescription(resultSetForAllInfo.getString("description"));
                allInfo.add(info);
            }
            return allInfo;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public boolean update(Info info) {
        return false;
    }

    public boolean delete(Info info) {
        return false;
    }
}
