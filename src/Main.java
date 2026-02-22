public class Main {
    public static  void main(String[] args){
        ChatMediator mediator=new ChatMediatorImpl();
        User user1=new ChatUser(mediator,"Saumya");
        User user2=new ChatUser(mediator,"Riya");
        User user3=new ChatUser(mediator,"sassy");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        user1.send("HELLLLO FRIENDS!");
        user2.send("Hi all");

    }
}