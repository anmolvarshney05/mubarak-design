
public class Stock {
	double rate;
	LAMDA trade;
	void SetBroker(LAMDA trade){
		this.trade = trade;
	}
	public void changeRate(double newRate) {
		rate = newRate;
		//if(condition && trade != null)
			trade();
	}
}
