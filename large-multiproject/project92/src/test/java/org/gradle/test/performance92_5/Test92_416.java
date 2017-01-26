package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_416 {
    private final Production92_416 production = new Production92_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}