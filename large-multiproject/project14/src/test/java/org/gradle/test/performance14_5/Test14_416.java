package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_416 {
    private final Production14_416 production = new Production14_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}