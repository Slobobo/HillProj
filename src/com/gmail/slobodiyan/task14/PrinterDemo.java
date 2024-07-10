package com.gmail.slobodiyan.task14;

public class PrinterDemo implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if (message.getText() == null && (message.getSender() == null || message.getSender().isEmpty())) {
            Printer emptyMessageProcessing = new Printer() {

                @Override
                public void print(Message msg) {
                    System.out.println("Processing empty message from anonymous...");
                }
            };
            emptyMessageProcessing.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Anonymous sent message: " + message.getText());
        } else {
            System.out.println("Sender " + message.getSender() + " sent message " + message.getText());
        }
    }

    public static void main(String[] args) {
        Printer printer = new PrinterDemo();

        PrinterDemo.Message message1 = new PrinterDemo.Message("Hi!", "David");
        PrinterDemo.Message message2 = new PrinterDemo.Message("Hi!", null);
        PrinterDemo.Message message3 = new PrinterDemo.Message(null, "");
        PrinterDemo.Message message4 = new PrinterDemo.Message(null, "Alice");
        PrinterDemo.Message message5 = new PrinterDemo.Message(null, null);

        printer.print(message1);
        printer.print(message2);
        printer.print(message3);
        printer.print(message4);
        printer.print(message5);
    }
}