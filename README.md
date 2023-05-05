# DateKeeper Backend API
## API仕様
TODO

## 環境構築
### 開発(Docker)
※ APIのコンテナ化はTODO
```
docker-compose up
```

### ローカル(IntelliJ)
事前にdokcer-comopseでmysqlコンテナを立ち上げておく
適切な環境変数を設定

実行
```
./gradlew bootRun
```

### APIサンプル
ローカル: 8080
```
curl -l http:/localhost:8080/book
```

### phpmyadmin
dokcer-composeを実行した場合、ローカルのmysqlをphpmyadimnから操作可能
```
http://localhost:4040/
```


## デプロイ
TODO