
import CacheImpl.*;
import Interfaces.ICache;

public class CacheFactory {
    public ICache createCacheInstance(CacheType cacheType, int capacity) {
        switch (cacheType) {
            case FIFO:
                return new FIFOCache(capacity);
            case LRU:
                return new LRUCache(capacity);
            default:
                System.out.println("Cache with type {0} is not implemented yet.");
                throw new AssertionError();
        }
    }
}
