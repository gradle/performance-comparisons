package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_416 {
    private final Production32_416 production = new Production32_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}