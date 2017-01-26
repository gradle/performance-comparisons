package org.gradle.test.performancenull_416;

import static org.junit.Assert.*;

public class Testnull_41576 {
    private final Productionnull_41576 production = new Productionnull_41576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}