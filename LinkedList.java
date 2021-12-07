class LinkedList
{
    node head;

    class node
    {
        int data;
        node next;
        node(int d){
            data =d;
            next =null;
        }
    }
        void sortList()
        {
            int count[] = {0,0,0};
            node ptr = head;

            while(ptr != null)
            {
                count[ptr.data]++;
                ptr= ptr.next;
            }

            int i =0;
            ptr =head;

            while(ptr != null)
            {
                if(count[i] == 0)
                    i++;
                else
                {
                    ptr.data =i;
                    --count[i];
                    ptr = ptr.next;

                }
            }
        }
        public void push(int new_data)
        {
            node new_node = new node(new_data);
            new_node.next = head;
            head = new_node;
        }
        void printList()
        {
            node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String args[])
        {
            LinkedList llist = new LinkedList();
            llist.push(1);
            llist.push(0);
            llist.push(1);
            llist.push(0);
            llist.push(2);
            llist.push(0);
            llist.push(2);
            llist.push(0);
            System.out.println("A :");
            llist.printList();

            llist.sortList();

            System.out.println("Output :");
            llist.printList();
        }
    
}