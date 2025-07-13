🎉 Esta es la primera versión oficial de **ErrorAssistantIA** 🎉

`ErrorAssistantIA` es una librería Java que permite analizar errores y excepciones en tiempo de ejecución usando inteligencia artificial (IA) mediante Gemini (Google). Devuelve automáticamente:

- ✅ Descripción breve del error  
- 📌 Posibles causas  
- 🛠️ Sugerencias rápidas para solucionarlo  
- 📍 Línea exacta donde ocurrió el error  

Ideal para entornos técnicos, backend, entornos educativos y desarrollo rápido.

¿Cómo usarla?

1. Agrega el archivo `.jar` a tu proyecto.

2. Configura tu API Key de Gemini:

```java
ClientConfigError config = ClientConfigError.builder()
    .apiKey("TU_API_KEY")
    .build();

ErrorAssistantIA.withConfig(config);
```

3. Analiza excepciones capturadas:

```java
try {
    int resultado = 10 / 0;
} catch (Exception e) {
     System.out.println(ErrorAssistantIA.analizaError(e).getDescripcion());
}
```

💡 Ejemplo de salida esperada:

```
1. Descripción: Se intentó dividir por cero.
2. Posibles causas:
   - El divisor tiene valor cero.
   - Falta de validación previa.
3. Sugerencias:
   - Validar divisor antes de dividir.
   - Usar try-catch para manejar excepciones.
4. Línea del error: Clase: Main, Línea: 12
```

📦 Requisitos:

- Java 11 o superior  
- Conexión a internet  
- API Key válida de Gemini (Google AI)

🧠 IA utilizada:

Esta librería usa [Gemini](https://ai.google.dev/) para generar respuestas automáticas basadas en errores de Java.

👨‍💻 Autor:

Desarrollado por **Francisco Gutiérrez Cueva**  
Versión: `v0.0.1`  
Licencia: [MIT](https://opensource.org/licenses/MIT)
