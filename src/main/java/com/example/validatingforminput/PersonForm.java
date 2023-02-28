package com.example.validatingforminput;

import jakarta.validation.constraints.Min; // Faz a validação da idade minima.
import jakarta.validation.constraints.NotNull; // certifica que o dado não eh nulo.
import jakarta.validation.constraints.Size; // certifica que a quantidade de caracteres da Strimg não seja muito grande.

public class PersonForm {

    @NotNull
	@Size(min=2, max=30)
    private String name;
    
    @NotNull
    @Min(18)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonForm [name=" + this.name + ", age=" + this.age + "]";
    }

    

}
