package mintic.unal.art;


import mintic.unal.art.vista.Ventana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mintic.unal.art")
public class ArtApplication {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
                new Ventana().setVisible(true);
	}

        public static void runSpringServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
            SpringApplication.run(ArtApplication.class, args);
        }
            
}
