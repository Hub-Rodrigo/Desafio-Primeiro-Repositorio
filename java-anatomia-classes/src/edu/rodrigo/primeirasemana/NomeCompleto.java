package edu.rodrigo.primeirasemana;
public class NomeCompleto {
    public static void main (String[] args){
    
        //Atribuindo nome e sobremone a variavel
        String primeiroNome = "Rodrigo";
        String sengundoNome = "Souza";

        //juntando nome, sobronome e imprimindo nome completo
        String nomeCompleto = nomeCompleto(primeiroNome, sengundoNome);
        System.out.println(nomeCompleto);
} 
//metodo para atribuir nome completo a variavel
public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do Metodo: " + primeiroNome.concat(" ").concat(segundoNome);
}
    
}
