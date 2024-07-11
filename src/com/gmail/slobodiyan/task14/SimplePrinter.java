package com.gmail.slobodiyan.task14;

public class SimplePrinter implements Printer {

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
        Printer printer = new SimplePrinter();

        SimplePrinter.Message[] messages = {
                new SimplePrinter.Message("Hi!", "David"),
                new SimplePrinter.Message("Hi!", null),
                new SimplePrinter.Message(null, ""),
                new SimplePrinter.Message(null, "Alice"),
                new SimplePrinter.Message(null, null),
        };
        for (SimplePrinter.Message message : messages) {
            printer.print(message);
        }
    }
}