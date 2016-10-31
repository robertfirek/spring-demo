package com.example.pure;

public class ApplicationPure
{
    public static void main( String[] args )
    {
        MessageService messageService = new MessageService();
        MessagePrinter messagePrinter = new MessagePrinter(messageService);

        messagePrinter.printMessage();
    }
}
