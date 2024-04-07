package com.mirea.textformat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;

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
