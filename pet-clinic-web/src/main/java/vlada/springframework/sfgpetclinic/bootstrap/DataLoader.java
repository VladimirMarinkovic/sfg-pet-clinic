package vlada.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vlada.springframework.sfgpetclinic.model.Owner;
import vlada.springframework.sfgpetclinic.model.Vet;
import vlada.springframework.sfgpetclinic.services.OwnerService;
import vlada.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1l);
        owner1.setIme("Vlada");
        owner1.setPrezime("Marinkovic");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2l);
        owner1.setIme("Jovana");
        owner1.setPrezime("Vicentijevic");

        ownerService.save(owner2);
        System.out.printf("Ucitani vlasnici. \n");


        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setIme("Marko");
        vet1.setPrezime("Markovic");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2l);
        vet1.setIme("Pera");
        vet1.setPrezime("Peric");

        vetService.save(vet1);
        System.out.printf("Ucitani veterinari. \n");

    }
}
