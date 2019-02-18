package inner.classes;

interface Message{
    String greet();
}

class Messenger{
    public void displayMessage(Message m){
        System.out.println(m.greet() + ", This is an example of anonymous inner class as an argument");
    }
}

public class AnonymousInnerAsArgument {

    public static void main(String[] args){
        Messenger messenger = new Messenger();

        messenger.displayMessage(new Message() {
            @Override
            public String greet() {
                return "Hello";
            }
        });

        messenger.displayMessage(() -> "Hey");
    }
}
