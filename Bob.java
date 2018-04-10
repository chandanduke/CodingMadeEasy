package one_two_transfer;

import java.math.BigInteger;

public class Bob {
	int bit;
	public BigInteger v;
	private BigInteger k;
public Bob(){
	
	if(Math.random()>0.5){
		bit =1;
		
	}
	else{
		bit=0;
	}
	
	
}
public void calculate_v(BigInteger N,BigInteger x0,BigInteger x1,BigInteger e){

	long k_k=(long) (Math.random()*1000);
	 k=BigInteger.valueOf(k_k);
	BigInteger xb;
	if(bit==1){
		xb=x1;
		
	}
	else{
		xb=x0;
	
	}
	v=((xb.mod(N)).add((k.modPow(e, N)))).mod(N);
}
public void printmsg(BigInteger m0,BigInteger m1){
	if(bit==1){
		
		System.out.println(m1.subtract(k));
	}
	else{
		System.out.println(m0.subtract(k));
	}
}



}
