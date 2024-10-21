package mediator;

// ChatMediator Interface
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

