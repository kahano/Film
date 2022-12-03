class Filmparticipation  implements Filmtype, Filmgenre{

    public String filmtype = null;
    public String genre = null;
    public Film film ;
    public Actors actor;

    public Filmparticipation(Film film, Actors actor ){
        this.film = film;
        this.actor = actor;
    }



    public boolean check_film(Film fi){
        if(this.film.hentfilm().equals(fi.hentfilm())){
            return true;
        }
        return false;
    }

    




    @Override
    public String type (String type){
        filmtype = type;
        return filmtype;

    }

    @Override

    public String genre (String filmgenre){

        genre = filmgenre;
        return genre;


    }


    public String toString(){
        return "film: "+ film.toString() + "\n " + "Actor:" + actor.toString() + "\n " + "filmtype: " + filmtype + "\n " + "filmgenre: " + genre;
    }

}
