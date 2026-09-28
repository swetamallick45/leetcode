class MyStack {

    Queue<Integer> q = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        int n = q.size();   // Store old size

        q.add(x);           // Add new element at rear

        // Move all previous elements behind x
        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}