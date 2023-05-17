package com.sopt.toss.domain;

import javax.persistence.*;

import com.sopt.toss.controller.product.dto.request.PresentReqDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Present {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CardType cardType;


    @Builder
    public Present(Product product, User user, String content, CardType cardType) {
        this.product = product;
        this.user = user;
        this.content = content;
        this.cardType = cardType;
    }

    public static Present toEntity(User user, Product product, String cardType, String content) {
        return Present.builder()
                .product(product)
                .user(user)
                .content(content)
                .cardType(CardType.valueOf(cardType))
                .build();
    }

}
