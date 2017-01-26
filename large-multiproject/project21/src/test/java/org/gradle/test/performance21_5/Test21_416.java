package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_416 {
    private final Production21_416 production = new Production21_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}