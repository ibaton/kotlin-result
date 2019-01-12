[![](https://jitpack.io/v/ibaton/kotlin-result.svg)](https://jitpack.io/#ibaton/kotlin-result)
# Kotlin-Result
Used to wrap results from operations that returns success or fauilure.

## USAGE
### Wrap
```
val success: Optional<String> = Optional.Success("value")
val failure: Optional<String> = Optional.Failure(throwable)
```

### Unwrap
```
val optional: Optional<String> = Optional.Success("value")
val (value, throwable) = optional.unwrap()

when(optional){
  is Success -> optional.value // Do something with value
  is Failure -> optional.throwable // Do something with throwable
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
```
dependencies {
  implementation 'com.github.ibaton:kotlin-result:Tag'
}
```
