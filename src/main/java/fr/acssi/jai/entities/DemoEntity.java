package fr.acssi.jai.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "demo_entity")
@AllArgsConstructor
@NoArgsConstructor
public class DemoEntity {

    @Id
    private Integer testColumn;
}
