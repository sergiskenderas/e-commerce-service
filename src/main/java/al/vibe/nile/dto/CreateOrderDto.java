package al.vibe.nile.dto;

import lombok.Data;
import java.util.List;

@Data
public class CreateOrderDto {
    private Long costumerId;
    private List<CreateOrderItemDto> orderItems;
}
