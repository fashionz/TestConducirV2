# TestConducirV2
_Pequeño proyecto con el que puedes realizar test de conducción._

## Descripción 🐺
Programa que te permite realizar test de condución sin un número predefinido de preguntas pero si de respuestas que serán cuatro, las cuales están randomizadas al igual que las preguntas para que el usuario no pueda memorizarlas tan facilmente. Al final del examen, se muestra un resultado con la cantidad de aciertos y si el examen está aprobado. Para ello, debes elegir la base de datos **(sqlite)** la cual contiene el examen. El programa ha sido realizado en Apache NetBeans IDE 12.0
###### Diseño
El programa tiene un tema oscuro tipo Flatlaf. El nombre del tema es **FlatVuesion**
###### Contenido del Proyecto
El proyecto contiene **JavaClass (3)** <ConexionBD, Pregunta, Respuesta> y **JFrames (4)** <Panel Principal, Frame Preguntas, Frame Resultados, SobreMíPanel>

- JavaClass ConexionBD: Se realiza la conexión a la base de datos mediante el DriverManager de sqlite y el path del archivo. Se consiguen las preguntas y las respuestas debido a las sentencias a la base de datos.
  
- JavaClass Pregunta: Contiene toda la información de una pregunta, por ej. el texto de la misma, las respuestas que tiene asociadas...
  
- JavaClass Respuesta: Contiene la información de una respuesta, por ej. el texto de las mismas y si es la pregunta correcta. Con esta clase creamos objetos en la clase pregunta.
  
- JFrame Panel Principal: Es la ventana principal del programa en la cual se pueden ver tres botones (iniciar, salir y ?).
  - Iniciar: Abre el explorador de archivos que tiene un filtro para solo poder elegir archivos **.db**. Cuando se elige la base de datos, se abre el _Frame Preguntas_.
  - Salir: Realiza un System.exit(0) que cierra el programa y todas las ventanas del programa que estén abiertas.
  - ?: Es un botón con información sobre mí el cual abre el _SobreMíPanel_.

- JFrame Frame Preguntas: Muestra las preguntas con las respuestas con el índice de la pregunta. Tiene dos botones (anterior, siguiente) que realizan la funcion de ir adelante o atrás respecto a la pregunta en la que estés. El botón siguiente en la última pregunta cambia de estado a finalizar. Cuando finalizamos, se muestra el _Frame Resultados_.

- JFrame Frame Resultados: Muestra el resultado de tu examen, si has aprobado o no y los aciertos obtenidos. Tiene un botón (menú principal) el cual te lleva al _Panel Principal_.

- JFrame SobreMíPanel: Muestra información sobre mí en varios labels y en uno de ellos guardamos una imagen para que se muestre a modo de logo corporativo o similar.

## Requisitos 📋
- La fecha de entrega de esta práctica se adelanta al día 25 de febrero a las 7:00 de la mañana.
- A causa de este adelanto, suprimimos los requisitos de añadir documentación con JavaHelp y de crear un instalador para la aplicación. Se podrán incluir estos posteriormente si el alumno lo desea, y se valorarán como trabajo para subir nota.
- La recuperación consistirá en repetir las prácticas suspensas o no entregadas, con los requisitos que se indiquen en clase.
- El día 3 de marzo se reserva para el exámen final, en caso de que alguien no haya superado la asignatura mediante la evaluación contínua y la recuperación de las prácticas.

## Autor 👨🏻‍💻
***Roberto Álvarez*** - ***[fashionz](https://github.com/fashionz)***
