package hello.upload.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Item {
    Long id;
    String itemName;
    UploadFile attachFile;
    private List<UploadFile> imageFiles;
}
