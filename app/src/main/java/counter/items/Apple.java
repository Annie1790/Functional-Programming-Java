package counter.items;

import counter.Countable;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public record Apple(Colour colour, LocalDate datePicked, LocalDate bestBefore) implements Countable {

    public int getCount() {
        return 1;
    }

    }
