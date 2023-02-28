
# Aplicativo Spring MVC com validação de formulário

Este é um exemplo de aplicativo Spring MVC que usa anotações de validação padrão para validar a entrada do usuário em um formulário. O controlador recebe a entrada do usuário e verifica se é válida usando a anotação @Valid. Se a validação falhar, o controlador exibe as mensagens de erro na página de formulário usando o objeto BindingResult. Se a validação for bem-sucedida, o controlador redireciona para a página de resultados.




## Stack utilizada

* Spring MVC
* Thymeleaf, Hibernate 
* Validator




## Requisitos


* Java 8 ou superior
* Maven



## Instalação

1. Clone o repositório para o seu computador:

```bash
  git clone https://github.com/MoisesssDev/validating-form-input
```
2. Navegue até o diretório do projeto:
```bash
cd spring-mvc-form-validation
```
3. Execute o aplicativo usando o Maven:
```bash
mvn spring-boot:run
```
4. Abra um navegador da web e acesse a seguinte URL:
```bash
http://localhost:8080/
```
5. Preencha o formulário e envie-o. Se a entrada for válida, você será redirecionado para a página de resultados. Se a entrada for inválida, você verá mensagens de erro na página de formulário.


## Considerações Finais

Este é um exemplo de um controlador Spring MVC que valida a entrada do usuário usando anotações de validação padrão. O controlador recebe a entrada do usuário na classe PersonForm e usa a anotação @Valid para validar a entrada. Se a validação falhar, o controlador retorna à página de formulário e exibe as mensagens de erro usando o objeto BindingResult. Se a validação for bem-sucedida, o controlador redireciona para a página de resultados.

A classe WebController implementa a interface WebMvcConfigurer para adicionar uma view controller para a página de resultados. O método showForm() retorna a página de formulário e o método checkPersonInfo() valida a entrada do usuário e decide se deve retornar à página de formulário ou redirecionar para a página de resultados.

É importante notar que a classe PersonForm deve ter anotações de validação para que a validação possa ser executada corretamente. As anotações de validação padrão, como @NotEmpty e @Pattern, podem ser usadas para validar as propriedades da classe.


