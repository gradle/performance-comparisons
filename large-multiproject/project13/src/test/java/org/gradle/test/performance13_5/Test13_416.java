package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_416 {
    private final Production13_416 production = new Production13_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}