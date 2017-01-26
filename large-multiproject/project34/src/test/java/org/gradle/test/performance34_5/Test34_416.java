package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_416 {
    private final Production34_416 production = new Production34_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}