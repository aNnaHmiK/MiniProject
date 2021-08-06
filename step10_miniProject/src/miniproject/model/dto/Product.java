package miniproject.model.dto;

public class Product {
	/** 상품 이름*/
	private String productName;
	/** 상품 가격*/
	private int price;
	/** 상품 가격*/
	private String shippingFee;
	/** 상품 가격*/
	private String category;
	/** 상품 가격*/
	private String grade;
	/** 추천 상품*/
	private String recommendation;
	
	public Product() {}

	public Product(String productName, int productPrice, String shippingFee, String category, String grade,
			String recommendation) {
		super();
		this.productName = productName;
		this.price = productPrice;
		this.shippingFee = shippingFee;
		this.category = category;
		this.grade = grade;
		this.recommendation = recommendation;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return price;
	}

	public void setProductPrice(int productPrice) {
		this.price = productPrice;
	}

	public String getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(String shippingFee) {
		this.shippingFee = shippingFee;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	@Override
	public String toString() {
		return "이름 : " + productName + ", 가격 : " + price + ", 배송료 : " + shippingFee
				+ ", 카테고리 : " + category + ", 후기 : " + grade + ", 추천 상품" + recommendation;
	}
	
}