package DataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class datahora {

    //Data hora local sem fuso horário
    //O momento exato não interessa a usuários de outro fuso horário (sistemas de região unica, excel, data de nascimento, etc)
    //EX: 2022-07-21T14:52:09.4930

    //Data hora global com fuso horário
    //O momento exato interessa a pessoas de outro fuso horário (sistemas multi-região, web, eventos online, comentários, etc)
    //EX: 2022-07-21T14:52:09Z - FUSO GMT
    //EX: 2022-07-21T14:52T-03:00  - 3 HORAS A MENOS DO HORARIO GMT (SP)
    public static void main(String[] args) throws ParseException {
        LocalDate d01= LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now(); //(GMT-3)
        Instant d03 = Instant.now(); //Horário de londres (GMT)
        LocalDate d04 = LocalDate.parse("2025-01-02");
        LocalDateTime d05 = LocalDateTime.parse("2025-01-30T11:24:36");
        Instant d06 = Instant.parse("2025-01-02T01:29:30Z");
        Instant d07 = Instant.parse("2025-01-02T14:29:30-03:00");
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("02/01/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09= LocalDateTime.parse("02/01/2025 11:35", fmt2);
        DateTimeFormatter fmt3 =DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d01: "+d01 + "\nd02: " + d02 + "\nd03: "+d03+ "\nd04: "+ d04+ "\nd05: "+ d05+ "\nd06: "+d06+ "\nd07: "+d07+ "\nd08: "+d08+ "\nd09: "+d09);
        System.out.println("d09 = " + d09.format(fmt2));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d06 = " + fmt3.format(d06));

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r2 = (LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")));
        LocalDateTime r3 = (LocalDateTime.ofInstant(d06, ZoneId.systemDefault()));
        System.out.println("r1= " + r1);
        System.out.println("r2= " + r2);
        System.out.println("r3= " + r3);
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonth());
        System.out.println("d04 ano = " + d04.getYear());

        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plus(7, ChronoUnit.DAYS);
        System.out.println("Past week: "+ pastWeek);
        System.out.println("Next week: "+ nextWeek);

        Duration t1= Duration.between(d05, d09);
        System.out.println("t1 dias: "+ t1.toDays());

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" );
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date x1 = new Date();
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(x1);
        Calendar cal = Calendar.getInstance();
        cal.setTime( x1);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        x1 = cal.getTime();
        System.out.println(sdf2.format(x1));
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println(minutes);
    }


}
