package kisa.team.exercisesservice.model.assignable;

import kisa.team.exercisesservice.model.assignable.answerable.RCAnswerable;
import kisa.team.exercisesservice.model.assignable.answerable.RCAnswerableTests;
import kisa.team.exercisesservice.model.assignable.constant.StringConstant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignableTests {
    public static class MOCKS {
        public static final String MOCK_STRING_HELLO_WORLD = "Hello world";
        public static final StringConstant MOCK_STRING_CONSTANT_HELLO_WORLD =
                new StringConstant(MOCK_STRING_HELLO_WORLD);
        public static final long MOCK_RC_ANSWERABLE_ON_OFF_ID = 123L;
        public static final RCAnswerable MOCK_RC_ANSWERABLE_ON_OFF =
                new RCAnswerable(MOCK_RC_ANSWERABLE_ON_OFF_ID, RCAnswerableTests.MOCKS.RC_ANSWERABLE.getChoices());

    }

    @Test
    public void getMockStringHelloWorldTextTest() {
        assertEquals(MOCKS.MOCK_STRING_HELLO_WORLD, MOCKS.MOCK_STRING_CONSTANT_HELLO_WORLD.getValue());
    }

    @Test
    public void getMockRCSentenceOnOffIdTest() {
        assertEquals(MOCKS.MOCK_RC_ANSWERABLE_ON_OFF_ID, MOCKS.MOCK_RC_ANSWERABLE_ON_OFF.getId());
    }

    @Test
    public void getMockRCSentenceOnOffAnswerableTest() {
        assertEquals(RCAnswerableTests.MOCKS.answerableChoices.length,
                MOCKS.MOCK_RC_ANSWERABLE_ON_OFF.getChoices().size());
    }
}
