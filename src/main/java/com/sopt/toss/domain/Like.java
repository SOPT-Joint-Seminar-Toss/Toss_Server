package com.sopt.toss.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

    private boolean isLike = true;

    @Builder
    public Like(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public static Like toEntity(User user, Product product) {
        return Like.builder()
                .product(product)
                .user(user)
                .build();
    }

    public void setLike(boolean like) {
        isLike = like;
    }
}
