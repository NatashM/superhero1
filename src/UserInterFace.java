import java.util.ArrayList;
import java.util.Scanner;
    public class UserInterFace {

        Scanner scanner = new Scanner(System.in);
        Database heroDatabase = new Database();


        public void createSuperHeros() {
            ArrayList<Superhero> superheros = new ArrayList<>();
            Superhero superhero1 = new Superhero("Flash", "Barry Allen, ", "Super speed, ", 1940, true, "weak, ");
            Superhero superhero2 = new Superhero("batMan", "Bruce Wayne, ", "Strong, ", 1939, true, "Strong, ");
            Superhero superhero3 = new Superhero("SuperMan", "Clark kent, ", "flying, strong, laser eyes, ", 1938, true, "Strong, ");
            Superhero superhero4 = new Superhero("SipderMan", "Peter Parker, ", "Web-slinging, ", 1962, true, "Strong, ");
            Superhero superhero5 = new Superhero("Hulk", "Brunce Banner, ", "Super Strong, ", 1962, false, "Strong, ");

            superheros.add(superhero1);
            superheros.add(superhero2);
            superheros.add(superhero3);
            superheros.add(superhero4);
            superheros.add(superhero5);

            System.out.println(superheros);

            heroDatabase.setSuperheros(superheros);
        }


        public void søgehero() {

            System.out.println("Skriv delvist noget af superhelte navnet der skal findes");
            String userIndput = scanner.nextLine();

            ArrayList<Superhero> searchResult = heroDatabase.getSuperheros();

            if (searchResult.isEmpty()) {
                System.out.println("Der findes ikke nogle der opflyder dette søgekriterium ");
            } else if (searchResult.size() > 1) {
                System.out.println("vælg en superhelt");
                int tæller = 0;
                for (Superhero hero : searchResult) {
                    if (hero.getName().startsWith(userIndput)) {
                        System.out.println("SuperhelteID: " + tæller++ + "\n" +
                                hero.getName() + ": Realname is - " +
                                hero.getRealName() + "\nAbilities: " +
                                hero.getsuperPower() + "\nYear created: " +
                                hero.getyearCreated() + "\nis a Human: " +
                                hero.getisHuman() + "\nTotal strength: " +
                                hero.getstregth() + "\n");
                    }
                }
            }
        }


        public void redigerhero() {
            System.out.println("Hvilken vil du helt redigere?");
            søgehero();
            Superhero superhero;
            boolean chosenHero = false;
            while (!chosenHero) {
                System.out.println("Indtast Helten på ID, du gerne vil redigerer");
                int heroId = Integer.parseInt(scanner.nextLine());
                superhero = heroDatabase.getSuperheros().get(heroId);

                System.out.println("Er du sikker på at du vil ændre superhelten: " + superhero.toString());
                String answer = scanner.nextLine().toLowerCase();

                if (answer.startsWith("j")) {
                    chosenHero = true;
                }
            }

            System.out.println("Indtast nyt navn");
            String newName = scanner.nextLine();

            System.out.println("Indtast nyt Superhelte navn");
            String newHeroName = scanner.nextLine();

            System.out.println("Indtast nye evner!");
            String newAbilities = scanner.nextLine();

            System.out.println("Indtast det år superhelten blev opret");
            String newYearCreated = scanner.nextLine();

            System.out.println("Indtast om du stadig er et menneske");
            boolean isHuman = Boolean.parseBoolean(scanner.nextLine());

            System.out.println("Indtast styrke");
            String strenght = scanner.nextLine();

            System.out.println("Din superhelt er nu redigeret.");

        }


        public void Oprethero() {


            System.out.println("\n Skriv nyt navn");
            String Name = scanner.next();

            System.out.println("\n Skriv dit nye superhelte navn");
            String RealName = scanner.next();

            System.out.println("\n Skriv dine nye helte krafter");
            String superPower = scanner.next();

            System.out.println("\n Skriv hvilket år superhelten blev lavet");
            int yearCreated = scanner.nextInt();

            System.out.println("\n Er du menneske (j/n): ");
            String Indput = scanner.next();
            boolean isHuman = Indput.equalsIgnoreCase("j");

            System.out.println("\n skriv din styrke");
            String stregth = scanner.next();

            Superhero superheros = new Superhero(Name, RealName, superPower, yearCreated, isHuman, stregth);

            heroDatabase.addSuperhero(superheros);


            System.out.println();
        }

        public void slethero(){}

        public void StartPogram() {

            System.out.println("Velkomme til verden af Superhelte ");
            System.out.println("\nMenu: ");
            System.out.println("1.Vis alle superheltene.");
            System.out.println("2.Søg efter en superhelt");
            System.out.println("3.Lave din egen supperhelt.");
            System.out.println("4.Rediger en superhelt");
            System.out.println("5.Slet superhelt fra superhelt databasen");
            System.out.println("6.Exit superhelte verden");

            System.out.println("Vælg en af menu mulighederne");

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> createSuperHeros();
                case 2 -> søgehero();
                case 3 -> Oprethero();
                case 4 -> redigerhero();
                case 5 -> slethero();
                case 6 -> System.out.println("Du er nu færdig med superhelte verden");
            }


        }


    }

