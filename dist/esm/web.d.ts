import { WebPlugin } from '@capacitor/core';
import type { InstagramSharePlugin, ShareResult, ShareVideoOptions } from './definitions';
export declare class InstagramShareWeb extends WebPlugin implements InstagramSharePlugin {
    shareVideo(_options: ShareVideoOptions): Promise<ShareResult>;
}
