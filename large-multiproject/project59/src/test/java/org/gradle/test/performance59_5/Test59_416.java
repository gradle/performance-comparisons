package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_416 {
    private final Production59_416 production = new Production59_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}