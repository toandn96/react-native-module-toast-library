
# react-native-module-toast-library

## Getting started

`$ npm install react-native-module-toast-library --save`

### Mostly automatic installation

`$ react-native link react-native-module-toast-library`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-module-toast-library` and add `RNModuleToastLibrary.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNModuleToastLibrary.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNModuleToastLibraryPackage;` to the imports at the top of the file
  - Add `new RNModuleToastLibraryPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-module-toast-library'
  	project(':react-native-module-toast-library').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-module-toast-library/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-module-toast-library')
  	```


## Usage
```javascript
import RNModuleToastLibrary from 'react-native-module-toast-library';

// TODO: What to do with the module?
RNModuleToastLibrary;
```
  