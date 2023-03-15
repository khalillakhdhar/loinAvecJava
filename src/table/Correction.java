package table;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Correction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> maliste=new ArrayList<>();
		for(int i=0;i<7;i++)
		{
			System.out.println("donnez un entier");
			maliste.add(sc.nextInt());
		}
		maliste.forEach(
				ls->{
					int test=ls%10;
					if(test==0 || test==4)
						System.out.println(ls);
				}
				);
				

	}

}
