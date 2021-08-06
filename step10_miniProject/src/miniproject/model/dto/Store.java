package miniproject.model.dto;

public class Store {
	private String storeName;
	private String storeContact;
	private String delivery;
	private String storeLocation;
	private String bestProduct;
	
	public Store() {}

	public Store(String storeName, String storeContact, String delivery, String storeLocation, String bestProduct) {
		super();
		this.storeName = storeName;
		this.storeContact = storeContact;
		this.delivery = delivery;
		this.storeLocation = storeLocation;
		this.bestProduct = bestProduct;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreContact() {
		return storeContact;
	}

	public void setStoreContact(String storeContact) {
		this.storeContact = storeContact;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}

	public String getBestProduct() {
		return bestProduct;
	}

	public void setBestProduct(String bestProduct) {
		this.bestProduct = bestProduct;
	}

	@Override
	public String toString() {
		return "��ü�� : " + storeName + ", ����ó : " + storeContact + ", �ù�� : " + delivery
				+ ", �ּ� : " + storeLocation + ", �α��ǰ : " + bestProduct;
	}
}
