package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_416 {
    private final Production75_416 production = new Production75_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}