package com.gt.edu.umg.ingenieriaSoftware.movieApp;

/**
 * 
 */
public class FreeAccount extends UserAcount {

    public FreeAccount() {
    }
    @Override
    public void PlayMovieFull()throws Exception {
        throw new Exception("Reproduciendo Pelicula FULL HD en cuenta gratis");
    }

    @Override
    public void PlayMovieFree() {
        System.out.println("Reproduciendo pelicula gratis en cuenta gratis");
    }

    @Override
    public void DownloadMovie()throws Exception {
        throw new Exception("Descargando Pelicula en cuenta gratis");
    }

    @Override
    public void TakeScreenshot() throws Exception{
        throw new Exception("TOmando screenshot en cuenta Gratis");
    }

    @Override
    public void SkipAd()throws Exception {
        throw new Exception("Adelantando anuncios en cuenta gratis");
    }
}