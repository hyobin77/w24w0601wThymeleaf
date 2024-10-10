package kr.ac.kumoh.s20230358.w24w0601wThymeleaf.repository

import kr.ac.kumoh.s20230358.w24w0601wThymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository{
    protected val song= listOf(
        Song(1, "Happy","Day6"),
        Song(2,"Bluemoon","엔플라잉"),
        Song(3, "관객이 될게","아이유")
    )
    val songSize: Int
        get() = song.size

    fun getSong(index: Int) = song[index]

    fun fetchSong() = song
}