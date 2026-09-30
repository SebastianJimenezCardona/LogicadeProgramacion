package logicnotes;

public class While {
    public static void main(String[] args){

        System.out.println("Escena: He venido a negociar");
        String negociar = "ño";

        while(negociar.equals("ño")){

            System.out.println("Socio, he venido a negociar");
            negociar = validadorTipos.validarString();
        }
    }
}
