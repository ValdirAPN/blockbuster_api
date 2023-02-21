package br.edu.ufersa.blockbuster.api.dto;

import br.edu.ufersa.blockbuster.domain.entity.AdvisoryRating;
import br.edu.ufersa.blockbuster.domain.entity.Gender;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

public class MovieFormDto {
    @NotNull(message = "O título não pode ser null")
    private String title;
    @NotNull(message = "A duração não pode ser null")
    private Long duration;
    @NotNull(message = "A data de lançamento não pode ser null")
    private LocalDate releaseDate;
    @NotNull(message = "O gênero não pode ser null")
    private Gender gender;
    @NotNull(message = "A classificação indicativa não pode ser null")
    private AdvisoryRating advisoryRating;
    @NotNull(message = "A URL da imagem não pode ser null")
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public AdvisoryRating getAdvisoryRating() {
        return advisoryRating;
    }

    public void setAdvisoryRating(AdvisoryRating advisoryRating) {
        this.advisoryRating = advisoryRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
