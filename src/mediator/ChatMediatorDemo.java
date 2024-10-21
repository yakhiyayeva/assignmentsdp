package mediator;

public class ChatMediatorDemo {
    public static void main(String[] args) {
        // Create ChatRoom (mediator)
        ChatMediator chatRoom = new ChatRoom();

        // Create Users
        User john = new RegularUser(chatRoom, "John");
        User alice = new PremiumUser(chatRoom, "Alice");
        User bob = new RegularUser(chatRoom, "Bob");

        // Add users to the chat room
        chatRoom.addUser(john);
        chatRoom.addUser(alice);
        chatRoom.addUser(bob);

        // Users send messages via the mediator (chat room)
        john.send("Hello everyone!");
        alice.send("Hi John!");
        bob.send("Hey Alice!");
    }
}

