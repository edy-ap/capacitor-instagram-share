'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

var core = require('@capacitor/core');

const InstagramShare = core.registerPlugin('InstagramShare', {
    web: () => Promise.resolve().then(function () { return web; }).then(m => new m.InstagramShareWeb()),
});

class InstagramShareWeb extends core.WebPlugin {
    // eslint-disable-next-line @typescript-eslint/no-unused-vars
    sharePhoto(_options) {
        throw new Error('Not supported in web');
    }
    // eslint-disable-next-line @typescript-eslint/no-unused-vars
    shareVideo(_options) {
        throw new Error('Not supported in web');
    }
}

var web = /*#__PURE__*/Object.freeze({
    __proto__: null,
    InstagramShareWeb: InstagramShareWeb
});

exports.InstagramShare = InstagramShare;
//# sourceMappingURL=plugin.cjs.js.map
