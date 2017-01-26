package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_416 {
    private final Production67_416 production = new Production67_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}