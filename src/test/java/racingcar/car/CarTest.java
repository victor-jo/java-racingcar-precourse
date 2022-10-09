package racingcar.car;

import org.junit.jupiter.api.Test;
import racingcar.move.MoveType;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static racingcar.move.MoveType.GO;
import static racingcar.move.MoveType.STOP;

public class CarTest {

    @Test
    void 자동차에_등록된_이름을_준다() {
        Car car = new Car("나의행복");
        String carName = car.getName();
        assertThat(carName).isEqualTo("나의행복");
        assertThat(carName).isNotEqualTo("나의 행복");
    }

    @Test
    void 자동차에_등록되는_이름은_5자_이하만_가능하다() {
        assertDoesNotThrow(() -> {
            Car car = new Car("나으행복나");
        });

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car("나으행복나으");
        });

        assertThat(exception.getMessage()).isEqualTo("자동차에 등록되는 이름은 5자 이하만 가능합니다.");
    }

    @Test
    void 자동차가_이동한다() {
        Car car = new Car("우리가바로");

        car.move(MoveType.GO);
        int position = car.getPosition();

        assertThat(position).isEqualTo(1);
        assertThat(position).isNotEqualTo(0);
    }

    @Test
    void 자동차가_아무것도_안한다() {
        Car car = new Car("우리가바로");

        car.move(STOP);
        int position = car.getPosition();

        assertThat(position).isEqualTo(0);
        assertThat(position).isNotEqualTo(1);
    }

    @Test
    void 자동차가_특정이름으로_표시된다() {
        Car car = new Car("표시되야할");
        Car moveCar = new Car("움직인");

        moveCar.move(GO);
        moveCar.move(GO);

        assertThat(car.toString()).isEqualTo("표시되야할 : ");
        assertThat(moveCar.toString()).isEqualTo("움직인 : --");
    }
}
