package 課題3;

import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		unit();
	}
			public static int sales() {
				ArrayList<Integer>sales = new ArrayList<Integer>();
				sales.add(150000);
				sales.add(100000);
				sales.add(120000);
				sales.add(160000);
				int totalsales=0;
				for(Integer s : sales) {
					totalsales += s;
				}
					return totalsales;
		}
			public static int quantity() {
				ArrayList<Integer>quantity = new ArrayList<Integer>();
				quantity.add(0);
				quantity.add(0);
				quantity.add(0);
				quantity.add(0);
				int totalquantity=0;
				for(Integer q : quantity) {
					totalquantity += q;
				}
					return totalquantity;
		}
				public static void unit() {
					int totalsales = sales();
					if(totalsales==0) throw new IllegalArgumentException("値が0です");
					int totalquantity = quantity();
					if(totalquantity==0) throw new IllegalArgumentException("値が0です");
					double avgunit = totalsales/totalquantity;
					System.out.println("単価："+avgunit);
				}
				}
		

