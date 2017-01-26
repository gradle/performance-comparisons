package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_416 {
    private final Production18_416 production = new Production18_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}