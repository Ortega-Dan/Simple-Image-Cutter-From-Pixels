# Simple-Image-Cutter-From-Pixels


Use with:
java -jar compiledJar.jar inputImage x1 y1 x2 y2 outputFileWithDesiredExtension

It cuts and converts the image format, according to the arguments passed.

Image Format Support (When compiled for each version):
Java 8 supports JPEG, PNG
Java 11 supports JPEG, PNG, TIFF



Use the following settings in pom to compile for different versions of Java:

Compile for Java 8 (requires JDK 8) [Default]:
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    
Compile for Java 11 (requires JDK 11) [Default]:
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>

