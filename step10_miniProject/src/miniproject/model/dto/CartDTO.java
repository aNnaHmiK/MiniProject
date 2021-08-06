package miniproject.model.dto;

public class CartDTO {
	/** 상품 이름*/
	private String productName;
	private Product product;
	private Store store;
	
	public CartDTO() {
		super();
	}

	public CartDTO(String productName, Product product, Store store) {
		super();
		this.productName = productName;
		this.product = product;
		this.store = store;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public String toString() {
		return "상품 : " + productName + " ** 상품 정보 [" + product + "] ** 판매업체 [" + store + "]";
	}
}