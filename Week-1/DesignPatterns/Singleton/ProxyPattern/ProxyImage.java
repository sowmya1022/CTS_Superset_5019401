


import java.util.LinkedHashMap;
import java.util.Map;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    private static final int CACHE_SIZE = 5;
    private static Map<String, RealImage> imageCache = new LinkedHashMap<String, RealImage>(CACHE_SIZE, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<String, RealImage> eldest) {
            return size() > CACHE_SIZE;
        }
    };

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            if (imageCache.containsKey(filename)) {
                realImage = imageCache.get(filename);
            } else {
                realImage = new RealImage(filename);
                imageCache.put(filename, realImage);
            }
        }
        realImage.display();
    }
}