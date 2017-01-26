package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_416 {
    private final Production66_416 production = new Production66_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}