# oauth2-resource-server-only



# Apendix

## Get Public Key

```sh
keytool -export -keystore server.jks -alias mytestkey -file example.cer
openssl x509 -inform der -in example.cer -pubkey -noout
```

