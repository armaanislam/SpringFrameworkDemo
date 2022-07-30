package demo;

import org.springframework.stereotype.Component;

@Component // To use annotations, we have to mark this as a spring component
public class Doctor implements Staff {

    public void assist() {
        System.out.println("Doctor is assisting");
    }

}
