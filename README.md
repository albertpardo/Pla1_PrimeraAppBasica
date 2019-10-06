# Pla1_PrimeraAppBasica

Año 2019

Primer ejercicio para el curso **PQTM programació Android**

**06/10/2019**:
Se programa la app para soportar el modelo **MVVM** (Model - View - ViewModel)
Donde :
* **MainActivity.java** equivale al  **View**
* **MainModel.java** equivale al **Model**. Contiene la lógica para acceder a los datos que se puedan solicitar desde **ViewModel**. La clase **FraseDao** contiene los datos y funciones para obtener los datos.
* **MainViewModel.java** equivale al **ViewModel**. Es donde contiene datos que se visualizan en **View** y permite realizar las actualizaciones de dichos datos solicitandolos al **Model**.
