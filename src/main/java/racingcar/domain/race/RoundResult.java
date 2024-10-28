package racingcar.domain.race;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.car.Car;

public class RoundResult {
    private final List<CarSnapshot> carSnapshots;

    public RoundResult(List<Car> cars) {
        this.carSnapshots = cars.stream()
                .map(Car::toSnapshot)
                .collect(Collectors.toList());
    }

    public List<CarSnapshot> getCarSnapshots() {
        return carSnapshots;
    }
}
