# 💬 Java Chat Interface (Mediator Pattern)

## 📌 Overview

This project is a simple **chat application** built in Java using the **Mediator Design Pattern**.
Instead of users communicating directly with each other, all communication happens through a central mediator.

This approach:

* Reduces complexity
* Decouples components
* Makes the system easier to extend

---

## 🧠 Design Pattern Used

### Mediator Pattern

The **Mediator Pattern** is a behavioral design pattern that allows objects to communicate through a central hub (mediator) rather than directly.

👉 In this project:

* Users → send messages
* Mediator → handles communication

---

## 📂 Project Structure

```
├── ChatMediator.java        # Mediator interface
├── ChatMediatorImpl.java    # Concrete mediator implementation
├── ChatUser.java            # Abstract user class
├── User.java                # Concrete user implementation
├── Main.java                # Entry point of the application
```

---

## ⚙️ How It Works

1. Users are registered with the mediator
2. A user sends a message
3. The mediator receives it
4. The mediator broadcasts the message to other users

---

## 🚀 How to Run

### 1. Compile the code

```bash
javac *.java
```

### 2. Run the program

```bash
java Main
```

---

## 🧪 Example Flow

```
User1 sends: Hello!
Mediator broadcasts message
User2 receives: Hello!
User3 receives: Hello!
```

---

## 🎯 Key Concepts

* **Loose Coupling** → Users don’t depend on each other directly
* **Centralized Control** → All communication handled in one place
* **Scalability** → Easy to add more users

---

## 📚 Learning Outcomes

* Understanding of **Mediator Design Pattern**
* Practical implementation in Java
* Clean architecture and separation of concerns

---

## 🔮 Future Improvements

* Add GUI (JavaFX / Swing)
* Support private messaging
* Add timestamps and message history
* Implement networking (real-time chat)

---

## 👩‍💻 Author

Sarniha

---

## ⭐ If you found this helpful

Give this repo a star!
# Object-Oriented
