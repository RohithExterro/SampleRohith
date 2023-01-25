package com.exterro.DemoOfJedis;

import java.util.List;

import redis.clients.jedis.Jedis;

public class DemoOfJedis {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost",6379); 
	      System.out.println("Connection to server sucessfully");
	      System.out.println("Server is running: "+jedis.ping());
	      jedis.set("tutorial-name", "Redis tutorial");      
	      System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));
	      jedis.lpush("tutorial-list", "Redis"); 
	      jedis.lpush("tutorial-list", "Mongodb"); 
	      jedis.lpush("tutorial-list", "Mysql"); 
	      
	      List<String> list = jedis.lrange("tutorial-list", 0 ,5);         
	         for(int i = 0; i<list.size(); i++) { 
	            System.out.println("List of stored keys:: "+list.get(i));
	          
	      }   

	}

}