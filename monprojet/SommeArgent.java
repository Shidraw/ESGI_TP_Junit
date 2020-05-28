package monprojet;
public class SommeArgent {
	private int quantite;
	private String unite;
	
	public SommeArgent(int amount, String currency){
		quantite = amount;
		unite = currency;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public String getUnite() {
		return unite;
	}
	
	@Override
    public boolean equals(Object anObject) {
		if(this == anObject) {
			return true;
		}
		if(this.getClass() != anObject.getClass()) {
			return false;
		}else {
			if(this.unite == ((SommeArgent) anObject).getUnite() && this.quantite == ((SommeArgent) anObject).getQuantite()) {
				return true;
			}
		}
		return false;
	}

	
	public SommeArgent add(SommeArgent m) {
		return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
	}
}
