
    public class Superhero {

        private String Name;

        private String RealName;

        private String superPower;

        private int yearCreated;

        private boolean isHuman;

        private String stregth;


        Superhero(String Name, String RealName, String superPower, int yearCreated, Boolean isHuman, String stregth) {

            this.Name = Name;
            this.RealName = RealName;
            this.superPower = superPower;
            this.yearCreated = yearCreated;
            this.isHuman = isHuman;
            this.stregth = stregth;
        }

        // public Superhero() {

        // }

        public String getName() {
            return Name;
        }

        public String getRealName() {
            return RealName;
        }

        public String getsuperPower() {
            return superPower;
        }


        public int getyearCreated() {
            return yearCreated;
        }

        public boolean getisHuman() {
            return isHuman;
        }

        public String getstregth() {
            return stregth;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public void setRealName(String RealName) {
            this.RealName = RealName;
        }

        public void setsuperPower(String superPower) {
            this.superPower = superPower;
        }

        public void setYearCreated(int YearCreated) {
            this.yearCreated = yearCreated;
        }

        public void setisHuman(boolean isHuman) {
            this.isHuman = isHuman;
        }

        public void setStregth(String stregth) {
            this.stregth = stregth;
        }

        // override kont
        @Override
        public String toString() {
            return "Superhero:  "
                    + Name +
                    ", Name = " + Name +
                    ", Powers = " + superPower +
                    ", Year of creation = " + yearCreated +
                    ", Human = " + isHuman +
                    ", Strength = " + stregth + " " + "\n";


        }
    }

