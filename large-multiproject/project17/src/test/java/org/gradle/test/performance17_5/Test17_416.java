package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_416 {
    private final Production17_416 production = new Production17_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}