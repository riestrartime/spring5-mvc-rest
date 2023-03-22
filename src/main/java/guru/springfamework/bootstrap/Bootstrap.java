package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//CommandLineRunner.run is executed on server start.
//args can contain variables passed when the project is started
@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        createCategories();
        createCustomers();

        System.out.println("Data loaded = " + (categoryRepository.count() + customerRepository.count()));
    }

    private void createCategories() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);
    }

    private void createCustomers() {
        Customer freddy = new Customer();
        freddy.setFirstname("Freddy");
        freddy.setLastname("Meyers");

        Customer joe = new Customer();
        joe.setFirstname("Joe");
        joe.setLastname("Buck");

        Customer michael = new Customer();
        michael.setFirstname("Michael");
        michael.setLastname("Weston");

        Customer susan = new Customer();
        susan.setFirstname("Susan");
        susan.setLastname("Tanner");

        customerRepository.save(freddy);
        customerRepository.save(joe);
        customerRepository.save(michael);
        customerRepository.save(susan);
    }
}
