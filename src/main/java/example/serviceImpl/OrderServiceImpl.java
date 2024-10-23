package example.serviceImpl;

import example.entity.Order;
import example.repository.OrderRepository;
import example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    @Bean
    public Consumer<Message<Order>> userRegistrationConsumer() {
        return orderMessage -> {
         Order order=   orderMessage.getPayload();
         repository.save(order);
            System.out.println("order saved!!"+ order.getName());
        };

    }
}
