package com.se;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSet;

public class TempDao {
	
	
	public void insert(Bean b){
		DBUtil db=new DBUtil();
		try{
	Connection con=	db.getConnection();
	String query = "insert into temperature values(pkey_seq.nextval,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, b.getClientid());
		st.setString(2, b.getDom());
		st.setString(3, b.getUnitid());
		st.setString(4, b.getTempval());
		
		
		st.executeUpdate();
		System.out.println(b.clientid);
		System.out.println(b.unitid);
		System.out.println(b.tempval);
		System.out.println(b.dom);
		
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	
		
			
	}
	
	
	

	
	public ArrayList update(int paramid){
		DBUtil db= new DBUtil();
		ArrayList list= new ArrayList();
		try{
			Connection con = db.getConnection();
		
	
		Statement st=con.createStatement();
		
		
	     java.sql.ResultSet rs=st.executeQuery("select * from temperature where paramid= "+paramid);
		
		
	     while(rs.next())
	     {
	    	 Bean b=new Bean(); 
	    	b.setParamid( rs.getInt(1));
	    	b.setClientid(rs.getInt(2));
	    	
	    	 b.setDom(rs.getString(3));
	    	b.setUnitid(rs.getString(4));
	    	b.setTempval(rs.getString(5));
	    	
	    	list.add(b);
	     }
	     
	     
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		return list;
		
		
		
		
		
	}
	
	public void delete(int paramid){
		DBUtil db= new DBUtil();
		try{
			Connection con = db.getConnection();
		
	
		String query2 = "delete from temperature where paramid=?";
		PreparedStatement st = con.prepareStatement(query2);
		st.setInt(1, paramid);
		
		st.executeUpdate();
		
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}
	
	public ArrayList display(String paramid){
		DBUtil db= new DBUtil();
		ArrayList list= new ArrayList();
		
		String query4 = "select * from temperature";
		if (paramid.equals(""))
		{
			query4=query4;
			System.out.println("all");
			
		}
		else{
			query4=query4+" where paramid ="+paramid;
			
		}
		
		
		try{
			Connection con = db.getConnection();
		
	
		Statement st=con.createStatement();
	
		
		
		
	     java.sql.ResultSet rs=st.executeQuery(query4);
		
		
	     while(rs.next())
	     {
	    	 Bean b=new Bean(); 
	    	b.setParamid( rs.getInt(1));
	    	b.setClientid(rs.getInt(2));
	    	
	    	 b.setDom(rs.getString(3));
	    	b.setUnitid(rs.getString(4));
	    	b.setTempval(rs.getString(5));
	    	
	    	list.add(b);
	     }
	     
	     
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		return list;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void updateData(Bean b){
		DBUtil db=new DBUtil();
		try{
	Connection con=	db.getConnection();
	String query3 = "update temperature set paramid=?,clientid=?,dom=?,unitid=?,tempval=? where paramid=? ";
		PreparedStatement st=con.prepareStatement(query3);
		st.setInt(1, b.getParamid());
		st.setInt(2, b.getClientid());
		st.setString(3, b.getDom());
		st.setString(4, b.getUnitid());
		st.setString(5, b.getTempval());
		st.setInt(6, b.getParamid());
		
		st.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}
	}
