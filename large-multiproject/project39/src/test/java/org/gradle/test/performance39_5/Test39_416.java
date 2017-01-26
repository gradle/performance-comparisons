package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_416 {
    private final Production39_416 production = new Production39_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}