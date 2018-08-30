package com.example.ecom;

import java.sql.SQLException;

import com.dto.Order;

public interface OrderDao {
	int create(Order order) throws SQLException;
	int update(Order order) throws SQLException;
	int delete(int id) throws SQLException;
	Order read(int id) throws SQLException;
}
