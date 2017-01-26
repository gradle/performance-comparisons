package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26081 {
    private final Productionnull_26081 production = new Productionnull_26081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}