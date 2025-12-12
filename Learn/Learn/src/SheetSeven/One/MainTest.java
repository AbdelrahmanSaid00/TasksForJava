package SheetSeven.One;

import java.io.IOException;

public class MainTest {
    public static void main(String[] args) {
        StorageDevice device = new FlashDrive();

        String[] files = {
                null,
                "oldfile.old",
                "doc_denied.txt",
                "infected_virus.data",
                "temp.tmp",
                "normal.txt"
        };

        for (String file : files) {
            try {
                String result = device.readData(file);
                System.out.println(result);
            } catch (CorruptedFileException e) {
                System.out.println("CorruptedFileException: " + e.getMessage());

            } catch (StorageException e) {
                System.out.println("StorageException: " + e.getMessage());

            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());

            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
            }
        }
    }
}
