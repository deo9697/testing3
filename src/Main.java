/*Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio*/

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {



                String inputString = "2023-03-01T13:00:00Z";

                OffsetDateTime dateTime = OffsetDateTime.parse(inputString);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                String formattedDate = dateTime.format(formatter);

                System.out.println(formattedDate);
            }
        }
