/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scjp;

/**
 *
 * @author dovailla
 */
public class PhoneNumber {

    
    public static void main(String args[]) {
        String html = "<div id=\"pnlPhoneNumber\">\n" +
                        "		\n" +
                        "<span id=\"lblrecruiterphonenumber\">TEL: (514) 840-6495</span>\n" +
                        "	</div>\n" +
                        "<div id=\"pnlTollFreeNumber\">\n" +
                        "		\n" +
                        "<span id=\"lbltollNumber\">TEL: (332)334 - 4432 x    </span>\n" +
                        "	</div>\n" +
                        "<div id=\"pnlFaxNumber\">\n" +
                        "		\n" +
                        "FAX:&nbsp;<span id=\"lblfaxNumber\">(332)334 - 4432 </span>\n" +
                        "	</div>";
        
        html = number2(html);
        System.out.println(html);
    }    

    static String number1(String replacedHtml)
    {
        String result = null;
    	String spaces = "\\s*";
    	String telephoneRegex = "\\(" + "[0-9]{3,3}" + "\\)" + spaces + "[0-9]{3,3}" + spaces + "\\-" + spaces + "[0-9]{4,4}";
    	//String telephoneRegex = "[0-9]*";
        
        //System.out.println(replacedHtml + "\n\n===================\n\n");
        
    	// replace recruiter phone number - <span id="lblrecruiterphonenumber">TEL: (514) 840-6495</span>
    	String regex1 = "(<span" + spaces + "id=\"lblrecruiterphonenumber\">" + spaces + "TEL:)(" + spaces + ")(" + telephoneRegex + ")";
        
        System.out.println("Regex: " +regex1 + "\n\n===================\n\n");
        
        //String regex1 = "([0-9]{3,3})";
    	replacedHtml = replacedHtml.replaceAll(regex1, "$1<a href=\"tel:$3\">$3</a>");
        //replacedHtml = replacedHtml.replaceAll(regex1, "--$1--$2--$3--");
        //replacedHtml = replacedHtml.replaceFirst(regex1, "edeee");
    	
        
        /*
    	// replace toll free number, but without extension - <span id="lbltollNumber">TEL: (555) 555-1212 x 123</span>
    	String regex2 = "(\\<span" + spaces + "id=\"lbltollNumber\"\\>" + spaces + "TEL\\:)" + spaces + "(" + telephoneRegex + ")";
    	replacedHtml = replacedHtml.replaceFirst(regex2, "$1<a href=\"tel:$2\">$2</a>");    	
    	*/
        
        return replacedHtml;        
    }
    
    static String number2(String replacedHtml)
    {
    	String spaces = "\\s*";
        

    	String telephoneRegex = "\\(" + "[0-9]{3,3}" + "\\)" + spaces + "[0-9]{3,3}" + spaces + "\\-" + spaces + "[0-9]{4,4}";
    	
    	// replace recruiter phone number - <span id="lblrecruiterphonenumber">TEL: (514) 840-6495</span>
    	String regex1 = "(<span" + spaces + "id=\"lblrecruiterphonenumber\">" + spaces + "TEL:)(" + spaces + ")(" + telephoneRegex + ")";
        
    	replacedHtml = replacedHtml.replaceAll(regex1, "$1<a href=\"tel:$3\">$3</a>");
    	
    	// replace toll free number, but without extension - <span id="lbltollNumber">TEL: (555) 555-1212 x 123</span>
    	String regex2 = "(\\<span" + spaces + "id=\"lbltollNumber\"\\>" + spaces + "TEL\\:)(" + spaces + ")(" + telephoneRegex + ")";
    	replacedHtml = replacedHtml.replaceFirst(regex2, "$1<a href=\"tel:$3\">$3</a>");    	
    	
        
        return replacedHtml;        
    }    
}


