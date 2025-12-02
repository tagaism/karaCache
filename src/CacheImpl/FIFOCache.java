import Interfaces.ICache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FIFOCache<K, V> implements ICache {
    int capacity;
    String server;
    
    public FIFOCache(int capacity) {
        this.capacity = capacity;
        this.server = "Global IT server";
    }

    @Override
    public void put(String k, int v) {
        throw new UnsupportedOperationException(message: "Unimplemented method 'put'");
    }

    @Override
    public void get(String k) {
        throw new UnsupportedOperationException(message: "Unimplemented method 'get'");
    }

    @Override
    public void remove(String k) {
        throw new UnsupportedOperationException(message: "Unimplemented method 'remove'");
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setServer(String str) {
        this.server = str;
    }
}
