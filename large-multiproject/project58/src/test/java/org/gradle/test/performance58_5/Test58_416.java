package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_416 {
    private final Production58_416 production = new Production58_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}