#language: pt
#enconding: UTF-8


Funcionalidade: Cadastrar usuario

@Cadastro
Cenario: cadastrar usuario
Quando eu acionar a aba admin 
E acionar o botao add
E selecionar no campo user roler "ESS"
E selecionar no campo status "Enabled"
E informar no campo employee name "Fiona Grace"
E informar no campo username "Erica"
E infomar no campo password "1234567e"
E informar no campo confirmar password "1234567e"
E acionar o botao salvar
Entao o sistema cadastra o usuario "Erica"




