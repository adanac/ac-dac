package com.adanac.framework.rws.wrapper;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

public class PreparedStatementWrapper implements PreparedStatement {

	private PreparedStatement currentPreparedStatement;

	public PreparedStatementWrapper(PreparedStatement currentPreparedStatement) {
		super();
		this.currentPreparedStatement = currentPreparedStatement;
	}

	public ResultSet executeQuery(String sql) throws SQLException {
		return currentPreparedStatement.executeQuery(sql);
	}

	public int executeUpdate(String sql) throws SQLException {
		return currentPreparedStatement.executeUpdate(sql);
	}

	public void close() throws SQLException {
		currentPreparedStatement.close();
	}

	public int getMaxFieldSize() throws SQLException {
		return currentPreparedStatement.getMaxFieldSize();
	}

	public void setMaxFieldSize(int max) throws SQLException {
		currentPreparedStatement.setMaxFieldSize(max);
	}

	public int getMaxRows() throws SQLException {
		return currentPreparedStatement.getMaxRows();
	}

	public void setMaxRows(int max) throws SQLException {
		currentPreparedStatement.setMaxRows(max);
	}

	public void setEscapeProcessing(boolean enable) throws SQLException {
		currentPreparedStatement.setEscapeProcessing(enable);
	}

	public int getQueryTimeout() throws SQLException {
		return currentPreparedStatement.getQueryTimeout();
	}

	public void setQueryTimeout(int seconds) throws SQLException {
		currentPreparedStatement.getQueryTimeout();
	}

	public void cancel() throws SQLException {
		currentPreparedStatement.cancel();
	}

	public SQLWarning getWarnings() throws SQLException {
		return currentPreparedStatement.getWarnings();
	}

	public void clearWarnings() throws SQLException {
		currentPreparedStatement.clearWarnings();
	}

	public void setCursorName(String name) throws SQLException {
		currentPreparedStatement.setCursorName(name);
	}

	public boolean execute(String sql) throws SQLException {
		return currentPreparedStatement.execute(sql);
	}

	public ResultSet getResultSet() throws SQLException {
		return currentPreparedStatement.getResultSet();
	}

	public int getUpdateCount() throws SQLException {
		return currentPreparedStatement.getUpdateCount();
	}

	public boolean getMoreResults() throws SQLException {
		return currentPreparedStatement.getMoreResults();
	}

	public void setFetchDirection(int direction) throws SQLException {
		currentPreparedStatement.setFetchDirection(direction);
	}

	public int getFetchDirection() throws SQLException {
		return currentPreparedStatement.getFetchDirection();
	}

	public void setFetchSize(int rows) throws SQLException {
		currentPreparedStatement.setFetchSize(rows);
	}

	public int getFetchSize() throws SQLException {
		return currentPreparedStatement.getFetchSize();
	}

	public int getResultSetConcurrency() throws SQLException {
		return currentPreparedStatement.getResultSetConcurrency();
	}

	public int getResultSetType() throws SQLException {
		return currentPreparedStatement.getResultSetType();
	}

	public void addBatch(String sql) throws SQLException {
		currentPreparedStatement.addBatch(sql);
	}

	public void clearBatch() throws SQLException {
		currentPreparedStatement.clearBatch();
	}

	public int[] executeBatch() throws SQLException {
		return currentPreparedStatement.executeBatch();
	}

	public Connection getConnection() throws SQLException {
		return new ConnectionWrapper(currentPreparedStatement.getConnection());
	}

	public boolean getMoreResults(int current) throws SQLException {
		return currentPreparedStatement.getMoreResults();
	}

	public ResultSet getGeneratedKeys() throws SQLException {
		return currentPreparedStatement.getGeneratedKeys();
	}

	public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
		return currentPreparedStatement.executeUpdate();
	}

	public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
		return currentPreparedStatement.executeUpdate(sql, columnIndexes);
	}

	public int executeUpdate(String sql, String[] columnNames) throws SQLException {
		return currentPreparedStatement.executeUpdate(sql, columnNames);
	}

	public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
		return currentPreparedStatement.execute(sql, autoGeneratedKeys);
	}

	public boolean execute(String sql, int[] columnIndexes) throws SQLException {
		return currentPreparedStatement.execute(sql, columnIndexes);
	}

	public boolean execute(String sql, String[] columnNames) throws SQLException {
		return currentPreparedStatement.execute(sql, columnNames);
	}

	public int getResultSetHoldability() throws SQLException {
		return currentPreparedStatement.getResultSetHoldability();
	}

	public boolean isClosed() throws SQLException {
		return currentPreparedStatement.isClosed();
	}

	public void setPoolable(boolean poolable) throws SQLException {
		currentPreparedStatement.setPoolable(poolable);
	}

	public boolean isPoolable() throws SQLException {
		return currentPreparedStatement.isPoolable();
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return currentPreparedStatement.unwrap(iface);
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return currentPreparedStatement.isWrapperFor(iface);
	}

	public ResultSet executeQuery() throws SQLException {
		return currentPreparedStatement.executeQuery();
	}

	public int executeUpdate() throws SQLException {
		return currentPreparedStatement.executeUpdate();
	}

	public void setNull(int parameterIndex, int sqlType) throws SQLException {
		currentPreparedStatement.setNull(parameterIndex, sqlType);
	}

	public void setBoolean(int parameterIndex, boolean x) throws SQLException {
		currentPreparedStatement.setBoolean(parameterIndex, x);
	}

	public void setByte(int parameterIndex, byte x) throws SQLException {
		currentPreparedStatement.setByte(parameterIndex, x);
	}

	public void setShort(int parameterIndex, short x) throws SQLException {
		currentPreparedStatement.setShort(parameterIndex, x);
	}

	public void setInt(int parameterIndex, int x) throws SQLException {
		currentPreparedStatement.setInt(parameterIndex, x);

	}

	public void setLong(int parameterIndex, long x) throws SQLException {
		currentPreparedStatement.setLong(parameterIndex, x);

	}

	public void setFloat(int parameterIndex, float x) throws SQLException {
		currentPreparedStatement.setFloat(parameterIndex, x);

	}

	public void setDouble(int parameterIndex, double x) throws SQLException {
		currentPreparedStatement.setDouble(parameterIndex, x);
	}

	public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
		currentPreparedStatement.setBigDecimal(parameterIndex, x);
	}

	public void setString(int parameterIndex, String x) throws SQLException {
		currentPreparedStatement.setString(parameterIndex, x);
	}

	public void setBytes(int parameterIndex, byte[] x) throws SQLException {
		currentPreparedStatement.setBytes(parameterIndex, x);
	}

	public void setDate(int parameterIndex, Date x) throws SQLException {
		currentPreparedStatement.setDate(parameterIndex, x);
	}

	public void setTime(int parameterIndex, Time x) throws SQLException {
		currentPreparedStatement.setTime(parameterIndex, x);
	}

	public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
		currentPreparedStatement.setTimestamp(parameterIndex, x);
	}

	public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
		currentPreparedStatement.setAsciiStream(parameterIndex, x, length);

	}

	@Deprecated
	public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
		currentPreparedStatement.setUnicodeStream(parameterIndex, x, length);
	}

	public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
		currentPreparedStatement.setBinaryStream(parameterIndex, x, length);
	}

	public void clearParameters() throws SQLException {
		currentPreparedStatement.clearParameters();
	}

	public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
		currentPreparedStatement.setObject(parameterIndex, x, targetSqlType);
	}

	public void setObject(int parameterIndex, Object x) throws SQLException {
		currentPreparedStatement.setObject(parameterIndex, x);
	}

	public boolean execute() throws SQLException {
		return currentPreparedStatement.execute();
	}

	public void addBatch() throws SQLException {
		currentPreparedStatement.addBatch();
	}

	public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
		currentPreparedStatement.setCharacterStream(parameterIndex, reader, length);
	}

	public void setRef(int parameterIndex, Ref x) throws SQLException {
		currentPreparedStatement.setRef(parameterIndex, x);
	}

	public void setBlob(int parameterIndex, Blob x) throws SQLException {
		currentPreparedStatement.setBlob(parameterIndex, x);
	}

	public void setClob(int parameterIndex, Clob x) throws SQLException {
		currentPreparedStatement.setClob(parameterIndex, x);

	}

	public void setArray(int parameterIndex, Array x) throws SQLException {
		currentPreparedStatement.setArray(parameterIndex, x);

	}

	public ResultSetMetaData getMetaData() throws SQLException {
		return currentPreparedStatement.getMetaData();
	}

	public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
		currentPreparedStatement.setDate(parameterIndex, x, cal);
	}

	public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
		currentPreparedStatement.setTime(parameterIndex, x, cal);

	}

	public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
		currentPreparedStatement.setTimestamp(parameterIndex, x, cal);

	}

	public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
		currentPreparedStatement.setNull(parameterIndex, sqlType, typeName);

	}

	public void setURL(int parameterIndex, URL x) throws SQLException {
		currentPreparedStatement.setURL(parameterIndex, x);

	}

	public ParameterMetaData getParameterMetaData() throws SQLException {
		return currentPreparedStatement.getParameterMetaData();
	}

	public void setRowId(int parameterIndex, RowId x) throws SQLException {
		currentPreparedStatement.setRowId(parameterIndex, x);
	}

	public void setNString(int parameterIndex, String value) throws SQLException {
		currentPreparedStatement.setNString(parameterIndex, value);

	}

	public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
		currentPreparedStatement.setNCharacterStream(parameterIndex, value, length);

	}

	public void setNClob(int parameterIndex, NClob value) throws SQLException {
		currentPreparedStatement.setNClob(parameterIndex, value);
	}

	public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
		currentPreparedStatement.setClob(parameterIndex, reader, length);

	}

	public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
		currentPreparedStatement.setBlob(parameterIndex, inputStream, length);

	}

	public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
		currentPreparedStatement.setNClob(parameterIndex, reader, length);

	}

	public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
		currentPreparedStatement.setSQLXML(parameterIndex, xmlObject);

	}

	public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
		currentPreparedStatement.setObject(parameterIndex, x, targetSqlType, scaleOrLength);

	}

	public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
		currentPreparedStatement.setAsciiStream(parameterIndex, x, length);

	}

	public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
		currentPreparedStatement.setBinaryStream(parameterIndex, x, length);

	}

	public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
		currentPreparedStatement.setCharacterStream(parameterIndex, reader, length);

	}

	public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
		currentPreparedStatement.setAsciiStream(parameterIndex, x);

	}

	public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
		currentPreparedStatement.setBinaryStream(parameterIndex, x);

	}

	public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
		currentPreparedStatement.setCharacterStream(parameterIndex, reader);

	}

	public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
		currentPreparedStatement.setNCharacterStream(parameterIndex, value);
	}

	public void setClob(int parameterIndex, Reader reader) throws SQLException {
		currentPreparedStatement.setClob(parameterIndex, reader);

	}

	public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
		currentPreparedStatement.setBlob(parameterIndex, inputStream);

	}

	public void setNClob(int parameterIndex, Reader reader) throws SQLException {
		currentPreparedStatement.setNClob(parameterIndex, reader);

	}

	@Override
	public void closeOnCompletion() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}