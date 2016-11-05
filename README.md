# Maven Echo Plugin

[![Apache License, Version 2.0, January 2004][shield-license]][apache-license]
[![Build Status][build-status]][travis-ci]
[![Maven Central][shield-central]][maven-central]

# Overview

If you are working with Maven it sometimes happens that you come to the point
where you get the feeling to print out some kind of message during the build.
But how can you do that? Some people think a second time and came to the 
Maven-AntRun-Plugin and use some ant task. But why does not exist
a simple small plugin which can simply print out some kind of messages.

Exactly for such situations the Echo Maven Plugin is intended.


## License

[Apache License, Version 2.0, January 2004](http://www.apache.org/licenses/)

## Issue Tracker

[The Issue Tracker](https://github.com/khmarbaise/echo-maven-plugin/issues)

## Status

 * First working implementation.

## TODOs

## Usage

The first and simplest usage is to configure the Maven Echo Plugin

    <plugin>
      <groupId>com.soebes.maven.plugins</groupId>
      <artifactId>echo-maven-plugin</artifactId>
      <version>0.3.0</version>
      <executions>
        <execution>
          <phase>initialize</phase>
          <goals>
            <goal>echo</goal>
          </goals>
        </execution>
      </executions>
      <configuration>
        <echos>
          <echo>This is the Text which will be printed out.</echo>
        </echos>
      </configuration>
    </plugin>


ATTENTION:

  Starting with version 0.2 of the maven-echo-plugin has been
  renamed to echo-maven-plugin according to the Apache Maven Trademarks.
  
  http://maven.apache.org/guides/plugin/guide-java-plugin-development.html


Ideas
-----

Format goal:

    <plugin>
      <groupId>com.soebes.maven.plugins</groupId>
      <artifactId>echo-maven-plugin</artifactId>
      <version>0.3</version>
      <executions>
        <execution>
          <phase>initialize</phase>
          <goals>
            <goal>format</goal>
          </goals>
        </execution>
      </executions>
      <configuration>
      	<format>%05d</format>
      	<integer>200</integer>
      </configuration>
    </plugin>

Multiple formats

      <configuration>
      	<formats>
      		<format>%03s</format>
      		<format>%03s</format>
      		<format>%03s</format>
      	</formats>
      	<integers>
      		<integer>1</integer>
      		<integer>2</integer>
      		<integer>3</integer>
      	</integers>
      </configuration>


## Settings Configuration

If you like you can configure an appropriate plugin group in your
settings.xml file to make life a little bit easier.

    <settings>
      ...
      <pluginGroups>
        <pluginGroup>com.soebes.maven.plugins</pluginGroup>
      </pluginGroups>
      ...
    </settings>

[maven-central]: http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.soebes.maven.plugins%22%20a%3A%22echo-maven-plugin%22
[build-status]: https://travis-ci.org/khmarbaise/echo-maven-plugin.svg?branch=master
[shield-central]: https://img.shields.io/maven-central/v/com.soebes.maven.plugins/echo-maven-plugin.svg?label=Maven%20Central
[travis-ci]: https://travis-ci.org/khmarbaise/echo-maven-plugin
[shield-license]: https://img.shields.io/github/license/khmarbaise/echo-maven-plugin.svg?label=License
[apache-license]: https://www.apache.org/licenses/
