Feature: Academy Choucair
  As a user, I want automate  in screenplay at the Maxtime Choucair

  @scenario1
  Scenario: Register job times in Maxtime
    Given than Juan wants to automation at the Maxtime Choucair
    When select the current working day
    And he register the job times on the choucair Maxtime platform
    |proyecto|servicio        |actividad           |horas|comentario|
    ##@externaldata@./src/test/resources/DataDriver/prueba.xlsx@prueba1
      |sinapsis|generales agiles|Ejecución de pruebas|8|Ejecución de pruebas|
    Then he should find the times registered on the platform
