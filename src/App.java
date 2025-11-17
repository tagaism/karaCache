import CacheImpl.FIFOCache;
import Interfaces.ICache;

public class App {
    public static void main(String[] args) throws Exception{
        testFIFO();        
    }

    private static testFIFO() {
        ICache fifoCache = new FIFOCache();

        fifoCache.put("key1", 111);
        fifoCache.put("key2", 222);
    }
}