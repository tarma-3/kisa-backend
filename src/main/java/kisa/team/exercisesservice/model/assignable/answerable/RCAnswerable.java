package kisa.team.exercisesservice.model.assignable.answerable;

import kisa.team.exercisesservice.model.assignable.Assignable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor

@Entity
@Table(name = "ASSIGN_SINGLE_CHOICE_ANSWERABLE")
public class RCAnswerable extends Assignable {

    public RCAnswerable(Long id, String type, List<SingleChoiceSentenceChoice> choices){
        super(id,type);
        this.choices = choices;
    }

    @OneToMany
    @JoinColumn(name = "SINGLE_CHOICE_ANSWERABLE", referencedColumnName = "ID")
    List<SingleChoiceSentenceChoice> choices;
    private String type=Assignable.RCAnswerable;
}