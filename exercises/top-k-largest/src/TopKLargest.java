import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
Task Description:
Complete the “find top k larger number” in an unsorted integer array.

Given an unsorted integer array, return the top k larger number in a sorted list. The k is always less than array size. Make sure the time complexity is less than O(nlogn).

Example 1: [-1, 15, 59, 22, 6, 42, 45, 0], k=4, return {22, 42, 45, 59}

Example 2: [5, 10, 22, 100, 8], k=2, return {22, 100}
 */
public class TopKLargest{
    public static List<Integer> topKLarger(int[] arr, int k) {
    TreeSet<Integer> treeSet = new TreeSet<>();
    for(int num: arr) {
        treeSet.add(num);
        if(treeSet.size()>k) {
            treeSet.pollFirst();
        }
    }
    return treeSet.stream().collect(Collectors.toList());
}
}
