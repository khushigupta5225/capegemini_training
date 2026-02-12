package junitPractice;

import java.util.List;

public class ListManager {

    public void add(List<Integer> list, int e) {
        list.add(e);
    }

    public void remove(List<Integer> list, int e) {
        list.remove(Integer.valueOf(e));
    }

    public int size(List<Integer> list) {
        return list.size();
    }
}
