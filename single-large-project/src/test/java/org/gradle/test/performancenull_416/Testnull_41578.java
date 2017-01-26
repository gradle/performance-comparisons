package org.gradle.test.performancenull_416;

import static org.junit.Assert.*;

public class Testnull_41578 {
    private final Productionnull_41578 production = new Productionnull_41578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}