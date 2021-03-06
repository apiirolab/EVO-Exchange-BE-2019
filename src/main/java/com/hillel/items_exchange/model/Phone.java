package com.hillel.items_exchange.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"id", "user"})
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "phone_number")
    private long phoneNumber;
    private Boolean show;
    @Column(name = "default_phone")
    private Boolean defaultPhone;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
