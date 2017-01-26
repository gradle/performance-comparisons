package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_416 {
    private final Production95_416 production = new Production95_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}