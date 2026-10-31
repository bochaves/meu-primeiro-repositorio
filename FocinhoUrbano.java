import java.util.Scanner;
public class FocinhoUrbano {
     public static void main (String[] args){
System.out.println("================================");
System.out.println("        FOCINHO URBANO        ");
System.out.println("================================");

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("INFORMAÇÕES DO TUTOR");
        System.out.println("================================");

        System.out.print("Nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println(cpf.substring(0,3));
        System.out.println(cpf.substring(3,6));
        System.out.println(cpf.substring(6,9));
        System.out.println(cpf.substring(9,11));
        String cpf2 = scanner.nextLine();
        System.out.println(cpf2 + cpf.substring(0, 3) + "." + cpf.substring (3, 6) + "." + cpf.substring (6, 9) + "-" + cpf.substring (9, 11));
        System.out.print("Telefone para contato: ");
        String telefone = scanner.nextLine();
        System.out.print("Endereço (com cep): ");
        String endereco = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.println();

        System.out.println("INFORMAÇÕES DO ANIMAL");
        System.out.println("================================");

        System.out.print("Data de nascimento do animal: ");
        String nascAnimal = scanner.nextLine();
        System.out.print("Raça do animal: ");
        String racaAnimal = scanner.nextLine();
        System.out.print("Sexo do animal (M/F): ");
        String sexo = scanner.nextLine();
        if (sexo!= "M" && sexo!= "F"){
        System.out.println("Opção Inválida");}
        System.out.print("Peso atualizado do animal: ");
        int peso = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner   
        System.out.print("Veterinário de preferência: ");
        String veterinario = scanner.nextLine();
        System.out.print("Número do microchip (se houver): ");
        String microchip = scanner.nextLine();
        System.out.print("Contato de emergência: ");
        String contatoEmergencia = scanner.nextLine();
        
        System.out.println();
        System.out.print("VACINAS");
        System.out.println("================================");
        System.out.println("1 - POLIVALENTE:");
        System.out.println("2 - ANTIRRÁBICA:");
        System.out.println("3 - GRIPE):");
        System.out.println("4 - GRIPE CANINA:");
        System.out.println("5 - GIÁRDIA:");

        System.out.print("Quais vacinas o animal possui? (Digite o número correspondente):  ");
        int vacinas = scanner.nextInt();
        switch(vacinas){
            case 1:
            System.out.println("O animal possui a vacina POLIVALENTE");
            break;
            case 2:
            System.out.println("O animal possui a vacina ANTIRRÁBICA");
            break;
            case 3:
            System.out.println("O animal possui a vacina GRIPE");
            break;
            case 4:
            System.out.println("O animal possui a vacina GRIPE CANINA");
            break;
            case 5:
            System.out.println("O animal possui a vacina GIÁRDIA");     
            break;
            default:
            System.out.println("O animal não possui nenhuma das vacinas listadas"); 
        }

        }
    }