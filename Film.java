class Film{

    public String filmnavn;
    public String filmid;
    public Film(String fn, String fi){
        filmnavn = fn;
        filmid = fi;
    }
    public String toString(){
        return "Film_name: " + filmnavn + "\n " + "filmid: " + filmid;
    }
    public String hentfilm(){
        return filmid + filmnavn;
    }
}
