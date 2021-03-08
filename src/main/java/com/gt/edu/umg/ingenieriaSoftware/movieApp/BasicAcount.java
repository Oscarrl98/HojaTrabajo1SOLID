package com.gt.edu.umg.ingenieriaSoftware.movieApp;

/**
 * 
 */
public class BasicAcount extends UserAcount implements IPlayFHDMovieAction,ITakeScreenAction {

    /**
     * Default constructor
     */
    public BasicAcount() {
    }

    @Override
    public void PlayMovieFree() {
        System.out.println("Reproduciendo pelicula gratis en cuenta Basica" );
    }


    @Override
    public void PlayMovieFull() {
        System.out.println("Reproduciendo pelicula FULLHD en cuenta Basica" );

    }

    @Override
    public void TakeScreenSHot() {
        System.out.println("Tomando Captura de pelicula gratis en cuenta Basica" );

    }
}