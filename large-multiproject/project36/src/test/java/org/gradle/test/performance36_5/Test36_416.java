package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_416 {
    private final Production36_416 production = new Production36_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}