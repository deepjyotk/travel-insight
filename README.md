Here’s a README file you can use for your GitHub project:

---

# Virtual Threads vs Platform Threads - Travel Insights

This project demonstrates the performance differences between the new **Virtual Threads** in Java 21 and the traditional **Platform Threads** in Java. The focus of the project is on scalability and responsiveness for a travel planning application that involves services like **trip reservations**, **event recommendations**, **accommodation bookings**, and more.

## Project Overview

In this project, we aimed to evaluate how Virtual Threads introduced in Java 21 improve the ability to handle concurrent workloads compared to Platform Threads in an older version of Java.

### Key Features
- **Trip Reservation Service**: Sequential flight search and reservation service.
- **Trip Planning Service**: Parallel execution of tasks like event search, weather check, accommodation, and transportation recommendations using either platform or virtual threads.
- **Scalability Testing**: Performed using JMeter to simulate increasing concurrent users.
- **Performance Metrics**:
  - **Throughput**: Transactions per second.
  - **Response Time**: Time taken to process each transaction.

### Technologies Used
- Java 21 (Virtual Threads)
- JMeter (Scalability testing)
- Spring Boot (Backend services)

## Results
The project tests demonstrate that **Virtual Threads** offer a significant improvement in scalability and efficiency over **Platform Threads**, particularly when dealing with a large number of concurrent users.

For detailed results and performance comparisons, please visit:
[Project Results - TravelInsights](https://deepjyotk.github.io/projects/TravelInsights/)

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/deepjyotk/travel-insights.git
   ```

2. Navigate to the project directory:
   ```bash
   cd travel-insights
   ```

3. Build and run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Use JMeter (or your preferred testing tool) to run scalability tests and compare the results.

## Conclusion
This project highlights the potential of Virtual Threads in Java 21 to enhance the scalability of web applications, making them better equipped to handle high levels of concurrency without degrading performance.

Feel free to explore the code and results, and contribute any improvements or suggestions.
