class Filmcountry {

    public String country_name;
    public Filmparticipation film ;
    

    public Filmcountry(Filmparticipation film,String name){
        this.film = film;
        country_name = name;
    }


    public String toString(){
        return  "country: " + country_name;

    }





}
