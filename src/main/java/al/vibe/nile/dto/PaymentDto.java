package al.vibe.nile.dto;
import al.vibe.nile.entity.PaymentMethod;
import al.vibe.nile.entity.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class PaymentDto {
    private Long id;

    @JsonProperty("payment_date")
    private LocalDateTime paymentDate;

    private String amount;

    @JsonProperty("payment_method")
    private PaymentMethod paymentMethod;

    @JsonProperty("payment_status")
    private PaymentStatus paymentStatus;

    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

}
