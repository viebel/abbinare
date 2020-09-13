Abbinare
====

A fork of [core.match](https://github.com/clojure/core.match) ported for use with self-hosted ClojureScript.


## Releases and Dependency Information

[![Clojars Project](https://img.shields.io/clojars/v/viebel/abbinare.svg)](https://clojars.org/viebel/abbinare)

[Deps](https://clojure.org/guides/deps_and_cli) dependency information:

```clj
 {viebel/abbinare {:mvn/version "1.10.597"}}
```  

[Leiningen](https://github.com/technomancy/leiningen) dependency information:

```clj
 [viebel/abbinare "1.10.597"]
```

[Maven](http://maven.apache.org/) dependency information:

```xml
<dependency>
  <groupId>viebel</groupId>
  <artifactId>abbinare</artifactId>
  <version>1.10.597</version>
</dependency>
```

## Usage

Abbinare preserves the namespaces present in `core.match`. Thus, bootstrap-compatible ClojureScript code that makes use of `core.match` can operate in self-hosted environments if you make the Abbinare artifact available for loading in lieu of the official `core.match` artifact.

## Demo

Short demo in the [Klipse app](http://app.klipse.tech/?cljs_in=(ns%20my.match%0A%20%20(%3Arequire%20%5Bcljs.core.match%20%3Arefer-macros%20%5Bmatch%5D%5D))%0A%0A%0A(let%20%5Bx%20true%0A%20%20%20%20%20%20y%20true%0A%20%20%20%20%20%20z%20true%5D%0A%20%20(match%20%5Bx%20y%20z%5D%0A%20%20%20%20%20%20%20%20%20%5B_%20false%20true%5D%201%0A%20%20%20%20%20%20%20%20%20%5Bfalse%20true%20_%20%5D%202%0A%20%20%20%20%20%20%20%20%20%5B_%20_%20false%5D%203%0A%20%20%20%20%20%20%20%20%20%5B_%20_%20true%5D%204%0A%20%20%20%20%20%20%20%20%20%3Aelse%205)))


Long demo: [An interactive core.match tutorial](http://localhost:4000/clojure/2016/10/25/core-match.html)

## License

Revisions in this fork:
Copyright © 2016–2020 Yehonathan Sharvit and Contributors

Distributed under the Eclipse Public License, the same as Clojure.
