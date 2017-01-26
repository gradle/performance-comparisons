package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_416 {
    private final Production89_416 production = new Production89_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}