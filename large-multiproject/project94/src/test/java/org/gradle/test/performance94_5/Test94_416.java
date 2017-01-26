package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_416 {
    private final Production94_416 production = new Production94_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}