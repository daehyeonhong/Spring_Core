package hello.upload.controller;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemForm {
    Long itemId;
    String itemName;
    List<MultipartFile> imageFiles;
    MultipartFile attachFile;
}
