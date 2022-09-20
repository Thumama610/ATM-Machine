
package atm.machine;

import java.io.IOException;

 
public class ATMMachine extends OptionMenu{

    public static void main(String[] args) throws IOException{
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.getLogin();
    }
}
