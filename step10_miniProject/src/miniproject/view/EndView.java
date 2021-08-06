package miniproject.view;

import java.util.ArrayList;

import miniproject.model.dto.CartDTO;

public class EndView {

	//장바구니 내 모든 상품 출력
	public static void cartListView(ArrayList<CartDTO> cartList) {
		for (CartDTO product : cartList) {
			System.out.println(product);
		}
	}

	//예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}

	//장바구니 내 특정 상품 출력
	public static void productView(CartDTO product) {
		System.out.println(product);
	}
}