import Interfaces.ICache;

public class FIFOCache implements ICache {
    @Override
    public void put(String key, int val) {
        // throw new UnsupportedOperationException(message: "Unimplemented method.");
    }
    
    @Override
    public int get(String key) {
        return 11;
        // throw new UnsupportedOperationException(message: "Unimplemented method.");
    }

    @Override
    public int remove(String key) {
        return 17;
        // throw new UnsupportedOperationException(message: "Unimplemented method.");
    }

    @Override
    public void clear() {
        // throw new UnsupportedOperationException(message: "Unimplemented method.");
    }

    @Override
    public int getSize() {
        return 28;
        // throw new UnsupportedOperationException(message: "Unimplemented method.");
    }

    @Override
    public boolean containsKey(String key) {
        return true;
        // throw new UnsupportedOperationException(message: "Unimplemented method.");
    }
}
