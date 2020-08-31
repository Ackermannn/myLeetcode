package sort_algorithm;


import sort_algorithm.simple_selection_sort.SelectSort;

public class Main {
    public static void main(String[] args) {

        Sort s = new SelectSort();

        int[] nums = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        s.sort(nums);
        for (int x : nums) {
            System.out.printf("%d ", x);
        }


    }
}
