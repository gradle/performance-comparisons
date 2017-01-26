package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_416 {
    private final Production73_416 production = new Production73_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}