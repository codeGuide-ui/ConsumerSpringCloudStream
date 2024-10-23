package example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;
    private String quantity;
    private String name;
}
