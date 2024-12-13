package com.project.property_rent.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name= "customer",
        uniqueConstraints = @UniqueConstraint(
                name = "emailId_unique",
                columnNames = "emailId"
        )
)
public class Customer {
    @Id
    @SequenceGenerator(
            name ="customer_sequence",
            sequenceName ="customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    private String emailId;
}
