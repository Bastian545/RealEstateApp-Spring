package com.bastian.realestateapp.utils;

import com.bastian.realestateapp.model.*;
import com.bastian.realestateapp.repo.PropertyRepo;
import com.bastian.realestateapp.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);


    private final String description = "Ubicada en espacio horrible sin areas verdes y lleno de vecinos indeseables";
    private final Address address1 = new Address("Región Metropolitana","santiago","la cisterna","Gran Av. José Miguel Carrera 7710", -33.525226f, 70.660945f);
    private final Address address2 = new Address("Región Metropolitana","santiago","santiago","Eleuterio Ramírez 1149", -33.449262f,  -70.6510944f);
    private final Address address3 = new Address("Región Metropolitana","santiago","la reina","Las Carretas 2151", -33.433452f,  -70.578354f);
    private final Address address4 = new Address("Región Metropolitana","santiago","la florida","Venezuela 9220", -33.537205f,  -70.580405f);
    private final Rooms rooms = new Rooms(2,1);

    @Bean
    CommandLineRunner initDatabase (PropertyRepo propertyRepo, IUserService userService){
        propertyRepo.deleteAll();

        List<String> pics = new ArrayList<>();
        pics.add("http://definicion.de/wp-content/uploads/2011/01/casa-1.jpg");
        pics.add("https://www.terracorp.cl/blog/wp-content/uploads/2018/11/Principal.png");
        List<String> pics2 = new ArrayList<>();
        pics2.add("http://zoominmobiliario.com/image?path=images/uploads/proyectos/6076_image_a30ecec5b117d84187a7b8ac6f0d3909.jpg");
        pics2.add("http://blog.reistock.com/wp-content/uploads/elementor/thumbs/2412-p3x379lcc89zhj5wedot1uhint13biwbqvtnjilayk.jpg");



        return args -> {
            log.info("Preloading " + propertyRepo.save(new Property("Grandes Robles", Type.HOUSE, Status.ACTIVE,description,pics,ConstructionStatus.NEW,75000000,60,address1,"Roblitos",rooms)));
            log.info("Preloading " + propertyRepo.save(new Property("Los Acacios", Type.APARTMENT,Status.ACTIVE,description,pics2,ConstructionStatus.PROJECT,55000000,43,address2,"Buenos Muchachos",rooms)));
            log.info("Preloading " + propertyRepo.save(new Property("Viña Marina", Type.HOUSE,Status.ACTIVE,description,pics,ConstructionStatus.NEW,87000000,55,address3,"Condescendiente",rooms)));
            log.info("Preloading " + propertyRepo.save(new Property("Puerto Macul", Type.HOUSE,Status.ACTIVE,description,pics,ConstructionStatus.NEW,23000000,28,address4,"Maculones",rooms)));

            log.info("Preloading " + userService.save(new User("Bastian Raul","Soto Espinoza","19.002.609-4","zpeckqt@gmail.com","56 9 73653268","holanda")));


        };
    }

}
