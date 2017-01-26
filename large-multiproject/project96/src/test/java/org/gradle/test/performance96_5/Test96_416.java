package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_416 {
    private final Production96_416 production = new Production96_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}