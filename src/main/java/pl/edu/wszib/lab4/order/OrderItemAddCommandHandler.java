package pl.edu.wszib.lab4.order;

import pl.edu.wszib.lab4.CommandHandler;

public class OrderItemAddCommandHandler implements CommandHandler<OrderItemAddCommand> {
    @Override
    public void handle(OrderItemAddCommand command) {
        System.out.println("Real impl for command = " + command);
    }
}
