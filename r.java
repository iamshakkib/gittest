import java.io.*;
import java.util.*;
class ll{
	static class Node<T>
	{
		T data;
		Node<T> next;
		Node(T data)
		{
			this.data = data;
			next=null;
		}
	}
	
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head; 
		while(head!=null)
		{
			System.out.println(head.data+" ");
			head=head.next;
		}
		head=temp; //resetting the head
	}
	public static void printrec(Node<Integer> head)
	{
		Node<Integer> temp = head;
		if(temp==null)
		return;
		System.out.println(temp.data+" ");
		printrec(temp.next);
	}
	public static int key(Node<Integer> head,int x)
	{
		Node<Integer> temp = head;
		int count=1;
		while(temp!=null)
		{
			
			if(temp.data==x)
			break;
			temp=temp.next;
			count++;
		}
		return count;
	}
	public static int keyrec(Node<Integer>head,int x)
	{
		Node<Integer> temp = head;
		if(temp.data==x)
		return 1;
		else{
		int res = keyrec(temp.next,x);
		if(res==-1)
		return -1;
		else
		return (res+1);
		}
	}
	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null,tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data!=-1)
		{
			Node<Integer> newnode = new Node<Integer>(data);
			if(head==null)
			{
				head = newnode;
				tail = newnode;
			}
			else
			{
//				Node<Integer> temp = head;
//				while(temp.next!=null)
//				{
//					temp = temp.next;
//				}
//				temp.next = newnode;
				tail.next = newnode;
				tail = newnode;
			}
			data = sc.nextInt();
		}
		return head;
	}
	public static Node<Integer> pos(Node<Integer> head , int pos)
	{
		Node<Integer> temp = head;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> newnode = new Node<Integer>(data);
		if(pos==0)
		{
			newnode.next = head;
			head = newnode;
			return head;
		}
		for(int i=0;i<pos-1;i++)
		{
			temp=temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
		return head;
		
	}
	public static Node<Integer> del(Node<Integer>head,int p)
	{
		Node<Integer> temp = head;
		if(p==0)
		{
			head = temp.next.next;
			temp.next= null;
			return head;
		}
		for(int i=0;i<p-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;
	}
	public static Node<Integer> sortedinsert(Node<Integer> head,int y)
	{
		Node<Integer> temp = head;
		Node<Integer> newnode = new Node<Integer>(y);
		int count =1;
		while(temp.next.data<y)
		{
			temp=temp.next;
			count++;
		}
		System.out.println(count);
		newnode.next=temp.next;
		temp.next=newnode;
		
		return head;
	}
	public static void mid(Node<Integer> head)
	{
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast  = fast.next.next;
		}
		System.out.println(slow.data);
		
	}
	public static Node<Integer> reverse(Node<Integer> head)
	{
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		Node<Integer> next = null;
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	public static Node<Integer> dup(Node<Integer> head)
	{
		Node<Integer> temp= head;
		while(temp!=null&&temp.next!=null)
		{
			if(temp.data==temp.next.data)
			{
				temp.next=temp.next.next;
			}
			temp=temp.next;
		}
		return head;
	}
	public static void main(String[] args)
	{
		Node<Integer> head = takeInput();
		printrec(head);
		Scanner sc = new Scanner(System.in);
		//int pos = sc.nextInt();
		//int x = sc.nextInt();
		//System.out.println(key(head,x));
		//System.out.println(keyrec(head,x));
		//int y = sc.nextInt();
		//mid(head);
		//head=reverse(head);
		head=dup(head);
		print(head);
		//head=pos(head,pos);
		//head = sortedinsert(head,y);
		//printrec(head);
		//int p = sc.nextInt();
		//del(head,p);
		//print(head);
	}
}
