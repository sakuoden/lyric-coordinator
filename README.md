# Lyric Coordinator

## Motive
From the fact that it was troublesome when I was writing lyric in HTML on a web page.

## Purpose
To convert a raw lyric to HTML.

## Usage
### 1. Create lyric .txt file in `src/main/resource`

### 2. Build application
```shell
$ ./gradlew clean build
```

### 3. Execution
Substitute the file name of the file created in 1 above for the argument and execute.

```shell
# *** = file name
 
$ java -jar build/libs/lyric-coordinator-1.0.0.jar *** 
```
