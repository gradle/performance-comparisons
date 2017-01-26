package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_416 {
    private final Production10_416 production = new Production10_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}