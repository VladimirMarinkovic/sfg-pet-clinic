package vlada.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vlada.springframework.sfgpetclinic.model.*;
import vlada.springframework.sfgpetclinic.services.*;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;



    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if(count == 0) {  loadData(); }
    }


    private void loadData() {
        PetType pas = new PetType();
        pas.setNaziv("Pit");
        PetType savedPasPetType = petTypeService.save(pas);

        PetType macka = new PetType();
        macka.setNaziv("Persijska");
        PetType savedMackaPetType = petTypeService.save(macka);

        Speciality radiology = new Speciality();
        radiology.setOpis("Radiologija");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setOpis("Hirurgija");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setOpis("Stomatoligija");
        Speciality savedDentistry = specialityService.save(dentistry);

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




        Pet jovaninaMacka = new Pet();
        jovaninaMacka.setPetType(savedMackaPetType);
        jovaninaMacka.setIme("Miona");
        jovaninaMacka.setOwner(owner2);
        jovaninaMacka.setDatumRodjenja(LocalDate.now());
        owner2.getPets().add(jovaninaMacka);

        ownerService.save(owner2);

        Visit mackaVisit = new Visit();
        mackaVisit.setPet(jovaninaMacka);
        mackaVisit.setDatum(LocalDate.now());
        mackaVisit.setOpis("Macka je usamljena");

        visitService.save(mackaVisit);

        System.out.printf("Ucitani vlasnici. \n");

        Vet vet1 = new Vet();
        vet1.setIme("Marko");
        vet1.setPrezime("Markovic");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setIme("Pera");
        vet2.setPrezime("Peric");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.printf("Ucitani veterinari. \n");
    }
}
