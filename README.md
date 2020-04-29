# Scope and extension functions example

### Files:
* `ExampleExtensionForEach` - template of forEach that demonstrated incorrect return, and potential issue with global scope function
* `ExampleTestHelpers` - shows how custom infix extension functions can improve the readability (1st part original)
* `ExampleImprovedTestHelpers` - shows how custom infix extension functions can improve the readability (2nd part improved), it also contains a potential problem of the name clash with `and` function that doesn't manifest itself yet because there is no such function for strings
* `BadExampleTopLevelExtension` - demonstrates the wrong package for top-level functions
* `TestUtils` - demonstrates the proper package for top-level functions
* `ExampleCustomContract` - shows how to replace multiple check with custom contract
* `ExampleCustomContractWithUnexpectedExtension` - similar to ExampleCustomContract but uses Kotlin string class, so concatenation can produce unexpected result if validation is removed, because it accepts null

## Project structure
It's an Android project that can be opened in Android Studio and built with gradle, it requires Android SDK.
Each example is a unit-test so that it can be executed independently, there is not actual application in the project.
