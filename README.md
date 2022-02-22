
# azure-cosmosdb-eventlog
*Spring Boot 2.6.3 reactive microservice connecting to Azure Cosmos DB*

## Table of contents
1. [Objectives](#Objectives)
2. [Prerequisites](#prerequisites)
3. [Environment variables](#environment-variables)
4. [Build and test the application](#build-and-test-the-application)
6. [Recommended content](#recommended-content)

## Objectives
1. Receive event messages in a reactive microservice with Spring boot and 
   send the data to Azure Cosmos DB.

## Prerequisites
* An Azure subscription.
* Java Development Kit (JDK) 11.
* Apache Maven, version 3.8 or later.
* An Azure Cosmos DB account.

## Environment variables
The Sensitive data was removed from the application configuration. The next 
environment variables must be configured with the proper values:
* AZURE_COSMOS_DATABASE. The name of the Azure Cosmos DB account.
* AZURE_COSMOS_URI. URI value for the Azure Cosmos DB account.
* AZURE_COSMOS_KEY. Primary key for the Azure Cosmos DB account.

