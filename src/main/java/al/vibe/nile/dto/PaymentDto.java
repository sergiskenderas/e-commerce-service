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
    private LocalDateTime paymentDate;
    private String amount;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;
    private String transactionId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long costumerId;

}

