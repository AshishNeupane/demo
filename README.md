ClusteredData Warehouse
Suppose you are part of a scrum team developing a data warehouse for Bloomberg to analyze FX deals. One of the customer stories is to accept deals details from and persist them into DB.

Request logic as follows:

Request Fields(Deal Unique Id, From Currency ISO Code "Ordering Currency", To Currency ISO Code, Deal timestamp, Deal Amount in ordering currency).
Validate row structure. (e.g: Missing fields, Type format..etc. We do not expect you to cover all possible cases but we'll look into how you'll implement validations)
System should not import the same request twice.
No rollback allowed, what every row imported should be saved in DB.
Deliverables should be ready to work including:

Use Actual Db, you can select between (Postgres, MySql, or MongoDB)
Workable deployment including sample file (Docker Compose).
Maven or Gradle project is required for full source code.
Proper error/exception handling.
Proper Logging.
Proper unit testing with respected Coverage.
Proper documentation using MD.
Delivered over Githhub.com.
Makefile to streamline running application (plus).

Project Setup
Setup MySQL on your local environment. Create schema "dem".
to run the project, go to project directory and open terminal. run 'mvn spring-boot-run' cmd
endpoints
http://localhost:8080/api/auth/signup
http://localhost:8080/api/auth/login
http://localhost:8080/master/deal for adding products
