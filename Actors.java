import java.util.ArrayList;

class Actors {
    // public Film film ;
    public String navn ;
    public String id;
    ArrayList<Film> films = new ArrayList<>();

    public Actors(String act_navn, String personid){
        // this.film = film;
        navn = act_navn;
        id = personid;

    }

    public void leggtilfilm(Film film){
        films.add(film);
    }

    public ArrayList<Film> hentfilms(){
        return films;
    }




    public String toString(){
         return "Actor's_name: " + navn + "\n " + "Personid: " + id;
    }


}
