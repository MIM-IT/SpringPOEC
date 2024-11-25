package com.ib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Person {
		String name;
		@Autowired
		private Adresse adresse; 
		


		public Adresse getAdresse() {
			return adresse;
		}
		@Autowired
		public void setAdresse(Adresse adresse) {
			this.adresse = adresse;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", adresse=" + adresse + "]";
		}

		
		
		
}
