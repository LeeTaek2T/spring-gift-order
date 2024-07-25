package gift.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Orders {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "option_id")
  private Option option;
  private int quantity;

  private String orderDateTime;
  private String message;

  public Orders(Long id, Option option, int quantity, String orderDateTime, String message) {
    this.id = id;
    this.option = option;
    this.quantity = quantity;
    this.orderDateTime = orderDateTime;
    this.message = message;
  }

  protected Orders() {
  }

  public Long getId() {
    return id;
  }

  public Option getOption() {
    return option;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getOrderDateTime() {
    return orderDateTime;
  }

  public String getMessage() {
    return message;
  }
}
