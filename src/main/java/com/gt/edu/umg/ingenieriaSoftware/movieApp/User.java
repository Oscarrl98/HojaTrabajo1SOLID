package com.gt.edu.umg.ingenieriaSoftware.movieApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@Controller
public class User {

    public User() {
    }

    @RequestMapping("/playMovie")
    public String start() throws Exception {
            
        this.playFreeAcount(new FreeAccount());
        this.takeScreenAcount(new BasicAcount());
        this.playMovieFHDAcount(new BasicAcount());
        this.downloadmovieAcount(new PremiumAcount());
        this.skipAdacount(new PremiumAcount());
        this.playMovieFHDAcount(new PremiumAcount());
        return "Ejecutando";
    }
    public void playMovieFHDAcount(IPlayFHDMovieAction acount)throws Exception{
        acount.PlayMovieFull();
 }
    public void skipAdacount(ISkipAdAction acount)throws Exception{
        acount.SkipAd();
    }
    public void takeScreenAcount(ITakeScreenAction acount)throws Exception{
        acount.TakeScreenSHot();
    }
    public void downloadmovieAcount(IDownloadMovieAction acount)throws Exception{
        acount.DownloadMovie();
    }
    public void playFreeAcount(UserAcount acount)throws Exception{
        acount.PlayMovieFree();
    }
}