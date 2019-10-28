import java.util.Scanner;

public class MergeLinkedLists
{
	Node head;
	Node tail;
	static class Node
	{
		String data;
		Node prev,next;
		Node(String d)
		{
			data=d;
		}
	}
	public static void insert(MergeLinkedLists li)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a linked list:-");
		String d="0";
		while(d.compareTo("-1")!=0){
			d=sc.next();
			Node newNode=new Node(d);
			if(li.head==null && d.compareTo("-1")!=0)
				li.head=li.tail=newNode;
			else if(d.compareTo("-1")!=0)
			{
				newNode.prev=li.tail;
				li.tail.next=newNode;
				li.tail=newNode;
			}
		}
	}
	public static void display(MergeLinkedLists li)
	{
		System.out.println("After merging two linked lists:-");
		Node current=li.head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void merge(Node head1,Node head2)
	{
		Node current1=head1;
		Node current2=head2;
		//System.out.println(current1.data+" "+current2.data+" "+current1+" "+current2);
		while(current1!=null || current2!=null)
		{
			if(current1==null)
				{
					System.out.print(current2.data+" ");
					current2=current2.prev;
				}
			else if(current2==null)
				{
					System.out.print(current1.data+" ");
					current1=current1.prev;
				}
			else
			{
				System.out.print(current1.data+" "+current2.data+" ");
				current1=current1.prev;
				current2=current2.prev;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeLinkedLists li1=new MergeLinkedLists();
		li1.insert(li1);
		MergeLinkedLists li2=new MergeLinkedLists();
		li2.insert(li2);
		li1.display(li1);
		li2.display(li2);
		li1.merge(li1.tail,li2.tail);
	}

}
