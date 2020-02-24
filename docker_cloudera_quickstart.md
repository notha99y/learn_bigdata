# Cloudera Quickstart
Single-node deployment of Cloudera's 100% open-source Hadoop platform, and Cloudera Manager

## Get docker image
```bash
docker pull cloudera/quickstart:latest
```

## Run
```bash
docker run --hostname=quickstart.cloudera --privileged=true -it -p 7180:7180 -p 8888:8888 cloudera/quickstart:latest /usr/bin/docker-quickstart
```

### Explanation for required flags
```bash
--hostname=quickstart.cloudera
Required: pseudo-distributed configuration assumes this hostname
```

```
--privileged=true
Required: for HBase, MySQL-backed Hive metastore, Hue, Oozie, Sentry, and Cloudera Manager, and possibly others
```

```
-t
Required: once services are started, a Bash shell takes over and will die without this
```
```
-i
Required: if you want to use the terminal, either immediately or attach later
```
```
-p 8888
Recommended: maps the Hue port in the guest to another port on the host
```
```
-p [PORT]
Optional: map any other ports (e.g. 7180 for Cloudera Manager, 80 for a guided tutorial)
```
```
-d
Optional: runs the container in the background
```

## Run 2
```bash
docker run -m 4G --memory-reservation 2G --memory-swap 8G --hostname=quickstart.cloudera --privileged=true -t -i -v $(pwd):/zaid --publish-all=true -p8888 -p8088 cloudera/quickstart /usr/bin/docker-quickstart
```

