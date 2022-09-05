package projetoyoutube;

public class Video implements ActionsVideo {

    private String title;
    private int evaluation;
    private int views;
    private int likes;
    private int deslikes;
    private int comments;
    private int shares;
    private boolean reproducing;

    public Video(String title) {
        this.title = title;
        this.evaluation = 1;
        this.views = 0;
        this.likes = 0;
        this.comments = 0;
        this.deslikes = 0;
        this.shares = 0;
        this.reproducing = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        int novaAvaliacao = (this.evaluation + evaluation) / this.views;

        this.evaluation = novaAvaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDeslikes() {
        return deslikes;
    }

    public void setDeslikes(int deslikes) {
        this.deslikes = deslikes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public boolean isReproducing() {
        return reproducing;
    }

    public void setReproducing(boolean reproducing) {
        this.reproducing = reproducing;
    }

    @Override
    public void play() {
        this.reproducing = true;
    }

    @Override
    public void pause() {
        this.reproducing = false;
    }

    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public void deslike() {
        this.deslikes++;
    }

    @Override
    public void comment() {
        this.comments++;
    }

    @Override
    public void share() {
        this.shares++;
    }

    @Override
    public String toString() {
        return "Video { " +
                "title: '" + title + '\'' +
                " | evaluation: " + evaluation +
                " | views: " + views +
                " | likes: " + likes +
                " | deslikes: " + deslikes +
                " | comments: " + comments +
                " | shares: " + shares +
                " | reproducing: " + reproducing + "| " +
                '}';
    }

}
