package vlada.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vlada.springframework.sfgpetclinic.model.Owner;
import vlada.springframework.sfgpetclinic.model.Pet;
import vlada.springframework.sfgpetclinic.model.PetType;
import vlada.springframework.sfgpetclinic.model.Vet;
import vlada.springframework.sfgpetclinic.services.OwnerService;
import vlada.springframework.sfgpetclinic.services.PetTypeService;
import vlada.springframework.sfgpetclinic.services.VetService;

import java.time.LocalDate;

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
        owner1.setAdresa("Bulevar Oslobodjenja 123");
        owner1.setGrad("Beograd");
        owner1.setTelefon("011/745-698");
        ownerService.save(owner1);

        Pet vladinPet = new Pet();
        vladinPet.setPetType(savedPasPetType);
        vladinPet.setIme("Shark");
        vladinPet.setOwner(owner1);
        vladinPet.setDatumRodjenja(LocalDate.now());
        owner1.getPets().add(vladinPet);


        Owner owner2 = new Owner();
        owner2.setIme("Jovana");
        owner2.setPrezime("Vicentijevic");
        owner2.setAdresa("Sutjetska ulica 7");
        owner2.setGrad("Beograd");
        owner2.setTelefon("062/745- 234");
        ownerService.save(owner2);

        Pet jovaninaMacka = new Pet();
        jovaninaMacka.setPetType(savedMackaPetType);
        jovaninaMacka.setIme("Miona");
        jovaninaMacka.setOwner(owner2);
        jovaninaMacka.setDatumRodjenja(LocalDate.now());
        owner2.getPets().add(jovaninaMacka);

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
