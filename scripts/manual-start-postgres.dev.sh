#!/usr/bin/env bash

docker run --name=formatter_db --rm -p 5433:5432 \
  -e POSTGRES_PASSWORD=password \
  -e POSTGRES_USER=sa \
  -e POSTGRES_DB=formatter-db \
  postgres:16