package com.wuxy.repository.impl;

import com.wuxy.entity.User2;
import com.wuxy.repository.UserRepository;
import com.wuxy.util.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-18 15:47
 **/
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User2> findAll() {
        Connection connection = JDBCTools.getConnection();
        String sql = "select * from t_user";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<User2> list = new ArrayList<>();
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String password = resultSet.getString(3);
                int age = resultSet.getInt(4);
                list.add(new User2(id, name, password, age));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(connection, statement, resultSet);
        }

        return list;
    }

    @Override
    public User2 find(int id) {
        Connection connection = JDBCTools.getConnection();
        String sql = "select * from t_user where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User2 user = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int id2 = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String password = resultSet.getString(3);
                int age = resultSet.getInt(4);
                user = new User2(id2, name, password, age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(connection,preparedStatement,resultSet);
        }

        return user;
    }

    @Override
    public void save(User2 user) {
        Connection connection = JDBCTools.getConnection();
        String sql = "insert into t_user(name, password, age) values(?,?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setInt(3,user.getAge());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(connection,preparedStatement,null);
        }
    }

    @Override
    public void delete(int id) {
        Connection connection = JDBCTools.getConnection();
        String sql = "delete from t_user where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTools.release(connection,preparedStatement,null);
        }
    }

    @Override
    public void update(User2 user) {
        Connection connection = JDBCTools.getConnection();
        String sql = "update t_user set name = ?, password = ?, age = ? where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setInt(3,user.getAge());
            preparedStatement.setInt(4,user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTools.release(connection,preparedStatement,null);
        }
    }

}
