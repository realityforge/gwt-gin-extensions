# gwt-gin-extensions

[![Build Status](https://secure.travis-ci.org/realityforge/gwt-gin-extensions.png?branch=master)](http://travis-ci.org/realityforge/gwt-gin-extensions)
[<img src="https://img.shields.io/maven-central/v/org.realityforge.gwt.gin/gwt-gin-extensions.svg?label=latest%20release"/>](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.realityforge.gwt.gin%22%20a%3A%22gwt-gin-extensions%22)

A micro library that helps when using gin.

## Quick Start

The simplest way to use the library is to add the following dependency
into the build system. i.e.

```xml
<dependency>
   <groupId>org.realityforge.gwt.gin</groupId>
   <artifactId>gwt-gin-extensions</artifactId>
   <version>0.1</version>
   <scope>provided</scope>
</dependency>
```

Then you add the following snippet into the .gwt.xml file.

```xml
<module rename-to='myapp'>
  ...

  <!-- Enable the library -->
  <inherits name="org.realityforge.gwt.gin.GinExtensions"/>
</module>
```
