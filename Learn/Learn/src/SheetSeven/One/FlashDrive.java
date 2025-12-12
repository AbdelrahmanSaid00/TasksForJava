package SheetSeven.One;

import java.io.IOException;

public class FlashDrive extends StorageDevice {
    @Override
    public String readData(String fileName) throws StorageException, IOException {

        if (fileName == null) {
            throw new NullPointerException("fileName must not be null");
        }

        if (fileName.contains("virus")) {
            throw new CorruptedFileException("unsupported format");
        }

        if (fileName.endsWith(".tmp")) {
            throw new IOException("temporary file cannot be read");
        }

        return "data from flash drive: " + fileName;
    }
}
