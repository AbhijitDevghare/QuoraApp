package com.quoraapp.quora_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(org.springframework.data.jpa.domain.support.AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
abstract public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    @CreatedDate
    private  LocalDateTime  createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
