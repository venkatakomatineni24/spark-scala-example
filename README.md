Spark WordCount Example for HDP 2.4.2
-----------------------------------------
This repo contains a sample wordcount application compiled against Hortonworks HPD 2.4.2.

Generate a jar package:

    mvn package

The generated jar file will be located under the target directory

If using an IDE like Eclipse or Intellij it can be useful to have the accompanying JavaDoc and source code while developing:

    # Download sources and javadoc
    mvn dependency:sources
    mvn dependency:resolve -Dclassifier=javadoc

    # Attach them to the project
    mvn eclipse:eclipse
    # Or if you are using Intellij
    mvn idea:idea

Running in YARN
---------------
```
spark-submit --master yarn --num-executors 2 --class es.cesga.bigdata.SparkWordCount spark-wordcount-0.1.0-jar-with-dependencies.jar data/book.txt
```

