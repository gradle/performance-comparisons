package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_416 {
    private final Production98_416 production = new Production98_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}