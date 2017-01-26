package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_416 {
    private final Production4_416 production = new Production4_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}