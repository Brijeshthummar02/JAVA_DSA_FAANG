package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExample {

    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(4);
//        stack.push(44);
//        stack.push(6);
//        stack.push(9);
//
//
//       System.out.println(stack.pop());
//        System.out.println(stack.pop());
//         System.out.println(stack.pop());
//          System.out.println(stack.pop());
//           System.out.println(stack.pop());

        Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(34);
        queue.add(4);
        queue.add(44);
        queue.add(6);
        queue.add(9);

        System.out.println(queue.remove());
          System.out.println(queue.remove( ));
            System.out.println(queue.remove());
              System.out.println(queue.remove());

              Deque<Integer> deque = new ArrayDeque<>();
              deque.addFirst(34);
              deque.addFirst(4);
              deque.addFirst(44);
              deque.addLast(6);
              deque.addLast(9);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

    }
}
