package one_two_transfer;

import java.math.BigInteger;
import java.util.Random;

public class Alice {
	   public  BigInteger a=null;
       public 	BigInteger b=null;
	
	   private BigInteger p;
	   private BigInteger q;
	   public BigInteger N;
	   private BigInteger phi;
       public BigInteger e;
	   private BigInteger d;
	   private int        bitlength = 1024;
	   private Random     r;
	   public BigInteger x0=BigInteger.valueOf((int) (Math.random()*1000));
	   public BigInteger x1=BigInteger.valueOf((int) (Math.random()*1000));
	   public  BigInteger m0=null;
       public BigInteger m1=null;
	   
	public Alice(long a,long b){
		this.a=BigInteger.valueOf(a);
		this.b=BigInteger.valueOf(b);
	    r = new Random();
	       p = BigInteger.probablePrime(bitlength, r);
	       q = BigInteger.probablePrime(bitlength, r);
	       N = p.multiply(q);
	       phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
	       e = BigInteger.probablePrime(bitlength / 2, r);
	       while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0)
	       {
	           e.add(BigInteger.ONE);
	          
	       }
	       d = e.modInverse(phi);
	       
	}
	public void calculate_k(BigInteger v){
		BigInteger k_0=(v.subtract(x0)).modPow(d, N);
	    BigInteger k_1=(v.subtract(x1)).modPow(d, N);
	    m0=a.add(k_0);
	    m1=b.add(k_1);
	}

	

}
