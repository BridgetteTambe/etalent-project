# Enviroassessment

This application is generated by spring initializer and running on java 17 spring boot version 3.2.4

## Development

Application running on port 8080 single/default profile

#####  	 

```
mvn spring-boot:run
```

## PROCESSES
```
0. To Upload call this api call http://localhost:8080/api/environmental-data/upload
add a request part of 'file'
1. This application is configured with swagger for easy testing 
2. Test file is atteched in resources. Use to be uploaded
3. Once upload is successful, EnvironmentalDataImportFile are created and save to db 
and marked as not processed
4. Once uploaded, a schedule runs every second to check for unprocessed files (EnvironmentalDataImportFile)
and EnvironmentalData will be created
5. Once point 4 is done, the EnvironmentalDataImportFile processed field will be updated to true.
6. To see the details of the uploaded file, 
check this api call GET http://localhost:8080/api/environmental-data/

```

### Nice to Have.
No Information was provided as to extra validate 
of what fields to look at as to know when to mark the file as fail to process
