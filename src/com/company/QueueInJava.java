package com.company;

import java.util.*;

/**
 * Created by laileon on 2017/7/20.
 */

//“Java 中提供PriorityQueue类，该类是 Interface Queue 的另外一种实现，和LinkedList的区别主要在于排序行为而不是性能，
//        基于 priority heap 实现，非synchronized，故多线程下应使用PriorityBlockingQueue. 默认为自然序（小根堆），
//        需要其他排序方式可自行实现Comparator接口，选用合适的构造器初始化。使用迭代器遍历时不保证有序，
//        有序访问时需要使用Arrays.sort(pq.toArray()).”

public class QueueInJava {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        int size = queue.size();

//    JDK doc 中建议使用Deque代替Stack实现栈，因为Stack继承自Vector，需要synchronized，性能略低。
        //栈
        Deque<Integer> stack = new ArrayDeque<>();
        int getSize = stack.size();

//    “Set 与 Collection 具有安全一样的接口，通常有HashSet, TreeSet 或 LinkedHashSet三种实现。
//    HashSet基于散列函数实现，无序，查询速度最快；TreeSet基于红-黑树实现，有序。”
        Set<String> hash = new HashSet<>();
        hash.add("bill");
        hash.contains("bill");

//        “Java 的实现中 Map 是一种将对象与对象相关联的设计。常用的实现有HashMap和TreeMap, HashMap被用来快速访问，
//        而TreeMap则保证『键』始终有序。Map 可以返回键的 Set, 值的 Collection, 键值对的 Set.”
        Map<String, Integer> map = new HashMap<>();
        //遍历
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
        }
    }

}
