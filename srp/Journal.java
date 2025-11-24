package srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

public void removeEntry(int idx) {
        entries.remove(idx);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

class Persistence {
    public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(filename).exists()) {
            try(PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }
}
