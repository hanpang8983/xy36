package com.shxt.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class MyDateTypeHandler extends BaseTypeHandler<Date> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setLong(i, parameter.getTime());
	}
	@Override
	public Date getNullableResult(ResultSet rs, String columnName) throws SQLException {
		if(rs.getString(columnName)!=null){
			return new Date(Long.parseLong(rs.getString(columnName)));
		}else{
			return null;
		}
	}

	@Override
	public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		if(rs.getString(columnIndex)!=null){
			return new Date(Long.parseLong(rs.getString(columnIndex)));
		}else{
			return null;
		}
	}
	@Override
	public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		if(cs.getString(columnIndex)!=null){
			return new Date(Long.parseLong(cs.getString(columnIndex)));
		}else{
			return null;
		}
	}

}
