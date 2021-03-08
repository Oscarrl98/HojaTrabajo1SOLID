package com.gt.edu.umg.ingenieriaSoftware.movieApp;

/**
 * 
 */
public class PremiumAcount extends UserAcount {

    public PremiumAcount() {
    }
    @Override
    public void PlayMovieFull() {
        System.out.println("Reproduciendo Pelicula en cuenta premium");
    }

    @Override
    public void PlayMovieFree() {
        System.out.println("Reproduciendo pelicula gratis en cuenta PRemium");
    }

    @Override
    public void DownloadMovie() {
        System.out.println("Descargando Pelicula en cuenta premium");
    }

    @Override
    public void TakeScreenshot() {
        System.out.println("TOmando screenshot en cuenta premium");
    }

    @Override
    public void SkipAd() {
        System.out.println("Adelantando anuncios en cuenta PRemium");
    }

}