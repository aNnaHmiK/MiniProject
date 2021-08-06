package miniproject.service;

import java.util.ArrayList;

import miniproject.exception.DuplicateException;
import miniproject.exception.NotExistException;
import miniproject.model.CartModel;
import miniproject.model.dto.CartDTO;

public class CartService {
	private static CartService instance = new CartService();
	private CartModel cartList = CartModel.getInstance();

	private CartService() {}

	public static CartService getInstance() {
		return instance;
	}
	public ArrayList<CartDTO> getCartList(){
		return cartList.getCartList();
	}

	public CartDTO getProduct(String pName){
		ArrayList<CartDTO> productCartList = cartList.getCartList();

		for(CartDTO product : productCartList) {
			if(product.getProductName().contains(pName)) {
				return product;
			}
		}
		return null;
	}

	public void cartInsert(CartDTO newCart) throws DuplicateException {
		CartDTO product = getProduct(newCart.getProductName());

		if (product != null) {
			throw new DuplicateException("�� ��ǰ�� �̹� �ֽ��ϴ�. �浿��������.");
		}
		cartList.insertProduct(newCart);
	}

	public void productDelete(String productName) throws NotExistException {
		CartDTO product = getProduct(productName);
		if(product == null) {
			throw new NotExistException("�����ϰ��� �ϴ� ��ǰ�� �����ϴ�");
		} else {
			getCartList().remove(product);
		}
	}
}
