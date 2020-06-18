package io.pro.jpawithoutforeignkey.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

/***
 * @author Pawan Maurya
 * @since June 16, 2020
 */

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class Address extends Auditable {

    private String fullAddress;
    private String country;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(
            foreignKey = @javax.persistence.ForeignKey(
                    value = ConstraintMode.NO_CONSTRAINT, name = "none"))
    private Student student;
}
