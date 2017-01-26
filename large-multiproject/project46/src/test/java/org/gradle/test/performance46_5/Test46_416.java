package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_416 {
    private final Production46_416 production = new Production46_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}