package com.ib;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Book book = ctx.getBean(Book.class);
        book.setId(95468);
        book.setName("Spring In Action");
        System.out.println(book);
        
        Person p = ctx.getBean(Person.class); 
        p.setName("Mario");
        p.getAdresse().setNumeroRue(3);
       
        
        Adresse d = ctx.getBean(Adresse.class); 
        d.toString(); 
        System.out.println(d);
        
        Person p1 = ctx.getBean(Person.class); 
        p1.setName("Luigi");
        p1.getAdresse().setNumeroRue(16);
        
      
        
        System.out.println(p);
        System.out.println(p1);
        
        
	}

}
