package prototype;

public class Movie {

    private int movieId;
    private String movieName;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + movieId +
                ", bookName='" + movieName + '\'' +
                '}';
    }
}
