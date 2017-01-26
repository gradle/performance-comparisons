package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_416 {
    private final Production2_416 production = new Production2_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}