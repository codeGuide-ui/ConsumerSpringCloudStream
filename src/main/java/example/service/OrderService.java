package example.service;

import example.entity.Order;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public interface OrderService {
    Consumer<Message<Order>> userRegistrationConsumer();

}
