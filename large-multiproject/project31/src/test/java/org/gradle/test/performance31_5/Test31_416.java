package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_416 {
    private final Production31_416 production = new Production31_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}