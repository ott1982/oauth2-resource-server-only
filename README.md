# OAuth 2.0 Resource Server (only)

Minimal gradle project Springboot OAuth 2 Resouce Server.

**Requirements**

- Pass as arguments application.yml properties.
- Generate new public key (apendix).
- Rewrite all TODO's in source code.
- Docker.
- [OAuth 2.0 Authentication Server](https://github.com/ott1982/oauth2-authorization-server-only).

# Development

```sh
./gradlew clean bootRun
```

# Run

```sh
./gradlew clean build
docker build --tag oauth2-resource-server-only -f ./docker/Dockerfile ./
docker run -d \
--name oauth2-resource-server-only_1 \
-p 8082:8080 \
--env-file $HOME/git/oauth2-resource-server-only/docker/env_file.properties \
oauth2-resource-server-only
```

# Apendix

## Get public key

```sh
keytool -export -keystore ../../oauth2-authorization-server-only/keystore/mykeystore.keystore -alias myalias -file mycertificate.cer
openssl x509 -inform der -in mycertificate.cer -pubkey -noout
```

## Curl end point GET securized

```sh
curl http://localhost:8080/securized \
-H "Authorization: Bearer $ACCESSTOKEN"
```

## Curl end point GET unsecurized

```sh
curl http://localhost:8080/unsecurized
```

