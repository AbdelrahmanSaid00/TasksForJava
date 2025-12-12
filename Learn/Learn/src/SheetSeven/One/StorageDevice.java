package SheetSeven.One;

import java.io.IOException;

public class StorageDevice {
    public String readData(String fileName) throws StorageException, IOException {
        if (fileName == null) {
            throw new NullPointerException("fileName must not be null");
        }
        if (fileName.endsWith(".old")) {
            throw new StorageException("unsupported format");
        }
        if (fileName.contains("denied")) {
            throw new IOException("access denied");
        }
        return "data from storage device: " + fileName;
    }
}
