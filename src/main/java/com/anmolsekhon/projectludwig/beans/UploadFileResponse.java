package com.anmolsekhon.projectludwig.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadFileResponse implements Serializable {

    private String filename;
    private String fileDownloadUri;
    private String fileType;
    private long size;

}
