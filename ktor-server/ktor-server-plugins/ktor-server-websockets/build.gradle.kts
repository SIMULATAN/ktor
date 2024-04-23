description = ""

kotlin.sourceSets {
    jvmAndNixMain {
        dependencies {
            api(project(":ktor-shared:ktor-websockets"))
            api(project(":ktor-shared:ktor-websocket-serialization"))
        }
    }

    jvmAndNixTest {
        dependencies {
            api(project(":ktor-server:ktor-server-plugins:ktor-server-content-negotiation"))
            api(project(":ktor-client:ktor-client-plugins:ktor-client-websockets"))
        }
    }
    jvmTest {
        dependencies {
            api(libs.kotlinx.coroutines.debug)
        }
    }
}
