package cracking.ch03;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * How would you design a stack which, in addition to push and pop, also has a
 * function min which returns the minimum element? Push, pop and min should all
 * operate in O(1) time.
 * 
 * @author mengchaowang
 *
 */
public class C02 {
	public class MinStack {
		PriorityQueue<Integer> min;
		Stack<Integer> stack;

		public MinStack() {
			min = null;
			stack = new Stack<Integer>();
		}

		public void push(Integer element) {
			stack.push(element);
			min.offer(element);
		}

		public Integer pop() {
			Integer pop = stack.pop();
			min.remove(pop);
			return pop;
		}

		public Integer min() {
			return min.peek();
		}
	}
}
