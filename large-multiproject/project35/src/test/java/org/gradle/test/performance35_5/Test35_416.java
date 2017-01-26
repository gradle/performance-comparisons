package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_416 {
    private final Production35_416 production = new Production35_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}