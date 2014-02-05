package com.dmv.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String data = "<span id=\"lblstreet1\">1801 McGill College Ave.</span> <span id=\"lblstreet2\"><br />Suite 1100</span> <span id=\"lblstreet3\"></span> "
                + "<span id=\"lblstreet4\"></span><br /> <span "
                + "id=\"lblofficeCity\">Montreal</span>, <span "
                + "id=\"lblofficeState\">QC</span>&nbsp; <span id=\"lblzipCode\">H3A "
                + "3P4</span>";

        getAddress(data);
    }

    public static void getAddress(String replacedHtml) {
        /*
         * <span id="lblstreet1">1801 McGill College Ave.</span> <span
         * id="lblstreet2"><br />Suite 1100</span> <span id="lblstreet3"></span>
         * <span id="lblstreet4"></span><br /> <span
         * id="lblofficeCity">Montreal</span>, <span
         * id="lblofficeState">QC</span>&nbsp; <span id="lblzipCode">H3A
         * 3P4</span>
         */
        // get address line one
        String addressLine1 = getAddressSubstring(replacedHtml, "lblstreet1");
        String addressLine2 = getAddressSubstring(replacedHtml, "lblstreet2");
        String addressCity = getAddressSubstring(replacedHtml, "lblofficeCity");
        String addressProvince = getAddressSubstring(replacedHtml,
                "lblofficeState");
        String addressPostalCode = getAddressSubstring(replacedHtml,
                "lblzipCode");

    }

    private static String getAddressSubstring(String replacedHtml, String tagID) {

        String match = "";
        Matcher matcher = null;

        // System.out.println("\n=========\nString: " + replacedHtml + "");

        try {
            Pattern pattern = Pattern.compile(tagID
                    + "[\'\"]>(<[^>]*>)*([^<]+)</span>",
                    Pattern.CASE_INSENSITIVE);

            pattern = Pattern.compile("[\'\"]>([a-zA-Z0-9\\s]*)</span>",
                    Pattern.CASE_INSENSITIVE);

            pattern = Pattern
                    .compile(
                            tagID
                                    + "[\'\"]>(<[a-zA-Z=\"\' \\/]*>)?([a-zA-Z0-9 \\.]*)<(?=(/span>))",
                            Pattern.CASE_INSENSITIVE);

            matcher = pattern.matcher(replacedHtml);

            // Boolean bFlag = matcher.find();
            // match = matcher.toString();
            // System.out.println("\nMatch: " + match + "\n");

            while (matcher.find()) {
                String s = matcher.group(2);
                System.out.println("Match: " + s);

            }

            System.out.println("Pattern: " + pattern.pattern());

            /*
             * System.out.println("Replace: " +
             * replacedHtml.replaceFirst(pattern.toString(),
             * "aaaaaaaa\1aaaaaa"));
             */

            System.out.println("");

        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

        // System.out.println("Match: " + match + "\n");

        return match;
    }
}
