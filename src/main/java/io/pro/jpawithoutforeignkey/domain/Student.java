package io.pro.jpawithoutforeignkey.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/***
 * @author Pawan Maurya
 * @since June 16, 2020
 */

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student extends Auditable {
    private String name;
    private int age;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @javax.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT, name = "none"))
    private List<Address> address;

    public void addAddress(Address newAddress) {
        newAddress.setStudent(this);
    }
}
