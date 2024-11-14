package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utilitaires pour le formatage des dates.
 */
public class DateUtils {

    /**
     * Formate une date selon le motif spécifié.
     *
     * @param pattern le motif de formatage (par exemple, "dd/MM/yyyy")
     * @param date    la date à formater
     * @return la date formatée en chaîne de caractères
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * Formate une date selon le motif par défaut "dd/MM/yyyy HH:mm:ss".
     *
     * @param date la date à formater
     * @return la date formatée en chaîne de caractères selon le motif par défaut
     */
    public static String formatDefaut(Date date) {
        return format("dd/MM/yyyy HH:mm:ss", date);
    }
}
