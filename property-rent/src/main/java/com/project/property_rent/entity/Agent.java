package com.project.property_rent.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Agent")
public class Agent {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(
            nullable = false,
            unique = true
    )
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String emailId;

    private String phoneNum;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
