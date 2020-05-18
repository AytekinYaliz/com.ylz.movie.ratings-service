package com.ylz.movie.ratingsservice.resources;

import com.ylz.movie.ratingsservice.models.Rating;
import com.ylz.movie.ratingsservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("123", 4),
                new Rating("555", 3)
        );

        UserRating userRating = new UserRating();
        userRating.setRatings(ratings);

        return userRating;
    }
}
