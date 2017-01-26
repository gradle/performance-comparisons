package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_416 {
    private final Production16_416 production = new Production16_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}