# actualiza-datos-generales-simulacion-client-java

API de Actualiza Datos Generales.

## Requisitos

1. Java >= 1.7
2. Maven >= 3.3

## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:

```shell
mvn install -Dmaven.test.skip=true
```

> **NOTA:** Este fragmento del comando *-Dmaven.test.skip=true* evitará que se lance la prueba unitaria.


## Guía de inicio

### Paso 1. Agregar el producto a la aplicación

Al iniciar sesión seguir los siguientes pasos:

 1. Dar clic en la sección "**Mis aplicaciones**".
 2. Seleccionar la aplicación.
 3. Ir a la pestaña de "**Editar '@tuApp**' ".
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/edit_applications.jpg" width="900">
    </p>
 4. Al abrirse la ventana, seleccionar el producto.
 5. Dar clic en el botón "**Guardar App**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/selected_product.jpg" width="400">
    </p>

### Paso 2. Capturar los datos de la petición

Los siguientes datos a modificar se encuentran en ***src/test/java/io/ActualizaDatosGeneralesSimulacion/client/api/AdgPorCuentaApiTest.java***

Es importante contar con el setUp() que se encargará de inicializar la url. Modificar la URL ***('the_url')***, como se muestra en el siguiente fragmento de código:

```java
 @Before()
    public void setUp() {
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath("https://services.circulodecredito.com.mx/sandbox/v1/adg");
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        apiClient.setHttpClient(okHttpClient);
    }    
```

En el archivo **AdgPorCuentaApiTest.java**, que se encuentra en ***src/test/java/io/ActualizaDatosGeneralesSimulacion/client/api/ApiTest.java*** se deberá modificar el siguiente fragmento de código con los datos correspondientes:

```java

  @Test
    public void porCuentaPostTest() throws Exception {
        Integer estatusOK = 200;
        String xApiKey = "x-api-key";
        RequestADG requestBody = new RequestADG();
        requestBody.setClaveEstado(CatalogoEstados.GRO);
        requestBody.setNumOtorgante("111111");
        requestBody.setCuenta("TO");
        requestBody.setCp("86621");
        requestBody.setFolioOtorgante("33333");
        ApiResponse<RespuestaADG> response = api.porCuentaPostWithHttpInfo(xApiKey, requestBody);

        // TODO: test validations

        Assert.assertTrue(estatusOK.equals(response.getStatusCode()));
            
        if(estatusOK.equals(response.getStatusCode())) {
            RespuestaADG responseOK = (RespuestaADG) response.getData();
            logger.info(responseOK.toString());
        }

    }

```

### Paso 3. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```
