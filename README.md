# signaturit-test


## About

This project is a solution to test required by Signaturit. Technologies used are:

- Java 8
- Maven
- Spring
- JBehave

## Requirements

- JDK 8
- Maven > 3.3
- Firefox 33.0 ([Download](https://ftp.mozilla.org/pub/firefox/releases/33.0/))

## Installation

To compile with Maven you should run:

`mvn compile`

## Execution

To run all stories and scenarios:

`mvn integration-test`

To run a particular Story:

`mvn integration-test -DstoryFilter="facebookLoginAndPost"`

To run tests filtering by metatag:

`mvn integration-test -Dmeta.filter="+facebook"`

## Reports and Results

After running tests, the report is generated in HTML file in the following path:

    + target
        + jbehave
            + view
                reports.html
                
## Support

agustinabosso7@gmail.com
