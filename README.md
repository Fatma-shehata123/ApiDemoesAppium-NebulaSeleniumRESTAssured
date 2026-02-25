# ApiDemoesAppium-NebulaSeleniumRESTAssured

## Overview
ApiDemoesAppium-NebulaSeleniumRESTAssured is a comprehensive suite for testing mobile applications and RESTful services using Appium and Selenium frameworks, along with REST Assured for API testing.

## Features
- Automated testing for mobile apps and web apps.
- Support for REST API testing.
- CI/CD integration capabilities.
- Extensible framework for adding new features.

## Structure
- **/src**: Source code for the application tests.
- **/tests**: Directory containing all the test scripts.
- **/docs**: Documentation files including setup and user manuals.

## Technologies
- **Appium**: For mobile application testing.
- **Selenium**: For web application testing.
- **REST Assured**: For API testing.
- **Java**: Primary programming language for the project.

## Getting Started Guide
1. Clone the repository:  
   `git clone https://github.com/Fatma-shehata123/ApiDemoesAppium-NebulaSeleniumRESTAssured.git`
2. Navigate to the project directory:  
   `cd ApiDemoesAppium-NebulaSeleniumRESTAssured`
3. Install dependencies using Maven:  
   `mvn install`

## Usage Examples
- Example for running tests:  
   `mvn test`

## Best Practices
- Write clear and concise test cases.
- Use descriptive naming conventions for test methods.
- Keep tests independent of each other.

## Troubleshooting
- **Issue:** Tests fail without logging.
  **Solution:** Ensure that the logging level is set to DEBUG in the configuration.

- **Issue:** Appium not starting.
  **Solution:** Verify that the Appium server is running and properly configured.