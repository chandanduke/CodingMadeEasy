package one_two_transfer;

public class Test1_outOf_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Alice alice=new Alice(654625,54154);
Bob  bob=new Bob();
bob.calculate_v(alice.N, alice.x0, alice.x1, alice.e);
alice.calculate_k(bob.v);
bob.printmsg(alice.m0, alice.m1);

	}

}
