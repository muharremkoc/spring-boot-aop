package com.aop.springbootaop.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USERS")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


    String firstName;

    String lastName;

    int age;
}
