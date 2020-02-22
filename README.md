# plapp-data-entities

## Adding this repo as maven dependency

1. Add jitpack as repository in pom.xml
    ```xml
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
    ```

2. Add plapp-data-entities dependency
    ```xml
    <dependency>
      <groupId>com.github.TAASPlapp</groupId>
      <artifactId>plapp-data-entities</artifactId>
      <version>3abcc977dd</version>
    </dependency>
    ```


## Annotating JPA entities

1.  Add in resources/applications.properties:
    ```spring.jpa.mapping-resources=META-INF/orm.xml```

2. Create resources/META-INF/perstistence.xml:
    ```xml
    <?xml version="1.0" encoding="UTF-8" ?>
    <persistence xmlns="http://java.sun.com/xml/ns/persistence">
        <persistence-unit name="persistence-unit">
            <mapping-file>\META-INF\orm.xml</mapping-file>
        </persistence-unit>
    </persistence>
    ```

3. Create resources/META-INF/orm.xml with the desired entity mapping, i.e.
    ```xml
    <?xml version="1.0" encoding="UTF-8" ?>
    <entity-mappings xmlns="http://java.sun.com/xml/ns/persistence/orm" version="2.0">
        <entity class="com.plapp.entities.auth.UserCredentials" name="UserCredentials">
            <attributes>
                <id name="id">
                    <generated-value />
                </id>
            </attributes>
        </entity>
    </entity-mappings>
    ```
