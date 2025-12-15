pluginManagement {
    repositories {
        
        maven { url = uri("https://artifacts.mercadolibre.com/repository/android-releases") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        
        maven {
            url = uri("https://artifacts.mercadolibre.com/repository/android-releases")
        }
    }
}
