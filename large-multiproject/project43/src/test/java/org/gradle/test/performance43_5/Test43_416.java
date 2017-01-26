package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_416 {
    private final Production43_416 production = new Production43_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}