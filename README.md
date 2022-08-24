# Locators task
### Preconditions
1. Create accounts on https://www.i.ua/ and https://accounts.ukr.net/
2. Add correspond email/password for each user to src/test/resources/test_data.csv in order:
```
i_ua_email,i_ua_pass,ukr_net_email,ukr_net_pass
```

### Run tests
Windows PowerShell:
```
.\gradlew.bat test
```
Linux:
```
./gradlew test
```