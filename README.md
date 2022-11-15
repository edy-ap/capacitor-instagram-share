<p align="center"><br><img src="https://user-images.githubusercontent.com/236501/85893648-1c92e880-b7a8-11ea-926d-95355b8175c7.png" width="128" height="128" /></p>
<h3 align="center">Instagram Share</h3>
<p align="center"><strong><code>@capacitor-community/instagram-share</code></strong></p>
<p align="center">
  Capacitor community plugin for instagram share.
</p>

<p align="center">
  <img src="https://img.shields.io/maintenance/yes/2022?style=flat-square" />
  <a href="https://github.com/capacitor-community/example/actions?query=workflow%3A%22CI%22"><img src="https://img.shields.io/github/workflow/status/capacitor-community/instagram-share/CI?style=flat-square" /></a>
  <a href="https://www.npmjs.com/package/@capacitor-community/instagram-share"><img src="https://img.shields.io/npm/l/@capacitor-community/instagram-share?style=flat-square" /></a>
<br>
  <a href="https://www.npmjs.com/package/@capacitor-community/instagram-share"><img src="https://img.shields.io/npm/dw/@capacitor-community/instagram-share?style=flat-square" /></a>
  <a href="https://www.npmjs.com/package/@capacitor-community/instagram-share"><img src="https://img.shields.io/npm/v/@capacitor-community/instagram-share?style=flat-square" /></a>
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
<a href="#contributors-"><img src="https://img.shields.io/badge/all%20contributors-0-orange?style=flat-square" /></a>
<!-- ALL-CONTRIBUTORS-BADGE:END -->
</p>

## Maintainers

| Maintainer | GitHub | Social |
| -----------| -------| -------|
| Edy Avendaño | [edy-ap](https://github.com/edy-ap) | [@edyap_](https://twitter.com/ionitron) |

## Install

```bash
npm install capacitor-instagram-share
npx cap sync
```

## Configuration

No config required

## Usage

TODO

## API

<docgen-index>

* [`sharePhoto(...)`](#sharephoto)
* [`shareVideo(...)`](#sharevideo)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### sharePhoto(...)

```typescript
sharePhoto(options: SharePhotoOptions) => Promise<ShareResult>
```

| Param         | Type                                                            |
| ------------- | --------------------------------------------------------------- |
| **`options`** | <code><a href="#sharephotooptions">SharePhotoOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#shareresult">ShareResult</a>&gt;</code>

--------------------


### shareVideo(...)

```typescript
shareVideo(options: ShareVideoOptions) => Promise<ShareResult>
```

| Param         | Type                                                            |
| ------------- | --------------------------------------------------------------- |
| **`options`** | <code><a href="#sharevideooptions">ShareVideoOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#shareresult">ShareResult</a>&gt;</code>

--------------------


### Interfaces


#### ShareResult

| Prop          | Type                 |
| ------------- | -------------------- |
| **`success`** | <code>boolean</code> |
| **`message`** | <code>string</code>  |


#### SharePhotoOptions

| Prop             | Type                                                                                                  | Description                                |
| ---------------- | ----------------------------------------------------------------------------------------------------- | ------------------------------------------ |
| **`data`**       | <code>any</code>                                                                                      | Base64 encoded data                        |
| **`hashtags`**   | <code>string</code>                                                                                   |                                            |
| **`sharedMode`** | <code>'automatic' \| 'feed' \| 'native' \| 'web' \| 'feedWeb' \| 'feedBrowser' \| 'shareSheet'</code> | Only iOS: feedWeb, feedBrowser, shareSheet |


#### ShareVideoOptions

| Prop             | Type                                                                                                  | Description                                |
| ---------------- | ----------------------------------------------------------------------------------------------------- | ------------------------------------------ |
| **`path`**       | <code>string</code>                                                                                   | Path of the video file                     |
| **`hashtags`**   | <code>string</code>                                                                                   |                                            |
| **`sharedMode`** | <code>'automatic' \| 'feed' \| 'native' \| 'web' \| 'feedWeb' \| 'feedBrowser' \| 'shareSheet'</code> | Only iOS: feedWeb, feedBrowser, shareSheet |

</docgen-api>
