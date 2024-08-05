package model.services;

import java.time.LocalDate; // Importa a classe LocalDate para manipulação de datas
import model.entities.Contract; // Importa a classe Contract para manipulação de contratos
import model.entities.Installment; // Importa a classe Installment para criar parcelas

public class ContractService {

    private OnlinePaymentService onlinePaymentService; // Atributo para armazenar o serviço de pagamento online
    
    // Construtor para inicializar o serviço de pagamento online
    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    // Método para processar um contrato e gerar as parcelas
    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months; // Calcula a cota básica por parcela
        
        // Loop para criar e adicionar parcelas ao contrato
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i); // Define a data de vencimento da parcela
            double interest = onlinePaymentService.interest(basicQuota, i); // Calcula o juros da parcela
            double fee = onlinePaymentService.paymentFee(basicQuota + interest); // Calcula a taxa de pagamento
            double quota = basicQuota + interest + fee; // Calcula o valor total da parcela
            
            // Adiciona a parcela ao contrato
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}