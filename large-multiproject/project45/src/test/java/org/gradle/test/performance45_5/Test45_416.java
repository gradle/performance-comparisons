package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_416 {
    private final Production45_416 production = new Production45_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}