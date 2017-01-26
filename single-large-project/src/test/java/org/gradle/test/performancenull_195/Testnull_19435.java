package org.gradle.test.performancenull_195;

import static org.junit.Assert.*;

public class Testnull_19435 {
    private final Productionnull_19435 production = new Productionnull_19435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}