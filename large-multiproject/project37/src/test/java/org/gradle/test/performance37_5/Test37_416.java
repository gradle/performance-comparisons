package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_416 {
    private final Production37_416 production = new Production37_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}