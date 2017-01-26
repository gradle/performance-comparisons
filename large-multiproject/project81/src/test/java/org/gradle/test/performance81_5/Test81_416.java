package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_416 {
    private final Production81_416 production = new Production81_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}