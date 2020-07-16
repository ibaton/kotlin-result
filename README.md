# Kotlin-Result
[![](https://jitpack.io/v/ibaton/kotlin-result.svg)](https://jitpack.io/#ibaton/kotlin-result)

Used to wrap results from operations that returns success or fauilure.

## USAGE
### Wrap
```
val success: Result<String> = Result.Success("value")
val failure: Result<String> = Result.Failure(throwable)
```

### Unwrap
```
val optional: Result<String> = Result.Success("value")
val (value, throwable) = c

when(result){
  is Success -> result.value // Do something with value
  is Failure -> result.throwable // Do something with throwable
}
```

## Install
**Step 1.** Add it in your root build.gradle at the end of repositories:
```
allprojects {
  repositories {
	  ...
	  maven { url 'https://jitpack.io' }
	}
}
```

**Step 2.** Add the dependency

[![](https://jitpack.io/v/ibaton/kotlin-result.svg)](https://jitpack.io/#ibaton/kotlin-result)
```
dependencies {
  implementation 'com.github.ibaton:kotlin-result:Tag'
}
```
