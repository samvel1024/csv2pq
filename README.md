### CSV to Parquet converter

Command line tool to convert CSV to Parquet (experimental)
 
### Usage
 ```bash
java -jar csv2pq.jar my.csv my.parquet
# You need to have schema definition in my.schema
```

### Build from sources
```
mvn -DskipTests=true assembly:single
#Check the jar in target folder
```

### TODO
- May have problems with encoding (base64)