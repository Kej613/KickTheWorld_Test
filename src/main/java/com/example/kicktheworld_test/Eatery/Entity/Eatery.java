package com.example.kicktheworld_test.Eatery.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="eatery")
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Eatery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eatery_id") // PK
    private Long eatery_id;

    @Column(nullable = false, length=100)
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "address")
    private String address;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String detail;

    @Builder
    public Eatery(String category, String name,
                  String address, String detail) {
        this.category = category;
        this.name=name;
        this.address = address;
        this.detail = detail;
    }
}
