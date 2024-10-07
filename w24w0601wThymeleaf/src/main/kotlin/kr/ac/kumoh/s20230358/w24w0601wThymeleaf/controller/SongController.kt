package kr.ac.kumoh.s20230358.w24w0601wThymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/song/random")
    fun  getRandomSong(): String{
        return "random"
    }

}