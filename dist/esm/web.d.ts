import { WebPlugin } from '@capacitor/core';
import type { InstagramSharePlugin, SharePhotoOptions, ShareResult, ShareVideoOptions } from './definitions';
export declare class InstagramShareWeb extends WebPlugin implements InstagramSharePlugin {
    sharePhoto(_options: SharePhotoOptions): Promise<ShareResult>;
    shareVideo(_options: ShareVideoOptions): Promise<ShareResult>;
}
