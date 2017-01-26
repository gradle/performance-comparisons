package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_416 {
    private final Production99_416 production = new Production99_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}