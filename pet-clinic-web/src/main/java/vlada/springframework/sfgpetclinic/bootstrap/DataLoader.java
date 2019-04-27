package vlada.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vlada.springframework.sfgpetclinic.model.Owner;
import vlada.springframework.sfgpetclinic.model.PetType;
import vlada.springframework.sfgpetclinic.model.Vet;
import vlada.springframework.sfgpetclinic.services.OwnerService;
import vlada.springframework.sfgpetclinic.services.PetTypeService;
import vlada.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    public void run(String... args) throws Exception {

        PetType pas = new PetType();
        pas.setNaziv("Pit");
        PetType savedPasPetType = petTypeService.save(pas);

        PetType macka = new PetType();
        pas.setNaziv("Pit");
        PetType savedMackaPetType = petTypeService.save(macka);

        Owner owner1 = new Owner();
        owner1.setIme("Vlada");
        owner1.setPrezime("Marinkovic");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setIme("Jovana");
        owner2.setPrezime("Vicentijevic");

        ownerService.save(owner2);
        System.out.printf("Ucitani vlasnici. \n");


        Vet vet1 = new Vet();
        vet1.setIme("Marko");
        vet1.setPrezime("Markovic");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setIme("Pera");
        vet2.setPrezime("Peric");

        vetService.save(vet2);
        System.out.printf("Ucitani veterinari. \n");

    }
}
