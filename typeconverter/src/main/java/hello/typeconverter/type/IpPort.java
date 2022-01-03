package hello.typeconverter.type;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IpPort {
    String ip;
    int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
