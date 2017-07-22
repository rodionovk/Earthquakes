package ru.inno.earthquakes.di.earthquakes;

import dagger.Subcomponent;
import ru.inno.earthquakes.presentation.alertscreen.AlertPresenter;

/**
 * @author Artur Badretdinov (Gaket)
 *         22.07.17.
 */
@Subcomponent(modules = {EarthquakesModule.class, LocationModule.class})
@EarthquakesScope
public interface EarthquakesComponent {
    void inject(AlertPresenter alertPresenter);
}
