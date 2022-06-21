import java.util.*;
class emp{
	int a;
	void fun1(){
		System.out.println("aaaa");
	}
}



class Student implements Comparable<Student> {
	int rollno;
	String name;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	public int compareTo(Student that){
		return this.rollno-that.rollno;
	}
	public String toString(){
		return this.rollno+" "+this.name;
	}
	public boolean equals(Object o){
		if(this==o){return true;}
		if(o==null || getClass()!=o.getClass()){return false;}
		Student student=(Student)o;
		return rollno==student.rollno;
	}

}
public class Collections_FrameWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List <Integer> arrlist=new ArrayList<Integer>();
	    arrlist.add(0,20);
	    arrlist.add(30);
	    arrlist.add(40);
	    System.out.println(arrlist.toString());
	    System.out.println(arrlist.contains(20));
	    arrlist.set(0,10);
	    System.out.println(arrlist.indexOf(10));
		arrlist.remove(Integer.valueOf(10));
		arrlist.remove(1);
		System.out.println(arrlist.toString());
		
		List <Integer> arrlist2=new ArrayList<Integer>(arrlist);//Passing to constructor
		
		System.out.println(arrlist2.toString());
		arrlist2.clear();
		arrlist2.addAll(arrlist);
	
		//Stack
	
		Stack <String> stack=new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.toString());
	
		List <Integer> ll=new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		
		
		Queue <Integer>llq=new LinkedList<Integer>();
		llq.offer(1);
		llq.offer(2);//you can use add too, but offer doesn't throw an exception
		System.out.println(llq.peek());
		System.out.println(llq.poll());
		System.out.println(llq.poll());
//		System.out.println(llq.element());//throws exception
		System.out.println(llq.peek());
	
		Queue <Integer> pq=new PriorityQueue<Integer>(); //Comparator.reverseorder() to change defalt priority of min to max.
		

		pq.offer(3);
		pq.offer(1);
		pq.offer(2);
		pq.offer(7);
		pq.offer(5);
		System.out.println(pq.peek());
		System.out.println(pq.isEmpty());
		System.out.println(pq.poll());
	
		
		//Array Deque
		ArrayDeque<Integer> arrdq=new ArrayDeque<Integer>();
		
		arrdq.offerFirst(1);
		arrdq.offerFirst(2);
		arrdq.offerLast(4);
		System.out.println(arrdq.peekFirst());
		System.out.println(arrdq.peekLast());
		System.out.println(arrdq.pollLast());
		System.out.println(arrdq.pollLast());
		System.out.println(arrdq.toString());
		
		
		
		//Sets
		
		//HashSets, uses hashing which performs opt in O(1), but doesn't store elements in inserted order
		//no repeated elements here
		Set<Integer> sethash=new HashSet<Integer>();
		sethash.add(1);
		sethash.add(1);
		sethash.add(2);
		sethash.add(4);
		System.out.println(sethash.toString());
		System.out.println(sethash.contains(1));
		sethash.remove(1);
		
		System.out.println(sethash.toString());
		
		//stores in inserted order
		Set<Integer> sethashlinked=new LinkedHashSet<Integer>();
		sethashlinked.add(3);
		sethashlinked.add(1);
		sethashlinked.add(1);
		sethashlinked.add(8);
		System.out.println(sethashlinked.toString());
		System.out.println(sethashlinked.isEmpty());
	
		//Stores everything in sorted for like BST
		Set<Integer> sethashtree=new TreeSet<Integer>();
		sethashtree.add(10);
		sethashtree.add(2);
		sethashtree.add(1);
		sethashtree.add(21);
		System.out.println(sethashtree.toString());
		
		Set<Student> treesetstud=new TreeSet<Student>();
		
		treesetstud.add(new Student(3,"C"));
		treesetstud.add(new Student(1,"A"));
		treesetstud.add(new Student(2,"B"));
		treesetstud.add(new Student(4,"D"));
		treesetstud.add(new Student(4,"D"));
		treesetstud.add(new Student(1,"A"));
		treesetstud.add(new Student(5,"E"));
		for(Student st: treesetstud){
			System.out.println(st.toString());//check Student class
			
		}
		System.out.println("______________________________\n");
		Set<Student> objhashset=new HashSet<Student>();
			
			objhashset.add(new Student(3,"C"));
			objhashset.add(new Student(1,"A"));
			objhashset.add(new Student(2,"B"));
			objhashset.add(new Student(4,"D"));
			objhashset.add(new Student(4,"D"));
			objhashset.add(new Student(1,"A"));
			objhashset.add(new Student(5,"E"));
			for(Student st_hash: objhashset){
				System.out.println(st_hash.toString());
		}
		
	
	
	//Maps
	 Map<Integer,String> hashmap=new HashMap<>();
	 hashmap.put(1, "GRE");
	 hashmap.put(2, "TOEFL");
	 hashmap.put(3, "IELTS");
	 hashmap.put(4, "GRE");
	 hashmap.put(4, "GMAT");
	 
	 System.out.println(hashmap);
	 if(hashmap.containsKey(3))
	 {
		 System.out.println(true);
	 }
	 hashmap.putIfAbsent(5, "CAT");
	 for(Map.Entry<Integer, String> e:hashmap.entrySet()){
		 System.out.println(e+"=>  Keys :"+e.getKey()+"    Value: "+e.getValue());
		 
		 
	 }
	 for(Integer e: hashmap.keySet()){
		 System.out.println(e);
	 }
	 for(String e: hashmap.values()){
		 System.out.println(e);
	 }
	System.out.println(hashmap.keySet());
	System.out.println(hashmap.values());
	
	
	//TreeMap does the same thing but sorts everything like in a binary tree.
	
	
	List <Student> arr_stud=new ArrayList<>();
	arr_stud.add(new Student(3,"X"));
	arr_stud.add(new Student(1,"Y"));
	arr_stud.add(new Student(2,"z"));
	
	System.out.println("Using Collections library with overiding Directly\n\n");
	Collections.sort(arr_stud, new Comparator<Student>(){
		public int compare(Student t1, Student t2){
			return t1.rollno-t2.rollno;	
		}
		 
	});
	System.out.println(arr_stud.toString());
	System.out.println(Integer.max(1,2));
	}

	}
	
