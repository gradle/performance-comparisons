package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_416 {
    private final Production5_416 production = new Production5_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}