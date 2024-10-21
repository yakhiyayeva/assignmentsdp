package memento;

// Caretaker: VersionControl
import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> savedVersions = new ArrayList<>();
    private List<String> versionNames = new ArrayList<>();

    // Save a new version
    public void saveVersion(DocumentVersion version, String versionName) {
        savedVersions.add(version);
        versionNames.add(versionName);
    }

    // List all saved versions
    public void listVersions() {
        for (int i = 0; i < versionNames.size(); i++) {
            System.out.println((i + 1) + ". " + versionNames.get(i));
        }
    }

    // Get a specific version by index
    public DocumentVersion getVersion(int index) {
        if (index >= 0 && index < savedVersions.size()) {
            return savedVersions.get(index);
        }
        return null;
    }
}


