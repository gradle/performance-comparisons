package org.gradle.test.performancenull_416;

import static org.junit.Assert.*;

public class Testnull_41572 {
    private final Productionnull_41572 production = new Productionnull_41572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}