package racingcar.move;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.move.Position;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    @Test
    void 위치값이_하나_증가한다() {
        Position position = new Position(0);

        position.go();

        assertThat(position.get()).isEqualTo(1);
    }

    @Test
    @DisplayName("비교했을때_내_위치가_높으면_-1을_준다")
    void compareTest1() {
        Position me = new Position(1);
        Position other = new Position(0);

        assertThat(me.compareTo(other)).isEqualTo(-1);
    }

    @Test
    @DisplayName("비교했을때_내_위치랑_똑같으면_0을_준다")
    void compareTest2() {
        Position me = new Position(1);
        Position other = new Position(1);

        assertThat(me.compareTo(other)).isEqualTo(0);
    }

    @Test
    @DisplayName("비교했을때_내_위치가_낮으면_1을_준다")
    void compareTest3() {
        Position me = new Position(0);
        Position other = new Position(1);

        assertThat(me.compareTo(other)).isEqualTo(1);
    }

    @Test
    @DisplayName("Equals_메시지를_호출했을때_위치가_동일하면_동일하다")
    void equalsTest() {
        Position me = new Position(2);
        Position other = new Position(2);

        assertEquals(me, other);
    }
}
