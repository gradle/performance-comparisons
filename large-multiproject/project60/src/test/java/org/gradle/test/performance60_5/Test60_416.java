package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_416 {
    private final Production60_416 production = new Production60_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}