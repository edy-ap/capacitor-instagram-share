export interface InstagramSharePlugin {
    shareVideo(options: ShareVideoOptions): Promise<ShareResult>;
}
export interface ShareVideoOptions {
    /**
     * Path of the video file
     */
    path: string;
}
export interface ShareResult {
    success: boolean;
    message: string;
}
