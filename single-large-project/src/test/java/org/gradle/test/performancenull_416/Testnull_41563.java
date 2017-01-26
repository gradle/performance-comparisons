package org.gradle.test.performancenull_416;

import static org.junit.Assert.*;

public class Testnull_41563 {
    private final Productionnull_41563 production = new Productionnull_41563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}