package miniproject.view;

import java.util.ArrayList;

import miniproject.model.dto.CartDTO;

public class EndView {

	//��ٱ��� �� ��� ��ǰ ���
	public static void cartListView(ArrayList<CartDTO> cartList) {
		for (CartDTO product : cartList) {
			System.out.println(product);
		}
	}

	//���ܰ� �ƴ� �ܼ� �޼��� ���
	public static void messageView(String message) {
		System.out.println(message);
	}

	//��ٱ��� �� Ư�� ��ǰ ���
	public static void productView(CartDTO product) {
		System.out.println(product);
	}
}