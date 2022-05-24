# language:es

Característica: Característica de prueba T01-C01-F02
  Yo como usuario quiero...

  Escenario: Título escenario T01-C01-F02-E01
    Dado precondiciones del escenario T01-C01-F02-E01 "parametro01"
    Cuando paso a paso del escenario T01-C01-F02-E01
    Entonces resultado del escenario T01-C01-F02-E01 "parametro02"

  Esquema del escenario: Título escenario outline T01-C01-F02-E02
    Dado precondiciones del escenario T01-C01-F02-E02 <parametro01>
    Cuando paso a paso del escenario T01-C01-F02-E02
    Entonces resultado del escenario T01-C01-F02-E02 <parametro02>

    Ejemplos: 
      | parametro01           | parametro02           |
      | valor parametro 01-01 | valor parametro 01-02 |
      | valor parametro 02-01 | valor parametro 02-02 |

  @manual-result:failed
  Escenario: Título escenario manual T01-C01-F02-E03
    Dado precondiciones del escenario T01-C01-F02-E03 "parametro01"
    Cuando paso a paso del escenario T01-C01-F02-E03
    Entonces resultado del escenario T01-C01-F02-E03 "parametro02"
