package com.mirea.textformat.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class FileForm {

  private String name;
  private String email;
  private MultipartFile file;

  public FileForm() {
    this.name = "";
    this.email = "";
    this.file = null;
  }

  public FileForm(String name, String email, MultipartFile file) {
    this.name = name;
    this.email = email;
    this.file = file;
  }

  public MultipartFile getFile() {
    return this.file;
  }
}
