package al.vibe.nile.dto;
import al.vibe.nile.entity.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import al.vibe.nile.entity.Costumer;
import al.vibe.nile.entity.OrderStatus;
import al.vibe.nile.entity.Payment;
import java.util.List;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CreateOrderDto {
    @JsonProperty("order_number")
    private String orderNumber;
    @JsonProperty("order_date")
    private LocalDateTime orderDate;
    @JsonProperty("order_status")
    private OrderStatus orderStatus;
    @JsonProperty("total_amount")
    private Integer totalAmount;
    @JsonProperty("payment_method")
    private Payment paymentMethod;
    private List<Product> items;
    private Costumer costumer;
}
