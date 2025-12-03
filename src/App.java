import CacheImpl.CacheType;
import Interfaces.ICache;

public class App {
    public static void main(String[] args) throws Exception{        
        // testFIFO();

        testFIFOwithFactory();
    }

    private static void testFIFOwithFactory() {
        ICache fifoWithFactory = new CacheFactory().createCacheInstance(CacheType.FIFO, 10);
        fifoWithFactory.put("key1", 11);
        fifoWithFactory.put("key2", 22);
        fifoWithFactory.put("key3", 33);
        fifoWithFactory.put("key4", 44);

    }
    private static void testFIFO() {
        ICache fifoCache = new FIFOCache();
        fifoCache.put("key1", 1);
        fifoCache.put("key2", 22);
        fifoCache.put("key3", 33);

        fifoCache.remove("key3");
        System.out.println(fifoCache.getSize()); // 2
        System.out.println(fifoCache.get("key")); //3
    }
    // private static void testFIFO() {
    //     ICache fifoCache = new FIFOCache();

    //     fifoCache.put("key1", 111);
    //     System.out.println(fifoCache.get("key1"));
    //     System.out.println(fifoCache);
    //     fifoCache.put("key2", 222);
    // }
}