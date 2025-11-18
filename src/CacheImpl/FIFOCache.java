import Interfaces.ICache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FIFOCache<K, V> implements ICache {
    private final int capacity;
    private final Map<K, V> dictMap;
    private final LinkedList<K> queue;

    public FIFOCach(int capacity) {
        this.capacity = capacity;
        this.dictMap = new HashMap<>();
        this.queue = new LinkedList<>();
    }
    @Override
    public  void put(K key, V val) {
        if(containsKey(key)) {
            dictMap.put(key, val);
            queue.remove(key);
            queue.addLast(key);
        } else {
            
        }
    }

    @Override
    public boolean containsKey(K key) {
        return  this.dictMap.containsKey(key);
    }
}
