// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
           int resultado =0;
          resultado=suma(10, 20,30);
          System.out.println("La cantidad de la suma es: " +resultado);



        Auto miAuto= new Auto();
        miAuto.sumarpuertas();

        System.out.println("La cantidad de las puerta son: " +miAuto.puertas);
        }




        public static int suma (int a, int b, int c)
        {
            return a+b+c;






        }



        static class Auto {
            public int puertas=4;

            public void sumarpuertas(){
                this.puertas++;
            }

        }

    }
