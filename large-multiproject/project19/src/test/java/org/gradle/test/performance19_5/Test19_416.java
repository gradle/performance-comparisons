package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_416 {
    private final Production19_416 production = new Production19_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}