public class Human {

    private double weight;
    private double size;

    public Human (double nweight, double nsize) {
        weight = nweight;
        size = nsize;

    }
    public void gainWeight (double gain) {
        weight += gain;

    }
    public void loseWeight (double lose) {
        weight -= lose;

    }
    public double bmi() {
        double bmi = weight/(size*size);
        return bmi;

    }
    public int rating () {
        double bmi = bmi();


        if (bmi<18.5) {

            return -1;
            } else {

                if (bmi<=25.0) {
                return 0;

                } else {
                return 1;
                }
            }

    }
    public String ratingAsString () {
        int wertung = rating();

        if (wertung == 1) {

            return "Übergewicht";
            } else {

                if (wertung == 0) {
                return "Normal";

                } else {
                return "Untergewicht";
                }
            }

    }
        public void printRating () {
            SimpleIO.print(" bmi: " + bmi());
            SimpleIO.println(" " + ratingAsString());
        }
}