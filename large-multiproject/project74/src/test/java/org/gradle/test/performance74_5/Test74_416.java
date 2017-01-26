package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_416 {
    private final Production74_416 production = new Production74_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}