package org.gradle.test.performancenull_286;

import static org.junit.Assert.*;

public class Testnull_28572 {
    private final Productionnull_28572 production = new Productionnull_28572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}