package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_416 {
    private final Production7_416 production = new Production7_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}