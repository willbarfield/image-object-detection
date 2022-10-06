package com.heb.demo.imageobjectdection.image;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "images")
public class Image {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	private Long id;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;
    
    @Column(name = "vision-scanned")
    private Boolean isVisionScanned;

    @Column(name = "size")
    private Long size;

    public Long getSize() {
        return this.size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Boolean isVisionScanned() {
        return isVisionScanned;
    }

    public void setVisionScanned(Boolean isScanned) {
        this.isVisionScanned = isScanned;
    }
    
    public Long getId() {
        return id;
    }
    
}
