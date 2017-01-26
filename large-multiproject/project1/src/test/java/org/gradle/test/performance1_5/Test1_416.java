package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_416 {
    private final Production1_416 production = new Production1_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}