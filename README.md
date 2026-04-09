# WhatsApp Chatbot Backend (Spring Boot)

 ## Project Overview

This is a simple WhatsApp chatbot backend simulation built using Java and Spring Boot.

The application receives messages through a REST API and responds with predefined replies.

---

##  Tech Stack

* Java
* Spring Boot
* REST API
* Maven

---

##  Features

* Accepts POST requests using `/webhook` endpoint
* Takes JSON input simulating WhatsApp messages
* Returns predefined responses

  * "hi" → "Hello"
  * "bye" → "Goodbye"
* Logs all incoming messages in the console

---

## ▶️ How to Run the Project

1. Clone the repository
2. Open in IntelliJ IDEA
3. Run `WhatsappbotApplication.java`
4. Server starts on:

```
http://localhost:8081
```

---

## 🧪 How to Test API

Use Postman:

* Method: POST
* URL:

```
http://localhost:8081/webhook
```

* Headers:

```
Content-Type: application/json
```

* Request Body:

```json
{
  "message": "hi"
}
```

* Response:

```
Hello
```

---

##  Output

The application logs messages like:

```
Incoming message: hi
```

---



---

## 📂 Project Structure

* controller → Handles API requests
* service → Contains chatbot logic
* model → Request data structure

---


