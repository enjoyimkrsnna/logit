# Logit Android Application

## Overview

Logit is an Android application designed to help students, particularly those pursuing a Master's in Chemistry, calculate logarithms and anti-logarithms. The application provides an easy-to-use interface for finding log and anti-log values based on user input.

## Features

- **Logarithm Calculation**: Computes logarithms with base 10 or natural logarithms (base e).
- **Anti-logarithm Calculation**: Computes anti-logarithms (inverse of logarithms) for both base 10 and base e.
- **User-Friendly Interface**: Simple and intuitive UI with clear options and results display.
- **Error Handling**: Provides user-friendly alerts and prompts if incorrect inputs are provided.

## Screens and Functionality

### Main Activity

- **Dashboard**: Provides navigation to different functionalities.
  - **Log Calculation**: Navigates to the Log Calculation screen.
  - **Anti-log Calculation**: Navigates to the Anti-log Calculation screen.
  - **About**: Displays information about logarithms and anti-logarithms.

### Log Calculation (`activity_log`)

- **Inputs**: 
  - Value for which the log needs to be calculated.
  - Option to select base (Log10 or Log e) using radio buttons.
- **Calculation**: Computes the log of the provided value based on the selected base.
- **Clear**: Clears the input and result fields.

### Anti-log Calculation (`activity_antilog`)

- **Inputs**: 
  - Value for which the anti-log needs to be calculated.
  - Option to select base (Log10 or Log e) using radio buttons.
- **Calculation**: Computes the anti-log of the provided value based on the selected base.
- **Clear**: Clears the input and result fields.

## How to Use

1. **Launch the Application**: Open the app on your Android device.
2. **Navigate to Desired Calculation**:
   - Select the Log or Anti-log option from the main dashboard.
3. **Input Values**:
   - Enter the value for which you need to calculate log or anti-log.
   - Select the appropriate base using radio buttons.
4. **View Results**:
   - The result will be displayed immediately after calculation.
5. **Clear Inputs**:
   - Use the clear button to reset input and result fields.

## Error Handling

- **Log and Anti-log Calculation**:
  - If no base is selected or incorrect values are entered, an alert dialog will be shown prompting the user to correct the inputs.
  - The dialog includes options to acknowledge the warning or cancel the action.

## Dependencies

- **Android SDK**: The application is built using the Android SDK.

## Screenshots



## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- The application was created to assist students in accurately calculating logarithms and anti-logarithms for academic purposes.
