class Testfilm{

    public static void main(String[] args){
        try{
            Film james_007 = new Film("007","3463921");
            Film diehard = new Film("DieHard ", "8576366");
            Film marsAttack = new Film("MarsAttack","8703561");
            Actors james_bond = new Actors("James_bond","84737372");
            Actors Harrison_ford = new Actors("Harrison Ford", "45326790");
            Filmparticipation film_particp1 = new Filmparticipation(james_007,james_bond);
            Filmparticipation film_particp2 = new Filmparticipation(diehard,Harrison_ford);
            Filmparticipation film_particp3 = new Filmparticipation(marsAttack,Harrison_ford);
            Filmcountry country = new Filmcountry(film_particp3,"USA");
            skrivUtfilm(diehard,marsAttack,james_007,Harrison_ford,country,film_particp3);

        }catch(Exception e){
            System.out.println("Not legal arguemtns");
        }


    }

    public static void skrivUtfilm(Film diehard,Film marsAttack,Film james_007, Actors actor, Filmcountry country,Filmparticipation film_particp){

        System.out.println("Test film: " + "\n");

        if(film_particp.check_film(marsAttack)){
            film_particp.type("Cinema");
            film_particp.genre("Fiction");
            actor.leggtilfilm(marsAttack);
            System.out.println(film_particp.toString());
            System.out.println(actor.toString());
            System.out.println(country.toString());


        }
        else if(film_particp.check_film(diehard)){
            film_particp.type("Cinema");
            film_particp.genre("Action");
            actor.leggtilfilm(diehard);
            System.out.println(film_particp.toString());
            System.out.println(actor.toString());
            System.out.println(country.toString());

        }
        else if(film_particp.check_film(james_007)){
            film_particp.type("Cinema");
            film_particp.genre("Action");
            actor.leggtilfilm(james_007);
            System.out.println(film_particp.toString());
            System.out.println(actor.toString());
            System.out.println(country.toString());

        }
        else{

            System.out.println("This film is not found! ");
        }

        System.out.println(" ");
        System.out.println(actor.hentfilms());




    }
}
