package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_416 {
    private final Production6_416 production = new Production6_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}