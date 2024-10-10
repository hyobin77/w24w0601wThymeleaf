package kr.ac.kumoh.s20230358.w24w0601wThymeleaf.service

import kr.ac.kumoh.s20230358.w24w0601wThymeleaf.repository.SongRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class SongService(val repository: SongRepository) {
    fun getRandomSong() = repository.getSong(Random.nextInt(repository.songSize))
    fun getAllSong() = repository.fetchSong()
}