package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i =0;
        if (i == common) {
        throw new EmptyStackException();
    }
        
  Record city;
  lnode *list = NULL;

  while (data_to_read()) {
    Readin_data(&city);
    insert(&city, &list);
  }
}

void insert(Record*& city, lnode*& list) {
  lnode* ptr = new lnode;
  ptr->next = list;
  list = ptr;
  prt->data = city;
}

    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
        
    }
}
