package projetoyoutube;

public class Visualization {

    private Student viewer;
    private Video movie;

    public Visualization(Student viewer, Video movie) {
        this.viewer = viewer;
        this.movie = movie;
        this.viewer.setTotalAssisted(this.viewer.getTotalAssisted() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }

    public Student getViewer() {
        return viewer;
    }

    public void setViewer(Student viewer) {
        this.viewer = viewer;
    }

    public Video getMovie() {
        return movie;
    }

    public void setMovie(Video movie) {
        this.movie = movie;
    }

    public void evaluates() {
        this.movie.setEvaluation(5);
    }

    public void evaluates(int note) {
        this.movie.setEvaluation(note);
    }

    public void evaluates(double percentage) {
        int total = 0;

        if (percentage <= 20) {
            total = 3;
        } else if (percentage > 20 && percentage <= 50) {
            total = 5;
        } else if (percentage > 50 && percentage <= 90) {
            total = 8;
        } else {
            total = 10;
        }

        this.movie.setEvaluation(total);
    }

    @Override
    public String toString() {
        return "Visualization{" +
                "viewer=" + viewer +
                ", movie=" + movie +
                '}';
    }
}
