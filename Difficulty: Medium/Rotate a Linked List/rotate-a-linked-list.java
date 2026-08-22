/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        if(head == null ) return null;
        Node last = head;
        int n = 1;
        while(last.next != null){
            n++;
            last = last.next;
        }
        k = k%n;
        if(k==0) return head;
        
        Node t = head;
        int count =1;
        while(count < k){
            count++;
            t = t.next;
        }
        last.next = head;
        Node res = t.next;
        t.next = null;
        return res;
        
    }
}