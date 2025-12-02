package CacheImpl;

import java.util.HashMap;
import java.util.Map;

import Interfaces.ICache;

public class LegacyCache implements ICache {
    private final Map<String, Integer> cache = new HashMap<>();

    @Override
    public void put(String k, int v) {
        cache.put(k, v);
    }

    @Override
    public int get(String k) {
        return cache.get(k);
    }
    
    @Override
    public void remove(String k) {
        cache.remove(k);
    }

    public int getSize() {
        return cache.size();
    }
}
