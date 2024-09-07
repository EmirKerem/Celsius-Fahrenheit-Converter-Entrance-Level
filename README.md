# Celsius-Fahrenheit Converter

This Java program is designed to convert temperatures between Celsius and Fahrenheit. The user can input the unit they have (Celsius or Fahrenheit) and the corresponding value. The program will then convert the temperature to the other unit and display the result.

## How to Use

1. **Select Unit:**  
   The user is prompted to enter the unit of temperature they have: "Celsius" or "Fahrenheit".

2. **Enter Temperature Value:**  
   The user is then asked to enter the temperature value for the selected unit.

3. **Conversion:**  
   The program converts the temperature to the other unit:
   - Celsius to Fahrenheit using the formula:
     ```
     Fahrenheit = (Celsius * 9/5) + 32
     ```
   - Fahrenheit to Celsius using the formula:
     ```
     Celsius = (Fahrenheit - 32) * 5/9
     ```

4. **Result:**  
   The converted temperature is displayed along with the unit.

## Example
```
Welcome to the Celsius-Fahrenheit Converter 
Please enter the unit you have (Celsius or Fahrenheit): Celsius 
Please enter the value of the selected unit: 25 
Your temperature is 77.0 Fahrenheit
```

## Requirements

- Java Development Kit (JDK) installed
- Any IDE or text editor that supports Java

## How to Run

1. Compile and Run the Java file:
```
javac Main.java
java Main
```

## License

This project is open-source and free to use.





