package bookmanagementcna.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "구독상태조회_table")
@Data
public class 구독상태조회 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    private Boolean joinStatus;
    private Integer point;
}
