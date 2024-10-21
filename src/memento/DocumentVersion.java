package memento;

// Memento: DocumentVersion
public class DocumentVersion {
    private final String content;

    public DocumentVersion(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

