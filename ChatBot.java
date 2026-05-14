import java.util.*;
public class ChatBot{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" I am Chatbot how i can help you!!");
        while(true){
            System.out.print("You:");
            String message=sc.nextLine();
            message=message.toLowerCase();
            if(message.contains("hi") || message.contains("hello")) {
                System.out.println("ChatBot: Hello! How can I assist you today?");
            }
            else if(message.contains("price")){
                System.out.println("ChatBot: The Price of the product is $100");
            }
            else if(message.contains("delivery")){
                System.out.println("ChatBot: The product will be delivered within 5-7 working days.");
            }
            else if(message.contains("return")){
                System.out.println("ChatBot: You can return the product within 7 days of purchase.");
            }
            else if(message.contains("bye")){
                System.out.println("ChatBot: Thank you for chatting with me. Have a great day!");
                break;
            }
            else{
                System.out.println("ChatBot: I'm sorry, I didn't understand that. Can you please rephrase?");
            }
        }
    }
}