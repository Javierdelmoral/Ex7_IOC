package exercici7;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class E07_DelMoralA {

    //VARIABLES CONSTANTS IVA
    public static final float IVA_SUPER = 4;
    public static final float IVA_REDUIT = 8;
    public static final float IVA_GENERAL = 21;
    //VARIABLES CONSTANTS ENVIAMENTS
    public static final int ENVIAMENT3 = 3;
    public static final int ENVIAMENT20 = 20;
    public static final int ENVIAMENT50 = 50;

    public static void main(String[] args) {

        //Boolean per comprovar entrada correcte de nombre
        boolean dadaCorrecte;
        //Variables a utilitzar
        int opcio, categoria, preu, quantitat;
        //float per a fer el calcul amb IVA
        float preuTotal;
        //aux per ajudarme amb els scans i el valor de preu
        int auxPreu;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quin dubte tens? [1]CALCULAR PREU FINAL [2]MOSTRAR IVA APLICAT PER CATEGORIA [3]COST ENVIAMENT");

        dadaCorrecte = sc.hasNextInt();

        //Si input es nombre...
        if (dadaCorrecte) {

            // Input opcio que escogeix user
            opcio = sc.nextInt();

            //Segons input entrara en una opcio o altre
            switch (opcio) {

                //el primer cas es per informar sobre preu final amb iva inclós
                case 1:

                    System.out.println("Quin és el preu base del producte?");

                    preu = sc.nextInt();
                    auxPreu = preu;

                    System.out.println("Quantes unitats vols?");

                    quantitat = sc.nextInt();

                    preuTotal = auxPreu * quantitat;

                    System.out.println("De quina categoria és el producte?");

                    categoria = sc.nextInt();

                    System.out.println("El preu final SENSE IVA és de: " + preuTotal);

                    //segons la categoria el preu final variara segons IVA
                    switch (categoria) {

                        case 1:

                            System.out.println("L'IVA sobre categoria MEDICAMENTS és superreduit del " + IVA_SUPER + "%");
                            System.out.println("PREU FINAL AMB IVA= " + (preuTotal + (preuTotal * (IVA_SUPER / 100))));
                            break;
                        case 2:
                            System.out.println("L'IVA sobre categoria FARINES és superreduit del " + IVA_SUPER + "%");
                            System.out.println("PREU FINAL AMB IVA= " + (preuTotal + (preuTotal * (IVA_SUPER / 100))));

                            break;
                        case 3:
                            System.out.println("L'IVA sobre categoria MEDICAMENTS VETERINARIS és reduit del " + IVA_REDUIT + "%");
                            System.out.println("PREU FINAL AMB IVA= " + (preuTotal + (preuTotal * (IVA_REDUIT / 100))));

                            break;
                        case 4:
                            System.out.println("L'IVA sobre categoria AIGUES és reduit del " + IVA_REDUIT + "%");
                            System.out.println("PREU FINAL AMB IVA= " + (preuTotal + (preuTotal * (IVA_REDUIT / 100))));

                            break;
                        case 5:
                            System.out.println("L'IVA sobre categoria COSMETICS és general del " + IVA_GENERAL + "%");
                            System.out.println("PREU FINAL AMB IVA = " + (preuTotal + (preuTotal * (IVA_GENERAL / 100))));

                            break;
                        case 6:
                            System.out.println("L'IVA sobre categoria BEGUDES ALCOHOLIQUES és general del " + IVA_GENERAL + "%");
                            System.out.println("PREU FINAL AMB IVA= " + (preuTotal + (preuTotal * (IVA_GENERAL / 100))));

                            break;
                    }

                    break;
                    
                    //El cas 2 si el user vol saber com son els IVAS segons la categoria
                case 2:

                    System.out.println("Mostrar IVA sobre quina categoria? [1]MEDICAMENTS [2]FARINES [3]MEDICAMENTS VETERINARIS [4]AIGUES [5]COSMETICS [6]BEGUDES ALCOHOLIQUES");

                    dadaCorrecte = sc.hasNextInt();

                    if (dadaCorrecte) {

                        categoria = sc.nextInt();

                        switch (categoria) {

                            case 1:

                                System.out.println("L'IVA sobre categoria MEDICAMENTS és superreduit del " + IVA_SUPER + "%");
                                break;
                            case 2:
                                System.out.println("L'IVA sobre categoria FARINES és superreduit del " + IVA_SUPER + "%");
                                break;
                            case 3:
                                System.out.println("L'IVA sobre categoria MEDICAMENTS VETERINARIS és reduit del " + IVA_REDUIT + "%");
                                break;
                            case 4:
                                System.out.println("L'IVA sobre categoria AIGUES és reduit del " + IVA_REDUIT + "%");
                                break;
                            case 5:
                                System.out.println("L'IVA sobre categoria COSMETICS és general del " + IVA_GENERAL + "%");
                                break;
                            case 6:
                                System.out.println("L'IVA sobre categoria BEGUDES ALCOHOLIQUES és general del " + IVA_GENERAL + "%");
                                break;
                        }
                    }

                    break;

                    
                    //El cas 3 es si user vol coneixer els preus d'enviament 
                case 3:

                    System.out.println("Quin és el preu del producte?");

                    dadaCorrecte = sc.hasNextInt();

                    if (dadaCorrecte) {

                        preu = sc.nextInt();
                        auxPreu = preu;

                        System.out.println("I quants voldries?");

                        quantitat = sc.nextInt();

                        preuTotal = auxPreu * quantitat;

                        //si total es igual o menor de 100
                        if (preuTotal <= 100) {
                            System.out.println("L'enviament té un preu de " + ENVIAMENT3 + " euros");
                            //si total es entre 101 i 500
                        } else if (preuTotal >= 101 && preuTotal <= 500) {
                            System.out.println("L'enviament té un preu de " + ENVIAMENT20 + " euros");
                            //si total es major de 501
                        } else if (preuTotal >= 501) {
                            System.out.println("L'enviament té un preu de " + ENVIAMENT50 + " euros");
                        }
                    }

                    break;
            }

        }

        if (!dadaCorrecte) {
            System.out.println("Has introduit algún caracter que no tocava!");
        }
    }

}
