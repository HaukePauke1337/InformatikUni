public class IntVector {

    private int [] A;


    public IntVector(int ndimension) {

        A = new int [ndimension];

    }

    public void setValue(int position, int value){

        A[position] = value;

    }

    public int getValue(int position) {
        return A[position];
    }

    public int scalarProduct(IntVector vector) {
            int Ergebnis = 0;
            for (int i = 0; i<A.length; i++) {


            Ergebnis += getValue(i)*vector.getValue(i);


        }

        return Ergebnis;
    }


}