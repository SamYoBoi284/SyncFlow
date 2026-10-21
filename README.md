# Sync Flow

Native Android offline-player prototype, using the Gradle and CI conventions from [Sync-AI](https://github.com/SamYoBoi284/Sync-AI).

## Included
- SAF local audio picker and persisted URI permission attempt.
- Media3 ExoPlayer in a MediaSessionService.
- Android media session/notification controls.
- Best-effort persistence of the last selected URI.
- GitHub Actions debug APK build.

## Build
JDK 17, Gradle 8.10, Android Gradle Plugin 8.7.3, SDK 35. Run `gradle assembleDebug`.

## Not implemented yet
Full MediaStore library, Room database, playlists/queue/favorites, artwork, shuffle/repeat UX, missing-file handling, and device-specific headphone/Bluetooth testing. This is a playback-path prototype, not a finished music player. Media3 is pinned to 1.4.1 for this first spike.
