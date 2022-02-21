package kisa.team.exercisesservice.model.assignable.answerable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "ASSIGN_SINGLE_CHOICE_ANSWERABLE_ITEM")
public class SingleChoiceSentenceChoice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", updatable = false)
    int id;
    String value;
}
