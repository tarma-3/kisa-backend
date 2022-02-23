package kisa.team.exercisesservice.mapper;

import kisa.team.exercisesservice.dto.rc.assignables.AssignableDTO;
import kisa.team.exercisesservice.dto.rc.assignables.RCAnswerableDTO;
import kisa.team.exercisesservice.dto.rc.assignables.StringConstantDTO;
import kisa.team.exercisesservice.model.assignable.Assignable;
import kisa.team.exercisesservice.model.assignable.answerable.RCAnswerable;
import kisa.team.exercisesservice.model.assignable.answerable.SingleChoiceSentenceChoice;
import kisa.team.exercisesservice.model.assignable.constant.StringConstant;

import java.util.stream.Collectors;

public class AssignableToDTOMapper {
    public static AssignableDTO map(Assignable assignable) {
        if (assignable.getType().equals(Assignable.RCAnswerable)) {
            RCAnswerable rc = (RCAnswerable) assignable;
            return new RCAnswerableDTO(rc.getType(),
                    rc.getChoices().stream().map(SingleChoiceSentenceChoice::getValue)
                            .toArray(String[]::new));
        } else {
            StringConstant st = (StringConstant) assignable;
            return new StringConstantDTO(assignable.getType(), st.getValue());
        }
    }
}
