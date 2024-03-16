plugins {
    lib
    `lib-publish`
}

kotlin {
    sourceSets {
        getByName("commonMain").dependencies {
            api(KotlinX.coroutines.core)
        }
        getByName("androidMain").dependencies {
            api(AndroidX.annotation)
        }
        all {
            languageSettings.apply {
                optIn("kotlin.RequiresOptIn")
            }
        }
    }
}
