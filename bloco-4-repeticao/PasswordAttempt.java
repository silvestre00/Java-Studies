import java.util.Scanner;

public class PasswordAttempt{
    public static void main(String[] args){
        final String SENHA_CORRETA = "java123";
        final int LIMITE_TENTATIVAS = 3;


        Scanner scanner = new Scanner(System.in);
        String senhaDigitada;
        int tentativas = 0;
        boolean acessoPermitido = false;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            tentativas++;

            if(senhaDigitada.equals(SENHA_CORRETA)){
                acessoPermitido = true;
                break;
            }
            else {
                System.out.println("Senha incorreta, Tentativas restantes: " + (LIMITE_TENTATIVAS - tentativas));
            }
        }
        while (tentativas < LIMITE_TENTATIVAS);

        if(acessoPermitido){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso bloqueado. Número máximo de tentativas atingido.");
        }
        scanner.close();
    }
}
