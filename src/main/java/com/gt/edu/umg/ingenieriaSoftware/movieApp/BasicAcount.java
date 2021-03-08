package com.gt.edu.umg.ingenieriaSoftware.movieApp;

/**
 * 
 */
public class BasicAcount extends UserAcount {

    /**
     * Default constructor
     */
    public BasicAcount() {
    }
    @Override
    public void PlayMovieFull() {
        System.out.println("Reproduciendo Pelicula FULLHD en cuenta  basica");
    }

    @Override
    public void PlayMovieFree() {
        System.out.println("Reproduciendo pelicula gratis en cuenta Basica" );
    }

    @Override
    public void DownloadMovie() throws Exception{
        throw new Exception("Descargando Pelicula en cuenta basica");
    }

    @Override
    public void TakeScreenshot() {
        System.out.println("TOmando screenshot en cuenta Basica");
    }

    @Override
    public void SkipAd() throws Exception{
        throw new Exception("Adelantando anuncios en cuenta basica");
    }

}