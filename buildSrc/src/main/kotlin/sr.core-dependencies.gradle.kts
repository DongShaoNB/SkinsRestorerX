plugins {
    java
    `java-test-fixtures`
    id("io.freefair.lombok")
}

dependencies {
    implementation("org.jetbrains:annotations:24.0.1")
    compileOnly("com.github.spotbugs:spotbugs-annotations:4.8.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.1")
    testImplementation("org.mockito:mockito-core:5.7.0")
    testImplementation("org.mockito:mockito-junit-jupiter:5.7.0")

    testFixturesImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
    testFixturesImplementation("org.mockito:mockito-core:5.7.0")
    testFixturesImplementation("org.mockito:mockito-junit-jupiter:5.7.0")
}
