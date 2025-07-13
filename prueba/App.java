import com.francisco.errorassistantia.ErrorAssistantIA;
import com.francisco.errorassistantia.infraestructure.config.ClientConfigError;


/**
 * Author: Francisco Gutierrez Cueva
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClientConfigError config = ClientConfigError
                .builder()
                .apiKey("AIzaSyAddflSIMxgJVe-syg-rket-0XbB7kYckA")
                .build();
        ErrorAssistantIA.withConfig(config);

        try {

            int numero = 10 / 0; // fuerza error

//            String texto = null;
//            System.out.println(texto.length()); // fuerza error
        } catch (Exception e) {
            System.out.println(ErrorAssistantIA.analizaError(e).getDescripcion());


        }
    }
}

//  System.out.println(ErrorAssistantIA.analizaError(e).getDescripcion());