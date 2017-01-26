package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26041 {
    private final Productionnull_26041 production = new Productionnull_26041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}