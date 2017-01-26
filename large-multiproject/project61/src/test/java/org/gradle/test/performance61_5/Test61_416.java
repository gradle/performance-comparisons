package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_416 {
    private final Production61_416 production = new Production61_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}