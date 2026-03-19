# Computer Science App

A multi-screen JavaFX desktop application built as part of an HNC Computing course. The app covers key computer science topics including number base conversions, bitwise logic, ASCII representation, and AI-assisted learning — all accessible through a clean, dark-themed sidebar interface.

---

## Screens

### Home / Welcome
The main layout of the application. Features a custom title bar (no OS decorations) with drag-to-move support, a sidebar for navigation, and a dynamic content area that loads each screen without reloading the whole window.

### Conversion
Convert numbers between different bases:
- Decimal → Binary
- Decimal → Hexadecimal
- Binary → Decimal
- Binary → Hexadecimal
- Hexadecimal → Decimal
- Hexadecimal → Binary

Input is validated with regex to ensure only valid characters are accepted for each number base.

### Bitwise Logic
Two sections:

**Comparative Operations** — Perform AND, OR, and XOR operations on two binary numbers. Results are padded to 8 bits.

**Arithmetic** — Add or subtract two numbers in either Binary or Hexadecimal. Toggle buttons are used to select between addition and subtraction.

### Representation (ASCII)
Explore how characters and strings are represented in memory:
- Convert a single character to its ASCII decimal, hex, and binary values
- Convert a string to its hex representation
- Convert hex values back to a readable string

### AI Chat
An AI-powered chat screen using the **Google Gemini 2.5 Flash** model. The AI is configured with a system prompt (guardrails and unit notes) to act as a focused computer science tutor. Users can ask questions and receive answers directly within the app.

---

## Tech Stack

- **Java** with **JavaFX** (FXML + CSS styling)
- **Maven** for dependency management
- **Google GenAI Java SDK** for the Gemini AI integration
- **Ikonli** for icons

---

## Setup

### Prerequisites
- Java 21+
- Maven
- IntelliJ IDEA (recommended)

### API Key (required for AI Chat screen)
The AI Chat screen requires a Google Gemini API key. **Do not hardcode this into the source code.**

Set it as an environment variable:

**PowerShell:**
```powershell
[System.Environment]::SetEnvironmentVariable("GOOGLE_API_KEY", "your-key-here", "User")
```

Then restart your terminal/IDE. You can verify it is set with:
```powershell
Get-ChildItem env:/GOOGLE_API_KEY
```

### Running the App
1. Clone the repository
2. Open in IntelliJ IDEA
3. Let Maven download dependencies
4. Run `MainApp.java`

---

## Project Structure

```
src/
├── nclan/ac/spa/               # JavaFX app entry point and scene switching
│   ├── MainApp.java
│   ├── SceneSwitcher.java
│   └── controllers/            # FXML controllers for each screen
│       ├── HomeController.java
│       ├── ConversionController.java
│       ├── BitwiseLogicController.java
│       ├── RepresentationController.java
│       └── AIChatController.java
└── nclan/ac/cs/
    ├── topic1/                 # Core logic classes
    │   ├── Conversion.java
    │   ├── BitwiseLogic.java
    │   ├── Representation.java
    │   └── Main.java
    └── topic5/                 # AI integration
        └── AIGemini.java
```

---

## Notes

- The app uses an undecorated window style (no OS title bar). A custom close and minimise button are provided in the UI.
- The AI guardrails and knowledge base are loaded from `guardrails.txt` and `base_knowledge.txt` resource files.
