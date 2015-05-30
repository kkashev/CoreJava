import javax.swing.ImageIcon;

import com.nitido.utils.toaster.Toaster;


public class Main {

    public static void main(String[] args) {
        Toaster toasterManager = new Toaster();
        toasterManager.showToaster( "JToaster Hello World!" );
        //toasterManager.showToaster( new ImageIcon( "mylogo.gif" ), "A simple toaster with an image" );
        
    }

}
