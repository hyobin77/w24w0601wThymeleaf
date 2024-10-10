package kr.ac.kumoh.s20230358.w24w0601wThymeleaf.controller

import kr.ac.kumoh.s20230358.w24w0601wThymeleaf.service.SongService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController(val service: SongService) {
    @GetMapping("/song/random")
    fun  getRandomSong(model: Model): String{
        model.addAttribute("song",service.getRandomSong())
        return "random"
    }

}