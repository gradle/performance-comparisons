package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_416 {
    private final Production79_416 production = new Production79_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}