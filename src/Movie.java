public class Movie {
    final String  title;
    final String studio;
    final String rating;

    Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public static Movie[] getPG(Movie[] movie) {
        Movie[] pgMovie = new Movie[movie.length];
        int idx = 0;
        for (int i = 0; i < movie.length; i++) {
            if (movie[i].rating.equals("PG")) {
                pgMovie[idx] = movie[i];
                idx++;
            }
        }
        return pgMovie;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Casino Royale","Eon Productions","PG");
        Movie movie1 = new Movie("The Dark Knight","Eon Films","PG-13");

        Movie[] pg = new Movie[2];
        pg[0]=movie;
        pg[1]=movie1;
        Movie[] m = getPG(pg);
        for(int i=0; i < m.length; i++){
            if(m[i] != null){
                System.out.println(m[i].title + " "+m[i].rating);
            }
        }

    }
}
