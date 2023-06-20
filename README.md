```
-- Elastic Search Docker Command
docker run -p 9200:9200 -e "discovery.type=single-node" -e "xpack.security.enabled=false" -e "cluster.name=elasticsearch"  docker.elastic.co/elasticsearch/elasticsearch:8.7.0 
```