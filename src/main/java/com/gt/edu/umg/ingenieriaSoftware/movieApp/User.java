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
        this.playMovieFHDAcount(new FreeAccount());
        this.playFreeAcount(new FreeAccount());
        this.takeScreenAcount(new FreeAccount());
        this.takeScreenAcount(new BasicAcount());
        this.downloadmovieAcount(new BasicAcount());
        this.downloadmovieAcount(new PremiumAcount());
        return "Ejecutando";
    }
    public void playMovieFHDAcount(UserAcount acount)throws Exception{
        acount.PlayMovieFull();
 }
    public void skipAdacount(UserAcount acount)throws Exception{
        acount.SkipAd();
    }
    public void takeScreenAcount(UserAcount acount)throws Exception{
        acount.TakeScreenshot();
    }
    public void downloadmovieAcount(UserAcount acount)throws Exception{
        acount.DownloadMovie();
    }
    public void playFreeAcount(UserAcount acount)throws Exception{
        acount.PlayMovieFree();
    }
}