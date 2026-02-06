import java.util.*;

public class AllCollectionsDemo {
    public static void main(String[] args) {

        // ---------- List ----------
        System.out.println("List (ArrayList):");
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list);

        // ---------- LinkedList ----------
        System.out.println("\nLinkedList:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.addFirst(5);
        System.out.println(linkedList);

        // ---------- Set ----------
        System.out.println("\nSet (HashSet):");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");  // duplicate will be ignored
        System.out.println(hashSet);

        // ---------- LinkedHashSet ----------
        System.out.println("\nLinkedHashSet:");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("One");
        System.out.println(linkedHashSet);

        // ---------- TreeSet ----------
        System.out.println("\nTreeSet (sorted):");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        System.out.println(treeSet);

        // ---------- Queue ----------
        System.out.println("\nQueue (PriorityQueue):");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        System.out.println(priorityQueue);

        // ---------- ArrayDeque ----------
        System.out.println("\nDeque (ArrayDeque):");
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println(deque);

        // ---------- HashMap ----------
        System.out.println("\nMap (HashMap):");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 100);
        hashMap.put("B", 200);
        System.out.println(hashMap);

        // ---------- TreeMap ----------
        System.out.println("\nTreeMap (sorted keys):");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Z", 9);
        treeMap.put("A", 1);
        treeMap.put("M", 5);
        System.out.println(treeMap);

        // ---------- LinkedHashMap ----------
        System.out.println("\nLinkedHashMap (insertion order):");
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("India", "Delhi");
        linkedHashMap.put("USA", "Washington");
        linkedHashMap.put("Japan", "Tokyo");
        System.out.println(linkedHashMap);
    }
}
