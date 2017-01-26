package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_416 {
    private final Production57_416 production = new Production57_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}