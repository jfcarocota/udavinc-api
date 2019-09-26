package com.jfcarocota.udavinciapi.controllers;

import com.jfcarocota.udavinciapi.interfaces.IUdavinci;
import com.jfcarocota.udavinciapi.modules.Udavinci;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/udavinci")
public class UdavinciController implements IUdavinci {

    @Override
    public Udavinci getHistory() {
        Udavinci results = new Udavinci(
                "Dr. Jaime Chaire Huerta",
                "Aspiramos a constituirnos en la institución líder de educación en línea en toda Latinoamérica, para contribuir en el mejoramiento y posicionamiento estratégico de esta región.",
                "Contribuir significativamente a la formación de profesionistas altamente competentes, brindando alternativas educativas flexibles, innovadoras y pertinentes, que les permitan ser capaces de desempeñarse con éxito en el ámbito laboral y social.",
                "https://udavinci.edu.mx/wp-content/uploads/2018/09/logo-udv-fondo-gris.png",
                "El modelo constructivista adoptado por la UDAVINCI convierte al maestro en el facilitador de conocimientos. De esta forma, los alumnos participan en lo que aprenden y es la tarea del tutor, así como de la institución educativa, crear estrategias que permitan que el alumno tenga la disposición y la motivación para el aprendizaje.",
                "UN95",
                "09PSU0537M"
        );
        return results;
    }
}
