# oauth2-resource-server-only



# Apendix

## Get Public Key

```sh
certificate git:(master) ✗ keytool -export -keystore ../../oauth2-authorization-server-only/keystore/mykeystore.keystore -alias myalias -file mycertificate.cer
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

