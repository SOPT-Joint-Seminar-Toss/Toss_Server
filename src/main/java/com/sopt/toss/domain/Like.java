package com.sopt.toss.domain;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(columnDefinition = "BOOLEAN DEFAULT true")
    private boolean isLike;

    @Builder
    public Like(Product product, User user, boolean isLike) {
        this.product = product;
        this.user = user;
        this.isLike = isLike;
    }

    public static Like toEntity(User user, Product product) {
        return Like.builder()
                .product(product)
                .user(user)
                .isLike(true)
                .build();
    }

    public void setLike(boolean like) {
        isLike = like;
    }
}
