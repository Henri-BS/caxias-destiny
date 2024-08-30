package com.pasifcode.caxias_destiny.domain.entity;

import com.pasifcode.caxias_destiny.domain.enums.ImageExtension;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_image")
@EntityListeners(AuditingEntityListener.class)
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "image_id")
    private UUID id;
    private String name;
    private String font;
    @CreatedDate
    private LocalDateTime uplaodDate;
    @Enumerated(EnumType.STRING)
    private ImageExtension imageExtension;
    @Lob
    private byte[] file;

}
