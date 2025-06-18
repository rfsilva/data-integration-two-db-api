package br.com.rodrigo.dataintegration.twodb.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class TarefaAgendada {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // Agendamento para rodar todo dia às 15h (3 da tarde)
    @Scheduled(cron = "*/10 * * * * *", zone = "America/Sao_Paulo")
    //@Scheduled(cron = "0 0 15 * * *", zone = "America/Sao_Paulo")
    public void executarTarefaDiaria() {
        String agora = LocalDateTime.now().format(formatter);
        System.out.println("Executando tarefa agendada a cada 10s! Horário: " + agora);
        // Aqui você coloca sua lógica (ex: enviar relatório, backup, etc)
    }
}