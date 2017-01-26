package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_416 {
    private final Production9_416 production = new Production9_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}