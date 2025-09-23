package com.franciscob.demo_proyectoSolicitudVacaciones.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "album")
public class Canciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AlbumId", nullable = false)
    private Integer albumId;  // mejor usar Integer para 'int'

    @Size(min = 10, max = 160)
    @Column(name = "Title", nullable = false, length = 160)
    private String title;

    public Canciones() {
    }

    public Canciones(Integer albumId, String title) {
        this.albumId = albumId;
        this.title = title;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Canciones{" +
                "albumId=" + albumId +
                ", title='" + title + '\'' +
                '}';
    }
}
