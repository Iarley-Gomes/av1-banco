package main;

import java.util.List;

import controller.OwnerController;
import controller.PetController;
import entities.Owner;
import entities.Pet;

public class Main {

	public static void main(String[] args) {
		
		OwnerController ownerController = new OwnerController();
//		CRIAR
//		Owner owner = new Owner("Owner 5", "00000000000");
//		ownerController.store(owner);
				
//		LISTAR
//		List<Owner> owners = ownerController.index();
//		for (Owner owner : owners) {
//			System.out.println(owner.getName());
//		}
		
//		BUSCAR POR ID
//		Owner owner =  ownerController.show(3);
//		System.out.println(owner.getName());
		
//		DELETAR
//		Owner owner = ownerController.show(3);
//		ownerController.destroy(owner);

//		ATUALIZAR
//		Owner owner = ownerController.show(2);
//		owner.setName("Jael Batista");
//		ownerController.update(owner);
		
		PetController petController = new PetController();
		
//		CRIA E ADD O OWNER DO PET
//		Owner owner = ownerController.show(2);
//		
//		Pet pet = new Pet("Pet 1", "breed 1");
//		pet.setOwner(owner);
//		petController.store(pet);
		
//		LISTAR
//		List<Pet> pets = petController.index();
//		for (Pet pet : pets) {
//			System.out.println(pet.getName());
//		}
		
//		BUSCAR POR ID
//		Pet pet = petController.show(3);
//		System.out.println(pet.getName());

//		ATUALIZAR
//		Pet pet = petController.show(3);
//		pet.setBreed("Ave");
//		petController.update(pet);

//		DELETAR
//		Pet pet = petController.show(3);
//		petController.destroy(pet);
	}

}
