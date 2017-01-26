package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_416 {
    private final Production28_416 production = new Production28_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}