package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_416 {
    private final Production25_416 production = new Production25_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}