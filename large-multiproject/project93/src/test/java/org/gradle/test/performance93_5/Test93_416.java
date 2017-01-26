package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_416 {
    private final Production93_416 production = new Production93_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}