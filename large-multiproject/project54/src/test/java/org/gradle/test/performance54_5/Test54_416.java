package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_416 {
    private final Production54_416 production = new Production54_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}