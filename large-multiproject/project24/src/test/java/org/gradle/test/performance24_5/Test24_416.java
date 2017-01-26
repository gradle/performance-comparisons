package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_416 {
    private final Production24_416 production = new Production24_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}