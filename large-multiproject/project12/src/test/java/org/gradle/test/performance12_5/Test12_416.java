package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_416 {
    private final Production12_416 production = new Production12_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}