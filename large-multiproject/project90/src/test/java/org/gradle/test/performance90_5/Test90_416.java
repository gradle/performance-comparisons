package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_416 {
    private final Production90_416 production = new Production90_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}