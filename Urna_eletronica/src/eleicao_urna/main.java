package eleicao_urna;

public class main {

	public static void main(String[] args) {
		 System.out.println("Eleição de Representante de Classe");
		 

int quantidadeCandidatos = Integer.parseInt(
    javax.swing.JOptionPane.showInputDialog("Digite a quantidade de candidatos:")
);

System.out.println("Quantidade de candidatos: " + quantidadeCandidatos);


String[] nomes = new String[quantidadeCandidatos];


for (int i = 0; i < quantidadeCandidatos; i++) {

    nomes[i] = javax.swing.JOptionPane.showInputDialog(
        "Digite o nome do candidato " + (i + 1) + ":"
    );

}

System.out.println("=== CANDIDATOS CADASTRADOS ===");

for (int i = 0; i < quantidadeCandidatos; i++) {
    System.out.println((i + 1) + " - " + nomes[i]);
}

int quantidadeEleitores = Integer.parseInt(
    javax.swing.JOptionPane.showInputDialog(
        "Quantos eleitores participarão da votação?"
    )
);

System.out.println("Quantidade de eleitores: " + quantidadeEleitores);


int[] votos = new int[quantidadeCandidatos];


for (int i = 0; i < quantidadeEleitores; i++) {

    String mensagem = "Eleitor " + (i + 1) + ", escolha seu candidato:\n";

    for (int j = 0; j < quantidadeCandidatos; j++) {
        mensagem += (j + 1) + " - " + nomes[j] + "\n";
    }

    int opcao = Integer.parseInt(
        javax.swing.JOptionPane.showInputDialog(mensagem)
    );

if (opcao >= 1 && opcao <= quantidadeCandidatos) {
    votos[opcao - 1]++;
} else {
    javax.swing.JOptionPane.showMessageDialog(
        null, "Opção inválida! Escolha um candidato da lista."
    );
    i--;
}

System.out.println("\n=== RESULTADO DA ELEIÇÃO ===");

for (int j = 0; j < quantidadeCandidatos; j++) {
    System.out.println(
        nomes[j] + " recebeu " + votos[j] + " voto(s)."
    );
}

int maiorNumeroVotos = -1;
String vencedor = "";

for (int j = 0; j < quantidadeCandidatos; j++) {
    if (votos[j] > maiorNumeroVotos) {
        maiorNumeroVotos = votos[j];
        vencedor = nomes[j];
    }
}

javax.swing.JOptionPane.showMessageDialog(
    null,
    "Vencedor da eleição: " + vencedor
    + "\nTotal de votos: " + maiorNumeroVotos
);

}

	}

}
