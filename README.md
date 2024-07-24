# Simulador de iPhone com Modelo UML


## Descrição

Este projeto simula a funcionalidade de um iPhone com três aplicativos principais: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Cada aplicativo possui funcionalidades específicas e a interface `ComandosIphone` fornece métodos comuns para desbloquear o iPhone, bloquear a tela e fechar o aplicativo atual.

## Funcionalidades

- **Reprodutor Musical**: Toca, pausa e seleciona músicas.
- **Aparelho Telefônico**: Realiza chamadas, atende chamadas e gerencia o correio de voz.
- **Navegador na Internet**: Exibe páginas, adiciona novas abas e atualiza páginas.
  
## Diagrama de Classes

Desenvolvi este diagrama de classes para ilustrar a estrutura do projeto e os relacionamentos entre as classes e interfaces. O diagrama foi feito utilizando o Mermaid. Abaixo está o diagrama de classes:

![Diagrama de Classes](https://mermaid.ink/img/pako:eNp1Us1uwjAMfpUqJybYC1QIqWIXDkPTmHbqxSSmtZbGnZugDca7L5Sytfzk1Nhfvx_He6XZoEqVttA0TwSFQJW7JJ62ksy5Ame4WdQlO0z2p97xTKfkPMoGNM5m_-WxwWZt-TOAnP4ZPfSabQdB3tDCoLFBXYJktSUNnrac-QD2jDjkru_pFWthEzzLc2gi3vZtjT1rkAF3DaG5KDVoURM76ChGKy_kiqRqb7dlsxoEbcnRO27YkeaBrqUiinQ8LlQo3FcEj87g0AVFEgKZswgSv_PuTuAlbLEAw7KExXHmDv1AGr9oTfICBbm_JEHsQN7QKe-St5Cth8OH47BpB2eKSxcXSzD9eXy8foT70OvB3cfeiJo7NVFxnBWQiZvaBs-VL7HCXKXx04B85Cp3h4iD6Gj17bRKvQScKOFQlCrdgG3iLdQmvkO35l318As3A_iK?type=png)


## Estrutura do Projeto

- `usuario/`:
  - `Usuario.java`: Classe principal que demonstra o uso dos aplicativos.
  
- `iphone/`:
  - `ComandosIphone.java`: Interface que define os comandos básicos do iPhone.

- `funcionalidades/`:
  - `ReprodutorMusical.java`: Implementa a funcionalidade de um reprodutor musical.
  - `AparelhoTelefonico.java`: Implementa a funcionalidade de um aparelho telefônico.
  - `NavegadorNaInternet.java`: Implementa a funcionalidade de um navegador na internet.

## Como Executar

### 1. Clone o Repositório:

```
git clone https://github.com/jonatasdamata/IphoneUMLModeling.git
```

### 2. Navegue até o diretório do projeto:
```
 cd IphoneUMLModeling
```

### 3. Abra o projeto no IntelliJ IDEA ou em qualquer outro IDE que suporte Java.

### 4. Compile o projeto:
```
  javac -d out src/usuario/Usuario.java src/iphone/ComandosIphone.java src/funcionalidades/ReprodutorMusical.java src/funcionalidades/AparelhoTelefonico.java src/funcionalidades/NavegadorNaInternet.java
```

### 5. Execute a classe principal:
```
 java -cp out usuario.Usuario
```

## Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

## Contato
Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato:

Nome: Jonatas da Mata <br>
Email: jonatasdamata1@hotmail.com <br>
LinkedIn: https://www.linkedin.com/in/jonatasdamata/ <br>
