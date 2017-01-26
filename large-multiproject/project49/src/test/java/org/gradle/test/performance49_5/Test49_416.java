package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_416 {
    private final Production49_416 production = new Production49_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}