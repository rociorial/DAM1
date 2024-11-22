package util;
/* 

1. LocalDate - Obtener la fecha actual
---------------------------
import java.time.LocalDate;
LocalDate fechaHoy = LocalDate.now();
System.out.println("Fecha de hoy: " + fechaHoy);


2. LocalDate - Crear una fecha específica
---------------------------
import java.time.LocalDate;
LocalDate fechaEspecifica = LocalDate.of(2024, 11, 20);
System.out.println("Fecha específica: " + fechaEspecifica);


3. LocalTime - Obtener la hora actual
---------------------------
import java.time.LocalTime;
LocalTime horaAhora = LocalTime.now();
System.out.println("Hora actual: " + horaAhora);


4. LocalTime - Crear una hora específica
---------------------------
import java.time.LocalTime;
LocalTime horaEspecifica = LocalTime.of(15, 30);
System.out.println("Hora específica: " + horaEspecifica);


5. LocalDateTime - Obtener la fecha y hora actuales
---------------------------
import java.time.LocalDateTime;
LocalDateTime fechaHoraAhora = LocalDateTime.now();
System.out.println("Fecha y hora actuales: " + fechaHoraAhora);


6. LocalDateTime - Crear una fecha y hora específica
---------------------------
import java.time.LocalDateTime;
LocalDateTime fechaHoraEspecifica = LocalDateTime.of(2024, 11, 20, 15, 30);
System.out.println("Fecha y hora específica: " + fechaHoraEspecifica);


7. ZonedDateTime - Obtener la fecha y hora con zona horaria
---------------------------
import java.time.ZonedDateTime;
import java.time.ZoneId;
ZonedDateTime fechaHoraZona = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
System.out.println("Fecha y hora con zona horaria: " + fechaHoraZona);


8. Duration - Calcular la duración entre dos tiempos
---------------------------
import java.time.Duration;
LocalTime inicio = LocalTime.of(10, 0);
LocalTime fin = LocalTime.of(15, 30);
Duration duracion = Duration.between(inicio, fin);
System.out.println("Duración: " + duracion);


9. Period - Calcular el período entre dos fechas
---------------------------
import java.time.LocalDate;
import java.time.Period;
LocalDate fechaInicio = LocalDate.of(2020, 5, 15);
LocalDate fechaFin = LocalDate.of(2024, 11, 20);
Period periodo = Period.between(fechaInicio, fechaFin);
System.out.println("Periodo: " + periodo);


10. Formatting con DateTimeFormatter
---------------------------
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
LocalDate fecha = LocalDate.of(2024, 11, 20);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String fechaFormateada = fecha.format(formatter);
System.out.println("Fecha formateada: " + fechaFormateada);

 */