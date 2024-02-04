// ----------------------------------------------------------------
//Assignment 4
// Written by: Nesrine Larbi 40079008
// COMP 249 (Section D)
// -----------------------------------------------------------------

import java.util.NoSuchElementException;

public class CellList {
	
	//inner class CellNode
    public class CellNode{
        //Two private attributes: an object of CellPhone and a pointer to a CellNode object;
        private CellPhone phone;
        private CellNode next;
        
        //default constructor
        public CellNode()
        {
            phone=null;
            next=null;
        }

        //parametrised constructor
        public CellNode(CellPhone phone, CellNode next) {
            this.phone = phone;
            this.next = next;
        }
        
        //copy constructor
        public CellNode(CellNode cell)
        {
            this.phone= cell.phone;
            this.next= cell.next;
        }
        
        //clone method
        public Object clone()
        {
            return (Object)new CellNode(this);
        }

        //setPhone mutator method
        public void setPhone(CellPhone phone) {
            this.phone = phone;
        }

        //setNext mutator method
        public void setNext(CellNode next) {
            this.next = next;
        }


        //getPhone accessor method
        public CellPhone getPhone() {
            return phone;
        }

        //getNext accessor method
        public CellNode getNext() {
            return next;
        }
        
        
    }//end of inner class
    
    private CellNode head;
    private int size;// indicates the current size of the list
    
    //default constrcutor
    public CellList()
    {
        head= null;
        size=0;
    }
    
    //copy constructor
    public CellList(CellList list)
    {
    	CellNode tmp=list.head;
    	while(tmp!=null)
    		{this.addToEnd(tmp.phone);
    		tmp=tmp.next;
    		}
    	this.size=list.size;
        
    }

    //addToEnd method adds a node to the end of list
    public void addToEnd(CellPhone phone)
    {
    	if(head==null) { head= new CellNode(phone,null);
    	return;}
    	
    	CellNode tmp=head;
    	while(tmp.next!=null)
    		tmp=tmp.next;
    	
    	tmp.next =new CellNode(phone, null);
    	size++;
    }
    
    //addToStart method adds a node to the start of list
public void addToStart(CellPhone phone)
{
    if(head==null) head=new CellNode(phone, null);
    else{
    CellNode newNode= new CellNode(phone, head);
    head= newNode;}
    size++;
}

//insertAtIndex method inserts a cellNode at a given index
public void insertAtIndex(CellPhone phone, int index)
{
    if(index>=0 && index<size)
    {
        if(index==0) 
        	{
        	addToStart(phone);
        	return;
        	}
        CellNode tmp=head;
        for(int i = 1;i<index;i++)
            tmp=tmp.getNext();
        
        CellNode newNode=new CellNode(phone,tmp.getNext());
        tmp.setNext(newNode);
        size++;
        
    }
    else
        throw new NoSuchElementException("Invalid Index");
}
//deletes a node at index
public void deleteFromIndex(int index)
{
    if(index>=0 && index<size)
    {
        if(index==0) head=head.getNext();
        else{
        CellNode tmp=head;
        for(int i = 1;i<index;i++)
            tmp=tmp.getNext();
        
       
        
      tmp.setNext(tmp.getNext().getNext());
      
        }
        size--;
        
    }
    else
        throw new NoSuchElementException("Invalid Index");
}
//delete first node
 public void deleteFromStart()
 {
     deleteFromIndex(0);
 }
  
 //replaces the value of a node
 public void replaceAtIndex(CellPhone phone, int index)
 {
     if(index>=0 && index<size)
     {
         CellNode tmp=head;
         for(int i =0;i<index;i++)
             tmp=tmp.getNext();
         
         tmp.setPhone(phone);
         
     }
     else
         return;
 }
  
 //searches the list for the given serial
 public CellNode find(long serial)
 {
     CellNode tmp=head;
     while(tmp!=null)
     { if(tmp.getPhone().getSerialNum()==serial)
             return tmp;
     tmp=tmp.getNext();
     }
     
     return null;
     
 }
 
 //checks if the serial number exists in list 
 public boolean contains(long serial)
 {
     if(head==null) return false;
     CellNode tmp=head;
     while(tmp!=null)
     {if(tmp.getPhone().getSerialNum()==serial)
             return true;
     tmp=tmp.next;
     }
     
     return false;
     
 }
// displays the contents of the list 
 public void showContents()
 {
     System.out.println("The current size of the list is "+size+". Here are the contents of the list:");
     CellNode tmp=head;
     int count=0;
     while(tmp!=null)
     {System.out.print(tmp.getPhone().toString()+" ---> ");
         //count is used to insert line breaks after every three nodes for better readability.
     count++;
     if(count%3==0)
         //a new line is started.
             System.out.println("");
     tmp=tmp.getNext();
     }
     System.out.println("x");
     }
 /*
 A method called equals(), which accepts one parameter of type CellList. The method returns true if the two lists contain
similar objects; otherwise the method returns false. Recall that two CellPhone objects are equal if they have the same
values with the exception of the serial number, which can, and actually is expected to be, different
 */
 
 public boolean equals(CellList list)
 {
     if(size==list.size)
     {
         
         CellNode tmp1= head;
         CellNode tmp2= list.head;
         while(tmp1!=null)
         {
             if(tmp1.getPhone().equals(tmp2.getPhone())==false)
                 return false;
             tmp1=tmp1.getNext();
             tmp2=tmp2.getNext();
         }
         return true;
     }
     else return false;

 }
 
}
 
 
 

