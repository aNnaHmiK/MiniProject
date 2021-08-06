package miniproject.model.dto;

public class Product {
	/** ��ǰ �̸�*/
	private String productName;
	/** ��ǰ ����*/
	private int price;
	/** ��ǰ ����*/
	private String shippingFee;
	/** ��ǰ ����*/
	private String category;
	/** ��ǰ ����*/
	private String grade;
	/** ��õ ��ǰ*/
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
		return "�̸� : " + productName + ", ���� : " + price + ", ��۷� : " + shippingFee
				+ ", ī�װ� : " + category + ", �ı� : " + grade + ", ��õ ��ǰ" + recommendation;
	}
	
}