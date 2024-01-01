

class linkedlist{
    node head;

    class node{
        String data;
        node next;

        node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
        System.out.println(head);


    }
    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.addfirst("aa");
        l.addfirst("something");
      
        
    }

}