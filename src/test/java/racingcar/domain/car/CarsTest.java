package racingcar.domain.car;

import org.junit.jupiter.api.Test;
import racingcar.domain.car.Cars;
import racingcar.domain.move.MoveType;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarsTest {

    @Test
    void 여러_이름들을_준다() {
        Cars cars = new Cars(Arrays.asList("우쾅쾅두둘", "나의행복", "나의사랑"));
        String names = cars.getNames();
        assertThat(names).isEqualTo("우쾅쾅두둘,나의행복,나의사랑");
        assertThat(names).isNotEqualTo("우쾅쾅1두둘,나의행복,나의사2랑");
    }

    @Test
    void 여러_이름들도_모두_5자_이하만_가능하다() {
        assertDoesNotThrow(() -> {
            Cars cars = new Cars(Arrays.asList("우쾅쾅두둘", "나의행복", "나의사랑"));
        });

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Cars cars = new Cars(Arrays.asList("우쾅쾅두둘", "나으행복나으", "나의사랑"));
        });

        assertThat(exception.getMessage()).isEqualTo("자동차에 등록되는 이름은 5자 이하만 가능합니다.");
    }

    @Test
    void 전체_자동차가_이동한다() {
        Cars cars = new Cars(Arrays.asList("우쾅쾅두둘", "나의행복", "나의사랑"));

        cars.move(Arrays.asList(MoveType.GO, MoveType.GO, MoveType.GO));
        List<Integer> position = cars.getPositions();

        assertThat(position.get(0)).isEqualTo(1);
        assertThat(position.get(1)).isEqualTo(1);
        assertThat(position.get(2)).isEqualTo(1);
    }
}
