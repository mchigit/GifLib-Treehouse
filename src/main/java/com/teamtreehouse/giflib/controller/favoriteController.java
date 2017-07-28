package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by MICHAELChi on 2017-07-28.
 */

@Controller
public class favoriteController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String getFavGifs(ModelMap modelMap) {
        List<Gif> favGifs = gifRepository.getFavGifs();
        modelMap.put("gifs", favGifs);

        return "favorites";

    }

}
