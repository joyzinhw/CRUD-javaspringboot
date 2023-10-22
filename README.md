# pring boot

Implementar um CRUD usando uma das tecnologias abaixo:

* Java com Spring, usando o abanco h2.

# quadro comparativo de servidores

*Estudar e fazer um quadro comparativo entre os seguintes servidores HTTP: Apache, Node.js, Tomcat, Nginx.*

| Característica              | Apache                                                                | Node.js                                                | Tomcat                                                       | Nginx                                                |
| ---------------------------- | --------------------------------------------------------------------- | ------------------------------------------------------ | ------------------------------------------------------------ | ---------------------------------------------------- |
| Tipo                         | Servidor web                                                          | Ambiente de tempo de execução JavaScript             | Servidor de aplicativos Java                                 | Servidor web/reverso proxy                           |
| Linguagem de Programação   | C                                                                     | JavaScript                                             | Java                                                         | C                                                    |
| Arquitetura                  | Modelo de processos múltiplos (prefork, worker, etc.)                | Event Loop                                             | Modelo de Thread (um thread por solicitação)               | Event-driven, modelo de processos múltiplos         |
| Desempenho                   | Moderado a bom, dependendo da configuração                          | Muito bom                                              | Bom                                                          | Muito bom                                            |
| Escalabilidade               | Possível, mas pode exigir configuração cuidadosa                   | Muito escalável                                       | Escalabilidade limitada para aplicações complexas          | Muito escalável                                     |
| Utilização Comum           | Servidor de arquivos estáticos, PHP, CGI                             | Aplicações web em tempo real, APIs RESTful           | Aplicações Java, Servlets, JSP                             | Servidor web, proxy reverso, balanceamento de carga  |
| Facilidade de Configuração | Moderada, com vários módulos disponíveis                           | Fácil de configurar com JavaScript e módulos Node.js | Exige conhecimento avançado em Java                         | Relativamente fácil de configurar                   |
| Requisitos de Hardware       | Médios a altos, especialmente para tráfego intenso                  | Baixos a moderados                                     | Médios a altos                                              | Baixos a moderados                                   |
| Uso de Recursos              | Usa mais recursos em comparação com Node.js e Nginx                 | Usa menos recursos                                     | Usa mais recursos                                            | Usa menos recursos                                   |
| Compatibilidade              | Suporta uma ampla variedade de módulos e linguagens de programação | Principalmente voltado para JavaScript                 | Suporta Java, Servlets, JSP                                  | Focado em servir conteúdo estático e proxy reverso |
| Proxy Reverso                | Suporta proxy reverso, mas não é a principal funcionalidade         | Pode atuar como proxy reverso                          | Não é a principal funcionalidade, mas pode ser configurado | Principal funcionalidade como proxy reverso          |
| Compressão de Conteúdo     | Suporta compressão de conteúdo                                      | Suporta compressão de conteúdo                       | Suporta compressão de conteúdo                             | Suporta compressão de conteúdo                     |
| SSL/TLS                      | Suporta SSL/TLS com mod_ssl                                           | Suporta SSL/TLS com módulos externos                  | Suporta SSL/TLS com configuração adequada                  | Suporta SSL/TLS nativamente                          |
| Comunidade/Documentação    | Grande comunidade e extensa documentação                            | Grande comunidade e documentação                     | Comunidade menor em comparação com Apache e Nginx          | Grande comunidade e documentação                   |
| Plataforma                   | Multiplataforma (Linux, Windows, etc.)                                | Multiplataforma (Linux, Windows, etc.)                 | Multiplataforma (Linux, Windows, etc.)                       | Multiplataforma (Linux, Windows, etc.)               |
