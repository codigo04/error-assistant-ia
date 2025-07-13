# 🚀 ErrorAssistantIA

[![Java](https://img.shields.io/badge/Java-11%2B-orange?style=flat-square)](https://openjdk.org/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](https://opensource.org/licenses/MIT)
[![Version](https://img.shields.io/badge/Version-0.0.2-brightgreen?style=flat-square)](https://github.com/codigo04/error-assistant-ia/releases)

**Librería Java para análisis automático de errores con IA (Gemini de Google)**

Analiza excepciones en tiempo real y obtén:

- ✅ Descripción clara del error  
- 🔍 Causas comunes  
- 🛠️ Sugerencias prácticas  
- 📍 Línea exacta donde ocurrió  

Ideal para desarrolladores backend, debugging técnico y proyectos educativos.

---

## ✨ Características principales

| Función | Descripción |
|--------|-------------|
| ✅ | Explicación en lenguaje natural |
| 🔍 | Detección de causas probables |
| 🛠️ | Sugerencias para resolver el problema |
| 📍 | Ubicación exacta del error |
| ⚙️ | Integración con Maven/JitPack |

---

## 📦 Instalación (Maven)

Agrega en tu `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.codigo04</groupId>
        <artifactId>error-assistant-ia</artifactId>
        <version>0.0.2</version>
    </dependency>
</dependencies>

```
🚀 Uso Rápido

```java
// 1. Configuración inicial
ClientConfigError config = ClientConfigError.builder()
    .apiKey("TU_API_KEY_DE_GEMINI") // Obtén key en: https://ai.google.dev/
    .build();
ErrorAssistantIA.withConfig(config);

// 2. Análisis de errores
try {

   int resultado = 10 / 0;
} catch (Exception e) {
  System.out.println(ErrorAssistantIA.analizaError(e).getDescripcion());
}
```
📝 Ejemplo de Salida
```text
🔴 Error: División por cero
📌 Causas:
   - Operación matemática inválida
   - Falta validación del divisor
🛠️ Soluciones:
   - Validar que el divisor no sea cero
   - Usar try-catch para ArithmeticException
📍 Ubicación: Main.java (Línea 42)
```
📌 Requisitos
Java 11+

API Key de Gemini

Conexión a internet

👨‍💻 Autor  
Desarrollado por Francisco Gutiérrez Cueva  

📦 Versión actual: 0.0.2  

📝 Licencia: MIT  

✨ ¿Te gusta el proyecto? ¡Dale una ⭐ en el repo!

