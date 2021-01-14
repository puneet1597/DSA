package myStackApp;

public class MyStack implements StackInterface {

	int[] arr;
	int[] rev;
	int top;
	int size;

	public MyStack(int s) {
		arr = new int[s];
		rev = new int[s];
		size = s;
		top = -1;
	}

	public int getSize() {
		return size;
	}

	@Override
	public void push(int n) {

		if (isFull()) {
			return;
		}
		System.out.println("Push Element");
		++top;
		arr[top] = n;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int p = arr[top];
		arr[top] = 0;
		--top;
		return p;
	}

	@Override
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if (size - 1 == top) {
			System.out.println("Stack is full !!");
			return true;
		}
		return false;
	}

	@Override
	public void display() {
		for (int i : arr) {
			if (i != 0) {
				System.out.println(i + " ");
			}
		}
	}

	@Override
	public void displayAndReverseStack() {
		for (int i = 0; i < size; i++) {
			rev[i] = pop();
			System.out.println(rev[i]);
		}
		
		for(int j = 0; j< size; j++) {
			push(rev[j]);
		} 
	}

}
