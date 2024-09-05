package com.tns.day3;

public class AccessModifiers {

	
		int defVar = 10;
		public int PubVar = 20;
		private int PriVar = 30;
		protected int ProVar = 40;
		
		void defMethod() {
			System.out.println("Default Method");
		}
		public void PubMethod() {
			System.out.println("Public Method");
		}
		private void PriMethod() {
			System.out.println("Private Method");
		}
		protected void ProMethod() {
			System.out.println("Protected Method");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AccessModifiers am = new AccessModifiers();
			System.out.println(am.defVar);
			System.out.println(am.PubVar);
			System.out.println(am.PriVar);
			System.out.println(am.ProVar);

		}

	
	}

	

