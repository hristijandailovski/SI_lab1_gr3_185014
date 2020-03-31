class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char tipNaDanok;
	//TODO constructor

	public Item(int id, String name, double price, char tipNaDanok ="B") {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tipNaDanok = tipNaDanok;
	}

	//TODO setters and getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getTipNaDanok() {
		return tipNaDanok;
	}

	public void setTipNaDanok(char tipNaDanok) {
		this.tipNaDanok = tipNaDanok;
	}

	double getTaxReturn () {
		//TODO
		double ddv=0
		if(tipNaDanok=='А'){
			ddv=this.price * 0.18;
		}
		if(tipNaDanok=='Б'){
			ddv=this.price * 0.05;
		}
		return ddv*0.15;
	}
}

class Receipt{
	private List<Item> listOfItems;
	void addToList(Item item){
		listOfItems.add(item);
	}
	void deleteItemOfList(item){
		listOfItems.remove(item);
	}
	double sumOfPrices(){
		int n=listOfItems.size();
		double result=0;
		for(int i=0;i<n;i++){
			result+=listOfItems.get(i).getPrice();
		}
		return result;
	}
	double sumOfTaxReturn(){
		int n=listOfItems.size();
		double result=0;
		for(int i=0;i<n;i++){
			result+=listOfItems.get(i).getTaxReturn();
		}
		return result;
	}

}