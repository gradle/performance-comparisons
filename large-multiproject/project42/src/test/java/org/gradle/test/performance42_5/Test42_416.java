package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_416 {
    private final Production42_416 production = new Production42_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}