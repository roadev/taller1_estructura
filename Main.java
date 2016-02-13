//Main class
public class Main {

    public static void main(String[] args) {

        Vector vec = new Vector();
        int vector[] = vec.vectorCalc();
        int vector2[];
        double prom = vec.prom(vector, vec.sum(vector));

        vec.inverse(vector);
        vec.sum(vector);
        vec.promCalc(vec.sum(vector), vector);
        vec.iguales(vector);
        vec.sumEven(vector);
        vec.sumOdd(vector);
        vec.menoresprom(vector, prom);
        vec.mayorMenor(vector);
        vec.menorRepetido(vector);
        vec.fivePosition(vector);
        vector2 = vec.vectorCalc();
        vec.showVectorialSum(vector, vector2);

    }

}
