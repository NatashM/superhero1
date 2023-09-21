import java.util.ArrayList;

    public class Database {

        private ArrayList<Superhero> superheros = new ArrayList<>();


        public void addSuperhero(Superhero superhero) {
            superheros.add(superhero);
        }


        public ArrayList<Superhero> getSuperheros() {
            return superheros;
        }

        public void setSuperheros(ArrayList<Superhero> superheroesList) {
            this.superheros = superheroesList;
        }

    }




