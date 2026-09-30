package logicnotes;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Seleccione: 1. Cuenta de ahorro\n" +
                "2. Crédito\n" +
                "3. Inversión\n" +
                "4. Mis datos\n");
        int option = validadorTipos.validarEnteros();

        System.out.println(option);

        switch (option){
            case 1:
                System.out.println("Usted está en la opción Cuenta de Ahorro");
                break;
            case 2:
                System.out.println("Usted está en la opción Crédito");
                break;
            case 3:
                System.out.println("Usted está en la opción Inversión");
                break;
            case 4:
                System.out.println("Usted está en la opción Mis datos");
                break;
            default:
                System.out.println("Seleccione una opción válida");
        }
    }
}
