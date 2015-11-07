About:
======

A part of the zip utility from gocd/gocd, just for some debugging. Is quick and dirty. Do NOT use for anything
else. Most code from around [here](https://github.com/gocd/gocd/tree/e76e13f04541465d4b6c4a794db208ea3080d3fd/base/src/com/thoughtworks/go/util).

This is mostly to help with [this question on the gocd IRC channel](https://botbot.me/freenode/gocd/2015-11-07/).

Usage:
======

```
java -cp zipmeup.jar ZipMeUp directory-to-zip
```

It'll create a file in a temporary directory which it will output.
