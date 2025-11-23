package Interfaces;

public interface  ICache {
    void put(String key, int val);

    int get(String key);

    int remove(String key);

    //optional methods

    void clear();

    int getSize();

    boolean containsKey(String key);
}
