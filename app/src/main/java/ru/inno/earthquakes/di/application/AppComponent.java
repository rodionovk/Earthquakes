package ru.inno.earthquakes.di.application;

import javax.inject.Singleton;

import dagger.Component;
import ru.inno.earthquakes.di.earthquakes.EarthquakesComponent;
import ru.inno.earthquakes.di.earthquakes.EarthquakesModule;

/**
 * @author Artur Badretdinov (Gaket)
 *         21.07.17.
 */
@Component(modules = {AppModule.class, RetrofitModule.class})
@Singleton
public interface AppComponent {

    EarthquakesComponent plusEarthquakesComponent(EarthquakesModule module);
}
