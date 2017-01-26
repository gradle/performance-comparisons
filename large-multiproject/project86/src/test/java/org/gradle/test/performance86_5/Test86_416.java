package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_416 {
    private final Production86_416 production = new Production86_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}