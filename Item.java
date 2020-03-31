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