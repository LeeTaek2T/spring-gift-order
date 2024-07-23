package gift.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ProductDto {

  private Long id;

  @Size(min = 1, max = 15, message = "가능한 글자 수는 1~15입니다.")
  @Pattern.List({
    @Pattern(regexp = "^[가-힣a-zA-Z0-9()\\[\\]+\\-&/_]*$", message = "유효한 이름이 아닙니다"),
    @Pattern(regexp = "^(?!.*카카오).*$", message = "'카카오' 포함된 경우 담당 MD와 협의가 필요합니다.")
  })
  @NotBlank
  private String name;

  @Min(value = 1)
  private int price;

  @NotBlank
  private String imageUrl;

  private CategoryDto categoryDto;

  public ProductDto() {
  }

  public ProductDto(Long id, String name, int price, String imageUrl, CategoryDto categoryDto) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.imageUrl = imageUrl;
    this.categoryDto = categoryDto;
  }

  public ProductDto(String name, int price, String imageUrl, CategoryDto categoryDto) {
    this.name = name;
    this.price = price;
    this.imageUrl = imageUrl;
    this.categoryDto = categoryDto;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public CategoryDto getCategoryDto() {
    return this.categoryDto;
  }
}


