package memento;

// Originator: Document
public class Document {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Create a new memento to save the current state
    public DocumentVersion save() {
        return new DocumentVersion(content);
    }

    // Restore the document's state from a memento
    public void restore(DocumentVersion memento) {
        this.content = memento.getContent();
    }
}

