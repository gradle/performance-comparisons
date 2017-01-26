package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25828 {
    private final Productionnull_25828 production = new Productionnull_25828("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}