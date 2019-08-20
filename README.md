# immo-publication-quarkus

## Commandes utiles

Pour construire le projet :
``` 
mvn clean package
```

Pour lancer le projet en mode développement :
```
mvn quarkus:dev 
```

Le mode développement intègre automatiquement Swagger UI.
Ce n'est pas le cas du packaging native-image.
Pour l'activer, il faut ajouter une propriété dans le fichier `application.properties`
```
quarkus.swagger-ui.always-include=true
```

Pour le mode natif :
```
mvn package -Pnative
./target/immo-publication-quarkus-1.0-SNAPSHOT-runner
```

## GraalVM

Installation (zlib et GRAALVM_HOME) :
https://github.com/quarkusio/quarkus/blob/master/CONTRIBUTING.md#setup