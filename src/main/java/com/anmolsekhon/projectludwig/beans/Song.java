package com.anmolsekhon.projectludwig.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song implements Serializable {
    private Long id;
    private String filename;

    public Song(String filename) {
        this.filename = filename;
    }
}
