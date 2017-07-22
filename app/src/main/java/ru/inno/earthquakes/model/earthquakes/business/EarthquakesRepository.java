package ru.inno.earthquakes.model.earthquakes.business;

import java.util.List;

import io.reactivex.Observable;
import ru.inno.earthquakes.entity.Earthquake;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.07.17.
 */
public interface EarthquakesRepository {

    Observable<List<Earthquake>> getTodaysEarthquakes();
}
